/*
 * RepositoryT.java
 *
 * Copyright 2017-2018 BCS-Technologies. All Rights Reserved.
 *
 * This software is the proprietary information of BCS-Technologies.
 * Use is subject to license terms.
 */

package com.bcs.bm.catalog_of_instruments_rudata.repositories;

import java.io.File;
import java.io.InputStream;
import java.nio.charset.StandardCharsets;
import java.time.LocalDateTime;
import java.util.Collections;
import java.util.LinkedHashMap;
import java.util.LinkedList;
import java.util.List;
import java.util.Map;
import java.util.stream.Collectors;
import java.util.stream.Stream;

import org.junit.Rule;
import org.junit.jupiter.api.Assertions;
import org.junit.jupiter.api.DisplayName;
import org.junit.jupiter.params.ParameterizedTest;
import org.junit.jupiter.params.provider.Arguments;
import org.junit.jupiter.params.provider.MethodSource;
import org.springframework.context.ApplicationContextInitializer;
import org.springframework.context.ConfigurableApplicationContext;
import org.springframework.data.mongodb.core.MongoTemplate;
import org.testcontainers.containers.GenericContainer;
import org.testcontainers.shaded.org.apache.commons.io.IOUtils;

import com.fasterxml.jackson.core.type.TypeReference;
import com.fasterxml.jackson.databind.ObjectMapper;
import com.mongodb.MongoClient;

import com.bcs.bm.catalog_of_instruments_rudata.repositories.entities.BondAmortization;
import com.bcs.bm.catalog_of_instruments_rudata.repositories.entities.BondConvertation;
import com.bcs.bm.catalog_of_instruments_rudata.repositories.entities.BondCoupon;
import com.bcs.bm.catalog_of_instruments_rudata.repositories.entities.BondMaturity;
import com.bcs.bm.catalog_of_instruments_rudata.repositories.entities.BondOffer;
import com.bcs.bm.catalog_of_instruments_rudata.repositories.entities.CorporateActionKind;
import com.bcs.bm.catalog_of_instruments_rudata.repositories.entities.CorporateActionKindGroups;
import com.bcs.bm.catalog_of_instruments_rudata.repositories.entities.CorporateActionSource;
import com.bcs.bm.catalog_of_instruments_rudata.repositories.entities.DefaultEntity;
import com.bcs.bm.catalog_of_instruments_rudata.repositories.entities.Emitent;
import com.bcs.bm.catalog_of_instruments_rudata.repositories.entities.FintoolReferenceData;
import com.bcs.bm.catalog_of_instruments_rudata.repositories.entities.Security;
import com.bcs.bm.catalog_of_instruments_rudata.repositories.entities.ShareDividend;

import static org.junit.jupiter.api.Assertions.fail;

/**
 * Truthful repository test
 */
@SuppressWarnings("unchecked")
class RepositoryFacadeTest {

    static final String MONGO_DATABASE = "admin";
    private static final int MONGO_PORT = 27017;

    @Rule
    public static GenericContainer MONGO_CONTAINER = new GenericContainer("mongo:3.1.5").withExposedPorts(MONGO_PORT);

    <T extends DefaultEntity> void test_upsert(Class<T> clazz, RepositoryFacade repositoryFacade, List<Map> objects) {
        Assertions.assertEquals(repositoryFacade.upsert(clazz, objects, LocalDateTime.now()).size(), objects.size());
    }

    <T extends DefaultEntity> void test_count(Class<T> clazz, RepositoryFacade repositoryFacade) {
        Assertions.assertFalse(repositoryFacade.count(clazz) == 0);
    }

    <T extends DefaultEntity> void test_find(Class<T> clazz, RepositoryFacade repositoryFacade, List<Map<String, ?>> keys) {
        Assertions.assertFalse(repositoryFacade.findAll(clazz, null, null).isEmpty());
        Assertions.assertFalse(repositoryFacade.findByKeys(clazz, keys, null, null).isEmpty());
        Assertions.assertTrue(repositoryFacade.findByKeysAndUpdateDate(clazz, keys, null, null, null)
                .stream().allMatch(e ->
                        ((T)e).getPrimaryKey().equals(
                                keys.iterator().next().values().stream().map(Object::toString).collect(Collectors.joining("#"))
                        )
                ));
        Assertions.assertNotNull(repositoryFacade.findLastRecord(clazz));
    }

    <T extends DefaultEntity> void test_deleteByIds(Class<T> clazz, RepositoryFacade repositoryFacade, List<Map<String, ?>> keys) {
        repositoryFacade.deleteByKeys(clazz, keys);
        Assertions.assertTrue(repositoryFacade.findByKeys(clazz, keys, null, null).isEmpty());
    }

    <T extends DefaultEntity> void test_deleteAll(Class<T> clazz, RepositoryFacade repositoryFacade) {
        repositoryFacade.deleteAll(clazz);
        Assertions.assertTrue(repositoryFacade.findAll(clazz, null, null).isEmpty());
    }

    <T extends DefaultEntity> void test_findByPaggination(Class<T> clazz, RepositoryFacade repositoryFacade, List<Map<String, ?>> keys) {
        Assertions.assertFalse(repositoryFacade.findAll(clazz, 0, 1).isEmpty());
        Assertions.assertTrue(repositoryFacade.findAll(clazz, 1, 1).isEmpty());
        Assertions.assertFalse(repositoryFacade.findByKeys(clazz, keys, 0, 1).isEmpty());
        Assertions.assertTrue(repositoryFacade.findByKeys(clazz, keys, 1, 1).isEmpty());
        Assertions.assertTrue(repositoryFacade.findByKeysAndUpdateDate(clazz, keys, null, 0, 1)
                .stream().allMatch(e ->
                        ((T)e).getPrimaryKey().equals(
                                keys.iterator().next().values().stream().map(Object::toString).collect(Collectors.joining("#"))
                        )
                ));
        Assertions.assertTrue(repositoryFacade.findByKeysAndUpdateDate(clazz, keys, LocalDateTime.now(), 1, 1).isEmpty());
    }

    private static Stream<Arguments> paramsForCrud() {
        return Stream.of(
                Arguments.of("json" + File.separator + "emitent1.json", Emitent.class, Collections.singletonList(Collections.singletonMap("fininstid", 61755L))),
                Arguments.of("json" + File.separator + "fintool1.json", FintoolReferenceData.class, Collections.singletonList(new LinkedHashMap<String, Object>() {{
                    put("fintoolid", 53486L);
                    put("isincode", "RU000A0JR2S7");
                    put("regcode", "4-01-12190-E");
                }})),
                Arguments.of("json" + File.separator + "security1.json", Security.class, Collections.singletonList(Collections.singletonMap("fintoolid", 4118L))),
                Arguments.of("json" + File.separator + "bondoffers1.json", BondOffer.class, Collections.singletonList(new LinkedHashMap<String, Object>() {{
                    put("idfintool", 6082L);
                    put("idoffer", 2L);
                }})),
                Arguments.of("json" + File.separator + "bondcoupon1.json", BondCoupon.class, Collections.singletonList(new LinkedHashMap<String, Object>() {{
                    put("idfintool", 139353L);
                    put("idcoupon", 6L);
                }})),
                Arguments.of("json" + File.separator + "bondconvertation1.json", BondConvertation.class, Collections.singletonList(new LinkedHashMap<String, Object>() {{
                    put("idfintool", 24599L);
                    put("idfintoolalter", 61639L);
                }})),
                Arguments.of("json" + File.separator + "bondamortization1.json", BondAmortization.class, Collections.singletonList(new LinkedHashMap<String, Object>() {{
                    put("idfintool", 84451L);
                    put("idtranche", 4L);
                }})),
                Arguments.of("json" + File.separator + "bondmaturity1.json", BondMaturity.class, Collections.singletonList(new LinkedHashMap<String, Object>() {{
                    put("fintoolid", 142951L);
                }})),
                Arguments.of("json" + File.separator + "corporateactionkind1.json", CorporateActionKind.class, Collections.singletonList(Collections.singletonMap("code", "MRGR"))),
                Arguments.of("json" + File.separator + "corporateactionsource1.json", CorporateActionSource.class, Collections.singletonList(Collections.singletonMap("code", "IFX"))),
                Arguments.of("json" + File.separator + "corporateactionkindgroups1.json", CorporateActionKindGroups.class, Collections.singletonList(Collections.singletonMap("code", "IEX"))),
                Arguments.of("json" + File.separator + "sharedividend1.json", ShareDividend.class, Collections.singletonList(new LinkedHashMap<String, Object>() {{
                    put("fintoolid", 134968L);
                    put("devorgan", 1L);
                    put("perioddate", "2017-12-31T00:00:00");
                }}))
        );
    }

    @ParameterizedTest
    @MethodSource("paramsForCrud")
    @DisplayName("Test RepositoryFacade")
    void test_crud(String path, Class clazz, List<Map<String, ?>> keys) {
        MONGO_CONTAINER.start();
        final ObjectMapper mapper = new ObjectMapper();
        final RepositoryFacade repositoryFacade = new RepositoryFacadeImpl(new MongoTemplate(new MongoClient(MONGO_CONTAINER.getContainerIpAddress(), MONGO_CONTAINER.getMappedPort(MONGO_PORT)), MONGO_DATABASE), mapper);
        try (InputStream reader = getClass().getClassLoader().getResourceAsStream(path)) {
            final String json = IOUtils.toString(reader, StandardCharsets.UTF_8.name());
            final List standardList =  new LinkedList();
            standardList.add(new ObjectMapper().readValue(json, new TypeReference<Map<String, Object>>(){}));
            test_upsert(clazz, repositoryFacade, standardList);
            test_count(clazz, repositoryFacade);
            test_find(clazz, repositoryFacade, keys);
            test_deleteByIds(clazz, repositoryFacade, keys);
            test_upsert(clazz, repositoryFacade, standardList);
            test_findByPaggination(clazz, repositoryFacade, keys);
            test_deleteAll(clazz, repositoryFacade);
        } catch (Exception e) {
            fail(e.getLocalizedMessage());
        }
        MONGO_CONTAINER.stop();
    }

    public static class Initializer implements ApplicationContextInitializer<ConfigurableApplicationContext> {

        public void initialize(ConfigurableApplicationContext configurableApplicationContext) {
            //set up container before start
        }

    }

}

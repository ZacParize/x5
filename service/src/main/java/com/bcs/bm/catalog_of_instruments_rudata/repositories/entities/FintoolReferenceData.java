package com.bcs.bm.catalog_of_instruments_rudata.repositories.entities;

import java.time.LocalDateTime;
import java.util.Objects;

import org.apache.commons.lang3.StringUtils;
import org.springframework.data.annotation.Id;
import org.springframework.data.annotation.PersistenceConstructor;
import org.springframework.data.mongodb.core.mapping.Document;

import lombok.Data;
import lombok.NoArgsConstructor;

/**
 * Расширенный справочник по фин. инструментам
 */
@Data
@NoArgsConstructor
@Document(collection = "fintool_reference_data")
@PrimaryKeyId({"fintoolid", "isincode", "regcode"})
public class FintoolReferenceData implements DefaultEntity {

    @Id
    private String id;
    private String clazz;
    private LocalDateTime importtime;
    /**
     * Тип финансового инструмента (наименование).
     */
    private String fintooltype;
    /**
     * CFI
     */
    private String cfi;
    /**
     * Вид купона.
     */
    private String coupontype;
    /**
     * Структурный параметр облигации
     */
    private String bondstructuralpar;
    /**
     * Секьюритизация
     */
    private String securitization;
    /**
     * Признак наличия по выпуску гарантии (1-да)
     */
    private Double isguaranteed;
    /**
     * Вид гарантии.
     */
    private String guaranteetype;
    /**
     * Полнота гарантии
     */
    private String guaranteeamount;
    /**
     * Базис НКД по базе Интерфакс.
     */
    private String basis;
    /**
     * Признак наличия амортизационного погашения по выпуску (1-да)
     */
    private Double amortisedmty;
    /**
     * Признак наличия по выпуску возможности досрочного выкупа
     * или погашения (1-да)
     */
    private Double haveoffer;
    /**
     * Наличие возможности конвертации / осуществленная
     * конвертация в другой инструмент (1-да)
     */
    private Double isconvertible;
    /**
     * Группа по периоду обращения.
     */
    private String maturitygroup;
    /**
     * Состояние выпуска финансового инструмента.
     */
    private String status;
    /**
     * Признак наличия дефолта по выпуску (1-да)
     */
    private Double havedefault;
    /**
     * Двухбуквенный код страны эмиссии в соответствии с ОКСМ.
     */
    private String country;
    /**
     * Номинал финансового инструмента
     */
    private Double facevalue;
    /**
     * Валюта номинала финансового инструмента.
     */
    private String faceftname;
    /**
     * Заявленный объем эмиссии в штуках
     */
    private Double sumissuevol;
    /**
     * Заявленный объем эмиссии в валюте номинала
     */
    private Double sumissueval;
    /**
     * Объем в обращении в штуках
     */
    private Double summarketvol;
    /**
     * Объем в обращении в валюте номинала
     */
    private Double summarketval;
    /**
     * Гарантированная сумма
     */
    private Double guarantval;
    /**
     * Признак, определяющий правила расчета НКД.
     */
    private Double accruedintcalctype;
    /**
     * Количество купонов в год
     */
    private Long couponperyear;
    /**
     * Количество купонов всего
     */
    private Long numcoupons;
    /**
     * Краткое наименование финансового инструмента
     */
    private String nickname;
    /**
     * Полное название финансового инструмента
     */
    private String fullname;
    /**
     * ISIN-код финансового инструмента
     */
    private String isincode;
    /**
     * Дополнительный ISIN-код выпуска облигаций
     */
    private String isin144a;
    /**
     * Код НРД финансового инструмента
     */
    private String nrdcode;
    /**
     * Регистрационный номер финансового инструмента
     */
    private String regcode;
    /**
     * Дата государственной регистрации выпуска
     */
    private String regdate;
    /**
     * Регистрирующий орган
     */
    private String regorg;
    /**
     * Идентификатор финансового инструмента в базе Интерфакс
     */
    private Long fintoolid;
    /**
     * Связь между УИН выпуска облигаций и УИН программы
     * облигаций
     */
    private Long progfintoolid;
    /**
     * ОКПО оператора выпуска финансового инструмента
     */
    private String issuerokpo;
    /**
     * Название оператора выпуска финансового инструмента
     */
    private String issuername;
    private Long issueruid;
    private String issuerinn;
    private String borrowerokpo;
    private String borrowername;
    private Long borroweruid;
    private String borrowersector;
    private String borrowerinn;
    private Integer numguarantors;
    private Integer privatedist;
    private String regdistdate;
    private String begdistdate;
    private String enddistdate;
    private String begmtydate;
    /**
     * Дата погашения финансового инструмента
     */
    private String endmtydate;
    /**
     * Количество дней с даты начала размещения до даты
     * окончания погашения облигации
     */
    private Long daysall;
    /**
     * Полное название финансового инструмента по базе НРД*
     * *Национальный расчётный депозитарий
     */
    private String fullnamenrd;
    private String rpregorgnrd;
    private String rpstatenrd;
    private String issuenumber;
    private Double currentfacevaluenrd;
    private Integer isqualifiednrd;
    private String bondseries;
    private Integer islombardcbrnrd;
    private Long numcouponsnrd;
    private Double facevaluenrd;
    private String faceftnamenrd;
    private Double summarketvolnrd;
    /**
     * Регистрационный номер финансового инструмента в базе НРД
     */
    private String regcodenrd;
    private String regdatenrd;
    private String regorgnrd;
    private String begdistdatenrd;
    private Long daysallnrd;
    private String enddistdatenrd;
    private String endmtydatenrd;
    private String regdistdatenrd;
    private Double sumissuevolnrd;
    private Double drqty;
    /**
     * ISIN-код выпуска акций, на которые выпущены расписки
     */
    private String isincodebasenrd;
    /**
     * Код НРД эмитента
     */
    private String nrdcompcode;
    /**
     * Количество представляемых ц.б.
     */
    private Double shqty;
    /**
     * Код НРД специализированного депозитария
     */
    private Double summarketvolorignrd;
    /**
     * Название оператора выпуска финансового инструмента по
     * базе НРД
     */
    private String issuernamenrd;
    /**
     * Дата погашения плановая
     */
    private String planmtydatenrd;
    /**
     * Дата начала начисления первого купона
     */
    private String firstcoupondatenrd;
    /**
     * Уполномоченный депозитарий
     */
    private String depositarynrd;
    /**
     * Реестродержатель
     */
    private String registrarnrd;
    /**
     * Цена размещения в валюте номинала
     */
    private Double placepricenrd;
    /**
     * Листинг/внесписочные (ФБ ММВБ)
     */
    private String micexlistnrd;
    /**
     * Минимальный лот (в валюте номинала) для проведения
     * расчетов в ISCD
     */
    private Double minlotnrd;
    /**
     * Признак биржевой облигации
     */
    private Integer formarketbondsnrd;
    /**
     * Тип лицевого счета (НД или НДЦД).
     */
    private String registraracctypenrd;
    /**
     * Дата открытия лицевого счета/изменения типа ЛС
     */
    private String registraracctypedatenrd;
    /**
     * Номер лицевого счета
     */
    private String facialaccnrd;
    /**
     * Дата первого открытия ЛС в реестре
     */
    private String accopendatenrd;
    /**
     * Кол-во знаков после запятой
     */
    private Integer fractionnrd;
    /**
     * Код НРД специализированного депозитария
     */
    private String specializeddeponrd;
    /**
     * Код НРД фонда/ИСУ
     */
    private String cmpcodensdissuernrd;
    /**
     * Код НРД управляющего ипотечным покрытием
     */
    private String cmpcodensdmanagingnrd;
    /**
     * Наименование вида купона (процента), русское.
     */
    private String ratetypenamerusnrd;
    /**
     * Наименование вида купона (процента), английское.
     */
    private String ratetypenameengnrd;
    /**
     * Наименование типа купонного периода.
     */
    private String coupontypenamenrd;
    /**
     * Базовый месяц по базе НРД
     */
    private String basemonth;
    /**
     * Базовый год по базе НРД
     */
    private String baseyear;
    /**
     * Базис НКД по базе НРД.
     */
    private String basisnrd;
    /**
     * Наименование типа ценных бумаг, русское.
     */
    private String sectypenamerusnrd;
    /**
     * Наименование типа ценных бумаг, английское.
     */
    private String sectypenameengnrd;
    /**
     * Наименование формы выпуска (русс).
     */
    private String secformnamerusnrd;
    /**
     * Наименование формы выпуска (англ).
     */
    private String secformnameengnrd;
    /**
     * Наименование типа ц.б. по классификации Банка России.
     */
    private String sectypenamebrnrd;
    /**
     * Наименование состояния бумаги/ выпуска/транша, русское.
     */
    private String secstaterusnrd;
    /**
     * Наименование состояния бумаги/ выпуска/транша, англ.
     */
    private String secstateengnrd;
    /**
     * Наименование способа размещения ценных бумаг.
     */
    private String placementtypenrd;
    /**
     * Наименование категории, русское.
     */
    private String sharecategorynamenrd;
    /**
     * Наименование категории, английское.
     */
    private String sharecategorynameennrd;
    /**
     * Полное наименование категории депозитарных расписок
     * (рус.)
     */
    private String drcategorynamenrd;
    /**
     * Полное наименование категории депозитарных расписок
     * (англ.)
     */
    private String drcategorynameennrd;
    /**
     * Наименование состояния организации
     */
    private String companystatenamenrd;
    /**
     * Идентификатор вида купона (процента)
     */
    private Long ratetypeid;
    /**
     * Периодичность выплаты купона
     */
    private Long cptypeid;
    /**
     * Метод исчисления купонного дохода
     */
    private Long couponperiodbaseid;
    /**
     * Идентификатор типа ценной бумаги
     */
    private Long sectypeid;
    /**
     * Форма выпуска ценных бумаг
     */
    private Long secformid;
    /**
     * Тип ц.б. по классификации Банка России.
     */
    private String sectypebrcode;
    /**
     * Состояние выпуска
     */
    private Long secstateid;
    /**
     * Способ размещения
     */
    private Long placementtypeid;
    /**
     * Категория акций
     */
    private Long sharecategoryid;
    /**
     * Мнемокод категории депозитарных расписок
     */
    private String drcategorymn;
    /**
     * Мнемокод состояния организации
     */
    private String companystatemn;
    /**
     * Тип выпуска/расписки/фонда.
     */
    private String securitytype;
    /**
     * Вид выпуска/спонсируемость/тип инвестиций.
     */
    private String securitykind;
    /**
     * Сектор эмитента
     */
    private String issuersector;
    /**
     * Отрасль актива.
     */
    private String assetssector;
    /**
     * Дата последнего обновления данных по бумаге
     */
    private LocalDateTime updatetime;
    /**
     * Выпуск субъекта федерации:
     * 0 – муниципальный выпуск;
     * 1 – выпуск субъекта федерации;
     * пусто – другое.
     */
    private Integer isregion;
    /**
     * Обслуживание в НРД. («На обслуживании» и т.п.).
     */
    private String nsdservice;
    /**
     * Частота пересмотра плавающей ставки купона (кол-во раз в
     * год)
     */
    private Long raterevisionsperyear;
    /**
     * Определение плавающей процентной ставки по купону
     */
    private String floatratename;
    /**
     * Признак субординированных облигаций (1 – да)
     */
    private Integer issubordinated;
    /**
     * Дата/время последнего изменения записи
     */
    private LocalDateTime updatedate;
    /**
     * Базис НКД по базе БКС
     */
    private Integer timebasis;
    /**
     * Сектор экономики по классификатору ЦБ РФ
     */
    private String sector4212u;
    /**
     * Система национальных счетов 2008
     */
    private String sna2008;

    @Override
    public String getPrimaryKey() {
        StringBuilder result = new StringBuilder();
        result.append(Objects.nonNull(fintoolid) ? fintoolid.toString() : "");
        result.append(Objects.nonNull(isincode) ? (result.length() != 0 ? "#" : "") + isincode : "");
        result.append(Objects.nonNull(regcode) ? (result.length() != 0 ? "#" : "") + regcode : "");
        return result.toString();
    }

    public void setUpdatetime(LocalDateTime updatetime) {
        this.updatetime = updatetime;
        this.setUpdatedate(updatetime);
    }

    @PersistenceConstructor
    public FintoolReferenceData(String id, String clazz, LocalDateTime importtime) {
        this.id = id;
        this.clazz = clazz;
        this.importtime = importtime;
    }

    @Override
    public void init() {
        setId(getPrimaryKey());
        setClazz(StringUtils.lowerCase(getClass().getSimpleName()));
        setTimebasis(0);

        if (Objects.isNull(this.basis)) {
            return;
        }

        switch (StringUtils.lowerCase(this.basis)) {
            case "act/360":
                setTimebasis(1);
                break;
            case "act/364":
                setTimebasis(2);
                break;
            case "nl/365":
            case "act/365":
                setTimebasis(3);
                break;
            case "30e/360":
                setTimebasis(4);
                break;
            case "30/360":
            case "30/360 german":
                setTimebasis(5);
                break;
            case "act/365l":
                setTimebasis(6);
                break;
            case "act/366":
                setTimebasis(7);
                break;
            case "act/act":
            case "act/act isda":
                setTimebasis(8);
                break;
        }
    }
}

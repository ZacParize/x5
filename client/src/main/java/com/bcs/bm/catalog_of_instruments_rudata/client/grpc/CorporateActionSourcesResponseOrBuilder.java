// Generated by the protocol buffer compiler.  DO NOT EDIT!
// source: GrpcService.proto

package com.bcs.bm.catalog_of_instruments_rudata.client.grpc;

public interface CorporateActionSourcesResponseOrBuilder extends
    // @@protoc_insertion_point(interface_extends:CorporateActionSourcesResponse)
    com.google.protobuf.MessageOrBuilder {

  /**
   * <code>string reqId = 1;</code>
   */
  java.lang.String getReqId();
  /**
   * <code>string reqId = 1;</code>
   */
  com.google.protobuf.ByteString
      getReqIdBytes();

  /**
   * <code>repeated .CorporateActionSource corporateActionSources = 2;</code>
   */
  java.util.List<com.bcs.bm.catalog_of_instruments_rudata.client.grpc.CorporateActionSource> 
      getCorporateActionSourcesList();
  /**
   * <code>repeated .CorporateActionSource corporateActionSources = 2;</code>
   */
  com.bcs.bm.catalog_of_instruments_rudata.client.grpc.CorporateActionSource getCorporateActionSources(int index);
  /**
   * <code>repeated .CorporateActionSource corporateActionSources = 2;</code>
   */
  int getCorporateActionSourcesCount();
  /**
   * <code>repeated .CorporateActionSource corporateActionSources = 2;</code>
   */
  java.util.List<? extends com.bcs.bm.catalog_of_instruments_rudata.client.grpc.CorporateActionSourceOrBuilder> 
      getCorporateActionSourcesOrBuilderList();
  /**
   * <code>repeated .CorporateActionSource corporateActionSources = 2;</code>
   */
  com.bcs.bm.catalog_of_instruments_rudata.client.grpc.CorporateActionSourceOrBuilder getCorporateActionSourcesOrBuilder(
      int index);
}

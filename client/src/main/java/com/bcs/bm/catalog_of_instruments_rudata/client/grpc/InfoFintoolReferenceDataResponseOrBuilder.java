// Generated by the protocol buffer compiler.  DO NOT EDIT!
// source: GrpcService.proto

package com.bcs.bm.catalog_of_instruments_rudata.client.grpc;

public interface InfoFintoolReferenceDataResponseOrBuilder extends
    // @@protoc_insertion_point(interface_extends:InfoFintoolReferenceDataResponse)
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
   * <code>repeated .FintoolReferenceData fintoolReferenceData = 2;</code>
   */
  java.util.List<com.bcs.bm.catalog_of_instruments_rudata.client.grpc.FintoolReferenceData> 
      getFintoolReferenceDataList();
  /**
   * <code>repeated .FintoolReferenceData fintoolReferenceData = 2;</code>
   */
  com.bcs.bm.catalog_of_instruments_rudata.client.grpc.FintoolReferenceData getFintoolReferenceData(int index);
  /**
   * <code>repeated .FintoolReferenceData fintoolReferenceData = 2;</code>
   */
  int getFintoolReferenceDataCount();
  /**
   * <code>repeated .FintoolReferenceData fintoolReferenceData = 2;</code>
   */
  java.util.List<? extends com.bcs.bm.catalog_of_instruments_rudata.client.grpc.FintoolReferenceDataOrBuilder> 
      getFintoolReferenceDataOrBuilderList();
  /**
   * <code>repeated .FintoolReferenceData fintoolReferenceData = 2;</code>
   */
  com.bcs.bm.catalog_of_instruments_rudata.client.grpc.FintoolReferenceDataOrBuilder getFintoolReferenceDataOrBuilder(
      int index);
}
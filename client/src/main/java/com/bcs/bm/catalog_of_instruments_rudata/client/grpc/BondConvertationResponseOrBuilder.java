// Generated by the protocol buffer compiler.  DO NOT EDIT!
// source: GrpcService.proto

package com.bcs.bm.catalog_of_instruments_rudata.client.grpc;

public interface BondConvertationResponseOrBuilder extends
    // @@protoc_insertion_point(interface_extends:BondConvertationResponse)
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
   * <code>repeated .BondConvertation bondConvertation = 2;</code>
   */
  java.util.List<com.bcs.bm.catalog_of_instruments_rudata.client.grpc.BondConvertation> 
      getBondConvertationList();
  /**
   * <code>repeated .BondConvertation bondConvertation = 2;</code>
   */
  com.bcs.bm.catalog_of_instruments_rudata.client.grpc.BondConvertation getBondConvertation(int index);
  /**
   * <code>repeated .BondConvertation bondConvertation = 2;</code>
   */
  int getBondConvertationCount();
  /**
   * <code>repeated .BondConvertation bondConvertation = 2;</code>
   */
  java.util.List<? extends com.bcs.bm.catalog_of_instruments_rudata.client.grpc.BondConvertationOrBuilder> 
      getBondConvertationOrBuilderList();
  /**
   * <code>repeated .BondConvertation bondConvertation = 2;</code>
   */
  com.bcs.bm.catalog_of_instruments_rudata.client.grpc.BondConvertationOrBuilder getBondConvertationOrBuilder(
      int index);
}

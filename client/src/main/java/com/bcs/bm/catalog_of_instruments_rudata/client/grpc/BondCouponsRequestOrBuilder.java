// Generated by the protocol buffer compiler.  DO NOT EDIT!
// source: GrpcService.proto

package com.bcs.bm.catalog_of_instruments_rudata.client.grpc;

public interface BondCouponsRequestOrBuilder extends
    // @@protoc_insertion_point(interface_extends:BondCouponsRequest)
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
   * <code>repeated .Int64Keys idFilter = 2;</code>
   */
  java.util.List<com.bcs.bm.catalog_of_instruments_rudata.client.grpc.Int64Keys> 
      getIdFilterList();
  /**
   * <code>repeated .Int64Keys idFilter = 2;</code>
   */
  com.bcs.bm.catalog_of_instruments_rudata.client.grpc.Int64Keys getIdFilter(int index);
  /**
   * <code>repeated .Int64Keys idFilter = 2;</code>
   */
  int getIdFilterCount();
  /**
   * <code>repeated .Int64Keys idFilter = 2;</code>
   */
  java.util.List<? extends com.bcs.bm.catalog_of_instruments_rudata.client.grpc.Int64KeysOrBuilder> 
      getIdFilterOrBuilderList();
  /**
   * <code>repeated .Int64Keys idFilter = 2;</code>
   */
  com.bcs.bm.catalog_of_instruments_rudata.client.grpc.Int64KeysOrBuilder getIdFilterOrBuilder(
      int index);

  /**
   * <code>int64 update_date = 3;</code>
   */
  long getUpdateDate();

  /**
   * <code>int32 skipCount = 4;</code>
   */
  int getSkipCount();

  /**
   * <code>int32 pageSize = 5;</code>
   */
  int getPageSize();
}

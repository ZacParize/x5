// Generated by the protocol buffer compiler.  DO NOT EDIT!
// source: GrpcService.proto

package com.bcs.bm.catalog_of_instruments_rudata.client.grpc;

public interface BondCouponsResponseOrBuilder extends
    // @@protoc_insertion_point(interface_extends:BondCouponsResponse)
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
   * <code>repeated .BondCoupons bondCoupons = 2;</code>
   */
  java.util.List<com.bcs.bm.catalog_of_instruments_rudata.client.grpc.BondCoupons> 
      getBondCouponsList();
  /**
   * <code>repeated .BondCoupons bondCoupons = 2;</code>
   */
  com.bcs.bm.catalog_of_instruments_rudata.client.grpc.BondCoupons getBondCoupons(int index);
  /**
   * <code>repeated .BondCoupons bondCoupons = 2;</code>
   */
  int getBondCouponsCount();
  /**
   * <code>repeated .BondCoupons bondCoupons = 2;</code>
   */
  java.util.List<? extends com.bcs.bm.catalog_of_instruments_rudata.client.grpc.BondCouponsOrBuilder> 
      getBondCouponsOrBuilderList();
  /**
   * <code>repeated .BondCoupons bondCoupons = 2;</code>
   */
  com.bcs.bm.catalog_of_instruments_rudata.client.grpc.BondCouponsOrBuilder getBondCouponsOrBuilder(
      int index);
}
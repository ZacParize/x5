// Generated by the protocol buffer compiler.  DO NOT EDIT!
// source: GrpcService.proto

package com.bcs.bm.catalog_of_instruments_rudata.client.grpc;

public interface BondCouponsOrBuilder extends
    // @@protoc_insertion_point(interface_extends:BondCoupons)
    com.google.protobuf.MessageOrBuilder {

  /**
   * <code>int64 id_fintool = 1;</code>
   */
  long getIdFintool();

  /**
   * <code>int64 id_coupon = 2;</code>
   */
  long getIdCoupon();

  /**
   * <code>string begin_period = 3;</code>
   */
  java.lang.String getBeginPeriod();
  /**
   * <code>string begin_period = 3;</code>
   */
  com.google.protobuf.ByteString
      getBeginPeriodBytes();

  /**
   * <code>string end_period = 4;</code>
   */
  java.lang.String getEndPeriod();
  /**
   * <code>string end_period = 4;</code>
   */
  com.google.protobuf.ByteString
      getEndPeriodBytes();

  /**
   * <code>int64 coupon_period = 5;</code>
   */
  long getCouponPeriod();

  /**
   * <code>int64 days_from_dist = 6;</code>
   */
  long getDaysFromDist();

  /**
   * <code>.google.protobuf.DoubleValue coupon_rate = 7;</code>
   */
  boolean hasCouponRate();
  /**
   * <code>.google.protobuf.DoubleValue coupon_rate = 7;</code>
   */
  com.google.protobuf.DoubleValue getCouponRate();
  /**
   * <code>.google.protobuf.DoubleValue coupon_rate = 7;</code>
   */
  com.google.protobuf.DoubleValueOrBuilder getCouponRateOrBuilder();

  /**
   * <code>.google.protobuf.DoubleValue pay_per_bound = 8;</code>
   */
  boolean hasPayPerBound();
  /**
   * <code>.google.protobuf.DoubleValue pay_per_bound = 8;</code>
   */
  com.google.protobuf.DoubleValue getPayPerBound();
  /**
   * <code>.google.protobuf.DoubleValue pay_per_bound = 8;</code>
   */
  com.google.protobuf.DoubleValueOrBuilder getPayPerBoundOrBuilder();

  /**
   * <code>.google.protobuf.DoubleValue coupon_val = 9;</code>
   */
  boolean hasCouponVal();
  /**
   * <code>.google.protobuf.DoubleValue coupon_val = 9;</code>
   */
  com.google.protobuf.DoubleValue getCouponVal();
  /**
   * <code>.google.protobuf.DoubleValue coupon_val = 9;</code>
   */
  com.google.protobuf.DoubleValueOrBuilder getCouponValOrBuilder();

  /**
   * <code>string stop_trade_date = 10;</code>
   */
  java.lang.String getStopTradeDate();
  /**
   * <code>string stop_trade_date = 10;</code>
   */
  com.google.protobuf.ByteString
      getStopTradeDateBytes();

  /**
   * <code>string pay_date = 11;</code>
   */
  java.lang.String getPayDate();
  /**
   * <code>string pay_date = 11;</code>
   */
  com.google.protobuf.ByteString
      getPayDateBytes();

  /**
   * <code>string coupon_rate_date = 12;</code>
   */
  java.lang.String getCouponRateDate();
  /**
   * <code>string coupon_rate_date = 12;</code>
   */
  com.google.protobuf.ByteString
      getCouponRateDateBytes();

  /**
   * <code>string fix_date = 13;</code>
   */
  java.lang.String getFixDate();
  /**
   * <code>string fix_date = 13;</code>
   */
  com.google.protobuf.ByteString
      getFixDateBytes();

  /**
   * <code>int64 update_date = 14;</code>
   */
  long getUpdateDate();

  /**
   * <code>.google.protobuf.DoubleValue pay_per_bond_frac = 15;</code>
   */
  boolean hasPayPerBondFrac();
  /**
   * <code>.google.protobuf.DoubleValue pay_per_bond_frac = 15;</code>
   */
  com.google.protobuf.DoubleValue getPayPerBondFrac();
  /**
   * <code>.google.protobuf.DoubleValue pay_per_bond_frac = 15;</code>
   */
  com.google.protobuf.DoubleValueOrBuilder getPayPerBondFracOrBuilder();
}

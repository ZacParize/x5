// Generated by the protocol buffer compiler.  DO NOT EDIT!
// source: GrpcService.proto

package com.bcs.bm.catalog_of_instruments_rudata.client.grpc;

public interface BondOffersOrBuilder extends
    // @@protoc_insertion_point(interface_extends:BondOffers)
    com.google.protobuf.MessageOrBuilder {

  /**
   * <code>int64 id_fintool = 1;</code>
   */
  long getIdFintool();

  /**
   * <code>int64 id_offer = 2;</code>
   */
  long getIdOffer();

  /**
   * <code>string beg_order = 3;</code>
   */
  java.lang.String getBegOrder();
  /**
   * <code>string beg_order = 3;</code>
   */
  com.google.protobuf.ByteString
      getBegOrderBytes();

  /**
   * <code>string end_order = 4;</code>
   */
  java.lang.String getEndOrder();
  /**
   * <code>string end_order = 4;</code>
   */
  com.google.protobuf.ByteString
      getEndOrderBytes();

  /**
   * <code>string offer_date = 5;</code>
   */
  java.lang.String getOfferDate();
  /**
   * <code>string offer_date = 5;</code>
   */
  com.google.protobuf.ByteString
      getOfferDateBytes();

  /**
   * <code>string end_offer_date = 6;</code>
   */
  java.lang.String getEndOfferDate();
  /**
   * <code>string end_offer_date = 6;</code>
   */
  com.google.protobuf.ByteString
      getEndOfferDateBytes();

  /**
   * <code>int64 days_from_dist = 7;</code>
   */
  long getDaysFromDist();

  /**
   * <code>string rate_date = 8;</code>
   */
  java.lang.String getRateDate();
  /**
   * <code>string rate_date = 8;</code>
   */
  com.google.protobuf.ByteString
      getRateDateBytes();

  /**
   * <code>string operation_type = 9;</code>
   */
  java.lang.String getOperationType();
  /**
   * <code>string operation_type = 9;</code>
   */
  com.google.protobuf.ByteString
      getOperationTypeBytes();

  /**
   * <code>.google.protobuf.DoubleValue buy_back_price = 10;</code>
   */
  boolean hasBuyBackPrice();
  /**
   * <code>.google.protobuf.DoubleValue buy_back_price = 10;</code>
   */
  com.google.protobuf.DoubleValue getBuyBackPrice();
  /**
   * <code>.google.protobuf.DoubleValue buy_back_price = 10;</code>
   */
  com.google.protobuf.DoubleValueOrBuilder getBuyBackPriceOrBuilder();

  /**
   * <code>.google.protobuf.DoubleValue buy_back_vol = 11;</code>
   */
  boolean hasBuyBackVol();
  /**
   * <code>.google.protobuf.DoubleValue buy_back_vol = 11;</code>
   */
  com.google.protobuf.DoubleValue getBuyBackVol();
  /**
   * <code>.google.protobuf.DoubleValue buy_back_vol = 11;</code>
   */
  com.google.protobuf.DoubleValueOrBuilder getBuyBackVolOrBuilder();

  /**
   * <code>int64 update_date = 12;</code>
   */
  long getUpdateDate();

  /**
   * <code>int64 buy_back_limit_vol = 13;</code>
   */
  long getBuyBackLimitVol();

  /**
   * <code>int64 buy_back_bid_vol = 14;</code>
   */
  long getBuyBackBidVol();

  /**
   * <code>.google.protobuf.DoubleValue buy_back_bid_ratio = 15;</code>
   */
  boolean hasBuyBackBidRatio();
  /**
   * <code>.google.protobuf.DoubleValue buy_back_bid_ratio = 15;</code>
   */
  com.google.protobuf.DoubleValue getBuyBackBidRatio();
  /**
   * <code>.google.protobuf.DoubleValue buy_back_bid_ratio = 15;</code>
   */
  com.google.protobuf.DoubleValueOrBuilder getBuyBackBidRatioOrBuilder();
}

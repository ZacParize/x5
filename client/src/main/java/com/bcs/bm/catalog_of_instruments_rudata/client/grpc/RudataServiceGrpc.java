package com.bcs.bm.catalog_of_instruments_rudata.client.grpc;

import static io.grpc.MethodDescriptor.generateFullMethodName;
import static io.grpc.stub.ClientCalls.blockingServerStreamingCall;
import static io.grpc.stub.ClientCalls.blockingUnaryCall;
import static io.grpc.stub.ClientCalls.futureUnaryCall;
import static io.grpc.stub.ServerCalls.asyncServerStreamingCall;
import static io.grpc.stub.ServerCalls.asyncUnaryCall;
import static io.grpc.stub.ServerCalls.asyncUnimplementedUnaryCall;

/**
 */
@javax.annotation.Generated(
    value = "by gRPC proto compiler (version 1.20.0)",
    comments = "Source: GrpcService.proto")
public final class RudataServiceGrpc {

  private RudataServiceGrpc() {}

  public static final String SERVICE_NAME = "RudataService";

  // Static method descriptors that strictly reflect the proto.
  private static volatile io.grpc.MethodDescriptor<com.bcs.bm.catalog_of_instruments_rudata.client.grpc.InfoEmitentsRequest,
      com.bcs.bm.catalog_of_instruments_rudata.client.grpc.InfoEmitentsResponse> getGetInfoEmitentsMethod;

  @io.grpc.stub.annotations.RpcMethod(
      fullMethodName = SERVICE_NAME + '/' + "GetInfoEmitents",
      requestType = com.bcs.bm.catalog_of_instruments_rudata.client.grpc.InfoEmitentsRequest.class,
      responseType = com.bcs.bm.catalog_of_instruments_rudata.client.grpc.InfoEmitentsResponse.class,
      methodType = io.grpc.MethodDescriptor.MethodType.UNARY)
  public static io.grpc.MethodDescriptor<com.bcs.bm.catalog_of_instruments_rudata.client.grpc.InfoEmitentsRequest,
      com.bcs.bm.catalog_of_instruments_rudata.client.grpc.InfoEmitentsResponse> getGetInfoEmitentsMethod() {
    io.grpc.MethodDescriptor<com.bcs.bm.catalog_of_instruments_rudata.client.grpc.InfoEmitentsRequest, com.bcs.bm.catalog_of_instruments_rudata.client.grpc.InfoEmitentsResponse> getGetInfoEmitentsMethod;
    if ((getGetInfoEmitentsMethod = RudataServiceGrpc.getGetInfoEmitentsMethod) == null) {
      synchronized (RudataServiceGrpc.class) {
        if ((getGetInfoEmitentsMethod = RudataServiceGrpc.getGetInfoEmitentsMethod) == null) {
          RudataServiceGrpc.getGetInfoEmitentsMethod = getGetInfoEmitentsMethod = 
              io.grpc.MethodDescriptor.<com.bcs.bm.catalog_of_instruments_rudata.client.grpc.InfoEmitentsRequest, com.bcs.bm.catalog_of_instruments_rudata.client.grpc.InfoEmitentsResponse>newBuilder()
              .setType(io.grpc.MethodDescriptor.MethodType.UNARY)
              .setFullMethodName(generateFullMethodName(
                  "RudataService", "GetInfoEmitents"))
              .setSampledToLocalTracing(true)
              .setRequestMarshaller(io.grpc.protobuf.ProtoUtils.marshaller(
                  com.bcs.bm.catalog_of_instruments_rudata.client.grpc.InfoEmitentsRequest.getDefaultInstance()))
              .setResponseMarshaller(io.grpc.protobuf.ProtoUtils.marshaller(
                  com.bcs.bm.catalog_of_instruments_rudata.client.grpc.InfoEmitentsResponse.getDefaultInstance()))
                  .setSchemaDescriptor(new RudataServiceMethodDescriptorSupplier("GetInfoEmitents"))
                  .build();
          }
        }
     }
     return getGetInfoEmitentsMethod;
  }

  private static volatile io.grpc.MethodDescriptor<com.bcs.bm.catalog_of_instruments_rudata.client.grpc.SubscribeEmitentsRequest,
      com.bcs.bm.catalog_of_instruments_rudata.client.grpc.Emitent> getSubscribeEmitentsMethod;

  @io.grpc.stub.annotations.RpcMethod(
      fullMethodName = SERVICE_NAME + '/' + "SubscribeEmitents",
      requestType = com.bcs.bm.catalog_of_instruments_rudata.client.grpc.SubscribeEmitentsRequest.class,
      responseType = com.bcs.bm.catalog_of_instruments_rudata.client.grpc.Emitent.class,
      methodType = io.grpc.MethodDescriptor.MethodType.SERVER_STREAMING)
  public static io.grpc.MethodDescriptor<com.bcs.bm.catalog_of_instruments_rudata.client.grpc.SubscribeEmitentsRequest,
      com.bcs.bm.catalog_of_instruments_rudata.client.grpc.Emitent> getSubscribeEmitentsMethod() {
    io.grpc.MethodDescriptor<com.bcs.bm.catalog_of_instruments_rudata.client.grpc.SubscribeEmitentsRequest, com.bcs.bm.catalog_of_instruments_rudata.client.grpc.Emitent> getSubscribeEmitentsMethod;
    if ((getSubscribeEmitentsMethod = RudataServiceGrpc.getSubscribeEmitentsMethod) == null) {
      synchronized (RudataServiceGrpc.class) {
        if ((getSubscribeEmitentsMethod = RudataServiceGrpc.getSubscribeEmitentsMethod) == null) {
          RudataServiceGrpc.getSubscribeEmitentsMethod = getSubscribeEmitentsMethod = 
              io.grpc.MethodDescriptor.<com.bcs.bm.catalog_of_instruments_rudata.client.grpc.SubscribeEmitentsRequest, com.bcs.bm.catalog_of_instruments_rudata.client.grpc.Emitent>newBuilder()
              .setType(io.grpc.MethodDescriptor.MethodType.SERVER_STREAMING)
              .setFullMethodName(generateFullMethodName(
                  "RudataService", "SubscribeEmitents"))
              .setSampledToLocalTracing(true)
              .setRequestMarshaller(io.grpc.protobuf.ProtoUtils.marshaller(
                  com.bcs.bm.catalog_of_instruments_rudata.client.grpc.SubscribeEmitentsRequest.getDefaultInstance()))
              .setResponseMarshaller(io.grpc.protobuf.ProtoUtils.marshaller(
                  com.bcs.bm.catalog_of_instruments_rudata.client.grpc.Emitent.getDefaultInstance()))
                  .setSchemaDescriptor(new RudataServiceMethodDescriptorSupplier("SubscribeEmitents"))
                  .build();
          }
        }
     }
     return getSubscribeEmitentsMethod;
  }

  private static volatile io.grpc.MethodDescriptor<com.bcs.bm.catalog_of_instruments_rudata.client.grpc.InfoSecuritiesRequest,
      com.bcs.bm.catalog_of_instruments_rudata.client.grpc.InfoSecuritiesResponse> getGetInfoSecuritiesMethod;

  @io.grpc.stub.annotations.RpcMethod(
      fullMethodName = SERVICE_NAME + '/' + "GetInfoSecurities",
      requestType = com.bcs.bm.catalog_of_instruments_rudata.client.grpc.InfoSecuritiesRequest.class,
      responseType = com.bcs.bm.catalog_of_instruments_rudata.client.grpc.InfoSecuritiesResponse.class,
      methodType = io.grpc.MethodDescriptor.MethodType.UNARY)
  public static io.grpc.MethodDescriptor<com.bcs.bm.catalog_of_instruments_rudata.client.grpc.InfoSecuritiesRequest,
      com.bcs.bm.catalog_of_instruments_rudata.client.grpc.InfoSecuritiesResponse> getGetInfoSecuritiesMethod() {
    io.grpc.MethodDescriptor<com.bcs.bm.catalog_of_instruments_rudata.client.grpc.InfoSecuritiesRequest, com.bcs.bm.catalog_of_instruments_rudata.client.grpc.InfoSecuritiesResponse> getGetInfoSecuritiesMethod;
    if ((getGetInfoSecuritiesMethod = RudataServiceGrpc.getGetInfoSecuritiesMethod) == null) {
      synchronized (RudataServiceGrpc.class) {
        if ((getGetInfoSecuritiesMethod = RudataServiceGrpc.getGetInfoSecuritiesMethod) == null) {
          RudataServiceGrpc.getGetInfoSecuritiesMethod = getGetInfoSecuritiesMethod = 
              io.grpc.MethodDescriptor.<com.bcs.bm.catalog_of_instruments_rudata.client.grpc.InfoSecuritiesRequest, com.bcs.bm.catalog_of_instruments_rudata.client.grpc.InfoSecuritiesResponse>newBuilder()
              .setType(io.grpc.MethodDescriptor.MethodType.UNARY)
              .setFullMethodName(generateFullMethodName(
                  "RudataService", "GetInfoSecurities"))
              .setSampledToLocalTracing(true)
              .setRequestMarshaller(io.grpc.protobuf.ProtoUtils.marshaller(
                  com.bcs.bm.catalog_of_instruments_rudata.client.grpc.InfoSecuritiesRequest.getDefaultInstance()))
              .setResponseMarshaller(io.grpc.protobuf.ProtoUtils.marshaller(
                  com.bcs.bm.catalog_of_instruments_rudata.client.grpc.InfoSecuritiesResponse.getDefaultInstance()))
                  .setSchemaDescriptor(new RudataServiceMethodDescriptorSupplier("GetInfoSecurities"))
                  .build();
          }
        }
     }
     return getGetInfoSecuritiesMethod;
  }

  private static volatile io.grpc.MethodDescriptor<com.bcs.bm.catalog_of_instruments_rudata.client.grpc.SubscribeSecuritiesRequest,
      com.bcs.bm.catalog_of_instruments_rudata.client.grpc.Security> getSubscribeSecuritiesMethod;

  @io.grpc.stub.annotations.RpcMethod(
      fullMethodName = SERVICE_NAME + '/' + "SubscribeSecurities",
      requestType = com.bcs.bm.catalog_of_instruments_rudata.client.grpc.SubscribeSecuritiesRequest.class,
      responseType = com.bcs.bm.catalog_of_instruments_rudata.client.grpc.Security.class,
      methodType = io.grpc.MethodDescriptor.MethodType.SERVER_STREAMING)
  public static io.grpc.MethodDescriptor<com.bcs.bm.catalog_of_instruments_rudata.client.grpc.SubscribeSecuritiesRequest,
      com.bcs.bm.catalog_of_instruments_rudata.client.grpc.Security> getSubscribeSecuritiesMethod() {
    io.grpc.MethodDescriptor<com.bcs.bm.catalog_of_instruments_rudata.client.grpc.SubscribeSecuritiesRequest, com.bcs.bm.catalog_of_instruments_rudata.client.grpc.Security> getSubscribeSecuritiesMethod;
    if ((getSubscribeSecuritiesMethod = RudataServiceGrpc.getSubscribeSecuritiesMethod) == null) {
      synchronized (RudataServiceGrpc.class) {
        if ((getSubscribeSecuritiesMethod = RudataServiceGrpc.getSubscribeSecuritiesMethod) == null) {
          RudataServiceGrpc.getSubscribeSecuritiesMethod = getSubscribeSecuritiesMethod = 
              io.grpc.MethodDescriptor.<com.bcs.bm.catalog_of_instruments_rudata.client.grpc.SubscribeSecuritiesRequest, com.bcs.bm.catalog_of_instruments_rudata.client.grpc.Security>newBuilder()
              .setType(io.grpc.MethodDescriptor.MethodType.SERVER_STREAMING)
              .setFullMethodName(generateFullMethodName(
                  "RudataService", "SubscribeSecurities"))
              .setSampledToLocalTracing(true)
              .setRequestMarshaller(io.grpc.protobuf.ProtoUtils.marshaller(
                  com.bcs.bm.catalog_of_instruments_rudata.client.grpc.SubscribeSecuritiesRequest.getDefaultInstance()))
              .setResponseMarshaller(io.grpc.protobuf.ProtoUtils.marshaller(
                  com.bcs.bm.catalog_of_instruments_rudata.client.grpc.Security.getDefaultInstance()))
                  .setSchemaDescriptor(new RudataServiceMethodDescriptorSupplier("SubscribeSecurities"))
                  .build();
          }
        }
     }
     return getSubscribeSecuritiesMethod;
  }

  private static volatile io.grpc.MethodDescriptor<com.bcs.bm.catalog_of_instruments_rudata.client.grpc.InfoFintoolReferenceDataRequest,
      com.bcs.bm.catalog_of_instruments_rudata.client.grpc.InfoFintoolReferenceDataResponse> getGetInfoFintoolReferenceDataMethod;

  @io.grpc.stub.annotations.RpcMethod(
      fullMethodName = SERVICE_NAME + '/' + "GetInfoFintoolReferenceData",
      requestType = com.bcs.bm.catalog_of_instruments_rudata.client.grpc.InfoFintoolReferenceDataRequest.class,
      responseType = com.bcs.bm.catalog_of_instruments_rudata.client.grpc.InfoFintoolReferenceDataResponse.class,
      methodType = io.grpc.MethodDescriptor.MethodType.UNARY)
  public static io.grpc.MethodDescriptor<com.bcs.bm.catalog_of_instruments_rudata.client.grpc.InfoFintoolReferenceDataRequest,
      com.bcs.bm.catalog_of_instruments_rudata.client.grpc.InfoFintoolReferenceDataResponse> getGetInfoFintoolReferenceDataMethod() {
    io.grpc.MethodDescriptor<com.bcs.bm.catalog_of_instruments_rudata.client.grpc.InfoFintoolReferenceDataRequest, com.bcs.bm.catalog_of_instruments_rudata.client.grpc.InfoFintoolReferenceDataResponse> getGetInfoFintoolReferenceDataMethod;
    if ((getGetInfoFintoolReferenceDataMethod = RudataServiceGrpc.getGetInfoFintoolReferenceDataMethod) == null) {
      synchronized (RudataServiceGrpc.class) {
        if ((getGetInfoFintoolReferenceDataMethod = RudataServiceGrpc.getGetInfoFintoolReferenceDataMethod) == null) {
          RudataServiceGrpc.getGetInfoFintoolReferenceDataMethod = getGetInfoFintoolReferenceDataMethod = 
              io.grpc.MethodDescriptor.<com.bcs.bm.catalog_of_instruments_rudata.client.grpc.InfoFintoolReferenceDataRequest, com.bcs.bm.catalog_of_instruments_rudata.client.grpc.InfoFintoolReferenceDataResponse>newBuilder()
              .setType(io.grpc.MethodDescriptor.MethodType.UNARY)
              .setFullMethodName(generateFullMethodName(
                  "RudataService", "GetInfoFintoolReferenceData"))
              .setSampledToLocalTracing(true)
              .setRequestMarshaller(io.grpc.protobuf.ProtoUtils.marshaller(
                  com.bcs.bm.catalog_of_instruments_rudata.client.grpc.InfoFintoolReferenceDataRequest.getDefaultInstance()))
              .setResponseMarshaller(io.grpc.protobuf.ProtoUtils.marshaller(
                  com.bcs.bm.catalog_of_instruments_rudata.client.grpc.InfoFintoolReferenceDataResponse.getDefaultInstance()))
                  .setSchemaDescriptor(new RudataServiceMethodDescriptorSupplier("GetInfoFintoolReferenceData"))
                  .build();
          }
        }
     }
     return getGetInfoFintoolReferenceDataMethod;
  }

  private static volatile io.grpc.MethodDescriptor<com.bcs.bm.catalog_of_instruments_rudata.client.grpc.SubscribeFintoolReferenceDataRequest,
      com.bcs.bm.catalog_of_instruments_rudata.client.grpc.FintoolReferenceData> getSubscribeFintoolReferenceDataMethod;

  @io.grpc.stub.annotations.RpcMethod(
      fullMethodName = SERVICE_NAME + '/' + "SubscribeFintoolReferenceData",
      requestType = com.bcs.bm.catalog_of_instruments_rudata.client.grpc.SubscribeFintoolReferenceDataRequest.class,
      responseType = com.bcs.bm.catalog_of_instruments_rudata.client.grpc.FintoolReferenceData.class,
      methodType = io.grpc.MethodDescriptor.MethodType.SERVER_STREAMING)
  public static io.grpc.MethodDescriptor<com.bcs.bm.catalog_of_instruments_rudata.client.grpc.SubscribeFintoolReferenceDataRequest,
      com.bcs.bm.catalog_of_instruments_rudata.client.grpc.FintoolReferenceData> getSubscribeFintoolReferenceDataMethod() {
    io.grpc.MethodDescriptor<com.bcs.bm.catalog_of_instruments_rudata.client.grpc.SubscribeFintoolReferenceDataRequest, com.bcs.bm.catalog_of_instruments_rudata.client.grpc.FintoolReferenceData> getSubscribeFintoolReferenceDataMethod;
    if ((getSubscribeFintoolReferenceDataMethod = RudataServiceGrpc.getSubscribeFintoolReferenceDataMethod) == null) {
      synchronized (RudataServiceGrpc.class) {
        if ((getSubscribeFintoolReferenceDataMethod = RudataServiceGrpc.getSubscribeFintoolReferenceDataMethod) == null) {
          RudataServiceGrpc.getSubscribeFintoolReferenceDataMethod = getSubscribeFintoolReferenceDataMethod = 
              io.grpc.MethodDescriptor.<com.bcs.bm.catalog_of_instruments_rudata.client.grpc.SubscribeFintoolReferenceDataRequest, com.bcs.bm.catalog_of_instruments_rudata.client.grpc.FintoolReferenceData>newBuilder()
              .setType(io.grpc.MethodDescriptor.MethodType.SERVER_STREAMING)
              .setFullMethodName(generateFullMethodName(
                  "RudataService", "SubscribeFintoolReferenceData"))
              .setSampledToLocalTracing(true)
              .setRequestMarshaller(io.grpc.protobuf.ProtoUtils.marshaller(
                  com.bcs.bm.catalog_of_instruments_rudata.client.grpc.SubscribeFintoolReferenceDataRequest.getDefaultInstance()))
              .setResponseMarshaller(io.grpc.protobuf.ProtoUtils.marshaller(
                  com.bcs.bm.catalog_of_instruments_rudata.client.grpc.FintoolReferenceData.getDefaultInstance()))
                  .setSchemaDescriptor(new RudataServiceMethodDescriptorSupplier("SubscribeFintoolReferenceData"))
                  .build();
          }
        }
     }
     return getSubscribeFintoolReferenceDataMethod;
  }

  private static volatile io.grpc.MethodDescriptor<com.bcs.bm.catalog_of_instruments_rudata.client.grpc.BondOffersRequest,
      com.bcs.bm.catalog_of_instruments_rudata.client.grpc.BondOffersResponse> getGetBondOffersMethod;

  @io.grpc.stub.annotations.RpcMethod(
      fullMethodName = SERVICE_NAME + '/' + "GetBondOffers",
      requestType = com.bcs.bm.catalog_of_instruments_rudata.client.grpc.BondOffersRequest.class,
      responseType = com.bcs.bm.catalog_of_instruments_rudata.client.grpc.BondOffersResponse.class,
      methodType = io.grpc.MethodDescriptor.MethodType.UNARY)
  public static io.grpc.MethodDescriptor<com.bcs.bm.catalog_of_instruments_rudata.client.grpc.BondOffersRequest,
      com.bcs.bm.catalog_of_instruments_rudata.client.grpc.BondOffersResponse> getGetBondOffersMethod() {
    io.grpc.MethodDescriptor<com.bcs.bm.catalog_of_instruments_rudata.client.grpc.BondOffersRequest, com.bcs.bm.catalog_of_instruments_rudata.client.grpc.BondOffersResponse> getGetBondOffersMethod;
    if ((getGetBondOffersMethod = RudataServiceGrpc.getGetBondOffersMethod) == null) {
      synchronized (RudataServiceGrpc.class) {
        if ((getGetBondOffersMethod = RudataServiceGrpc.getGetBondOffersMethod) == null) {
          RudataServiceGrpc.getGetBondOffersMethod = getGetBondOffersMethod = 
              io.grpc.MethodDescriptor.<com.bcs.bm.catalog_of_instruments_rudata.client.grpc.BondOffersRequest, com.bcs.bm.catalog_of_instruments_rudata.client.grpc.BondOffersResponse>newBuilder()
              .setType(io.grpc.MethodDescriptor.MethodType.UNARY)
              .setFullMethodName(generateFullMethodName(
                  "RudataService", "GetBondOffers"))
              .setSampledToLocalTracing(true)
              .setRequestMarshaller(io.grpc.protobuf.ProtoUtils.marshaller(
                  com.bcs.bm.catalog_of_instruments_rudata.client.grpc.BondOffersRequest.getDefaultInstance()))
              .setResponseMarshaller(io.grpc.protobuf.ProtoUtils.marshaller(
                  com.bcs.bm.catalog_of_instruments_rudata.client.grpc.BondOffersResponse.getDefaultInstance()))
                  .setSchemaDescriptor(new RudataServiceMethodDescriptorSupplier("GetBondOffers"))
                  .build();
          }
        }
     }
     return getGetBondOffersMethod;
  }

  private static volatile io.grpc.MethodDescriptor<com.bcs.bm.catalog_of_instruments_rudata.client.grpc.SubscribeBondOffersRequest,
      com.bcs.bm.catalog_of_instruments_rudata.client.grpc.BondOffers> getSubscribeBondOffersMethod;

  @io.grpc.stub.annotations.RpcMethod(
      fullMethodName = SERVICE_NAME + '/' + "SubscribeBondOffers",
      requestType = com.bcs.bm.catalog_of_instruments_rudata.client.grpc.SubscribeBondOffersRequest.class,
      responseType = com.bcs.bm.catalog_of_instruments_rudata.client.grpc.BondOffers.class,
      methodType = io.grpc.MethodDescriptor.MethodType.SERVER_STREAMING)
  public static io.grpc.MethodDescriptor<com.bcs.bm.catalog_of_instruments_rudata.client.grpc.SubscribeBondOffersRequest,
      com.bcs.bm.catalog_of_instruments_rudata.client.grpc.BondOffers> getSubscribeBondOffersMethod() {
    io.grpc.MethodDescriptor<com.bcs.bm.catalog_of_instruments_rudata.client.grpc.SubscribeBondOffersRequest, com.bcs.bm.catalog_of_instruments_rudata.client.grpc.BondOffers> getSubscribeBondOffersMethod;
    if ((getSubscribeBondOffersMethod = RudataServiceGrpc.getSubscribeBondOffersMethod) == null) {
      synchronized (RudataServiceGrpc.class) {
        if ((getSubscribeBondOffersMethod = RudataServiceGrpc.getSubscribeBondOffersMethod) == null) {
          RudataServiceGrpc.getSubscribeBondOffersMethod = getSubscribeBondOffersMethod = 
              io.grpc.MethodDescriptor.<com.bcs.bm.catalog_of_instruments_rudata.client.grpc.SubscribeBondOffersRequest, com.bcs.bm.catalog_of_instruments_rudata.client.grpc.BondOffers>newBuilder()
              .setType(io.grpc.MethodDescriptor.MethodType.SERVER_STREAMING)
              .setFullMethodName(generateFullMethodName(
                  "RudataService", "SubscribeBondOffers"))
              .setSampledToLocalTracing(true)
              .setRequestMarshaller(io.grpc.protobuf.ProtoUtils.marshaller(
                  com.bcs.bm.catalog_of_instruments_rudata.client.grpc.SubscribeBondOffersRequest.getDefaultInstance()))
              .setResponseMarshaller(io.grpc.protobuf.ProtoUtils.marshaller(
                  com.bcs.bm.catalog_of_instruments_rudata.client.grpc.BondOffers.getDefaultInstance()))
                  .setSchemaDescriptor(new RudataServiceMethodDescriptorSupplier("SubscribeBondOffers"))
                  .build();
          }
        }
     }
     return getSubscribeBondOffersMethod;
  }

  private static volatile io.grpc.MethodDescriptor<com.bcs.bm.catalog_of_instruments_rudata.client.grpc.BondConvertationRequest,
      com.bcs.bm.catalog_of_instruments_rudata.client.grpc.BondConvertationResponse> getGetBondConvertationMethod;

  @io.grpc.stub.annotations.RpcMethod(
      fullMethodName = SERVICE_NAME + '/' + "GetBondConvertation",
      requestType = com.bcs.bm.catalog_of_instruments_rudata.client.grpc.BondConvertationRequest.class,
      responseType = com.bcs.bm.catalog_of_instruments_rudata.client.grpc.BondConvertationResponse.class,
      methodType = io.grpc.MethodDescriptor.MethodType.UNARY)
  public static io.grpc.MethodDescriptor<com.bcs.bm.catalog_of_instruments_rudata.client.grpc.BondConvertationRequest,
      com.bcs.bm.catalog_of_instruments_rudata.client.grpc.BondConvertationResponse> getGetBondConvertationMethod() {
    io.grpc.MethodDescriptor<com.bcs.bm.catalog_of_instruments_rudata.client.grpc.BondConvertationRequest, com.bcs.bm.catalog_of_instruments_rudata.client.grpc.BondConvertationResponse> getGetBondConvertationMethod;
    if ((getGetBondConvertationMethod = RudataServiceGrpc.getGetBondConvertationMethod) == null) {
      synchronized (RudataServiceGrpc.class) {
        if ((getGetBondConvertationMethod = RudataServiceGrpc.getGetBondConvertationMethod) == null) {
          RudataServiceGrpc.getGetBondConvertationMethod = getGetBondConvertationMethod = 
              io.grpc.MethodDescriptor.<com.bcs.bm.catalog_of_instruments_rudata.client.grpc.BondConvertationRequest, com.bcs.bm.catalog_of_instruments_rudata.client.grpc.BondConvertationResponse>newBuilder()
              .setType(io.grpc.MethodDescriptor.MethodType.UNARY)
              .setFullMethodName(generateFullMethodName(
                  "RudataService", "GetBondConvertation"))
              .setSampledToLocalTracing(true)
              .setRequestMarshaller(io.grpc.protobuf.ProtoUtils.marshaller(
                  com.bcs.bm.catalog_of_instruments_rudata.client.grpc.BondConvertationRequest.getDefaultInstance()))
              .setResponseMarshaller(io.grpc.protobuf.ProtoUtils.marshaller(
                  com.bcs.bm.catalog_of_instruments_rudata.client.grpc.BondConvertationResponse.getDefaultInstance()))
                  .setSchemaDescriptor(new RudataServiceMethodDescriptorSupplier("GetBondConvertation"))
                  .build();
          }
        }
     }
     return getGetBondConvertationMethod;
  }

  private static volatile io.grpc.MethodDescriptor<com.bcs.bm.catalog_of_instruments_rudata.client.grpc.SubscribeBondConvertationRequest,
      com.bcs.bm.catalog_of_instruments_rudata.client.grpc.BondConvertation> getSubscribeBondConvertationMethod;

  @io.grpc.stub.annotations.RpcMethod(
      fullMethodName = SERVICE_NAME + '/' + "SubscribeBondConvertation",
      requestType = com.bcs.bm.catalog_of_instruments_rudata.client.grpc.SubscribeBondConvertationRequest.class,
      responseType = com.bcs.bm.catalog_of_instruments_rudata.client.grpc.BondConvertation.class,
      methodType = io.grpc.MethodDescriptor.MethodType.SERVER_STREAMING)
  public static io.grpc.MethodDescriptor<com.bcs.bm.catalog_of_instruments_rudata.client.grpc.SubscribeBondConvertationRequest,
      com.bcs.bm.catalog_of_instruments_rudata.client.grpc.BondConvertation> getSubscribeBondConvertationMethod() {
    io.grpc.MethodDescriptor<com.bcs.bm.catalog_of_instruments_rudata.client.grpc.SubscribeBondConvertationRequest, com.bcs.bm.catalog_of_instruments_rudata.client.grpc.BondConvertation> getSubscribeBondConvertationMethod;
    if ((getSubscribeBondConvertationMethod = RudataServiceGrpc.getSubscribeBondConvertationMethod) == null) {
      synchronized (RudataServiceGrpc.class) {
        if ((getSubscribeBondConvertationMethod = RudataServiceGrpc.getSubscribeBondConvertationMethod) == null) {
          RudataServiceGrpc.getSubscribeBondConvertationMethod = getSubscribeBondConvertationMethod = 
              io.grpc.MethodDescriptor.<com.bcs.bm.catalog_of_instruments_rudata.client.grpc.SubscribeBondConvertationRequest, com.bcs.bm.catalog_of_instruments_rudata.client.grpc.BondConvertation>newBuilder()
              .setType(io.grpc.MethodDescriptor.MethodType.SERVER_STREAMING)
              .setFullMethodName(generateFullMethodName(
                  "RudataService", "SubscribeBondConvertation"))
              .setSampledToLocalTracing(true)
              .setRequestMarshaller(io.grpc.protobuf.ProtoUtils.marshaller(
                  com.bcs.bm.catalog_of_instruments_rudata.client.grpc.SubscribeBondConvertationRequest.getDefaultInstance()))
              .setResponseMarshaller(io.grpc.protobuf.ProtoUtils.marshaller(
                  com.bcs.bm.catalog_of_instruments_rudata.client.grpc.BondConvertation.getDefaultInstance()))
                  .setSchemaDescriptor(new RudataServiceMethodDescriptorSupplier("SubscribeBondConvertation"))
                  .build();
          }
        }
     }
     return getSubscribeBondConvertationMethod;
  }

  private static volatile io.grpc.MethodDescriptor<com.bcs.bm.catalog_of_instruments_rudata.client.grpc.BondCouponsRequest,
      com.bcs.bm.catalog_of_instruments_rudata.client.grpc.BondCouponsResponse> getGetBondCouponsMethod;

  @io.grpc.stub.annotations.RpcMethod(
      fullMethodName = SERVICE_NAME + '/' + "GetBondCoupons",
      requestType = com.bcs.bm.catalog_of_instruments_rudata.client.grpc.BondCouponsRequest.class,
      responseType = com.bcs.bm.catalog_of_instruments_rudata.client.grpc.BondCouponsResponse.class,
      methodType = io.grpc.MethodDescriptor.MethodType.UNARY)
  public static io.grpc.MethodDescriptor<com.bcs.bm.catalog_of_instruments_rudata.client.grpc.BondCouponsRequest,
      com.bcs.bm.catalog_of_instruments_rudata.client.grpc.BondCouponsResponse> getGetBondCouponsMethod() {
    io.grpc.MethodDescriptor<com.bcs.bm.catalog_of_instruments_rudata.client.grpc.BondCouponsRequest, com.bcs.bm.catalog_of_instruments_rudata.client.grpc.BondCouponsResponse> getGetBondCouponsMethod;
    if ((getGetBondCouponsMethod = RudataServiceGrpc.getGetBondCouponsMethod) == null) {
      synchronized (RudataServiceGrpc.class) {
        if ((getGetBondCouponsMethod = RudataServiceGrpc.getGetBondCouponsMethod) == null) {
          RudataServiceGrpc.getGetBondCouponsMethod = getGetBondCouponsMethod = 
              io.grpc.MethodDescriptor.<com.bcs.bm.catalog_of_instruments_rudata.client.grpc.BondCouponsRequest, com.bcs.bm.catalog_of_instruments_rudata.client.grpc.BondCouponsResponse>newBuilder()
              .setType(io.grpc.MethodDescriptor.MethodType.UNARY)
              .setFullMethodName(generateFullMethodName(
                  "RudataService", "GetBondCoupons"))
              .setSampledToLocalTracing(true)
              .setRequestMarshaller(io.grpc.protobuf.ProtoUtils.marshaller(
                  com.bcs.bm.catalog_of_instruments_rudata.client.grpc.BondCouponsRequest.getDefaultInstance()))
              .setResponseMarshaller(io.grpc.protobuf.ProtoUtils.marshaller(
                  com.bcs.bm.catalog_of_instruments_rudata.client.grpc.BondCouponsResponse.getDefaultInstance()))
                  .setSchemaDescriptor(new RudataServiceMethodDescriptorSupplier("GetBondCoupons"))
                  .build();
          }
        }
     }
     return getGetBondCouponsMethod;
  }

  private static volatile io.grpc.MethodDescriptor<com.bcs.bm.catalog_of_instruments_rudata.client.grpc.SubscribeBondCouponsRequest,
      com.bcs.bm.catalog_of_instruments_rudata.client.grpc.BondCoupons> getSubscribeBondCouponsMethod;

  @io.grpc.stub.annotations.RpcMethod(
      fullMethodName = SERVICE_NAME + '/' + "SubscribeBondCoupons",
      requestType = com.bcs.bm.catalog_of_instruments_rudata.client.grpc.SubscribeBondCouponsRequest.class,
      responseType = com.bcs.bm.catalog_of_instruments_rudata.client.grpc.BondCoupons.class,
      methodType = io.grpc.MethodDescriptor.MethodType.SERVER_STREAMING)
  public static io.grpc.MethodDescriptor<com.bcs.bm.catalog_of_instruments_rudata.client.grpc.SubscribeBondCouponsRequest,
      com.bcs.bm.catalog_of_instruments_rudata.client.grpc.BondCoupons> getSubscribeBondCouponsMethod() {
    io.grpc.MethodDescriptor<com.bcs.bm.catalog_of_instruments_rudata.client.grpc.SubscribeBondCouponsRequest, com.bcs.bm.catalog_of_instruments_rudata.client.grpc.BondCoupons> getSubscribeBondCouponsMethod;
    if ((getSubscribeBondCouponsMethod = RudataServiceGrpc.getSubscribeBondCouponsMethod) == null) {
      synchronized (RudataServiceGrpc.class) {
        if ((getSubscribeBondCouponsMethod = RudataServiceGrpc.getSubscribeBondCouponsMethod) == null) {
          RudataServiceGrpc.getSubscribeBondCouponsMethod = getSubscribeBondCouponsMethod = 
              io.grpc.MethodDescriptor.<com.bcs.bm.catalog_of_instruments_rudata.client.grpc.SubscribeBondCouponsRequest, com.bcs.bm.catalog_of_instruments_rudata.client.grpc.BondCoupons>newBuilder()
              .setType(io.grpc.MethodDescriptor.MethodType.SERVER_STREAMING)
              .setFullMethodName(generateFullMethodName(
                  "RudataService", "SubscribeBondCoupons"))
              .setSampledToLocalTracing(true)
              .setRequestMarshaller(io.grpc.protobuf.ProtoUtils.marshaller(
                  com.bcs.bm.catalog_of_instruments_rudata.client.grpc.SubscribeBondCouponsRequest.getDefaultInstance()))
              .setResponseMarshaller(io.grpc.protobuf.ProtoUtils.marshaller(
                  com.bcs.bm.catalog_of_instruments_rudata.client.grpc.BondCoupons.getDefaultInstance()))
                  .setSchemaDescriptor(new RudataServiceMethodDescriptorSupplier("SubscribeBondCoupons"))
                  .build();
          }
        }
     }
     return getSubscribeBondCouponsMethod;
  }

  private static volatile io.grpc.MethodDescriptor<com.bcs.bm.catalog_of_instruments_rudata.client.grpc.BondAmortizationsRequest,
      com.bcs.bm.catalog_of_instruments_rudata.client.grpc.BondAmortizationsResponse> getGetBondAmortizationsMethod;

  @io.grpc.stub.annotations.RpcMethod(
      fullMethodName = SERVICE_NAME + '/' + "GetBondAmortizations",
      requestType = com.bcs.bm.catalog_of_instruments_rudata.client.grpc.BondAmortizationsRequest.class,
      responseType = com.bcs.bm.catalog_of_instruments_rudata.client.grpc.BondAmortizationsResponse.class,
      methodType = io.grpc.MethodDescriptor.MethodType.UNARY)
  public static io.grpc.MethodDescriptor<com.bcs.bm.catalog_of_instruments_rudata.client.grpc.BondAmortizationsRequest,
      com.bcs.bm.catalog_of_instruments_rudata.client.grpc.BondAmortizationsResponse> getGetBondAmortizationsMethod() {
    io.grpc.MethodDescriptor<com.bcs.bm.catalog_of_instruments_rudata.client.grpc.BondAmortizationsRequest, com.bcs.bm.catalog_of_instruments_rudata.client.grpc.BondAmortizationsResponse> getGetBondAmortizationsMethod;
    if ((getGetBondAmortizationsMethod = RudataServiceGrpc.getGetBondAmortizationsMethod) == null) {
      synchronized (RudataServiceGrpc.class) {
        if ((getGetBondAmortizationsMethod = RudataServiceGrpc.getGetBondAmortizationsMethod) == null) {
          RudataServiceGrpc.getGetBondAmortizationsMethod = getGetBondAmortizationsMethod = 
              io.grpc.MethodDescriptor.<com.bcs.bm.catalog_of_instruments_rudata.client.grpc.BondAmortizationsRequest, com.bcs.bm.catalog_of_instruments_rudata.client.grpc.BondAmortizationsResponse>newBuilder()
              .setType(io.grpc.MethodDescriptor.MethodType.UNARY)
              .setFullMethodName(generateFullMethodName(
                  "RudataService", "GetBondAmortizations"))
              .setSampledToLocalTracing(true)
              .setRequestMarshaller(io.grpc.protobuf.ProtoUtils.marshaller(
                  com.bcs.bm.catalog_of_instruments_rudata.client.grpc.BondAmortizationsRequest.getDefaultInstance()))
              .setResponseMarshaller(io.grpc.protobuf.ProtoUtils.marshaller(
                  com.bcs.bm.catalog_of_instruments_rudata.client.grpc.BondAmortizationsResponse.getDefaultInstance()))
                  .setSchemaDescriptor(new RudataServiceMethodDescriptorSupplier("GetBondAmortizations"))
                  .build();
          }
        }
     }
     return getGetBondAmortizationsMethod;
  }

  private static volatile io.grpc.MethodDescriptor<com.bcs.bm.catalog_of_instruments_rudata.client.grpc.SubscribeBondAmortizationsRequest,
      com.bcs.bm.catalog_of_instruments_rudata.client.grpc.BondAmortizations> getSubscribeBondAmortizationsMethod;

  @io.grpc.stub.annotations.RpcMethod(
      fullMethodName = SERVICE_NAME + '/' + "SubscribeBondAmortizations",
      requestType = com.bcs.bm.catalog_of_instruments_rudata.client.grpc.SubscribeBondAmortizationsRequest.class,
      responseType = com.bcs.bm.catalog_of_instruments_rudata.client.grpc.BondAmortizations.class,
      methodType = io.grpc.MethodDescriptor.MethodType.SERVER_STREAMING)
  public static io.grpc.MethodDescriptor<com.bcs.bm.catalog_of_instruments_rudata.client.grpc.SubscribeBondAmortizationsRequest,
      com.bcs.bm.catalog_of_instruments_rudata.client.grpc.BondAmortizations> getSubscribeBondAmortizationsMethod() {
    io.grpc.MethodDescriptor<com.bcs.bm.catalog_of_instruments_rudata.client.grpc.SubscribeBondAmortizationsRequest, com.bcs.bm.catalog_of_instruments_rudata.client.grpc.BondAmortizations> getSubscribeBondAmortizationsMethod;
    if ((getSubscribeBondAmortizationsMethod = RudataServiceGrpc.getSubscribeBondAmortizationsMethod) == null) {
      synchronized (RudataServiceGrpc.class) {
        if ((getSubscribeBondAmortizationsMethod = RudataServiceGrpc.getSubscribeBondAmortizationsMethod) == null) {
          RudataServiceGrpc.getSubscribeBondAmortizationsMethod = getSubscribeBondAmortizationsMethod = 
              io.grpc.MethodDescriptor.<com.bcs.bm.catalog_of_instruments_rudata.client.grpc.SubscribeBondAmortizationsRequest, com.bcs.bm.catalog_of_instruments_rudata.client.grpc.BondAmortizations>newBuilder()
              .setType(io.grpc.MethodDescriptor.MethodType.SERVER_STREAMING)
              .setFullMethodName(generateFullMethodName(
                  "RudataService", "SubscribeBondAmortizations"))
              .setSampledToLocalTracing(true)
              .setRequestMarshaller(io.grpc.protobuf.ProtoUtils.marshaller(
                  com.bcs.bm.catalog_of_instruments_rudata.client.grpc.SubscribeBondAmortizationsRequest.getDefaultInstance()))
              .setResponseMarshaller(io.grpc.protobuf.ProtoUtils.marshaller(
                  com.bcs.bm.catalog_of_instruments_rudata.client.grpc.BondAmortizations.getDefaultInstance()))
                  .setSchemaDescriptor(new RudataServiceMethodDescriptorSupplier("SubscribeBondAmortizations"))
                  .build();
          }
        }
     }
     return getSubscribeBondAmortizationsMethod;
  }

  private static volatile io.grpc.MethodDescriptor<com.bcs.bm.catalog_of_instruments_rudata.client.grpc.BondMaturitiesRequest,
      com.bcs.bm.catalog_of_instruments_rudata.client.grpc.BondMaturitiesResponse> getGetBondMaturitiesMethod;

  @io.grpc.stub.annotations.RpcMethod(
      fullMethodName = SERVICE_NAME + '/' + "GetBondMaturities",
      requestType = com.bcs.bm.catalog_of_instruments_rudata.client.grpc.BondMaturitiesRequest.class,
      responseType = com.bcs.bm.catalog_of_instruments_rudata.client.grpc.BondMaturitiesResponse.class,
      methodType = io.grpc.MethodDescriptor.MethodType.UNARY)
  public static io.grpc.MethodDescriptor<com.bcs.bm.catalog_of_instruments_rudata.client.grpc.BondMaturitiesRequest,
      com.bcs.bm.catalog_of_instruments_rudata.client.grpc.BondMaturitiesResponse> getGetBondMaturitiesMethod() {
    io.grpc.MethodDescriptor<com.bcs.bm.catalog_of_instruments_rudata.client.grpc.BondMaturitiesRequest, com.bcs.bm.catalog_of_instruments_rudata.client.grpc.BondMaturitiesResponse> getGetBondMaturitiesMethod;
    if ((getGetBondMaturitiesMethod = RudataServiceGrpc.getGetBondMaturitiesMethod) == null) {
      synchronized (RudataServiceGrpc.class) {
        if ((getGetBondMaturitiesMethod = RudataServiceGrpc.getGetBondMaturitiesMethod) == null) {
          RudataServiceGrpc.getGetBondMaturitiesMethod = getGetBondMaturitiesMethod = 
              io.grpc.MethodDescriptor.<com.bcs.bm.catalog_of_instruments_rudata.client.grpc.BondMaturitiesRequest, com.bcs.bm.catalog_of_instruments_rudata.client.grpc.BondMaturitiesResponse>newBuilder()
              .setType(io.grpc.MethodDescriptor.MethodType.UNARY)
              .setFullMethodName(generateFullMethodName(
                  "RudataService", "GetBondMaturities"))
              .setSampledToLocalTracing(true)
              .setRequestMarshaller(io.grpc.protobuf.ProtoUtils.marshaller(
                  com.bcs.bm.catalog_of_instruments_rudata.client.grpc.BondMaturitiesRequest.getDefaultInstance()))
              .setResponseMarshaller(io.grpc.protobuf.ProtoUtils.marshaller(
                  com.bcs.bm.catalog_of_instruments_rudata.client.grpc.BondMaturitiesResponse.getDefaultInstance()))
                  .setSchemaDescriptor(new RudataServiceMethodDescriptorSupplier("GetBondMaturities"))
                  .build();
          }
        }
     }
     return getGetBondMaturitiesMethod;
  }

  private static volatile io.grpc.MethodDescriptor<com.bcs.bm.catalog_of_instruments_rudata.client.grpc.SubscribeBondMaturitiesRequest,
      com.bcs.bm.catalog_of_instruments_rudata.client.grpc.BondMaturities> getSubscribeBondMaturitiesMethod;

  @io.grpc.stub.annotations.RpcMethod(
      fullMethodName = SERVICE_NAME + '/' + "SubscribeBondMaturities",
      requestType = com.bcs.bm.catalog_of_instruments_rudata.client.grpc.SubscribeBondMaturitiesRequest.class,
      responseType = com.bcs.bm.catalog_of_instruments_rudata.client.grpc.BondMaturities.class,
      methodType = io.grpc.MethodDescriptor.MethodType.SERVER_STREAMING)
  public static io.grpc.MethodDescriptor<com.bcs.bm.catalog_of_instruments_rudata.client.grpc.SubscribeBondMaturitiesRequest,
      com.bcs.bm.catalog_of_instruments_rudata.client.grpc.BondMaturities> getSubscribeBondMaturitiesMethod() {
    io.grpc.MethodDescriptor<com.bcs.bm.catalog_of_instruments_rudata.client.grpc.SubscribeBondMaturitiesRequest, com.bcs.bm.catalog_of_instruments_rudata.client.grpc.BondMaturities> getSubscribeBondMaturitiesMethod;
    if ((getSubscribeBondMaturitiesMethod = RudataServiceGrpc.getSubscribeBondMaturitiesMethod) == null) {
      synchronized (RudataServiceGrpc.class) {
        if ((getSubscribeBondMaturitiesMethod = RudataServiceGrpc.getSubscribeBondMaturitiesMethod) == null) {
          RudataServiceGrpc.getSubscribeBondMaturitiesMethod = getSubscribeBondMaturitiesMethod = 
              io.grpc.MethodDescriptor.<com.bcs.bm.catalog_of_instruments_rudata.client.grpc.SubscribeBondMaturitiesRequest, com.bcs.bm.catalog_of_instruments_rudata.client.grpc.BondMaturities>newBuilder()
              .setType(io.grpc.MethodDescriptor.MethodType.SERVER_STREAMING)
              .setFullMethodName(generateFullMethodName(
                  "RudataService", "SubscribeBondMaturities"))
              .setSampledToLocalTracing(true)
              .setRequestMarshaller(io.grpc.protobuf.ProtoUtils.marshaller(
                  com.bcs.bm.catalog_of_instruments_rudata.client.grpc.SubscribeBondMaturitiesRequest.getDefaultInstance()))
              .setResponseMarshaller(io.grpc.protobuf.ProtoUtils.marshaller(
                  com.bcs.bm.catalog_of_instruments_rudata.client.grpc.BondMaturities.getDefaultInstance()))
                  .setSchemaDescriptor(new RudataServiceMethodDescriptorSupplier("SubscribeBondMaturities"))
                  .build();
          }
        }
     }
     return getSubscribeBondMaturitiesMethod;
  }

  private static volatile io.grpc.MethodDescriptor<com.bcs.bm.catalog_of_instruments_rudata.client.grpc.CorporateActionKindGroupsRequest,
      com.bcs.bm.catalog_of_instruments_rudata.client.grpc.CorporateActionKindGroupsResponse> getGetCorporateActionKindGroupsMethod;

  @io.grpc.stub.annotations.RpcMethod(
      fullMethodName = SERVICE_NAME + '/' + "GetCorporateActionKindGroups",
      requestType = com.bcs.bm.catalog_of_instruments_rudata.client.grpc.CorporateActionKindGroupsRequest.class,
      responseType = com.bcs.bm.catalog_of_instruments_rudata.client.grpc.CorporateActionKindGroupsResponse.class,
      methodType = io.grpc.MethodDescriptor.MethodType.UNARY)
  public static io.grpc.MethodDescriptor<com.bcs.bm.catalog_of_instruments_rudata.client.grpc.CorporateActionKindGroupsRequest,
      com.bcs.bm.catalog_of_instruments_rudata.client.grpc.CorporateActionKindGroupsResponse> getGetCorporateActionKindGroupsMethod() {
    io.grpc.MethodDescriptor<com.bcs.bm.catalog_of_instruments_rudata.client.grpc.CorporateActionKindGroupsRequest, com.bcs.bm.catalog_of_instruments_rudata.client.grpc.CorporateActionKindGroupsResponse> getGetCorporateActionKindGroupsMethod;
    if ((getGetCorporateActionKindGroupsMethod = RudataServiceGrpc.getGetCorporateActionKindGroupsMethod) == null) {
      synchronized (RudataServiceGrpc.class) {
        if ((getGetCorporateActionKindGroupsMethod = RudataServiceGrpc.getGetCorporateActionKindGroupsMethod) == null) {
          RudataServiceGrpc.getGetCorporateActionKindGroupsMethod = getGetCorporateActionKindGroupsMethod = 
              io.grpc.MethodDescriptor.<com.bcs.bm.catalog_of_instruments_rudata.client.grpc.CorporateActionKindGroupsRequest, com.bcs.bm.catalog_of_instruments_rudata.client.grpc.CorporateActionKindGroupsResponse>newBuilder()
              .setType(io.grpc.MethodDescriptor.MethodType.UNARY)
              .setFullMethodName(generateFullMethodName(
                  "RudataService", "GetCorporateActionKindGroups"))
              .setSampledToLocalTracing(true)
              .setRequestMarshaller(io.grpc.protobuf.ProtoUtils.marshaller(
                  com.bcs.bm.catalog_of_instruments_rudata.client.grpc.CorporateActionKindGroupsRequest.getDefaultInstance()))
              .setResponseMarshaller(io.grpc.protobuf.ProtoUtils.marshaller(
                  com.bcs.bm.catalog_of_instruments_rudata.client.grpc.CorporateActionKindGroupsResponse.getDefaultInstance()))
                  .setSchemaDescriptor(new RudataServiceMethodDescriptorSupplier("GetCorporateActionKindGroups"))
                  .build();
          }
        }
     }
     return getGetCorporateActionKindGroupsMethod;
  }

  private static volatile io.grpc.MethodDescriptor<com.bcs.bm.catalog_of_instruments_rudata.client.grpc.SubscribeCorporateActionKindGroupsRequest,
      com.bcs.bm.catalog_of_instruments_rudata.client.grpc.CorporateActionKindGroups> getSubscribeCorporateActionKindGroupsMethod;

  @io.grpc.stub.annotations.RpcMethod(
      fullMethodName = SERVICE_NAME + '/' + "SubscribeCorporateActionKindGroups",
      requestType = com.bcs.bm.catalog_of_instruments_rudata.client.grpc.SubscribeCorporateActionKindGroupsRequest.class,
      responseType = com.bcs.bm.catalog_of_instruments_rudata.client.grpc.CorporateActionKindGroups.class,
      methodType = io.grpc.MethodDescriptor.MethodType.SERVER_STREAMING)
  public static io.grpc.MethodDescriptor<com.bcs.bm.catalog_of_instruments_rudata.client.grpc.SubscribeCorporateActionKindGroupsRequest,
      com.bcs.bm.catalog_of_instruments_rudata.client.grpc.CorporateActionKindGroups> getSubscribeCorporateActionKindGroupsMethod() {
    io.grpc.MethodDescriptor<com.bcs.bm.catalog_of_instruments_rudata.client.grpc.SubscribeCorporateActionKindGroupsRequest, com.bcs.bm.catalog_of_instruments_rudata.client.grpc.CorporateActionKindGroups> getSubscribeCorporateActionKindGroupsMethod;
    if ((getSubscribeCorporateActionKindGroupsMethod = RudataServiceGrpc.getSubscribeCorporateActionKindGroupsMethod) == null) {
      synchronized (RudataServiceGrpc.class) {
        if ((getSubscribeCorporateActionKindGroupsMethod = RudataServiceGrpc.getSubscribeCorporateActionKindGroupsMethod) == null) {
          RudataServiceGrpc.getSubscribeCorporateActionKindGroupsMethod = getSubscribeCorporateActionKindGroupsMethod = 
              io.grpc.MethodDescriptor.<com.bcs.bm.catalog_of_instruments_rudata.client.grpc.SubscribeCorporateActionKindGroupsRequest, com.bcs.bm.catalog_of_instruments_rudata.client.grpc.CorporateActionKindGroups>newBuilder()
              .setType(io.grpc.MethodDescriptor.MethodType.SERVER_STREAMING)
              .setFullMethodName(generateFullMethodName(
                  "RudataService", "SubscribeCorporateActionKindGroups"))
              .setSampledToLocalTracing(true)
              .setRequestMarshaller(io.grpc.protobuf.ProtoUtils.marshaller(
                  com.bcs.bm.catalog_of_instruments_rudata.client.grpc.SubscribeCorporateActionKindGroupsRequest.getDefaultInstance()))
              .setResponseMarshaller(io.grpc.protobuf.ProtoUtils.marshaller(
                  com.bcs.bm.catalog_of_instruments_rudata.client.grpc.CorporateActionKindGroups.getDefaultInstance()))
                  .setSchemaDescriptor(new RudataServiceMethodDescriptorSupplier("SubscribeCorporateActionKindGroups"))
                  .build();
          }
        }
     }
     return getSubscribeCorporateActionKindGroupsMethod;
  }

  private static volatile io.grpc.MethodDescriptor<com.bcs.bm.catalog_of_instruments_rudata.client.grpc.CorporateActionKindsRequest,
      com.bcs.bm.catalog_of_instruments_rudata.client.grpc.CorporateActionKindsResponse> getGetCorporateActionKindsMethod;

  @io.grpc.stub.annotations.RpcMethod(
      fullMethodName = SERVICE_NAME + '/' + "GetCorporateActionKinds",
      requestType = com.bcs.bm.catalog_of_instruments_rudata.client.grpc.CorporateActionKindsRequest.class,
      responseType = com.bcs.bm.catalog_of_instruments_rudata.client.grpc.CorporateActionKindsResponse.class,
      methodType = io.grpc.MethodDescriptor.MethodType.UNARY)
  public static io.grpc.MethodDescriptor<com.bcs.bm.catalog_of_instruments_rudata.client.grpc.CorporateActionKindsRequest,
      com.bcs.bm.catalog_of_instruments_rudata.client.grpc.CorporateActionKindsResponse> getGetCorporateActionKindsMethod() {
    io.grpc.MethodDescriptor<com.bcs.bm.catalog_of_instruments_rudata.client.grpc.CorporateActionKindsRequest, com.bcs.bm.catalog_of_instruments_rudata.client.grpc.CorporateActionKindsResponse> getGetCorporateActionKindsMethod;
    if ((getGetCorporateActionKindsMethod = RudataServiceGrpc.getGetCorporateActionKindsMethod) == null) {
      synchronized (RudataServiceGrpc.class) {
        if ((getGetCorporateActionKindsMethod = RudataServiceGrpc.getGetCorporateActionKindsMethod) == null) {
          RudataServiceGrpc.getGetCorporateActionKindsMethod = getGetCorporateActionKindsMethod = 
              io.grpc.MethodDescriptor.<com.bcs.bm.catalog_of_instruments_rudata.client.grpc.CorporateActionKindsRequest, com.bcs.bm.catalog_of_instruments_rudata.client.grpc.CorporateActionKindsResponse>newBuilder()
              .setType(io.grpc.MethodDescriptor.MethodType.UNARY)
              .setFullMethodName(generateFullMethodName(
                  "RudataService", "GetCorporateActionKinds"))
              .setSampledToLocalTracing(true)
              .setRequestMarshaller(io.grpc.protobuf.ProtoUtils.marshaller(
                  com.bcs.bm.catalog_of_instruments_rudata.client.grpc.CorporateActionKindsRequest.getDefaultInstance()))
              .setResponseMarshaller(io.grpc.protobuf.ProtoUtils.marshaller(
                  com.bcs.bm.catalog_of_instruments_rudata.client.grpc.CorporateActionKindsResponse.getDefaultInstance()))
                  .setSchemaDescriptor(new RudataServiceMethodDescriptorSupplier("GetCorporateActionKinds"))
                  .build();
          }
        }
     }
     return getGetCorporateActionKindsMethod;
  }

  private static volatile io.grpc.MethodDescriptor<com.bcs.bm.catalog_of_instruments_rudata.client.grpc.SubscribeCorporateActionKindRequest,
      com.bcs.bm.catalog_of_instruments_rudata.client.grpc.CorporateActionKind> getSubscribeCorporateActionKindsMethod;

  @io.grpc.stub.annotations.RpcMethod(
      fullMethodName = SERVICE_NAME + '/' + "SubscribeCorporateActionKinds",
      requestType = com.bcs.bm.catalog_of_instruments_rudata.client.grpc.SubscribeCorporateActionKindRequest.class,
      responseType = com.bcs.bm.catalog_of_instruments_rudata.client.grpc.CorporateActionKind.class,
      methodType = io.grpc.MethodDescriptor.MethodType.SERVER_STREAMING)
  public static io.grpc.MethodDescriptor<com.bcs.bm.catalog_of_instruments_rudata.client.grpc.SubscribeCorporateActionKindRequest,
      com.bcs.bm.catalog_of_instruments_rudata.client.grpc.CorporateActionKind> getSubscribeCorporateActionKindsMethod() {
    io.grpc.MethodDescriptor<com.bcs.bm.catalog_of_instruments_rudata.client.grpc.SubscribeCorporateActionKindRequest, com.bcs.bm.catalog_of_instruments_rudata.client.grpc.CorporateActionKind> getSubscribeCorporateActionKindsMethod;
    if ((getSubscribeCorporateActionKindsMethod = RudataServiceGrpc.getSubscribeCorporateActionKindsMethod) == null) {
      synchronized (RudataServiceGrpc.class) {
        if ((getSubscribeCorporateActionKindsMethod = RudataServiceGrpc.getSubscribeCorporateActionKindsMethod) == null) {
          RudataServiceGrpc.getSubscribeCorporateActionKindsMethod = getSubscribeCorporateActionKindsMethod = 
              io.grpc.MethodDescriptor.<com.bcs.bm.catalog_of_instruments_rudata.client.grpc.SubscribeCorporateActionKindRequest, com.bcs.bm.catalog_of_instruments_rudata.client.grpc.CorporateActionKind>newBuilder()
              .setType(io.grpc.MethodDescriptor.MethodType.SERVER_STREAMING)
              .setFullMethodName(generateFullMethodName(
                  "RudataService", "SubscribeCorporateActionKinds"))
              .setSampledToLocalTracing(true)
              .setRequestMarshaller(io.grpc.protobuf.ProtoUtils.marshaller(
                  com.bcs.bm.catalog_of_instruments_rudata.client.grpc.SubscribeCorporateActionKindRequest.getDefaultInstance()))
              .setResponseMarshaller(io.grpc.protobuf.ProtoUtils.marshaller(
                  com.bcs.bm.catalog_of_instruments_rudata.client.grpc.CorporateActionKind.getDefaultInstance()))
                  .setSchemaDescriptor(new RudataServiceMethodDescriptorSupplier("SubscribeCorporateActionKinds"))
                  .build();
          }
        }
     }
     return getSubscribeCorporateActionKindsMethod;
  }

  private static volatile io.grpc.MethodDescriptor<com.bcs.bm.catalog_of_instruments_rudata.client.grpc.CorporateActionSourcesRequest,
      com.bcs.bm.catalog_of_instruments_rudata.client.grpc.CorporateActionSourcesResponse> getGetCorporateActionSourcesMethod;

  @io.grpc.stub.annotations.RpcMethod(
      fullMethodName = SERVICE_NAME + '/' + "GetCorporateActionSources",
      requestType = com.bcs.bm.catalog_of_instruments_rudata.client.grpc.CorporateActionSourcesRequest.class,
      responseType = com.bcs.bm.catalog_of_instruments_rudata.client.grpc.CorporateActionSourcesResponse.class,
      methodType = io.grpc.MethodDescriptor.MethodType.UNARY)
  public static io.grpc.MethodDescriptor<com.bcs.bm.catalog_of_instruments_rudata.client.grpc.CorporateActionSourcesRequest,
      com.bcs.bm.catalog_of_instruments_rudata.client.grpc.CorporateActionSourcesResponse> getGetCorporateActionSourcesMethod() {
    io.grpc.MethodDescriptor<com.bcs.bm.catalog_of_instruments_rudata.client.grpc.CorporateActionSourcesRequest, com.bcs.bm.catalog_of_instruments_rudata.client.grpc.CorporateActionSourcesResponse> getGetCorporateActionSourcesMethod;
    if ((getGetCorporateActionSourcesMethod = RudataServiceGrpc.getGetCorporateActionSourcesMethod) == null) {
      synchronized (RudataServiceGrpc.class) {
        if ((getGetCorporateActionSourcesMethod = RudataServiceGrpc.getGetCorporateActionSourcesMethod) == null) {
          RudataServiceGrpc.getGetCorporateActionSourcesMethod = getGetCorporateActionSourcesMethod = 
              io.grpc.MethodDescriptor.<com.bcs.bm.catalog_of_instruments_rudata.client.grpc.CorporateActionSourcesRequest, com.bcs.bm.catalog_of_instruments_rudata.client.grpc.CorporateActionSourcesResponse>newBuilder()
              .setType(io.grpc.MethodDescriptor.MethodType.UNARY)
              .setFullMethodName(generateFullMethodName(
                  "RudataService", "GetCorporateActionSources"))
              .setSampledToLocalTracing(true)
              .setRequestMarshaller(io.grpc.protobuf.ProtoUtils.marshaller(
                  com.bcs.bm.catalog_of_instruments_rudata.client.grpc.CorporateActionSourcesRequest.getDefaultInstance()))
              .setResponseMarshaller(io.grpc.protobuf.ProtoUtils.marshaller(
                  com.bcs.bm.catalog_of_instruments_rudata.client.grpc.CorporateActionSourcesResponse.getDefaultInstance()))
                  .setSchemaDescriptor(new RudataServiceMethodDescriptorSupplier("GetCorporateActionSources"))
                  .build();
          }
        }
     }
     return getGetCorporateActionSourcesMethod;
  }

  private static volatile io.grpc.MethodDescriptor<com.bcs.bm.catalog_of_instruments_rudata.client.grpc.SubscribeCorporateActionSourceRequest,
      com.bcs.bm.catalog_of_instruments_rudata.client.grpc.CorporateActionSource> getSubscribeCorporateActionSourcesMethod;

  @io.grpc.stub.annotations.RpcMethod(
      fullMethodName = SERVICE_NAME + '/' + "SubscribeCorporateActionSources",
      requestType = com.bcs.bm.catalog_of_instruments_rudata.client.grpc.SubscribeCorporateActionSourceRequest.class,
      responseType = com.bcs.bm.catalog_of_instruments_rudata.client.grpc.CorporateActionSource.class,
      methodType = io.grpc.MethodDescriptor.MethodType.SERVER_STREAMING)
  public static io.grpc.MethodDescriptor<com.bcs.bm.catalog_of_instruments_rudata.client.grpc.SubscribeCorporateActionSourceRequest,
      com.bcs.bm.catalog_of_instruments_rudata.client.grpc.CorporateActionSource> getSubscribeCorporateActionSourcesMethod() {
    io.grpc.MethodDescriptor<com.bcs.bm.catalog_of_instruments_rudata.client.grpc.SubscribeCorporateActionSourceRequest, com.bcs.bm.catalog_of_instruments_rudata.client.grpc.CorporateActionSource> getSubscribeCorporateActionSourcesMethod;
    if ((getSubscribeCorporateActionSourcesMethod = RudataServiceGrpc.getSubscribeCorporateActionSourcesMethod) == null) {
      synchronized (RudataServiceGrpc.class) {
        if ((getSubscribeCorporateActionSourcesMethod = RudataServiceGrpc.getSubscribeCorporateActionSourcesMethod) == null) {
          RudataServiceGrpc.getSubscribeCorporateActionSourcesMethod = getSubscribeCorporateActionSourcesMethod = 
              io.grpc.MethodDescriptor.<com.bcs.bm.catalog_of_instruments_rudata.client.grpc.SubscribeCorporateActionSourceRequest, com.bcs.bm.catalog_of_instruments_rudata.client.grpc.CorporateActionSource>newBuilder()
              .setType(io.grpc.MethodDescriptor.MethodType.SERVER_STREAMING)
              .setFullMethodName(generateFullMethodName(
                  "RudataService", "SubscribeCorporateActionSources"))
              .setSampledToLocalTracing(true)
              .setRequestMarshaller(io.grpc.protobuf.ProtoUtils.marshaller(
                  com.bcs.bm.catalog_of_instruments_rudata.client.grpc.SubscribeCorporateActionSourceRequest.getDefaultInstance()))
              .setResponseMarshaller(io.grpc.protobuf.ProtoUtils.marshaller(
                  com.bcs.bm.catalog_of_instruments_rudata.client.grpc.CorporateActionSource.getDefaultInstance()))
                  .setSchemaDescriptor(new RudataServiceMethodDescriptorSupplier("SubscribeCorporateActionSources"))
                  .build();
          }
        }
     }
     return getSubscribeCorporateActionSourcesMethod;
  }

  private static volatile io.grpc.MethodDescriptor<com.bcs.bm.catalog_of_instruments_rudata.client.grpc.CorporateActionActionsRequest,
      com.bcs.bm.catalog_of_instruments_rudata.client.grpc.CorporateActionActionsResponse> getGetCorporateActionActionsMethod;

  @io.grpc.stub.annotations.RpcMethod(
      fullMethodName = SERVICE_NAME + '/' + "GetCorporateActionActions",
      requestType = com.bcs.bm.catalog_of_instruments_rudata.client.grpc.CorporateActionActionsRequest.class,
      responseType = com.bcs.bm.catalog_of_instruments_rudata.client.grpc.CorporateActionActionsResponse.class,
      methodType = io.grpc.MethodDescriptor.MethodType.UNARY)
  public static io.grpc.MethodDescriptor<com.bcs.bm.catalog_of_instruments_rudata.client.grpc.CorporateActionActionsRequest,
      com.bcs.bm.catalog_of_instruments_rudata.client.grpc.CorporateActionActionsResponse> getGetCorporateActionActionsMethod() {
    io.grpc.MethodDescriptor<com.bcs.bm.catalog_of_instruments_rudata.client.grpc.CorporateActionActionsRequest, com.bcs.bm.catalog_of_instruments_rudata.client.grpc.CorporateActionActionsResponse> getGetCorporateActionActionsMethod;
    if ((getGetCorporateActionActionsMethod = RudataServiceGrpc.getGetCorporateActionActionsMethod) == null) {
      synchronized (RudataServiceGrpc.class) {
        if ((getGetCorporateActionActionsMethod = RudataServiceGrpc.getGetCorporateActionActionsMethod) == null) {
          RudataServiceGrpc.getGetCorporateActionActionsMethod = getGetCorporateActionActionsMethod = 
              io.grpc.MethodDescriptor.<com.bcs.bm.catalog_of_instruments_rudata.client.grpc.CorporateActionActionsRequest, com.bcs.bm.catalog_of_instruments_rudata.client.grpc.CorporateActionActionsResponse>newBuilder()
              .setType(io.grpc.MethodDescriptor.MethodType.UNARY)
              .setFullMethodName(generateFullMethodName(
                  "RudataService", "GetCorporateActionActions"))
              .setSampledToLocalTracing(true)
              .setRequestMarshaller(io.grpc.protobuf.ProtoUtils.marshaller(
                  com.bcs.bm.catalog_of_instruments_rudata.client.grpc.CorporateActionActionsRequest.getDefaultInstance()))
              .setResponseMarshaller(io.grpc.protobuf.ProtoUtils.marshaller(
                  com.bcs.bm.catalog_of_instruments_rudata.client.grpc.CorporateActionActionsResponse.getDefaultInstance()))
                  .setSchemaDescriptor(new RudataServiceMethodDescriptorSupplier("GetCorporateActionActions"))
                  .build();
          }
        }
     }
     return getGetCorporateActionActionsMethod;
  }

  private static volatile io.grpc.MethodDescriptor<com.bcs.bm.catalog_of_instruments_rudata.client.grpc.SubscribeCorporateActionActionsRequest,
      com.bcs.bm.catalog_of_instruments_rudata.client.grpc.CorporateActionActions> getSubscribeCorporateActionActionsMethod;

  @io.grpc.stub.annotations.RpcMethod(
      fullMethodName = SERVICE_NAME + '/' + "SubscribeCorporateActionActions",
      requestType = com.bcs.bm.catalog_of_instruments_rudata.client.grpc.SubscribeCorporateActionActionsRequest.class,
      responseType = com.bcs.bm.catalog_of_instruments_rudata.client.grpc.CorporateActionActions.class,
      methodType = io.grpc.MethodDescriptor.MethodType.SERVER_STREAMING)
  public static io.grpc.MethodDescriptor<com.bcs.bm.catalog_of_instruments_rudata.client.grpc.SubscribeCorporateActionActionsRequest,
      com.bcs.bm.catalog_of_instruments_rudata.client.grpc.CorporateActionActions> getSubscribeCorporateActionActionsMethod() {
    io.grpc.MethodDescriptor<com.bcs.bm.catalog_of_instruments_rudata.client.grpc.SubscribeCorporateActionActionsRequest, com.bcs.bm.catalog_of_instruments_rudata.client.grpc.CorporateActionActions> getSubscribeCorporateActionActionsMethod;
    if ((getSubscribeCorporateActionActionsMethod = RudataServiceGrpc.getSubscribeCorporateActionActionsMethod) == null) {
      synchronized (RudataServiceGrpc.class) {
        if ((getSubscribeCorporateActionActionsMethod = RudataServiceGrpc.getSubscribeCorporateActionActionsMethod) == null) {
          RudataServiceGrpc.getSubscribeCorporateActionActionsMethod = getSubscribeCorporateActionActionsMethod = 
              io.grpc.MethodDescriptor.<com.bcs.bm.catalog_of_instruments_rudata.client.grpc.SubscribeCorporateActionActionsRequest, com.bcs.bm.catalog_of_instruments_rudata.client.grpc.CorporateActionActions>newBuilder()
              .setType(io.grpc.MethodDescriptor.MethodType.SERVER_STREAMING)
              .setFullMethodName(generateFullMethodName(
                  "RudataService", "SubscribeCorporateActionActions"))
              .setSampledToLocalTracing(true)
              .setRequestMarshaller(io.grpc.protobuf.ProtoUtils.marshaller(
                  com.bcs.bm.catalog_of_instruments_rudata.client.grpc.SubscribeCorporateActionActionsRequest.getDefaultInstance()))
              .setResponseMarshaller(io.grpc.protobuf.ProtoUtils.marshaller(
                  com.bcs.bm.catalog_of_instruments_rudata.client.grpc.CorporateActionActions.getDefaultInstance()))
                  .setSchemaDescriptor(new RudataServiceMethodDescriptorSupplier("SubscribeCorporateActionActions"))
                  .build();
          }
        }
     }
     return getSubscribeCorporateActionActionsMethod;
  }

  private static volatile io.grpc.MethodDescriptor<com.bcs.bm.catalog_of_instruments_rudata.client.grpc.ShareDividendRequest,
      com.bcs.bm.catalog_of_instruments_rudata.client.grpc.ShareDividendResponse> getGetShareDividendMethod;

  @io.grpc.stub.annotations.RpcMethod(
      fullMethodName = SERVICE_NAME + '/' + "GetShareDividend",
      requestType = com.bcs.bm.catalog_of_instruments_rudata.client.grpc.ShareDividendRequest.class,
      responseType = com.bcs.bm.catalog_of_instruments_rudata.client.grpc.ShareDividendResponse.class,
      methodType = io.grpc.MethodDescriptor.MethodType.UNARY)
  public static io.grpc.MethodDescriptor<com.bcs.bm.catalog_of_instruments_rudata.client.grpc.ShareDividendRequest,
      com.bcs.bm.catalog_of_instruments_rudata.client.grpc.ShareDividendResponse> getGetShareDividendMethod() {
    io.grpc.MethodDescriptor<com.bcs.bm.catalog_of_instruments_rudata.client.grpc.ShareDividendRequest, com.bcs.bm.catalog_of_instruments_rudata.client.grpc.ShareDividendResponse> getGetShareDividendMethod;
    if ((getGetShareDividendMethod = RudataServiceGrpc.getGetShareDividendMethod) == null) {
      synchronized (RudataServiceGrpc.class) {
        if ((getGetShareDividendMethod = RudataServiceGrpc.getGetShareDividendMethod) == null) {
          RudataServiceGrpc.getGetShareDividendMethod = getGetShareDividendMethod = 
              io.grpc.MethodDescriptor.<com.bcs.bm.catalog_of_instruments_rudata.client.grpc.ShareDividendRequest, com.bcs.bm.catalog_of_instruments_rudata.client.grpc.ShareDividendResponse>newBuilder()
              .setType(io.grpc.MethodDescriptor.MethodType.UNARY)
              .setFullMethodName(generateFullMethodName(
                  "RudataService", "GetShareDividend"))
              .setSampledToLocalTracing(true)
              .setRequestMarshaller(io.grpc.protobuf.ProtoUtils.marshaller(
                  com.bcs.bm.catalog_of_instruments_rudata.client.grpc.ShareDividendRequest.getDefaultInstance()))
              .setResponseMarshaller(io.grpc.protobuf.ProtoUtils.marshaller(
                  com.bcs.bm.catalog_of_instruments_rudata.client.grpc.ShareDividendResponse.getDefaultInstance()))
                  .setSchemaDescriptor(new RudataServiceMethodDescriptorSupplier("GetShareDividend"))
                  .build();
          }
        }
     }
     return getGetShareDividendMethod;
  }

  private static volatile io.grpc.MethodDescriptor<com.bcs.bm.catalog_of_instruments_rudata.client.grpc.SubscribeShareDividendRequest,
      com.bcs.bm.catalog_of_instruments_rudata.client.grpc.ShareDividend> getSubscribeShareDividendMethod;

  @io.grpc.stub.annotations.RpcMethod(
      fullMethodName = SERVICE_NAME + '/' + "SubscribeShareDividend",
      requestType = com.bcs.bm.catalog_of_instruments_rudata.client.grpc.SubscribeShareDividendRequest.class,
      responseType = com.bcs.bm.catalog_of_instruments_rudata.client.grpc.ShareDividend.class,
      methodType = io.grpc.MethodDescriptor.MethodType.SERVER_STREAMING)
  public static io.grpc.MethodDescriptor<com.bcs.bm.catalog_of_instruments_rudata.client.grpc.SubscribeShareDividendRequest,
      com.bcs.bm.catalog_of_instruments_rudata.client.grpc.ShareDividend> getSubscribeShareDividendMethod() {
    io.grpc.MethodDescriptor<com.bcs.bm.catalog_of_instruments_rudata.client.grpc.SubscribeShareDividendRequest, com.bcs.bm.catalog_of_instruments_rudata.client.grpc.ShareDividend> getSubscribeShareDividendMethod;
    if ((getSubscribeShareDividendMethod = RudataServiceGrpc.getSubscribeShareDividendMethod) == null) {
      synchronized (RudataServiceGrpc.class) {
        if ((getSubscribeShareDividendMethod = RudataServiceGrpc.getSubscribeShareDividendMethod) == null) {
          RudataServiceGrpc.getSubscribeShareDividendMethod = getSubscribeShareDividendMethod = 
              io.grpc.MethodDescriptor.<com.bcs.bm.catalog_of_instruments_rudata.client.grpc.SubscribeShareDividendRequest, com.bcs.bm.catalog_of_instruments_rudata.client.grpc.ShareDividend>newBuilder()
              .setType(io.grpc.MethodDescriptor.MethodType.SERVER_STREAMING)
              .setFullMethodName(generateFullMethodName(
                  "RudataService", "SubscribeShareDividend"))
              .setSampledToLocalTracing(true)
              .setRequestMarshaller(io.grpc.protobuf.ProtoUtils.marshaller(
                  com.bcs.bm.catalog_of_instruments_rudata.client.grpc.SubscribeShareDividendRequest.getDefaultInstance()))
              .setResponseMarshaller(io.grpc.protobuf.ProtoUtils.marshaller(
                  com.bcs.bm.catalog_of_instruments_rudata.client.grpc.ShareDividend.getDefaultInstance()))
                  .setSchemaDescriptor(new RudataServiceMethodDescriptorSupplier("SubscribeShareDividend"))
                  .build();
          }
        }
     }
     return getSubscribeShareDividendMethod;
  }

  private static volatile io.grpc.MethodDescriptor<com.bcs.bm.catalog_of_instruments_rudata.client.grpc.InfoCurrenciesRequest,
      com.bcs.bm.catalog_of_instruments_rudata.client.grpc.InfoCurrenciesResponse> getGetInfoCurrenciesMethod;

  @io.grpc.stub.annotations.RpcMethod(
      fullMethodName = SERVICE_NAME + '/' + "GetInfoCurrencies",
      requestType = com.bcs.bm.catalog_of_instruments_rudata.client.grpc.InfoCurrenciesRequest.class,
      responseType = com.bcs.bm.catalog_of_instruments_rudata.client.grpc.InfoCurrenciesResponse.class,
      methodType = io.grpc.MethodDescriptor.MethodType.UNARY)
  public static io.grpc.MethodDescriptor<com.bcs.bm.catalog_of_instruments_rudata.client.grpc.InfoCurrenciesRequest,
      com.bcs.bm.catalog_of_instruments_rudata.client.grpc.InfoCurrenciesResponse> getGetInfoCurrenciesMethod() {
    io.grpc.MethodDescriptor<com.bcs.bm.catalog_of_instruments_rudata.client.grpc.InfoCurrenciesRequest, com.bcs.bm.catalog_of_instruments_rudata.client.grpc.InfoCurrenciesResponse> getGetInfoCurrenciesMethod;
    if ((getGetInfoCurrenciesMethod = RudataServiceGrpc.getGetInfoCurrenciesMethod) == null) {
      synchronized (RudataServiceGrpc.class) {
        if ((getGetInfoCurrenciesMethod = RudataServiceGrpc.getGetInfoCurrenciesMethod) == null) {
          RudataServiceGrpc.getGetInfoCurrenciesMethod = getGetInfoCurrenciesMethod = 
              io.grpc.MethodDescriptor.<com.bcs.bm.catalog_of_instruments_rudata.client.grpc.InfoCurrenciesRequest, com.bcs.bm.catalog_of_instruments_rudata.client.grpc.InfoCurrenciesResponse>newBuilder()
              .setType(io.grpc.MethodDescriptor.MethodType.UNARY)
              .setFullMethodName(generateFullMethodName(
                  "RudataService", "GetInfoCurrencies"))
              .setSampledToLocalTracing(true)
              .setRequestMarshaller(io.grpc.protobuf.ProtoUtils.marshaller(
                  com.bcs.bm.catalog_of_instruments_rudata.client.grpc.InfoCurrenciesRequest.getDefaultInstance()))
              .setResponseMarshaller(io.grpc.protobuf.ProtoUtils.marshaller(
                  com.bcs.bm.catalog_of_instruments_rudata.client.grpc.InfoCurrenciesResponse.getDefaultInstance()))
                  .setSchemaDescriptor(new RudataServiceMethodDescriptorSupplier("GetInfoCurrencies"))
                  .build();
          }
        }
     }
     return getGetInfoCurrenciesMethod;
  }

  private static volatile io.grpc.MethodDescriptor<com.bcs.bm.catalog_of_instruments_rudata.client.grpc.SubscribeInfoCurrenciesRequest,
      com.bcs.bm.catalog_of_instruments_rudata.client.grpc.InfoCurrencies> getSubscribeInfoCurrenciesMethod;

  @io.grpc.stub.annotations.RpcMethod(
      fullMethodName = SERVICE_NAME + '/' + "SubscribeInfoCurrencies",
      requestType = com.bcs.bm.catalog_of_instruments_rudata.client.grpc.SubscribeInfoCurrenciesRequest.class,
      responseType = com.bcs.bm.catalog_of_instruments_rudata.client.grpc.InfoCurrencies.class,
      methodType = io.grpc.MethodDescriptor.MethodType.SERVER_STREAMING)
  public static io.grpc.MethodDescriptor<com.bcs.bm.catalog_of_instruments_rudata.client.grpc.SubscribeInfoCurrenciesRequest,
      com.bcs.bm.catalog_of_instruments_rudata.client.grpc.InfoCurrencies> getSubscribeInfoCurrenciesMethod() {
    io.grpc.MethodDescriptor<com.bcs.bm.catalog_of_instruments_rudata.client.grpc.SubscribeInfoCurrenciesRequest, com.bcs.bm.catalog_of_instruments_rudata.client.grpc.InfoCurrencies> getSubscribeInfoCurrenciesMethod;
    if ((getSubscribeInfoCurrenciesMethod = RudataServiceGrpc.getSubscribeInfoCurrenciesMethod) == null) {
      synchronized (RudataServiceGrpc.class) {
        if ((getSubscribeInfoCurrenciesMethod = RudataServiceGrpc.getSubscribeInfoCurrenciesMethod) == null) {
          RudataServiceGrpc.getSubscribeInfoCurrenciesMethod = getSubscribeInfoCurrenciesMethod = 
              io.grpc.MethodDescriptor.<com.bcs.bm.catalog_of_instruments_rudata.client.grpc.SubscribeInfoCurrenciesRequest, com.bcs.bm.catalog_of_instruments_rudata.client.grpc.InfoCurrencies>newBuilder()
              .setType(io.grpc.MethodDescriptor.MethodType.SERVER_STREAMING)
              .setFullMethodName(generateFullMethodName(
                  "RudataService", "SubscribeInfoCurrencies"))
              .setSampledToLocalTracing(true)
              .setRequestMarshaller(io.grpc.protobuf.ProtoUtils.marshaller(
                  com.bcs.bm.catalog_of_instruments_rudata.client.grpc.SubscribeInfoCurrenciesRequest.getDefaultInstance()))
              .setResponseMarshaller(io.grpc.protobuf.ProtoUtils.marshaller(
                  com.bcs.bm.catalog_of_instruments_rudata.client.grpc.InfoCurrencies.getDefaultInstance()))
                  .setSchemaDescriptor(new RudataServiceMethodDescriptorSupplier("SubscribeInfoCurrencies"))
                  .build();
          }
        }
     }
     return getSubscribeInfoCurrenciesMethod;
  }

  /**
   * Creates a new async stub that supports all call types for the service
   */
  public static RudataServiceStub newStub(io.grpc.Channel channel) {
    return new RudataServiceStub(channel);
  }

  /**
   * Creates a new blocking-style stub that supports unary and streaming output calls on the service
   */
  public static RudataServiceBlockingStub newBlockingStub(
      io.grpc.Channel channel) {
    return new RudataServiceBlockingStub(channel);
  }

  /**
   * Creates a new ListenableFuture-style stub that supports unary calls on the service
   */
  public static RudataServiceFutureStub newFutureStub(
      io.grpc.Channel channel) {
    return new RudataServiceFutureStub(channel);
  }

  /**
   */
  public static abstract class RudataServiceImplBase implements io.grpc.BindableService {

    /**
     */
    public void getInfoEmitents(com.bcs.bm.catalog_of_instruments_rudata.client.grpc.InfoEmitentsRequest request,
        io.grpc.stub.StreamObserver<com.bcs.bm.catalog_of_instruments_rudata.client.grpc.InfoEmitentsResponse> responseObserver) {
      asyncUnimplementedUnaryCall(getGetInfoEmitentsMethod(), responseObserver);
    }

    /**
     */
    public void subscribeEmitents(com.bcs.bm.catalog_of_instruments_rudata.client.grpc.SubscribeEmitentsRequest request,
        io.grpc.stub.StreamObserver<com.bcs.bm.catalog_of_instruments_rudata.client.grpc.Emitent> responseObserver) {
      asyncUnimplementedUnaryCall(getSubscribeEmitentsMethod(), responseObserver);
    }

    /**
     */
    public void getInfoSecurities(com.bcs.bm.catalog_of_instruments_rudata.client.grpc.InfoSecuritiesRequest request,
        io.grpc.stub.StreamObserver<com.bcs.bm.catalog_of_instruments_rudata.client.grpc.InfoSecuritiesResponse> responseObserver) {
      asyncUnimplementedUnaryCall(getGetInfoSecuritiesMethod(), responseObserver);
    }

    /**
     */
    public void subscribeSecurities(com.bcs.bm.catalog_of_instruments_rudata.client.grpc.SubscribeSecuritiesRequest request,
        io.grpc.stub.StreamObserver<com.bcs.bm.catalog_of_instruments_rudata.client.grpc.Security> responseObserver) {
      asyncUnimplementedUnaryCall(getSubscribeSecuritiesMethod(), responseObserver);
    }

    /**
     */
    public void getInfoFintoolReferenceData(com.bcs.bm.catalog_of_instruments_rudata.client.grpc.InfoFintoolReferenceDataRequest request,
        io.grpc.stub.StreamObserver<com.bcs.bm.catalog_of_instruments_rudata.client.grpc.InfoFintoolReferenceDataResponse> responseObserver) {
      asyncUnimplementedUnaryCall(getGetInfoFintoolReferenceDataMethod(), responseObserver);
    }

    /**
     */
    public void subscribeFintoolReferenceData(com.bcs.bm.catalog_of_instruments_rudata.client.grpc.SubscribeFintoolReferenceDataRequest request,
        io.grpc.stub.StreamObserver<com.bcs.bm.catalog_of_instruments_rudata.client.grpc.FintoolReferenceData> responseObserver) {
      asyncUnimplementedUnaryCall(getSubscribeFintoolReferenceDataMethod(), responseObserver);
    }

    /**
     */
    public void getBondOffers(com.bcs.bm.catalog_of_instruments_rudata.client.grpc.BondOffersRequest request,
        io.grpc.stub.StreamObserver<com.bcs.bm.catalog_of_instruments_rudata.client.grpc.BondOffersResponse> responseObserver) {
      asyncUnimplementedUnaryCall(getGetBondOffersMethod(), responseObserver);
    }

    /**
     */
    public void subscribeBondOffers(com.bcs.bm.catalog_of_instruments_rudata.client.grpc.SubscribeBondOffersRequest request,
        io.grpc.stub.StreamObserver<com.bcs.bm.catalog_of_instruments_rudata.client.grpc.BondOffers> responseObserver) {
      asyncUnimplementedUnaryCall(getSubscribeBondOffersMethod(), responseObserver);
    }

    /**
     */
    public void getBondConvertation(com.bcs.bm.catalog_of_instruments_rudata.client.grpc.BondConvertationRequest request,
        io.grpc.stub.StreamObserver<com.bcs.bm.catalog_of_instruments_rudata.client.grpc.BondConvertationResponse> responseObserver) {
      asyncUnimplementedUnaryCall(getGetBondConvertationMethod(), responseObserver);
    }

    /**
     */
    public void subscribeBondConvertation(com.bcs.bm.catalog_of_instruments_rudata.client.grpc.SubscribeBondConvertationRequest request,
        io.grpc.stub.StreamObserver<com.bcs.bm.catalog_of_instruments_rudata.client.grpc.BondConvertation> responseObserver) {
      asyncUnimplementedUnaryCall(getSubscribeBondConvertationMethod(), responseObserver);
    }

    /**
     */
    public void getBondCoupons(com.bcs.bm.catalog_of_instruments_rudata.client.grpc.BondCouponsRequest request,
        io.grpc.stub.StreamObserver<com.bcs.bm.catalog_of_instruments_rudata.client.grpc.BondCouponsResponse> responseObserver) {
      asyncUnimplementedUnaryCall(getGetBondCouponsMethod(), responseObserver);
    }

    /**
     */
    public void subscribeBondCoupons(com.bcs.bm.catalog_of_instruments_rudata.client.grpc.SubscribeBondCouponsRequest request,
        io.grpc.stub.StreamObserver<com.bcs.bm.catalog_of_instruments_rudata.client.grpc.BondCoupons> responseObserver) {
      asyncUnimplementedUnaryCall(getSubscribeBondCouponsMethod(), responseObserver);
    }

    /**
     */
    public void getBondAmortizations(com.bcs.bm.catalog_of_instruments_rudata.client.grpc.BondAmortizationsRequest request,
        io.grpc.stub.StreamObserver<com.bcs.bm.catalog_of_instruments_rudata.client.grpc.BondAmortizationsResponse> responseObserver) {
      asyncUnimplementedUnaryCall(getGetBondAmortizationsMethod(), responseObserver);
    }

    /**
     */
    public void subscribeBondAmortizations(com.bcs.bm.catalog_of_instruments_rudata.client.grpc.SubscribeBondAmortizationsRequest request,
        io.grpc.stub.StreamObserver<com.bcs.bm.catalog_of_instruments_rudata.client.grpc.BondAmortizations> responseObserver) {
      asyncUnimplementedUnaryCall(getSubscribeBondAmortizationsMethod(), responseObserver);
    }

    /**
     */
    public void getBondMaturities(com.bcs.bm.catalog_of_instruments_rudata.client.grpc.BondMaturitiesRequest request,
        io.grpc.stub.StreamObserver<com.bcs.bm.catalog_of_instruments_rudata.client.grpc.BondMaturitiesResponse> responseObserver) {
      asyncUnimplementedUnaryCall(getGetBondMaturitiesMethod(), responseObserver);
    }

    /**
     */
    public void subscribeBondMaturities(com.bcs.bm.catalog_of_instruments_rudata.client.grpc.SubscribeBondMaturitiesRequest request,
        io.grpc.stub.StreamObserver<com.bcs.bm.catalog_of_instruments_rudata.client.grpc.BondMaturities> responseObserver) {
      asyncUnimplementedUnaryCall(getSubscribeBondMaturitiesMethod(), responseObserver);
    }

    /**
     */
    public void getCorporateActionKindGroups(com.bcs.bm.catalog_of_instruments_rudata.client.grpc.CorporateActionKindGroupsRequest request,
        io.grpc.stub.StreamObserver<com.bcs.bm.catalog_of_instruments_rudata.client.grpc.CorporateActionKindGroupsResponse> responseObserver) {
      asyncUnimplementedUnaryCall(getGetCorporateActionKindGroupsMethod(), responseObserver);
    }

    /**
     */
    public void subscribeCorporateActionKindGroups(com.bcs.bm.catalog_of_instruments_rudata.client.grpc.SubscribeCorporateActionKindGroupsRequest request,
        io.grpc.stub.StreamObserver<com.bcs.bm.catalog_of_instruments_rudata.client.grpc.CorporateActionKindGroups> responseObserver) {
      asyncUnimplementedUnaryCall(getSubscribeCorporateActionKindGroupsMethod(), responseObserver);
    }

    /**
     */
    public void getCorporateActionKinds(com.bcs.bm.catalog_of_instruments_rudata.client.grpc.CorporateActionKindsRequest request,
        io.grpc.stub.StreamObserver<com.bcs.bm.catalog_of_instruments_rudata.client.grpc.CorporateActionKindsResponse> responseObserver) {
      asyncUnimplementedUnaryCall(getGetCorporateActionKindsMethod(), responseObserver);
    }

    /**
     */
    public void subscribeCorporateActionKinds(com.bcs.bm.catalog_of_instruments_rudata.client.grpc.SubscribeCorporateActionKindRequest request,
        io.grpc.stub.StreamObserver<com.bcs.bm.catalog_of_instruments_rudata.client.grpc.CorporateActionKind> responseObserver) {
      asyncUnimplementedUnaryCall(getSubscribeCorporateActionKindsMethod(), responseObserver);
    }

    /**
     */
    public void getCorporateActionSources(com.bcs.bm.catalog_of_instruments_rudata.client.grpc.CorporateActionSourcesRequest request,
        io.grpc.stub.StreamObserver<com.bcs.bm.catalog_of_instruments_rudata.client.grpc.CorporateActionSourcesResponse> responseObserver) {
      asyncUnimplementedUnaryCall(getGetCorporateActionSourcesMethod(), responseObserver);
    }

    /**
     */
    public void subscribeCorporateActionSources(com.bcs.bm.catalog_of_instruments_rudata.client.grpc.SubscribeCorporateActionSourceRequest request,
        io.grpc.stub.StreamObserver<com.bcs.bm.catalog_of_instruments_rudata.client.grpc.CorporateActionSource> responseObserver) {
      asyncUnimplementedUnaryCall(getSubscribeCorporateActionSourcesMethod(), responseObserver);
    }

    /**
     */
    public void getCorporateActionActions(com.bcs.bm.catalog_of_instruments_rudata.client.grpc.CorporateActionActionsRequest request,
        io.grpc.stub.StreamObserver<com.bcs.bm.catalog_of_instruments_rudata.client.grpc.CorporateActionActionsResponse> responseObserver) {
      asyncUnimplementedUnaryCall(getGetCorporateActionActionsMethod(), responseObserver);
    }

    /**
     */
    public void subscribeCorporateActionActions(com.bcs.bm.catalog_of_instruments_rudata.client.grpc.SubscribeCorporateActionActionsRequest request,
        io.grpc.stub.StreamObserver<com.bcs.bm.catalog_of_instruments_rudata.client.grpc.CorporateActionActions> responseObserver) {
      asyncUnimplementedUnaryCall(getSubscribeCorporateActionActionsMethod(), responseObserver);
    }

    /**
     */
    public void getShareDividend(com.bcs.bm.catalog_of_instruments_rudata.client.grpc.ShareDividendRequest request,
        io.grpc.stub.StreamObserver<com.bcs.bm.catalog_of_instruments_rudata.client.grpc.ShareDividendResponse> responseObserver) {
      asyncUnimplementedUnaryCall(getGetShareDividendMethod(), responseObserver);
    }

    /**
     */
    public void subscribeShareDividend(com.bcs.bm.catalog_of_instruments_rudata.client.grpc.SubscribeShareDividendRequest request,
        io.grpc.stub.StreamObserver<com.bcs.bm.catalog_of_instruments_rudata.client.grpc.ShareDividend> responseObserver) {
      asyncUnimplementedUnaryCall(getSubscribeShareDividendMethod(), responseObserver);
    }

    /**
     */
    public void getInfoCurrencies(com.bcs.bm.catalog_of_instruments_rudata.client.grpc.InfoCurrenciesRequest request,
        io.grpc.stub.StreamObserver<com.bcs.bm.catalog_of_instruments_rudata.client.grpc.InfoCurrenciesResponse> responseObserver) {
      asyncUnimplementedUnaryCall(getGetInfoCurrenciesMethod(), responseObserver);
    }

    /**
     */
    public void subscribeInfoCurrencies(com.bcs.bm.catalog_of_instruments_rudata.client.grpc.SubscribeInfoCurrenciesRequest request,
        io.grpc.stub.StreamObserver<com.bcs.bm.catalog_of_instruments_rudata.client.grpc.InfoCurrencies> responseObserver) {
      asyncUnimplementedUnaryCall(getSubscribeInfoCurrenciesMethod(), responseObserver);
    }

    @java.lang.Override public final io.grpc.ServerServiceDefinition bindService() {
      return io.grpc.ServerServiceDefinition.builder(getServiceDescriptor())
          .addMethod(
            getGetInfoEmitentsMethod(),
            asyncUnaryCall(
              new MethodHandlers<
                com.bcs.bm.catalog_of_instruments_rudata.client.grpc.InfoEmitentsRequest,
                com.bcs.bm.catalog_of_instruments_rudata.client.grpc.InfoEmitentsResponse>(
                  this, METHODID_GET_INFO_EMITENTS)))
          .addMethod(
            getSubscribeEmitentsMethod(),
            asyncServerStreamingCall(
              new MethodHandlers<
                com.bcs.bm.catalog_of_instruments_rudata.client.grpc.SubscribeEmitentsRequest,
                com.bcs.bm.catalog_of_instruments_rudata.client.grpc.Emitent>(
                  this, METHODID_SUBSCRIBE_EMITENTS)))
          .addMethod(
            getGetInfoSecuritiesMethod(),
            asyncUnaryCall(
              new MethodHandlers<
                com.bcs.bm.catalog_of_instruments_rudata.client.grpc.InfoSecuritiesRequest,
                com.bcs.bm.catalog_of_instruments_rudata.client.grpc.InfoSecuritiesResponse>(
                  this, METHODID_GET_INFO_SECURITIES)))
          .addMethod(
            getSubscribeSecuritiesMethod(),
            asyncServerStreamingCall(
              new MethodHandlers<
                com.bcs.bm.catalog_of_instruments_rudata.client.grpc.SubscribeSecuritiesRequest,
                com.bcs.bm.catalog_of_instruments_rudata.client.grpc.Security>(
                  this, METHODID_SUBSCRIBE_SECURITIES)))
          .addMethod(
            getGetInfoFintoolReferenceDataMethod(),
            asyncUnaryCall(
              new MethodHandlers<
                com.bcs.bm.catalog_of_instruments_rudata.client.grpc.InfoFintoolReferenceDataRequest,
                com.bcs.bm.catalog_of_instruments_rudata.client.grpc.InfoFintoolReferenceDataResponse>(
                  this, METHODID_GET_INFO_FINTOOL_REFERENCE_DATA)))
          .addMethod(
            getSubscribeFintoolReferenceDataMethod(),
            asyncServerStreamingCall(
              new MethodHandlers<
                com.bcs.bm.catalog_of_instruments_rudata.client.grpc.SubscribeFintoolReferenceDataRequest,
                com.bcs.bm.catalog_of_instruments_rudata.client.grpc.FintoolReferenceData>(
                  this, METHODID_SUBSCRIBE_FINTOOL_REFERENCE_DATA)))
          .addMethod(
            getGetBondOffersMethod(),
            asyncUnaryCall(
              new MethodHandlers<
                com.bcs.bm.catalog_of_instruments_rudata.client.grpc.BondOffersRequest,
                com.bcs.bm.catalog_of_instruments_rudata.client.grpc.BondOffersResponse>(
                  this, METHODID_GET_BOND_OFFERS)))
          .addMethod(
            getSubscribeBondOffersMethod(),
            asyncServerStreamingCall(
              new MethodHandlers<
                com.bcs.bm.catalog_of_instruments_rudata.client.grpc.SubscribeBondOffersRequest,
                com.bcs.bm.catalog_of_instruments_rudata.client.grpc.BondOffers>(
                  this, METHODID_SUBSCRIBE_BOND_OFFERS)))
          .addMethod(
            getGetBondConvertationMethod(),
            asyncUnaryCall(
              new MethodHandlers<
                com.bcs.bm.catalog_of_instruments_rudata.client.grpc.BondConvertationRequest,
                com.bcs.bm.catalog_of_instruments_rudata.client.grpc.BondConvertationResponse>(
                  this, METHODID_GET_BOND_CONVERTATION)))
          .addMethod(
            getSubscribeBondConvertationMethod(),
            asyncServerStreamingCall(
              new MethodHandlers<
                com.bcs.bm.catalog_of_instruments_rudata.client.grpc.SubscribeBondConvertationRequest,
                com.bcs.bm.catalog_of_instruments_rudata.client.grpc.BondConvertation>(
                  this, METHODID_SUBSCRIBE_BOND_CONVERTATION)))
          .addMethod(
            getGetBondCouponsMethod(),
            asyncUnaryCall(
              new MethodHandlers<
                com.bcs.bm.catalog_of_instruments_rudata.client.grpc.BondCouponsRequest,
                com.bcs.bm.catalog_of_instruments_rudata.client.grpc.BondCouponsResponse>(
                  this, METHODID_GET_BOND_COUPONS)))
          .addMethod(
            getSubscribeBondCouponsMethod(),
            asyncServerStreamingCall(
              new MethodHandlers<
                com.bcs.bm.catalog_of_instruments_rudata.client.grpc.SubscribeBondCouponsRequest,
                com.bcs.bm.catalog_of_instruments_rudata.client.grpc.BondCoupons>(
                  this, METHODID_SUBSCRIBE_BOND_COUPONS)))
          .addMethod(
            getGetBondAmortizationsMethod(),
            asyncUnaryCall(
              new MethodHandlers<
                com.bcs.bm.catalog_of_instruments_rudata.client.grpc.BondAmortizationsRequest,
                com.bcs.bm.catalog_of_instruments_rudata.client.grpc.BondAmortizationsResponse>(
                  this, METHODID_GET_BOND_AMORTIZATIONS)))
          .addMethod(
            getSubscribeBondAmortizationsMethod(),
            asyncServerStreamingCall(
              new MethodHandlers<
                com.bcs.bm.catalog_of_instruments_rudata.client.grpc.SubscribeBondAmortizationsRequest,
                com.bcs.bm.catalog_of_instruments_rudata.client.grpc.BondAmortizations>(
                  this, METHODID_SUBSCRIBE_BOND_AMORTIZATIONS)))
          .addMethod(
            getGetBondMaturitiesMethod(),
            asyncUnaryCall(
              new MethodHandlers<
                com.bcs.bm.catalog_of_instruments_rudata.client.grpc.BondMaturitiesRequest,
                com.bcs.bm.catalog_of_instruments_rudata.client.grpc.BondMaturitiesResponse>(
                  this, METHODID_GET_BOND_MATURITIES)))
          .addMethod(
            getSubscribeBondMaturitiesMethod(),
            asyncServerStreamingCall(
              new MethodHandlers<
                com.bcs.bm.catalog_of_instruments_rudata.client.grpc.SubscribeBondMaturitiesRequest,
                com.bcs.bm.catalog_of_instruments_rudata.client.grpc.BondMaturities>(
                  this, METHODID_SUBSCRIBE_BOND_MATURITIES)))
          .addMethod(
            getGetCorporateActionKindGroupsMethod(),
            asyncUnaryCall(
              new MethodHandlers<
                com.bcs.bm.catalog_of_instruments_rudata.client.grpc.CorporateActionKindGroupsRequest,
                com.bcs.bm.catalog_of_instruments_rudata.client.grpc.CorporateActionKindGroupsResponse>(
                  this, METHODID_GET_CORPORATE_ACTION_KIND_GROUPS)))
          .addMethod(
            getSubscribeCorporateActionKindGroupsMethod(),
            asyncServerStreamingCall(
              new MethodHandlers<
                com.bcs.bm.catalog_of_instruments_rudata.client.grpc.SubscribeCorporateActionKindGroupsRequest,
                com.bcs.bm.catalog_of_instruments_rudata.client.grpc.CorporateActionKindGroups>(
                  this, METHODID_SUBSCRIBE_CORPORATE_ACTION_KIND_GROUPS)))
          .addMethod(
            getGetCorporateActionKindsMethod(),
            asyncUnaryCall(
              new MethodHandlers<
                com.bcs.bm.catalog_of_instruments_rudata.client.grpc.CorporateActionKindsRequest,
                com.bcs.bm.catalog_of_instruments_rudata.client.grpc.CorporateActionKindsResponse>(
                  this, METHODID_GET_CORPORATE_ACTION_KINDS)))
          .addMethod(
            getSubscribeCorporateActionKindsMethod(),
            asyncServerStreamingCall(
              new MethodHandlers<
                com.bcs.bm.catalog_of_instruments_rudata.client.grpc.SubscribeCorporateActionKindRequest,
                com.bcs.bm.catalog_of_instruments_rudata.client.grpc.CorporateActionKind>(
                  this, METHODID_SUBSCRIBE_CORPORATE_ACTION_KINDS)))
          .addMethod(
            getGetCorporateActionSourcesMethod(),
            asyncUnaryCall(
              new MethodHandlers<
                com.bcs.bm.catalog_of_instruments_rudata.client.grpc.CorporateActionSourcesRequest,
                com.bcs.bm.catalog_of_instruments_rudata.client.grpc.CorporateActionSourcesResponse>(
                  this, METHODID_GET_CORPORATE_ACTION_SOURCES)))
          .addMethod(
            getSubscribeCorporateActionSourcesMethod(),
            asyncServerStreamingCall(
              new MethodHandlers<
                com.bcs.bm.catalog_of_instruments_rudata.client.grpc.SubscribeCorporateActionSourceRequest,
                com.bcs.bm.catalog_of_instruments_rudata.client.grpc.CorporateActionSource>(
                  this, METHODID_SUBSCRIBE_CORPORATE_ACTION_SOURCES)))
          .addMethod(
            getGetCorporateActionActionsMethod(),
            asyncUnaryCall(
              new MethodHandlers<
                com.bcs.bm.catalog_of_instruments_rudata.client.grpc.CorporateActionActionsRequest,
                com.bcs.bm.catalog_of_instruments_rudata.client.grpc.CorporateActionActionsResponse>(
                  this, METHODID_GET_CORPORATE_ACTION_ACTIONS)))
          .addMethod(
            getSubscribeCorporateActionActionsMethod(),
            asyncServerStreamingCall(
              new MethodHandlers<
                com.bcs.bm.catalog_of_instruments_rudata.client.grpc.SubscribeCorporateActionActionsRequest,
                com.bcs.bm.catalog_of_instruments_rudata.client.grpc.CorporateActionActions>(
                  this, METHODID_SUBSCRIBE_CORPORATE_ACTION_ACTIONS)))
          .addMethod(
            getGetShareDividendMethod(),
            asyncUnaryCall(
              new MethodHandlers<
                com.bcs.bm.catalog_of_instruments_rudata.client.grpc.ShareDividendRequest,
                com.bcs.bm.catalog_of_instruments_rudata.client.grpc.ShareDividendResponse>(
                  this, METHODID_GET_SHARE_DIVIDEND)))
          .addMethod(
            getSubscribeShareDividendMethod(),
            asyncServerStreamingCall(
              new MethodHandlers<
                com.bcs.bm.catalog_of_instruments_rudata.client.grpc.SubscribeShareDividendRequest,
                com.bcs.bm.catalog_of_instruments_rudata.client.grpc.ShareDividend>(
                  this, METHODID_SUBSCRIBE_SHARE_DIVIDEND)))
          .addMethod(
            getGetInfoCurrenciesMethod(),
            asyncUnaryCall(
              new MethodHandlers<
                com.bcs.bm.catalog_of_instruments_rudata.client.grpc.InfoCurrenciesRequest,
                com.bcs.bm.catalog_of_instruments_rudata.client.grpc.InfoCurrenciesResponse>(
                  this, METHODID_GET_INFO_CURRENCIES)))
          .addMethod(
            getSubscribeInfoCurrenciesMethod(),
            asyncServerStreamingCall(
              new MethodHandlers<
                com.bcs.bm.catalog_of_instruments_rudata.client.grpc.SubscribeInfoCurrenciesRequest,
                com.bcs.bm.catalog_of_instruments_rudata.client.grpc.InfoCurrencies>(
                  this, METHODID_SUBSCRIBE_INFO_CURRENCIES)))
          .build();
    }
  }

  /**
   */
  public static final class RudataServiceStub extends io.grpc.stub.AbstractStub<RudataServiceStub> {
    private RudataServiceStub(io.grpc.Channel channel) {
      super(channel);
    }

    private RudataServiceStub(io.grpc.Channel channel,
        io.grpc.CallOptions callOptions) {
      super(channel, callOptions);
    }

    @java.lang.Override
    protected RudataServiceStub build(io.grpc.Channel channel,
        io.grpc.CallOptions callOptions) {
      return new RudataServiceStub(channel, callOptions);
    }

    /**
     */
    public void getInfoEmitents(com.bcs.bm.catalog_of_instruments_rudata.client.grpc.InfoEmitentsRequest request,
        io.grpc.stub.StreamObserver<com.bcs.bm.catalog_of_instruments_rudata.client.grpc.InfoEmitentsResponse> responseObserver) {
      asyncUnaryCall(
          getChannel().newCall(getGetInfoEmitentsMethod(), getCallOptions()), request, responseObserver);
    }

    /**
     */
    public void subscribeEmitents(com.bcs.bm.catalog_of_instruments_rudata.client.grpc.SubscribeEmitentsRequest request,
        io.grpc.stub.StreamObserver<com.bcs.bm.catalog_of_instruments_rudata.client.grpc.Emitent> responseObserver) {
      asyncServerStreamingCall(
          getChannel().newCall(getSubscribeEmitentsMethod(), getCallOptions()), request, responseObserver);
    }

    /**
     */
    public void getInfoSecurities(com.bcs.bm.catalog_of_instruments_rudata.client.grpc.InfoSecuritiesRequest request,
        io.grpc.stub.StreamObserver<com.bcs.bm.catalog_of_instruments_rudata.client.grpc.InfoSecuritiesResponse> responseObserver) {
      asyncUnaryCall(
          getChannel().newCall(getGetInfoSecuritiesMethod(), getCallOptions()), request, responseObserver);
    }

    /**
     */
    public void subscribeSecurities(com.bcs.bm.catalog_of_instruments_rudata.client.grpc.SubscribeSecuritiesRequest request,
        io.grpc.stub.StreamObserver<com.bcs.bm.catalog_of_instruments_rudata.client.grpc.Security> responseObserver) {
      asyncServerStreamingCall(
          getChannel().newCall(getSubscribeSecuritiesMethod(), getCallOptions()), request, responseObserver);
    }

    /**
     */
    public void getInfoFintoolReferenceData(com.bcs.bm.catalog_of_instruments_rudata.client.grpc.InfoFintoolReferenceDataRequest request,
        io.grpc.stub.StreamObserver<com.bcs.bm.catalog_of_instruments_rudata.client.grpc.InfoFintoolReferenceDataResponse> responseObserver) {
      asyncUnaryCall(
          getChannel().newCall(getGetInfoFintoolReferenceDataMethod(), getCallOptions()), request, responseObserver);
    }

    /**
     */
    public void subscribeFintoolReferenceData(com.bcs.bm.catalog_of_instruments_rudata.client.grpc.SubscribeFintoolReferenceDataRequest request,
        io.grpc.stub.StreamObserver<com.bcs.bm.catalog_of_instruments_rudata.client.grpc.FintoolReferenceData> responseObserver) {
      asyncServerStreamingCall(
          getChannel().newCall(getSubscribeFintoolReferenceDataMethod(), getCallOptions()), request, responseObserver);
    }

    /**
     */
    public void getBondOffers(com.bcs.bm.catalog_of_instruments_rudata.client.grpc.BondOffersRequest request,
        io.grpc.stub.StreamObserver<com.bcs.bm.catalog_of_instruments_rudata.client.grpc.BondOffersResponse> responseObserver) {
      asyncUnaryCall(
          getChannel().newCall(getGetBondOffersMethod(), getCallOptions()), request, responseObserver);
    }

    /**
     */
    public void subscribeBondOffers(com.bcs.bm.catalog_of_instruments_rudata.client.grpc.SubscribeBondOffersRequest request,
        io.grpc.stub.StreamObserver<com.bcs.bm.catalog_of_instruments_rudata.client.grpc.BondOffers> responseObserver) {
      asyncServerStreamingCall(
          getChannel().newCall(getSubscribeBondOffersMethod(), getCallOptions()), request, responseObserver);
    }

    /**
     */
    public void getBondConvertation(com.bcs.bm.catalog_of_instruments_rudata.client.grpc.BondConvertationRequest request,
        io.grpc.stub.StreamObserver<com.bcs.bm.catalog_of_instruments_rudata.client.grpc.BondConvertationResponse> responseObserver) {
      asyncUnaryCall(
          getChannel().newCall(getGetBondConvertationMethod(), getCallOptions()), request, responseObserver);
    }

    /**
     */
    public void subscribeBondConvertation(com.bcs.bm.catalog_of_instruments_rudata.client.grpc.SubscribeBondConvertationRequest request,
        io.grpc.stub.StreamObserver<com.bcs.bm.catalog_of_instruments_rudata.client.grpc.BondConvertation> responseObserver) {
      asyncServerStreamingCall(
          getChannel().newCall(getSubscribeBondConvertationMethod(), getCallOptions()), request, responseObserver);
    }

    /**
     */
    public void getBondCoupons(com.bcs.bm.catalog_of_instruments_rudata.client.grpc.BondCouponsRequest request,
        io.grpc.stub.StreamObserver<com.bcs.bm.catalog_of_instruments_rudata.client.grpc.BondCouponsResponse> responseObserver) {
      asyncUnaryCall(
          getChannel().newCall(getGetBondCouponsMethod(), getCallOptions()), request, responseObserver);
    }

    /**
     */
    public void subscribeBondCoupons(com.bcs.bm.catalog_of_instruments_rudata.client.grpc.SubscribeBondCouponsRequest request,
        io.grpc.stub.StreamObserver<com.bcs.bm.catalog_of_instruments_rudata.client.grpc.BondCoupons> responseObserver) {
      asyncServerStreamingCall(
          getChannel().newCall(getSubscribeBondCouponsMethod(), getCallOptions()), request, responseObserver);
    }

    /**
     */
    public void getBondAmortizations(com.bcs.bm.catalog_of_instruments_rudata.client.grpc.BondAmortizationsRequest request,
        io.grpc.stub.StreamObserver<com.bcs.bm.catalog_of_instruments_rudata.client.grpc.BondAmortizationsResponse> responseObserver) {
      asyncUnaryCall(
          getChannel().newCall(getGetBondAmortizationsMethod(), getCallOptions()), request, responseObserver);
    }

    /**
     */
    public void subscribeBondAmortizations(com.bcs.bm.catalog_of_instruments_rudata.client.grpc.SubscribeBondAmortizationsRequest request,
        io.grpc.stub.StreamObserver<com.bcs.bm.catalog_of_instruments_rudata.client.grpc.BondAmortizations> responseObserver) {
      asyncServerStreamingCall(
          getChannel().newCall(getSubscribeBondAmortizationsMethod(), getCallOptions()), request, responseObserver);
    }

    /**
     */
    public void getBondMaturities(com.bcs.bm.catalog_of_instruments_rudata.client.grpc.BondMaturitiesRequest request,
        io.grpc.stub.StreamObserver<com.bcs.bm.catalog_of_instruments_rudata.client.grpc.BondMaturitiesResponse> responseObserver) {
      asyncUnaryCall(
          getChannel().newCall(getGetBondMaturitiesMethod(), getCallOptions()), request, responseObserver);
    }

    /**
     */
    public void subscribeBondMaturities(com.bcs.bm.catalog_of_instruments_rudata.client.grpc.SubscribeBondMaturitiesRequest request,
        io.grpc.stub.StreamObserver<com.bcs.bm.catalog_of_instruments_rudata.client.grpc.BondMaturities> responseObserver) {
      asyncServerStreamingCall(
          getChannel().newCall(getSubscribeBondMaturitiesMethod(), getCallOptions()), request, responseObserver);
    }

    /**
     */
    public void getCorporateActionKindGroups(com.bcs.bm.catalog_of_instruments_rudata.client.grpc.CorporateActionKindGroupsRequest request,
        io.grpc.stub.StreamObserver<com.bcs.bm.catalog_of_instruments_rudata.client.grpc.CorporateActionKindGroupsResponse> responseObserver) {
      asyncUnaryCall(
          getChannel().newCall(getGetCorporateActionKindGroupsMethod(), getCallOptions()), request, responseObserver);
    }

    /**
     */
    public void subscribeCorporateActionKindGroups(com.bcs.bm.catalog_of_instruments_rudata.client.grpc.SubscribeCorporateActionKindGroupsRequest request,
        io.grpc.stub.StreamObserver<com.bcs.bm.catalog_of_instruments_rudata.client.grpc.CorporateActionKindGroups> responseObserver) {
      asyncServerStreamingCall(
          getChannel().newCall(getSubscribeCorporateActionKindGroupsMethod(), getCallOptions()), request, responseObserver);
    }

    /**
     */
    public void getCorporateActionKinds(com.bcs.bm.catalog_of_instruments_rudata.client.grpc.CorporateActionKindsRequest request,
        io.grpc.stub.StreamObserver<com.bcs.bm.catalog_of_instruments_rudata.client.grpc.CorporateActionKindsResponse> responseObserver) {
      asyncUnaryCall(
          getChannel().newCall(getGetCorporateActionKindsMethod(), getCallOptions()), request, responseObserver);
    }

    /**
     */
    public void subscribeCorporateActionKinds(com.bcs.bm.catalog_of_instruments_rudata.client.grpc.SubscribeCorporateActionKindRequest request,
        io.grpc.stub.StreamObserver<com.bcs.bm.catalog_of_instruments_rudata.client.grpc.CorporateActionKind> responseObserver) {
      asyncServerStreamingCall(
          getChannel().newCall(getSubscribeCorporateActionKindsMethod(), getCallOptions()), request, responseObserver);
    }

    /**
     */
    public void getCorporateActionSources(com.bcs.bm.catalog_of_instruments_rudata.client.grpc.CorporateActionSourcesRequest request,
        io.grpc.stub.StreamObserver<com.bcs.bm.catalog_of_instruments_rudata.client.grpc.CorporateActionSourcesResponse> responseObserver) {
      asyncUnaryCall(
          getChannel().newCall(getGetCorporateActionSourcesMethod(), getCallOptions()), request, responseObserver);
    }

    /**
     */
    public void subscribeCorporateActionSources(com.bcs.bm.catalog_of_instruments_rudata.client.grpc.SubscribeCorporateActionSourceRequest request,
        io.grpc.stub.StreamObserver<com.bcs.bm.catalog_of_instruments_rudata.client.grpc.CorporateActionSource> responseObserver) {
      asyncServerStreamingCall(
          getChannel().newCall(getSubscribeCorporateActionSourcesMethod(), getCallOptions()), request, responseObserver);
    }

    /**
     */
    public void getCorporateActionActions(com.bcs.bm.catalog_of_instruments_rudata.client.grpc.CorporateActionActionsRequest request,
        io.grpc.stub.StreamObserver<com.bcs.bm.catalog_of_instruments_rudata.client.grpc.CorporateActionActionsResponse> responseObserver) {
      asyncUnaryCall(
          getChannel().newCall(getGetCorporateActionActionsMethod(), getCallOptions()), request, responseObserver);
    }

    /**
     */
    public void subscribeCorporateActionActions(com.bcs.bm.catalog_of_instruments_rudata.client.grpc.SubscribeCorporateActionActionsRequest request,
        io.grpc.stub.StreamObserver<com.bcs.bm.catalog_of_instruments_rudata.client.grpc.CorporateActionActions> responseObserver) {
      asyncServerStreamingCall(
          getChannel().newCall(getSubscribeCorporateActionActionsMethod(), getCallOptions()), request, responseObserver);
    }

    /**
     */
    public void getShareDividend(com.bcs.bm.catalog_of_instruments_rudata.client.grpc.ShareDividendRequest request,
        io.grpc.stub.StreamObserver<com.bcs.bm.catalog_of_instruments_rudata.client.grpc.ShareDividendResponse> responseObserver) {
      asyncUnaryCall(
          getChannel().newCall(getGetShareDividendMethod(), getCallOptions()), request, responseObserver);
    }

    /**
     */
    public void subscribeShareDividend(com.bcs.bm.catalog_of_instruments_rudata.client.grpc.SubscribeShareDividendRequest request,
        io.grpc.stub.StreamObserver<com.bcs.bm.catalog_of_instruments_rudata.client.grpc.ShareDividend> responseObserver) {
      asyncServerStreamingCall(
          getChannel().newCall(getSubscribeShareDividendMethod(), getCallOptions()), request, responseObserver);
    }

    /**
     */
    public void getInfoCurrencies(com.bcs.bm.catalog_of_instruments_rudata.client.grpc.InfoCurrenciesRequest request,
        io.grpc.stub.StreamObserver<com.bcs.bm.catalog_of_instruments_rudata.client.grpc.InfoCurrenciesResponse> responseObserver) {
      asyncUnaryCall(
          getChannel().newCall(getGetInfoCurrenciesMethod(), getCallOptions()), request, responseObserver);
    }

    /**
     */
    public void subscribeInfoCurrencies(com.bcs.bm.catalog_of_instruments_rudata.client.grpc.SubscribeInfoCurrenciesRequest request,
        io.grpc.stub.StreamObserver<com.bcs.bm.catalog_of_instruments_rudata.client.grpc.InfoCurrencies> responseObserver) {
      asyncServerStreamingCall(
          getChannel().newCall(getSubscribeInfoCurrenciesMethod(), getCallOptions()), request, responseObserver);
    }
  }

  /**
   */
  public static final class RudataServiceBlockingStub extends io.grpc.stub.AbstractStub<RudataServiceBlockingStub> {
    private RudataServiceBlockingStub(io.grpc.Channel channel) {
      super(channel);
    }

    private RudataServiceBlockingStub(io.grpc.Channel channel,
        io.grpc.CallOptions callOptions) {
      super(channel, callOptions);
    }

    @java.lang.Override
    protected RudataServiceBlockingStub build(io.grpc.Channel channel,
        io.grpc.CallOptions callOptions) {
      return new RudataServiceBlockingStub(channel, callOptions);
    }

    /**
     */
    public com.bcs.bm.catalog_of_instruments_rudata.client.grpc.InfoEmitentsResponse getInfoEmitents(com.bcs.bm.catalog_of_instruments_rudata.client.grpc.InfoEmitentsRequest request) {
      return blockingUnaryCall(
          getChannel(), getGetInfoEmitentsMethod(), getCallOptions(), request);
    }

    /**
     */
    public java.util.Iterator<com.bcs.bm.catalog_of_instruments_rudata.client.grpc.Emitent> subscribeEmitents(
        com.bcs.bm.catalog_of_instruments_rudata.client.grpc.SubscribeEmitentsRequest request) {
      return blockingServerStreamingCall(
          getChannel(), getSubscribeEmitentsMethod(), getCallOptions(), request);
    }

    /**
     */
    public com.bcs.bm.catalog_of_instruments_rudata.client.grpc.InfoSecuritiesResponse getInfoSecurities(com.bcs.bm.catalog_of_instruments_rudata.client.grpc.InfoSecuritiesRequest request) {
      return blockingUnaryCall(
          getChannel(), getGetInfoSecuritiesMethod(), getCallOptions(), request);
    }

    /**
     */
    public java.util.Iterator<com.bcs.bm.catalog_of_instruments_rudata.client.grpc.Security> subscribeSecurities(
        com.bcs.bm.catalog_of_instruments_rudata.client.grpc.SubscribeSecuritiesRequest request) {
      return blockingServerStreamingCall(
          getChannel(), getSubscribeSecuritiesMethod(), getCallOptions(), request);
    }

    /**
     */
    public com.bcs.bm.catalog_of_instruments_rudata.client.grpc.InfoFintoolReferenceDataResponse getInfoFintoolReferenceData(com.bcs.bm.catalog_of_instruments_rudata.client.grpc.InfoFintoolReferenceDataRequest request) {
      return blockingUnaryCall(
          getChannel(), getGetInfoFintoolReferenceDataMethod(), getCallOptions(), request);
    }

    /**
     */
    public java.util.Iterator<com.bcs.bm.catalog_of_instruments_rudata.client.grpc.FintoolReferenceData> subscribeFintoolReferenceData(
        com.bcs.bm.catalog_of_instruments_rudata.client.grpc.SubscribeFintoolReferenceDataRequest request) {
      return blockingServerStreamingCall(
          getChannel(), getSubscribeFintoolReferenceDataMethod(), getCallOptions(), request);
    }

    /**
     */
    public com.bcs.bm.catalog_of_instruments_rudata.client.grpc.BondOffersResponse getBondOffers(com.bcs.bm.catalog_of_instruments_rudata.client.grpc.BondOffersRequest request) {
      return blockingUnaryCall(
          getChannel(), getGetBondOffersMethod(), getCallOptions(), request);
    }

    /**
     */
    public java.util.Iterator<com.bcs.bm.catalog_of_instruments_rudata.client.grpc.BondOffers> subscribeBondOffers(
        com.bcs.bm.catalog_of_instruments_rudata.client.grpc.SubscribeBondOffersRequest request) {
      return blockingServerStreamingCall(
          getChannel(), getSubscribeBondOffersMethod(), getCallOptions(), request);
    }

    /**
     */
    public com.bcs.bm.catalog_of_instruments_rudata.client.grpc.BondConvertationResponse getBondConvertation(com.bcs.bm.catalog_of_instruments_rudata.client.grpc.BondConvertationRequest request) {
      return blockingUnaryCall(
          getChannel(), getGetBondConvertationMethod(), getCallOptions(), request);
    }

    /**
     */
    public java.util.Iterator<com.bcs.bm.catalog_of_instruments_rudata.client.grpc.BondConvertation> subscribeBondConvertation(
        com.bcs.bm.catalog_of_instruments_rudata.client.grpc.SubscribeBondConvertationRequest request) {
      return blockingServerStreamingCall(
          getChannel(), getSubscribeBondConvertationMethod(), getCallOptions(), request);
    }

    /**
     */
    public com.bcs.bm.catalog_of_instruments_rudata.client.grpc.BondCouponsResponse getBondCoupons(com.bcs.bm.catalog_of_instruments_rudata.client.grpc.BondCouponsRequest request) {
      return blockingUnaryCall(
          getChannel(), getGetBondCouponsMethod(), getCallOptions(), request);
    }

    /**
     */
    public java.util.Iterator<com.bcs.bm.catalog_of_instruments_rudata.client.grpc.BondCoupons> subscribeBondCoupons(
        com.bcs.bm.catalog_of_instruments_rudata.client.grpc.SubscribeBondCouponsRequest request) {
      return blockingServerStreamingCall(
          getChannel(), getSubscribeBondCouponsMethod(), getCallOptions(), request);
    }

    /**
     */
    public com.bcs.bm.catalog_of_instruments_rudata.client.grpc.BondAmortizationsResponse getBondAmortizations(com.bcs.bm.catalog_of_instruments_rudata.client.grpc.BondAmortizationsRequest request) {
      return blockingUnaryCall(
          getChannel(), getGetBondAmortizationsMethod(), getCallOptions(), request);
    }

    /**
     */
    public java.util.Iterator<com.bcs.bm.catalog_of_instruments_rudata.client.grpc.BondAmortizations> subscribeBondAmortizations(
        com.bcs.bm.catalog_of_instruments_rudata.client.grpc.SubscribeBondAmortizationsRequest request) {
      return blockingServerStreamingCall(
          getChannel(), getSubscribeBondAmortizationsMethod(), getCallOptions(), request);
    }

    /**
     */
    public com.bcs.bm.catalog_of_instruments_rudata.client.grpc.BondMaturitiesResponse getBondMaturities(com.bcs.bm.catalog_of_instruments_rudata.client.grpc.BondMaturitiesRequest request) {
      return blockingUnaryCall(
          getChannel(), getGetBondMaturitiesMethod(), getCallOptions(), request);
    }

    /**
     */
    public java.util.Iterator<com.bcs.bm.catalog_of_instruments_rudata.client.grpc.BondMaturities> subscribeBondMaturities(
        com.bcs.bm.catalog_of_instruments_rudata.client.grpc.SubscribeBondMaturitiesRequest request) {
      return blockingServerStreamingCall(
          getChannel(), getSubscribeBondMaturitiesMethod(), getCallOptions(), request);
    }

    /**
     */
    public com.bcs.bm.catalog_of_instruments_rudata.client.grpc.CorporateActionKindGroupsResponse getCorporateActionKindGroups(com.bcs.bm.catalog_of_instruments_rudata.client.grpc.CorporateActionKindGroupsRequest request) {
      return blockingUnaryCall(
          getChannel(), getGetCorporateActionKindGroupsMethod(), getCallOptions(), request);
    }

    /**
     */
    public java.util.Iterator<com.bcs.bm.catalog_of_instruments_rudata.client.grpc.CorporateActionKindGroups> subscribeCorporateActionKindGroups(
        com.bcs.bm.catalog_of_instruments_rudata.client.grpc.SubscribeCorporateActionKindGroupsRequest request) {
      return blockingServerStreamingCall(
          getChannel(), getSubscribeCorporateActionKindGroupsMethod(), getCallOptions(), request);
    }

    /**
     */
    public com.bcs.bm.catalog_of_instruments_rudata.client.grpc.CorporateActionKindsResponse getCorporateActionKinds(com.bcs.bm.catalog_of_instruments_rudata.client.grpc.CorporateActionKindsRequest request) {
      return blockingUnaryCall(
          getChannel(), getGetCorporateActionKindsMethod(), getCallOptions(), request);
    }

    /**
     */
    public java.util.Iterator<com.bcs.bm.catalog_of_instruments_rudata.client.grpc.CorporateActionKind> subscribeCorporateActionKinds(
        com.bcs.bm.catalog_of_instruments_rudata.client.grpc.SubscribeCorporateActionKindRequest request) {
      return blockingServerStreamingCall(
          getChannel(), getSubscribeCorporateActionKindsMethod(), getCallOptions(), request);
    }

    /**
     */
    public com.bcs.bm.catalog_of_instruments_rudata.client.grpc.CorporateActionSourcesResponse getCorporateActionSources(com.bcs.bm.catalog_of_instruments_rudata.client.grpc.CorporateActionSourcesRequest request) {
      return blockingUnaryCall(
          getChannel(), getGetCorporateActionSourcesMethod(), getCallOptions(), request);
    }

    /**
     */
    public java.util.Iterator<com.bcs.bm.catalog_of_instruments_rudata.client.grpc.CorporateActionSource> subscribeCorporateActionSources(
        com.bcs.bm.catalog_of_instruments_rudata.client.grpc.SubscribeCorporateActionSourceRequest request) {
      return blockingServerStreamingCall(
          getChannel(), getSubscribeCorporateActionSourcesMethod(), getCallOptions(), request);
    }

    /**
     */
    public com.bcs.bm.catalog_of_instruments_rudata.client.grpc.CorporateActionActionsResponse getCorporateActionActions(com.bcs.bm.catalog_of_instruments_rudata.client.grpc.CorporateActionActionsRequest request) {
      return blockingUnaryCall(
          getChannel(), getGetCorporateActionActionsMethod(), getCallOptions(), request);
    }

    /**
     */
    public java.util.Iterator<com.bcs.bm.catalog_of_instruments_rudata.client.grpc.CorporateActionActions> subscribeCorporateActionActions(
        com.bcs.bm.catalog_of_instruments_rudata.client.grpc.SubscribeCorporateActionActionsRequest request) {
      return blockingServerStreamingCall(
          getChannel(), getSubscribeCorporateActionActionsMethod(), getCallOptions(), request);
    }

    /**
     */
    public com.bcs.bm.catalog_of_instruments_rudata.client.grpc.ShareDividendResponse getShareDividend(com.bcs.bm.catalog_of_instruments_rudata.client.grpc.ShareDividendRequest request) {
      return blockingUnaryCall(
          getChannel(), getGetShareDividendMethod(), getCallOptions(), request);
    }

    /**
     */
    public java.util.Iterator<com.bcs.bm.catalog_of_instruments_rudata.client.grpc.ShareDividend> subscribeShareDividend(
        com.bcs.bm.catalog_of_instruments_rudata.client.grpc.SubscribeShareDividendRequest request) {
      return blockingServerStreamingCall(
          getChannel(), getSubscribeShareDividendMethod(), getCallOptions(), request);
    }

    /**
     */
    public com.bcs.bm.catalog_of_instruments_rudata.client.grpc.InfoCurrenciesResponse getInfoCurrencies(com.bcs.bm.catalog_of_instruments_rudata.client.grpc.InfoCurrenciesRequest request) {
      return blockingUnaryCall(
          getChannel(), getGetInfoCurrenciesMethod(), getCallOptions(), request);
    }

    /**
     */
    public java.util.Iterator<com.bcs.bm.catalog_of_instruments_rudata.client.grpc.InfoCurrencies> subscribeInfoCurrencies(
        com.bcs.bm.catalog_of_instruments_rudata.client.grpc.SubscribeInfoCurrenciesRequest request) {
      return blockingServerStreamingCall(
          getChannel(), getSubscribeInfoCurrenciesMethod(), getCallOptions(), request);
    }
  }

  /**
   */
  public static final class RudataServiceFutureStub extends io.grpc.stub.AbstractStub<RudataServiceFutureStub> {
    private RudataServiceFutureStub(io.grpc.Channel channel) {
      super(channel);
    }

    private RudataServiceFutureStub(io.grpc.Channel channel,
        io.grpc.CallOptions callOptions) {
      super(channel, callOptions);
    }

    @java.lang.Override
    protected RudataServiceFutureStub build(io.grpc.Channel channel,
        io.grpc.CallOptions callOptions) {
      return new RudataServiceFutureStub(channel, callOptions);
    }

    /**
     */
    public com.google.common.util.concurrent.ListenableFuture<com.bcs.bm.catalog_of_instruments_rudata.client.grpc.InfoEmitentsResponse> getInfoEmitents(
        com.bcs.bm.catalog_of_instruments_rudata.client.grpc.InfoEmitentsRequest request) {
      return futureUnaryCall(
          getChannel().newCall(getGetInfoEmitentsMethod(), getCallOptions()), request);
    }

    /**
     */
    public com.google.common.util.concurrent.ListenableFuture<com.bcs.bm.catalog_of_instruments_rudata.client.grpc.InfoSecuritiesResponse> getInfoSecurities(
        com.bcs.bm.catalog_of_instruments_rudata.client.grpc.InfoSecuritiesRequest request) {
      return futureUnaryCall(
          getChannel().newCall(getGetInfoSecuritiesMethod(), getCallOptions()), request);
    }

    /**
     */
    public com.google.common.util.concurrent.ListenableFuture<com.bcs.bm.catalog_of_instruments_rudata.client.grpc.InfoFintoolReferenceDataResponse> getInfoFintoolReferenceData(
        com.bcs.bm.catalog_of_instruments_rudata.client.grpc.InfoFintoolReferenceDataRequest request) {
      return futureUnaryCall(
          getChannel().newCall(getGetInfoFintoolReferenceDataMethod(), getCallOptions()), request);
    }

    /**
     */
    public com.google.common.util.concurrent.ListenableFuture<com.bcs.bm.catalog_of_instruments_rudata.client.grpc.BondOffersResponse> getBondOffers(
        com.bcs.bm.catalog_of_instruments_rudata.client.grpc.BondOffersRequest request) {
      return futureUnaryCall(
          getChannel().newCall(getGetBondOffersMethod(), getCallOptions()), request);
    }

    /**
     */
    public com.google.common.util.concurrent.ListenableFuture<com.bcs.bm.catalog_of_instruments_rudata.client.grpc.BondConvertationResponse> getBondConvertation(
        com.bcs.bm.catalog_of_instruments_rudata.client.grpc.BondConvertationRequest request) {
      return futureUnaryCall(
          getChannel().newCall(getGetBondConvertationMethod(), getCallOptions()), request);
    }

    /**
     */
    public com.google.common.util.concurrent.ListenableFuture<com.bcs.bm.catalog_of_instruments_rudata.client.grpc.BondCouponsResponse> getBondCoupons(
        com.bcs.bm.catalog_of_instruments_rudata.client.grpc.BondCouponsRequest request) {
      return futureUnaryCall(
          getChannel().newCall(getGetBondCouponsMethod(), getCallOptions()), request);
    }

    /**
     */
    public com.google.common.util.concurrent.ListenableFuture<com.bcs.bm.catalog_of_instruments_rudata.client.grpc.BondAmortizationsResponse> getBondAmortizations(
        com.bcs.bm.catalog_of_instruments_rudata.client.grpc.BondAmortizationsRequest request) {
      return futureUnaryCall(
          getChannel().newCall(getGetBondAmortizationsMethod(), getCallOptions()), request);
    }

    /**
     */
    public com.google.common.util.concurrent.ListenableFuture<com.bcs.bm.catalog_of_instruments_rudata.client.grpc.BondMaturitiesResponse> getBondMaturities(
        com.bcs.bm.catalog_of_instruments_rudata.client.grpc.BondMaturitiesRequest request) {
      return futureUnaryCall(
          getChannel().newCall(getGetBondMaturitiesMethod(), getCallOptions()), request);
    }

    /**
     */
    public com.google.common.util.concurrent.ListenableFuture<com.bcs.bm.catalog_of_instruments_rudata.client.grpc.CorporateActionKindGroupsResponse> getCorporateActionKindGroups(
        com.bcs.bm.catalog_of_instruments_rudata.client.grpc.CorporateActionKindGroupsRequest request) {
      return futureUnaryCall(
          getChannel().newCall(getGetCorporateActionKindGroupsMethod(), getCallOptions()), request);
    }

    /**
     */
    public com.google.common.util.concurrent.ListenableFuture<com.bcs.bm.catalog_of_instruments_rudata.client.grpc.CorporateActionKindsResponse> getCorporateActionKinds(
        com.bcs.bm.catalog_of_instruments_rudata.client.grpc.CorporateActionKindsRequest request) {
      return futureUnaryCall(
          getChannel().newCall(getGetCorporateActionKindsMethod(), getCallOptions()), request);
    }

    /**
     */
    public com.google.common.util.concurrent.ListenableFuture<com.bcs.bm.catalog_of_instruments_rudata.client.grpc.CorporateActionSourcesResponse> getCorporateActionSources(
        com.bcs.bm.catalog_of_instruments_rudata.client.grpc.CorporateActionSourcesRequest request) {
      return futureUnaryCall(
          getChannel().newCall(getGetCorporateActionSourcesMethod(), getCallOptions()), request);
    }

    /**
     */
    public com.google.common.util.concurrent.ListenableFuture<com.bcs.bm.catalog_of_instruments_rudata.client.grpc.CorporateActionActionsResponse> getCorporateActionActions(
        com.bcs.bm.catalog_of_instruments_rudata.client.grpc.CorporateActionActionsRequest request) {
      return futureUnaryCall(
          getChannel().newCall(getGetCorporateActionActionsMethod(), getCallOptions()), request);
    }

    /**
     */
    public com.google.common.util.concurrent.ListenableFuture<com.bcs.bm.catalog_of_instruments_rudata.client.grpc.ShareDividendResponse> getShareDividend(
        com.bcs.bm.catalog_of_instruments_rudata.client.grpc.ShareDividendRequest request) {
      return futureUnaryCall(
          getChannel().newCall(getGetShareDividendMethod(), getCallOptions()), request);
    }

    /**
     */
    public com.google.common.util.concurrent.ListenableFuture<com.bcs.bm.catalog_of_instruments_rudata.client.grpc.InfoCurrenciesResponse> getInfoCurrencies(
        com.bcs.bm.catalog_of_instruments_rudata.client.grpc.InfoCurrenciesRequest request) {
      return futureUnaryCall(
          getChannel().newCall(getGetInfoCurrenciesMethod(), getCallOptions()), request);
    }
  }

  private static final int METHODID_GET_INFO_EMITENTS = 0;
  private static final int METHODID_SUBSCRIBE_EMITENTS = 1;
  private static final int METHODID_GET_INFO_SECURITIES = 2;
  private static final int METHODID_SUBSCRIBE_SECURITIES = 3;
  private static final int METHODID_GET_INFO_FINTOOL_REFERENCE_DATA = 4;
  private static final int METHODID_SUBSCRIBE_FINTOOL_REFERENCE_DATA = 5;
  private static final int METHODID_GET_BOND_OFFERS = 6;
  private static final int METHODID_SUBSCRIBE_BOND_OFFERS = 7;
  private static final int METHODID_GET_BOND_CONVERTATION = 8;
  private static final int METHODID_SUBSCRIBE_BOND_CONVERTATION = 9;
  private static final int METHODID_GET_BOND_COUPONS = 10;
  private static final int METHODID_SUBSCRIBE_BOND_COUPONS = 11;
  private static final int METHODID_GET_BOND_AMORTIZATIONS = 12;
  private static final int METHODID_SUBSCRIBE_BOND_AMORTIZATIONS = 13;
  private static final int METHODID_GET_BOND_MATURITIES = 14;
  private static final int METHODID_SUBSCRIBE_BOND_MATURITIES = 15;
  private static final int METHODID_GET_CORPORATE_ACTION_KIND_GROUPS = 16;
  private static final int METHODID_SUBSCRIBE_CORPORATE_ACTION_KIND_GROUPS = 17;
  private static final int METHODID_GET_CORPORATE_ACTION_KINDS = 18;
  private static final int METHODID_SUBSCRIBE_CORPORATE_ACTION_KINDS = 19;
  private static final int METHODID_GET_CORPORATE_ACTION_SOURCES = 20;
  private static final int METHODID_SUBSCRIBE_CORPORATE_ACTION_SOURCES = 21;
  private static final int METHODID_GET_CORPORATE_ACTION_ACTIONS = 22;
  private static final int METHODID_SUBSCRIBE_CORPORATE_ACTION_ACTIONS = 23;
  private static final int METHODID_GET_SHARE_DIVIDEND = 24;
  private static final int METHODID_SUBSCRIBE_SHARE_DIVIDEND = 25;
  private static final int METHODID_GET_INFO_CURRENCIES = 26;
  private static final int METHODID_SUBSCRIBE_INFO_CURRENCIES = 27;

  private static final class MethodHandlers<Req, Resp> implements
      io.grpc.stub.ServerCalls.UnaryMethod<Req, Resp>,
      io.grpc.stub.ServerCalls.ServerStreamingMethod<Req, Resp>,
      io.grpc.stub.ServerCalls.ClientStreamingMethod<Req, Resp>,
      io.grpc.stub.ServerCalls.BidiStreamingMethod<Req, Resp> {
    private final RudataServiceImplBase serviceImpl;
    private final int methodId;

    MethodHandlers(RudataServiceImplBase serviceImpl, int methodId) {
      this.serviceImpl = serviceImpl;
      this.methodId = methodId;
    }

    @java.lang.Override
    @java.lang.SuppressWarnings("unchecked")
    public void invoke(Req request, io.grpc.stub.StreamObserver<Resp> responseObserver) {
      switch (methodId) {
        case METHODID_GET_INFO_EMITENTS:
          serviceImpl.getInfoEmitents((com.bcs.bm.catalog_of_instruments_rudata.client.grpc.InfoEmitentsRequest) request,
              (io.grpc.stub.StreamObserver<com.bcs.bm.catalog_of_instruments_rudata.client.grpc.InfoEmitentsResponse>) responseObserver);
          break;
        case METHODID_SUBSCRIBE_EMITENTS:
          serviceImpl.subscribeEmitents((com.bcs.bm.catalog_of_instruments_rudata.client.grpc.SubscribeEmitentsRequest) request,
              (io.grpc.stub.StreamObserver<com.bcs.bm.catalog_of_instruments_rudata.client.grpc.Emitent>) responseObserver);
          break;
        case METHODID_GET_INFO_SECURITIES:
          serviceImpl.getInfoSecurities((com.bcs.bm.catalog_of_instruments_rudata.client.grpc.InfoSecuritiesRequest) request,
              (io.grpc.stub.StreamObserver<com.bcs.bm.catalog_of_instruments_rudata.client.grpc.InfoSecuritiesResponse>) responseObserver);
          break;
        case METHODID_SUBSCRIBE_SECURITIES:
          serviceImpl.subscribeSecurities((com.bcs.bm.catalog_of_instruments_rudata.client.grpc.SubscribeSecuritiesRequest) request,
              (io.grpc.stub.StreamObserver<com.bcs.bm.catalog_of_instruments_rudata.client.grpc.Security>) responseObserver);
          break;
        case METHODID_GET_INFO_FINTOOL_REFERENCE_DATA:
          serviceImpl.getInfoFintoolReferenceData((com.bcs.bm.catalog_of_instruments_rudata.client.grpc.InfoFintoolReferenceDataRequest) request,
              (io.grpc.stub.StreamObserver<com.bcs.bm.catalog_of_instruments_rudata.client.grpc.InfoFintoolReferenceDataResponse>) responseObserver);
          break;
        case METHODID_SUBSCRIBE_FINTOOL_REFERENCE_DATA:
          serviceImpl.subscribeFintoolReferenceData((com.bcs.bm.catalog_of_instruments_rudata.client.grpc.SubscribeFintoolReferenceDataRequest) request,
              (io.grpc.stub.StreamObserver<com.bcs.bm.catalog_of_instruments_rudata.client.grpc.FintoolReferenceData>) responseObserver);
          break;
        case METHODID_GET_BOND_OFFERS:
          serviceImpl.getBondOffers((com.bcs.bm.catalog_of_instruments_rudata.client.grpc.BondOffersRequest) request,
              (io.grpc.stub.StreamObserver<com.bcs.bm.catalog_of_instruments_rudata.client.grpc.BondOffersResponse>) responseObserver);
          break;
        case METHODID_SUBSCRIBE_BOND_OFFERS:
          serviceImpl.subscribeBondOffers((com.bcs.bm.catalog_of_instruments_rudata.client.grpc.SubscribeBondOffersRequest) request,
              (io.grpc.stub.StreamObserver<com.bcs.bm.catalog_of_instruments_rudata.client.grpc.BondOffers>) responseObserver);
          break;
        case METHODID_GET_BOND_CONVERTATION:
          serviceImpl.getBondConvertation((com.bcs.bm.catalog_of_instruments_rudata.client.grpc.BondConvertationRequest) request,
              (io.grpc.stub.StreamObserver<com.bcs.bm.catalog_of_instruments_rudata.client.grpc.BondConvertationResponse>) responseObserver);
          break;
        case METHODID_SUBSCRIBE_BOND_CONVERTATION:
          serviceImpl.subscribeBondConvertation((com.bcs.bm.catalog_of_instruments_rudata.client.grpc.SubscribeBondConvertationRequest) request,
              (io.grpc.stub.StreamObserver<com.bcs.bm.catalog_of_instruments_rudata.client.grpc.BondConvertation>) responseObserver);
          break;
        case METHODID_GET_BOND_COUPONS:
          serviceImpl.getBondCoupons((com.bcs.bm.catalog_of_instruments_rudata.client.grpc.BondCouponsRequest) request,
              (io.grpc.stub.StreamObserver<com.bcs.bm.catalog_of_instruments_rudata.client.grpc.BondCouponsResponse>) responseObserver);
          break;
        case METHODID_SUBSCRIBE_BOND_COUPONS:
          serviceImpl.subscribeBondCoupons((com.bcs.bm.catalog_of_instruments_rudata.client.grpc.SubscribeBondCouponsRequest) request,
              (io.grpc.stub.StreamObserver<com.bcs.bm.catalog_of_instruments_rudata.client.grpc.BondCoupons>) responseObserver);
          break;
        case METHODID_GET_BOND_AMORTIZATIONS:
          serviceImpl.getBondAmortizations((com.bcs.bm.catalog_of_instruments_rudata.client.grpc.BondAmortizationsRequest) request,
              (io.grpc.stub.StreamObserver<com.bcs.bm.catalog_of_instruments_rudata.client.grpc.BondAmortizationsResponse>) responseObserver);
          break;
        case METHODID_SUBSCRIBE_BOND_AMORTIZATIONS:
          serviceImpl.subscribeBondAmortizations((com.bcs.bm.catalog_of_instruments_rudata.client.grpc.SubscribeBondAmortizationsRequest) request,
              (io.grpc.stub.StreamObserver<com.bcs.bm.catalog_of_instruments_rudata.client.grpc.BondAmortizations>) responseObserver);
          break;
        case METHODID_GET_BOND_MATURITIES:
          serviceImpl.getBondMaturities((com.bcs.bm.catalog_of_instruments_rudata.client.grpc.BondMaturitiesRequest) request,
              (io.grpc.stub.StreamObserver<com.bcs.bm.catalog_of_instruments_rudata.client.grpc.BondMaturitiesResponse>) responseObserver);
          break;
        case METHODID_SUBSCRIBE_BOND_MATURITIES:
          serviceImpl.subscribeBondMaturities((com.bcs.bm.catalog_of_instruments_rudata.client.grpc.SubscribeBondMaturitiesRequest) request,
              (io.grpc.stub.StreamObserver<com.bcs.bm.catalog_of_instruments_rudata.client.grpc.BondMaturities>) responseObserver);
          break;
        case METHODID_GET_CORPORATE_ACTION_KIND_GROUPS:
          serviceImpl.getCorporateActionKindGroups((com.bcs.bm.catalog_of_instruments_rudata.client.grpc.CorporateActionKindGroupsRequest) request,
              (io.grpc.stub.StreamObserver<com.bcs.bm.catalog_of_instruments_rudata.client.grpc.CorporateActionKindGroupsResponse>) responseObserver);
          break;
        case METHODID_SUBSCRIBE_CORPORATE_ACTION_KIND_GROUPS:
          serviceImpl.subscribeCorporateActionKindGroups((com.bcs.bm.catalog_of_instruments_rudata.client.grpc.SubscribeCorporateActionKindGroupsRequest) request,
              (io.grpc.stub.StreamObserver<com.bcs.bm.catalog_of_instruments_rudata.client.grpc.CorporateActionKindGroups>) responseObserver);
          break;
        case METHODID_GET_CORPORATE_ACTION_KINDS:
          serviceImpl.getCorporateActionKinds((com.bcs.bm.catalog_of_instruments_rudata.client.grpc.CorporateActionKindsRequest) request,
              (io.grpc.stub.StreamObserver<com.bcs.bm.catalog_of_instruments_rudata.client.grpc.CorporateActionKindsResponse>) responseObserver);
          break;
        case METHODID_SUBSCRIBE_CORPORATE_ACTION_KINDS:
          serviceImpl.subscribeCorporateActionKinds((com.bcs.bm.catalog_of_instruments_rudata.client.grpc.SubscribeCorporateActionKindRequest) request,
              (io.grpc.stub.StreamObserver<com.bcs.bm.catalog_of_instruments_rudata.client.grpc.CorporateActionKind>) responseObserver);
          break;
        case METHODID_GET_CORPORATE_ACTION_SOURCES:
          serviceImpl.getCorporateActionSources((com.bcs.bm.catalog_of_instruments_rudata.client.grpc.CorporateActionSourcesRequest) request,
              (io.grpc.stub.StreamObserver<com.bcs.bm.catalog_of_instruments_rudata.client.grpc.CorporateActionSourcesResponse>) responseObserver);
          break;
        case METHODID_SUBSCRIBE_CORPORATE_ACTION_SOURCES:
          serviceImpl.subscribeCorporateActionSources((com.bcs.bm.catalog_of_instruments_rudata.client.grpc.SubscribeCorporateActionSourceRequest) request,
              (io.grpc.stub.StreamObserver<com.bcs.bm.catalog_of_instruments_rudata.client.grpc.CorporateActionSource>) responseObserver);
          break;
        case METHODID_GET_CORPORATE_ACTION_ACTIONS:
          serviceImpl.getCorporateActionActions((com.bcs.bm.catalog_of_instruments_rudata.client.grpc.CorporateActionActionsRequest) request,
              (io.grpc.stub.StreamObserver<com.bcs.bm.catalog_of_instruments_rudata.client.grpc.CorporateActionActionsResponse>) responseObserver);
          break;
        case METHODID_SUBSCRIBE_CORPORATE_ACTION_ACTIONS:
          serviceImpl.subscribeCorporateActionActions((com.bcs.bm.catalog_of_instruments_rudata.client.grpc.SubscribeCorporateActionActionsRequest) request,
              (io.grpc.stub.StreamObserver<com.bcs.bm.catalog_of_instruments_rudata.client.grpc.CorporateActionActions>) responseObserver);
          break;
        case METHODID_GET_SHARE_DIVIDEND:
          serviceImpl.getShareDividend((com.bcs.bm.catalog_of_instruments_rudata.client.grpc.ShareDividendRequest) request,
              (io.grpc.stub.StreamObserver<com.bcs.bm.catalog_of_instruments_rudata.client.grpc.ShareDividendResponse>) responseObserver);
          break;
        case METHODID_SUBSCRIBE_SHARE_DIVIDEND:
          serviceImpl.subscribeShareDividend((com.bcs.bm.catalog_of_instruments_rudata.client.grpc.SubscribeShareDividendRequest) request,
              (io.grpc.stub.StreamObserver<com.bcs.bm.catalog_of_instruments_rudata.client.grpc.ShareDividend>) responseObserver);
          break;
        case METHODID_GET_INFO_CURRENCIES:
          serviceImpl.getInfoCurrencies((com.bcs.bm.catalog_of_instruments_rudata.client.grpc.InfoCurrenciesRequest) request,
              (io.grpc.stub.StreamObserver<com.bcs.bm.catalog_of_instruments_rudata.client.grpc.InfoCurrenciesResponse>) responseObserver);
          break;
        case METHODID_SUBSCRIBE_INFO_CURRENCIES:
          serviceImpl.subscribeInfoCurrencies((com.bcs.bm.catalog_of_instruments_rudata.client.grpc.SubscribeInfoCurrenciesRequest) request,
              (io.grpc.stub.StreamObserver<com.bcs.bm.catalog_of_instruments_rudata.client.grpc.InfoCurrencies>) responseObserver);
          break;
        default:
          throw new AssertionError();
      }
    }

    @java.lang.Override
    @java.lang.SuppressWarnings("unchecked")
    public io.grpc.stub.StreamObserver<Req> invoke(
        io.grpc.stub.StreamObserver<Resp> responseObserver) {
      switch (methodId) {
        default:
          throw new AssertionError();
      }
    }
  }

  private static abstract class RudataServiceBaseDescriptorSupplier
      implements io.grpc.protobuf.ProtoFileDescriptorSupplier, io.grpc.protobuf.ProtoServiceDescriptorSupplier {
    RudataServiceBaseDescriptorSupplier() {}

    @java.lang.Override
    public com.google.protobuf.Descriptors.FileDescriptor getFileDescriptor() {
      return com.bcs.bm.catalog_of_instruments_rudata.client.grpc.GrpcService.getDescriptor();
    }

    @java.lang.Override
    public com.google.protobuf.Descriptors.ServiceDescriptor getServiceDescriptor() {
      return getFileDescriptor().findServiceByName("RudataService");
    }
  }

  private static final class RudataServiceFileDescriptorSupplier
      extends RudataServiceBaseDescriptorSupplier {
    RudataServiceFileDescriptorSupplier() {}
  }

  private static final class RudataServiceMethodDescriptorSupplier
      extends RudataServiceBaseDescriptorSupplier
      implements io.grpc.protobuf.ProtoMethodDescriptorSupplier {
    private final String methodName;

    RudataServiceMethodDescriptorSupplier(String methodName) {
      this.methodName = methodName;
    }

    @java.lang.Override
    public com.google.protobuf.Descriptors.MethodDescriptor getMethodDescriptor() {
      return getServiceDescriptor().findMethodByName(methodName);
    }
  }

  private static volatile io.grpc.ServiceDescriptor serviceDescriptor;

  public static io.grpc.ServiceDescriptor getServiceDescriptor() {
    io.grpc.ServiceDescriptor result = serviceDescriptor;
    if (result == null) {
      synchronized (RudataServiceGrpc.class) {
        result = serviceDescriptor;
        if (result == null) {
          serviceDescriptor = result = io.grpc.ServiceDescriptor.newBuilder(SERVICE_NAME)
              .setSchemaDescriptor(new RudataServiceFileDescriptorSupplier())
              .addMethod(getGetInfoEmitentsMethod())
              .addMethod(getSubscribeEmitentsMethod())
              .addMethod(getGetInfoSecuritiesMethod())
              .addMethod(getSubscribeSecuritiesMethod())
              .addMethod(getGetInfoFintoolReferenceDataMethod())
              .addMethod(getSubscribeFintoolReferenceDataMethod())
              .addMethod(getGetBondOffersMethod())
              .addMethod(getSubscribeBondOffersMethod())
              .addMethod(getGetBondConvertationMethod())
              .addMethod(getSubscribeBondConvertationMethod())
              .addMethod(getGetBondCouponsMethod())
              .addMethod(getSubscribeBondCouponsMethod())
              .addMethod(getGetBondAmortizationsMethod())
              .addMethod(getSubscribeBondAmortizationsMethod())
              .addMethod(getGetBondMaturitiesMethod())
              .addMethod(getSubscribeBondMaturitiesMethod())
              .addMethod(getGetCorporateActionKindGroupsMethod())
              .addMethod(getSubscribeCorporateActionKindGroupsMethod())
              .addMethod(getGetCorporateActionKindsMethod())
              .addMethod(getSubscribeCorporateActionKindsMethod())
              .addMethod(getGetCorporateActionSourcesMethod())
              .addMethod(getSubscribeCorporateActionSourcesMethod())
              .addMethod(getGetCorporateActionActionsMethod())
              .addMethod(getSubscribeCorporateActionActionsMethod())
              .addMethod(getGetShareDividendMethod())
              .addMethod(getSubscribeShareDividendMethod())
              .addMethod(getGetInfoCurrenciesMethod())
              .addMethod(getSubscribeInfoCurrenciesMethod())
              .build();
        }
      }
    }
    return result;
  }
}

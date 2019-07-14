// Generated by the protocol buffer compiler.  DO NOT EDIT!
// source: GrpcService.proto

package com.bcs.bm.catalog_of_instruments_rudata.client.grpc;

/**
 * Protobuf type {@code BondMaturitiesResponse}
 */
public  final class BondMaturitiesResponse extends
    com.google.protobuf.GeneratedMessageV3 implements
    // @@protoc_insertion_point(message_implements:BondMaturitiesResponse)
    BondMaturitiesResponseOrBuilder {
private static final long serialVersionUID = 0L;
  // Use BondMaturitiesResponse.newBuilder() to construct.
  private BondMaturitiesResponse(com.google.protobuf.GeneratedMessageV3.Builder<?> builder) {
    super(builder);
  }
  private BondMaturitiesResponse() {
    reqId_ = "";
    bondCoupons_ = java.util.Collections.emptyList();
  }

  @java.lang.Override
  @SuppressWarnings({"unused"})
  protected java.lang.Object newInstance(
      UnusedPrivateParameter unused) {
    return new BondMaturitiesResponse();
  }

  @java.lang.Override
  public final com.google.protobuf.UnknownFieldSet
  getUnknownFields() {
    return this.unknownFields;
  }
  private BondMaturitiesResponse(
      com.google.protobuf.CodedInputStream input,
      com.google.protobuf.ExtensionRegistryLite extensionRegistry)
      throws com.google.protobuf.InvalidProtocolBufferException {
    this();
    if (extensionRegistry == null) {
      throw new java.lang.NullPointerException();
    }
    int mutable_bitField0_ = 0;
    com.google.protobuf.UnknownFieldSet.Builder unknownFields =
        com.google.protobuf.UnknownFieldSet.newBuilder();
    try {
      boolean done = false;
      while (!done) {
        int tag = input.readTag();
        switch (tag) {
          case 0:
            done = true;
            break;
          case 10: {
            java.lang.String s = input.readStringRequireUtf8();

            reqId_ = s;
            break;
          }
          case 18: {
            if (!((mutable_bitField0_ & 0x00000001) != 0)) {
              bondCoupons_ = new java.util.ArrayList<com.bcs.bm.catalog_of_instruments_rudata.client.grpc.BondCoupons>();
              mutable_bitField0_ |= 0x00000001;
            }
            bondCoupons_.add(
                input.readMessage(com.bcs.bm.catalog_of_instruments_rudata.client.grpc.BondCoupons.parser(), extensionRegistry));
            break;
          }
          default: {
            if (!parseUnknownField(
                input, unknownFields, extensionRegistry, tag)) {
              done = true;
            }
            break;
          }
        }
      }
    } catch (com.google.protobuf.InvalidProtocolBufferException e) {
      throw e.setUnfinishedMessage(this);
    } catch (java.io.IOException e) {
      throw new com.google.protobuf.InvalidProtocolBufferException(
          e).setUnfinishedMessage(this);
    } finally {
      if (((mutable_bitField0_ & 0x00000001) != 0)) {
        bondCoupons_ = java.util.Collections.unmodifiableList(bondCoupons_);
      }
      this.unknownFields = unknownFields.build();
      makeExtensionsImmutable();
    }
  }
  public static final com.google.protobuf.Descriptors.Descriptor
      getDescriptor() {
    return com.bcs.bm.catalog_of_instruments_rudata.client.grpc.GrpcService.internal_static_BondMaturitiesResponse_descriptor;
  }

  @java.lang.Override
  protected com.google.protobuf.GeneratedMessageV3.FieldAccessorTable
      internalGetFieldAccessorTable() {
    return com.bcs.bm.catalog_of_instruments_rudata.client.grpc.GrpcService.internal_static_BondMaturitiesResponse_fieldAccessorTable
        .ensureFieldAccessorsInitialized(
            com.bcs.bm.catalog_of_instruments_rudata.client.grpc.BondMaturitiesResponse.class, com.bcs.bm.catalog_of_instruments_rudata.client.grpc.BondMaturitiesResponse.Builder.class);
  }

  public static final int REQID_FIELD_NUMBER = 1;
  private volatile java.lang.Object reqId_;
  /**
   * <code>string reqId = 1;</code>
   */
  public java.lang.String getReqId() {
    java.lang.Object ref = reqId_;
    if (ref instanceof java.lang.String) {
      return (java.lang.String) ref;
    } else {
      com.google.protobuf.ByteString bs = 
          (com.google.protobuf.ByteString) ref;
      java.lang.String s = bs.toStringUtf8();
      reqId_ = s;
      return s;
    }
  }
  /**
   * <code>string reqId = 1;</code>
   */
  public com.google.protobuf.ByteString
      getReqIdBytes() {
    java.lang.Object ref = reqId_;
    if (ref instanceof java.lang.String) {
      com.google.protobuf.ByteString b = 
          com.google.protobuf.ByteString.copyFromUtf8(
              (java.lang.String) ref);
      reqId_ = b;
      return b;
    } else {
      return (com.google.protobuf.ByteString) ref;
    }
  }

  public static final int BONDCOUPONS_FIELD_NUMBER = 2;
  private java.util.List<com.bcs.bm.catalog_of_instruments_rudata.client.grpc.BondCoupons> bondCoupons_;
  /**
   * <code>repeated .BondCoupons bondCoupons = 2;</code>
   */
  public java.util.List<com.bcs.bm.catalog_of_instruments_rudata.client.grpc.BondCoupons> getBondCouponsList() {
    return bondCoupons_;
  }
  /**
   * <code>repeated .BondCoupons bondCoupons = 2;</code>
   */
  public java.util.List<? extends com.bcs.bm.catalog_of_instruments_rudata.client.grpc.BondCouponsOrBuilder> 
      getBondCouponsOrBuilderList() {
    return bondCoupons_;
  }
  /**
   * <code>repeated .BondCoupons bondCoupons = 2;</code>
   */
  public int getBondCouponsCount() {
    return bondCoupons_.size();
  }
  /**
   * <code>repeated .BondCoupons bondCoupons = 2;</code>
   */
  public com.bcs.bm.catalog_of_instruments_rudata.client.grpc.BondCoupons getBondCoupons(int index) {
    return bondCoupons_.get(index);
  }
  /**
   * <code>repeated .BondCoupons bondCoupons = 2;</code>
   */
  public com.bcs.bm.catalog_of_instruments_rudata.client.grpc.BondCouponsOrBuilder getBondCouponsOrBuilder(
      int index) {
    return bondCoupons_.get(index);
  }

  private byte memoizedIsInitialized = -1;
  @java.lang.Override
  public final boolean isInitialized() {
    byte isInitialized = memoizedIsInitialized;
    if (isInitialized == 1) return true;
    if (isInitialized == 0) return false;

    memoizedIsInitialized = 1;
    return true;
  }

  @java.lang.Override
  public void writeTo(com.google.protobuf.CodedOutputStream output)
                      throws java.io.IOException {
    if (!getReqIdBytes().isEmpty()) {
      com.google.protobuf.GeneratedMessageV3.writeString(output, 1, reqId_);
    }
    for (int i = 0; i < bondCoupons_.size(); i++) {
      output.writeMessage(2, bondCoupons_.get(i));
    }
    unknownFields.writeTo(output);
  }

  @java.lang.Override
  public int getSerializedSize() {
    int size = memoizedSize;
    if (size != -1) return size;

    size = 0;
    if (!getReqIdBytes().isEmpty()) {
      size += com.google.protobuf.GeneratedMessageV3.computeStringSize(1, reqId_);
    }
    for (int i = 0; i < bondCoupons_.size(); i++) {
      size += com.google.protobuf.CodedOutputStream
        .computeMessageSize(2, bondCoupons_.get(i));
    }
    size += unknownFields.getSerializedSize();
    memoizedSize = size;
    return size;
  }

  @java.lang.Override
  public boolean equals(final java.lang.Object obj) {
    if (obj == this) {
     return true;
    }
    if (!(obj instanceof com.bcs.bm.catalog_of_instruments_rudata.client.grpc.BondMaturitiesResponse)) {
      return super.equals(obj);
    }
    com.bcs.bm.catalog_of_instruments_rudata.client.grpc.BondMaturitiesResponse other = (com.bcs.bm.catalog_of_instruments_rudata.client.grpc.BondMaturitiesResponse) obj;

    if (!getReqId()
        .equals(other.getReqId())) return false;
    if (!getBondCouponsList()
        .equals(other.getBondCouponsList())) return false;
    if (!unknownFields.equals(other.unknownFields)) return false;
    return true;
  }

  @java.lang.Override
  public int hashCode() {
    if (memoizedHashCode != 0) {
      return memoizedHashCode;
    }
    int hash = 41;
    hash = (19 * hash) + getDescriptor().hashCode();
    hash = (37 * hash) + REQID_FIELD_NUMBER;
    hash = (53 * hash) + getReqId().hashCode();
    if (getBondCouponsCount() > 0) {
      hash = (37 * hash) + BONDCOUPONS_FIELD_NUMBER;
      hash = (53 * hash) + getBondCouponsList().hashCode();
    }
    hash = (29 * hash) + unknownFields.hashCode();
    memoizedHashCode = hash;
    return hash;
  }

  public static com.bcs.bm.catalog_of_instruments_rudata.client.grpc.BondMaturitiesResponse parseFrom(
      java.nio.ByteBuffer data)
      throws com.google.protobuf.InvalidProtocolBufferException {
    return PARSER.parseFrom(data);
  }
  public static com.bcs.bm.catalog_of_instruments_rudata.client.grpc.BondMaturitiesResponse parseFrom(
      java.nio.ByteBuffer data,
      com.google.protobuf.ExtensionRegistryLite extensionRegistry)
      throws com.google.protobuf.InvalidProtocolBufferException {
    return PARSER.parseFrom(data, extensionRegistry);
  }
  public static com.bcs.bm.catalog_of_instruments_rudata.client.grpc.BondMaturitiesResponse parseFrom(
      com.google.protobuf.ByteString data)
      throws com.google.protobuf.InvalidProtocolBufferException {
    return PARSER.parseFrom(data);
  }
  public static com.bcs.bm.catalog_of_instruments_rudata.client.grpc.BondMaturitiesResponse parseFrom(
      com.google.protobuf.ByteString data,
      com.google.protobuf.ExtensionRegistryLite extensionRegistry)
      throws com.google.protobuf.InvalidProtocolBufferException {
    return PARSER.parseFrom(data, extensionRegistry);
  }
  public static com.bcs.bm.catalog_of_instruments_rudata.client.grpc.BondMaturitiesResponse parseFrom(byte[] data)
      throws com.google.protobuf.InvalidProtocolBufferException {
    return PARSER.parseFrom(data);
  }
  public static com.bcs.bm.catalog_of_instruments_rudata.client.grpc.BondMaturitiesResponse parseFrom(
      byte[] data,
      com.google.protobuf.ExtensionRegistryLite extensionRegistry)
      throws com.google.protobuf.InvalidProtocolBufferException {
    return PARSER.parseFrom(data, extensionRegistry);
  }
  public static com.bcs.bm.catalog_of_instruments_rudata.client.grpc.BondMaturitiesResponse parseFrom(java.io.InputStream input)
      throws java.io.IOException {
    return com.google.protobuf.GeneratedMessageV3
        .parseWithIOException(PARSER, input);
  }
  public static com.bcs.bm.catalog_of_instruments_rudata.client.grpc.BondMaturitiesResponse parseFrom(
      java.io.InputStream input,
      com.google.protobuf.ExtensionRegistryLite extensionRegistry)
      throws java.io.IOException {
    return com.google.protobuf.GeneratedMessageV3
        .parseWithIOException(PARSER, input, extensionRegistry);
  }
  public static com.bcs.bm.catalog_of_instruments_rudata.client.grpc.BondMaturitiesResponse parseDelimitedFrom(java.io.InputStream input)
      throws java.io.IOException {
    return com.google.protobuf.GeneratedMessageV3
        .parseDelimitedWithIOException(PARSER, input);
  }
  public static com.bcs.bm.catalog_of_instruments_rudata.client.grpc.BondMaturitiesResponse parseDelimitedFrom(
      java.io.InputStream input,
      com.google.protobuf.ExtensionRegistryLite extensionRegistry)
      throws java.io.IOException {
    return com.google.protobuf.GeneratedMessageV3
        .parseDelimitedWithIOException(PARSER, input, extensionRegistry);
  }
  public static com.bcs.bm.catalog_of_instruments_rudata.client.grpc.BondMaturitiesResponse parseFrom(
      com.google.protobuf.CodedInputStream input)
      throws java.io.IOException {
    return com.google.protobuf.GeneratedMessageV3
        .parseWithIOException(PARSER, input);
  }
  public static com.bcs.bm.catalog_of_instruments_rudata.client.grpc.BondMaturitiesResponse parseFrom(
      com.google.protobuf.CodedInputStream input,
      com.google.protobuf.ExtensionRegistryLite extensionRegistry)
      throws java.io.IOException {
    return com.google.protobuf.GeneratedMessageV3
        .parseWithIOException(PARSER, input, extensionRegistry);
  }

  @java.lang.Override
  public Builder newBuilderForType() { return newBuilder(); }
  public static Builder newBuilder() {
    return DEFAULT_INSTANCE.toBuilder();
  }
  public static Builder newBuilder(com.bcs.bm.catalog_of_instruments_rudata.client.grpc.BondMaturitiesResponse prototype) {
    return DEFAULT_INSTANCE.toBuilder().mergeFrom(prototype);
  }
  @java.lang.Override
  public Builder toBuilder() {
    return this == DEFAULT_INSTANCE
        ? new Builder() : new Builder().mergeFrom(this);
  }

  @java.lang.Override
  protected Builder newBuilderForType(
      com.google.protobuf.GeneratedMessageV3.BuilderParent parent) {
    Builder builder = new Builder(parent);
    return builder;
  }
  /**
   * Protobuf type {@code BondMaturitiesResponse}
   */
  public static final class Builder extends
      com.google.protobuf.GeneratedMessageV3.Builder<Builder> implements
      // @@protoc_insertion_point(builder_implements:BondMaturitiesResponse)
      com.bcs.bm.catalog_of_instruments_rudata.client.grpc.BondMaturitiesResponseOrBuilder {
    public static final com.google.protobuf.Descriptors.Descriptor
        getDescriptor() {
      return com.bcs.bm.catalog_of_instruments_rudata.client.grpc.GrpcService.internal_static_BondMaturitiesResponse_descriptor;
    }

    @java.lang.Override
    protected com.google.protobuf.GeneratedMessageV3.FieldAccessorTable
        internalGetFieldAccessorTable() {
      return com.bcs.bm.catalog_of_instruments_rudata.client.grpc.GrpcService.internal_static_BondMaturitiesResponse_fieldAccessorTable
          .ensureFieldAccessorsInitialized(
              com.bcs.bm.catalog_of_instruments_rudata.client.grpc.BondMaturitiesResponse.class, com.bcs.bm.catalog_of_instruments_rudata.client.grpc.BondMaturitiesResponse.Builder.class);
    }

    // Construct using com.bcs.bm.catalog_of_instruments_rudata.client.grpc.BondMaturitiesResponse.newBuilder()
    private Builder() {
      maybeForceBuilderInitialization();
    }

    private Builder(
        com.google.protobuf.GeneratedMessageV3.BuilderParent parent) {
      super(parent);
      maybeForceBuilderInitialization();
    }
    private void maybeForceBuilderInitialization() {
      if (com.google.protobuf.GeneratedMessageV3
              .alwaysUseFieldBuilders) {
        getBondCouponsFieldBuilder();
      }
    }
    @java.lang.Override
    public Builder clear() {
      super.clear();
      reqId_ = "";

      if (bondCouponsBuilder_ == null) {
        bondCoupons_ = java.util.Collections.emptyList();
        bitField0_ = (bitField0_ & ~0x00000001);
      } else {
        bondCouponsBuilder_.clear();
      }
      return this;
    }

    @java.lang.Override
    public com.google.protobuf.Descriptors.Descriptor
        getDescriptorForType() {
      return com.bcs.bm.catalog_of_instruments_rudata.client.grpc.GrpcService.internal_static_BondMaturitiesResponse_descriptor;
    }

    @java.lang.Override
    public com.bcs.bm.catalog_of_instruments_rudata.client.grpc.BondMaturitiesResponse getDefaultInstanceForType() {
      return com.bcs.bm.catalog_of_instruments_rudata.client.grpc.BondMaturitiesResponse.getDefaultInstance();
    }

    @java.lang.Override
    public com.bcs.bm.catalog_of_instruments_rudata.client.grpc.BondMaturitiesResponse build() {
      com.bcs.bm.catalog_of_instruments_rudata.client.grpc.BondMaturitiesResponse result = buildPartial();
      if (!result.isInitialized()) {
        throw newUninitializedMessageException(result);
      }
      return result;
    }

    @java.lang.Override
    public com.bcs.bm.catalog_of_instruments_rudata.client.grpc.BondMaturitiesResponse buildPartial() {
      com.bcs.bm.catalog_of_instruments_rudata.client.grpc.BondMaturitiesResponse result = new com.bcs.bm.catalog_of_instruments_rudata.client.grpc.BondMaturitiesResponse(this);
      int from_bitField0_ = bitField0_;
      result.reqId_ = reqId_;
      if (bondCouponsBuilder_ == null) {
        if (((bitField0_ & 0x00000001) != 0)) {
          bondCoupons_ = java.util.Collections.unmodifiableList(bondCoupons_);
          bitField0_ = (bitField0_ & ~0x00000001);
        }
        result.bondCoupons_ = bondCoupons_;
      } else {
        result.bondCoupons_ = bondCouponsBuilder_.build();
      }
      onBuilt();
      return result;
    }

    @java.lang.Override
    public Builder clone() {
      return super.clone();
    }
    @java.lang.Override
    public Builder setField(
        com.google.protobuf.Descriptors.FieldDescriptor field,
        java.lang.Object value) {
      return super.setField(field, value);
    }
    @java.lang.Override
    public Builder clearField(
        com.google.protobuf.Descriptors.FieldDescriptor field) {
      return super.clearField(field);
    }
    @java.lang.Override
    public Builder clearOneof(
        com.google.protobuf.Descriptors.OneofDescriptor oneof) {
      return super.clearOneof(oneof);
    }
    @java.lang.Override
    public Builder setRepeatedField(
        com.google.protobuf.Descriptors.FieldDescriptor field,
        int index, java.lang.Object value) {
      return super.setRepeatedField(field, index, value);
    }
    @java.lang.Override
    public Builder addRepeatedField(
        com.google.protobuf.Descriptors.FieldDescriptor field,
        java.lang.Object value) {
      return super.addRepeatedField(field, value);
    }
    @java.lang.Override
    public Builder mergeFrom(com.google.protobuf.Message other) {
      if (other instanceof com.bcs.bm.catalog_of_instruments_rudata.client.grpc.BondMaturitiesResponse) {
        return mergeFrom((com.bcs.bm.catalog_of_instruments_rudata.client.grpc.BondMaturitiesResponse)other);
      } else {
        super.mergeFrom(other);
        return this;
      }
    }

    public Builder mergeFrom(com.bcs.bm.catalog_of_instruments_rudata.client.grpc.BondMaturitiesResponse other) {
      if (other == com.bcs.bm.catalog_of_instruments_rudata.client.grpc.BondMaturitiesResponse.getDefaultInstance()) return this;
      if (!other.getReqId().isEmpty()) {
        reqId_ = other.reqId_;
        onChanged();
      }
      if (bondCouponsBuilder_ == null) {
        if (!other.bondCoupons_.isEmpty()) {
          if (bondCoupons_.isEmpty()) {
            bondCoupons_ = other.bondCoupons_;
            bitField0_ = (bitField0_ & ~0x00000001);
          } else {
            ensureBondCouponsIsMutable();
            bondCoupons_.addAll(other.bondCoupons_);
          }
          onChanged();
        }
      } else {
        if (!other.bondCoupons_.isEmpty()) {
          if (bondCouponsBuilder_.isEmpty()) {
            bondCouponsBuilder_.dispose();
            bondCouponsBuilder_ = null;
            bondCoupons_ = other.bondCoupons_;
            bitField0_ = (bitField0_ & ~0x00000001);
            bondCouponsBuilder_ = 
              com.google.protobuf.GeneratedMessageV3.alwaysUseFieldBuilders ?
                 getBondCouponsFieldBuilder() : null;
          } else {
            bondCouponsBuilder_.addAllMessages(other.bondCoupons_);
          }
        }
      }
      this.mergeUnknownFields(other.unknownFields);
      onChanged();
      return this;
    }

    @java.lang.Override
    public final boolean isInitialized() {
      return true;
    }

    @java.lang.Override
    public Builder mergeFrom(
        com.google.protobuf.CodedInputStream input,
        com.google.protobuf.ExtensionRegistryLite extensionRegistry)
        throws java.io.IOException {
      com.bcs.bm.catalog_of_instruments_rudata.client.grpc.BondMaturitiesResponse parsedMessage = null;
      try {
        parsedMessage = PARSER.parsePartialFrom(input, extensionRegistry);
      } catch (com.google.protobuf.InvalidProtocolBufferException e) {
        parsedMessage = (com.bcs.bm.catalog_of_instruments_rudata.client.grpc.BondMaturitiesResponse) e.getUnfinishedMessage();
        throw e.unwrapIOException();
      } finally {
        if (parsedMessage != null) {
          mergeFrom(parsedMessage);
        }
      }
      return this;
    }
    private int bitField0_;

    private java.lang.Object reqId_ = "";
    /**
     * <code>string reqId = 1;</code>
     */
    public java.lang.String getReqId() {
      java.lang.Object ref = reqId_;
      if (!(ref instanceof java.lang.String)) {
        com.google.protobuf.ByteString bs =
            (com.google.protobuf.ByteString) ref;
        java.lang.String s = bs.toStringUtf8();
        reqId_ = s;
        return s;
      } else {
        return (java.lang.String) ref;
      }
    }
    /**
     * <code>string reqId = 1;</code>
     */
    public com.google.protobuf.ByteString
        getReqIdBytes() {
      java.lang.Object ref = reqId_;
      if (ref instanceof String) {
        com.google.protobuf.ByteString b = 
            com.google.protobuf.ByteString.copyFromUtf8(
                (java.lang.String) ref);
        reqId_ = b;
        return b;
      } else {
        return (com.google.protobuf.ByteString) ref;
      }
    }
    /**
     * <code>string reqId = 1;</code>
     */
    public Builder setReqId(
        java.lang.String value) {
      if (value == null) {
    throw new NullPointerException();
  }
  
      reqId_ = value;
      onChanged();
      return this;
    }
    /**
     * <code>string reqId = 1;</code>
     */
    public Builder clearReqId() {
      
      reqId_ = getDefaultInstance().getReqId();
      onChanged();
      return this;
    }
    /**
     * <code>string reqId = 1;</code>
     */
    public Builder setReqIdBytes(
        com.google.protobuf.ByteString value) {
      if (value == null) {
    throw new NullPointerException();
  }
  checkByteStringIsUtf8(value);
      
      reqId_ = value;
      onChanged();
      return this;
    }

    private java.util.List<com.bcs.bm.catalog_of_instruments_rudata.client.grpc.BondCoupons> bondCoupons_ =
      java.util.Collections.emptyList();
    private void ensureBondCouponsIsMutable() {
      if (!((bitField0_ & 0x00000001) != 0)) {
        bondCoupons_ = new java.util.ArrayList<com.bcs.bm.catalog_of_instruments_rudata.client.grpc.BondCoupons>(bondCoupons_);
        bitField0_ |= 0x00000001;
       }
    }

    private com.google.protobuf.RepeatedFieldBuilderV3<
        com.bcs.bm.catalog_of_instruments_rudata.client.grpc.BondCoupons, com.bcs.bm.catalog_of_instruments_rudata.client.grpc.BondCoupons.Builder, com.bcs.bm.catalog_of_instruments_rudata.client.grpc.BondCouponsOrBuilder> bondCouponsBuilder_;

    /**
     * <code>repeated .BondCoupons bondCoupons = 2;</code>
     */
    public java.util.List<com.bcs.bm.catalog_of_instruments_rudata.client.grpc.BondCoupons> getBondCouponsList() {
      if (bondCouponsBuilder_ == null) {
        return java.util.Collections.unmodifiableList(bondCoupons_);
      } else {
        return bondCouponsBuilder_.getMessageList();
      }
    }
    /**
     * <code>repeated .BondCoupons bondCoupons = 2;</code>
     */
    public int getBondCouponsCount() {
      if (bondCouponsBuilder_ == null) {
        return bondCoupons_.size();
      } else {
        return bondCouponsBuilder_.getCount();
      }
    }
    /**
     * <code>repeated .BondCoupons bondCoupons = 2;</code>
     */
    public com.bcs.bm.catalog_of_instruments_rudata.client.grpc.BondCoupons getBondCoupons(int index) {
      if (bondCouponsBuilder_ == null) {
        return bondCoupons_.get(index);
      } else {
        return bondCouponsBuilder_.getMessage(index);
      }
    }
    /**
     * <code>repeated .BondCoupons bondCoupons = 2;</code>
     */
    public Builder setBondCoupons(
        int index, com.bcs.bm.catalog_of_instruments_rudata.client.grpc.BondCoupons value) {
      if (bondCouponsBuilder_ == null) {
        if (value == null) {
          throw new NullPointerException();
        }
        ensureBondCouponsIsMutable();
        bondCoupons_.set(index, value);
        onChanged();
      } else {
        bondCouponsBuilder_.setMessage(index, value);
      }
      return this;
    }
    /**
     * <code>repeated .BondCoupons bondCoupons = 2;</code>
     */
    public Builder setBondCoupons(
        int index, com.bcs.bm.catalog_of_instruments_rudata.client.grpc.BondCoupons.Builder builderForValue) {
      if (bondCouponsBuilder_ == null) {
        ensureBondCouponsIsMutable();
        bondCoupons_.set(index, builderForValue.build());
        onChanged();
      } else {
        bondCouponsBuilder_.setMessage(index, builderForValue.build());
      }
      return this;
    }
    /**
     * <code>repeated .BondCoupons bondCoupons = 2;</code>
     */
    public Builder addBondCoupons(com.bcs.bm.catalog_of_instruments_rudata.client.grpc.BondCoupons value) {
      if (bondCouponsBuilder_ == null) {
        if (value == null) {
          throw new NullPointerException();
        }
        ensureBondCouponsIsMutable();
        bondCoupons_.add(value);
        onChanged();
      } else {
        bondCouponsBuilder_.addMessage(value);
      }
      return this;
    }
    /**
     * <code>repeated .BondCoupons bondCoupons = 2;</code>
     */
    public Builder addBondCoupons(
        int index, com.bcs.bm.catalog_of_instruments_rudata.client.grpc.BondCoupons value) {
      if (bondCouponsBuilder_ == null) {
        if (value == null) {
          throw new NullPointerException();
        }
        ensureBondCouponsIsMutable();
        bondCoupons_.add(index, value);
        onChanged();
      } else {
        bondCouponsBuilder_.addMessage(index, value);
      }
      return this;
    }
    /**
     * <code>repeated .BondCoupons bondCoupons = 2;</code>
     */
    public Builder addBondCoupons(
        com.bcs.bm.catalog_of_instruments_rudata.client.grpc.BondCoupons.Builder builderForValue) {
      if (bondCouponsBuilder_ == null) {
        ensureBondCouponsIsMutable();
        bondCoupons_.add(builderForValue.build());
        onChanged();
      } else {
        bondCouponsBuilder_.addMessage(builderForValue.build());
      }
      return this;
    }
    /**
     * <code>repeated .BondCoupons bondCoupons = 2;</code>
     */
    public Builder addBondCoupons(
        int index, com.bcs.bm.catalog_of_instruments_rudata.client.grpc.BondCoupons.Builder builderForValue) {
      if (bondCouponsBuilder_ == null) {
        ensureBondCouponsIsMutable();
        bondCoupons_.add(index, builderForValue.build());
        onChanged();
      } else {
        bondCouponsBuilder_.addMessage(index, builderForValue.build());
      }
      return this;
    }
    /**
     * <code>repeated .BondCoupons bondCoupons = 2;</code>
     */
    public Builder addAllBondCoupons(
        java.lang.Iterable<? extends com.bcs.bm.catalog_of_instruments_rudata.client.grpc.BondCoupons> values) {
      if (bondCouponsBuilder_ == null) {
        ensureBondCouponsIsMutable();
        com.google.protobuf.AbstractMessageLite.Builder.addAll(
            values, bondCoupons_);
        onChanged();
      } else {
        bondCouponsBuilder_.addAllMessages(values);
      }
      return this;
    }
    /**
     * <code>repeated .BondCoupons bondCoupons = 2;</code>
     */
    public Builder clearBondCoupons() {
      if (bondCouponsBuilder_ == null) {
        bondCoupons_ = java.util.Collections.emptyList();
        bitField0_ = (bitField0_ & ~0x00000001);
        onChanged();
      } else {
        bondCouponsBuilder_.clear();
      }
      return this;
    }
    /**
     * <code>repeated .BondCoupons bondCoupons = 2;</code>
     */
    public Builder removeBondCoupons(int index) {
      if (bondCouponsBuilder_ == null) {
        ensureBondCouponsIsMutable();
        bondCoupons_.remove(index);
        onChanged();
      } else {
        bondCouponsBuilder_.remove(index);
      }
      return this;
    }
    /**
     * <code>repeated .BondCoupons bondCoupons = 2;</code>
     */
    public com.bcs.bm.catalog_of_instruments_rudata.client.grpc.BondCoupons.Builder getBondCouponsBuilder(
        int index) {
      return getBondCouponsFieldBuilder().getBuilder(index);
    }
    /**
     * <code>repeated .BondCoupons bondCoupons = 2;</code>
     */
    public com.bcs.bm.catalog_of_instruments_rudata.client.grpc.BondCouponsOrBuilder getBondCouponsOrBuilder(
        int index) {
      if (bondCouponsBuilder_ == null) {
        return bondCoupons_.get(index);  } else {
        return bondCouponsBuilder_.getMessageOrBuilder(index);
      }
    }
    /**
     * <code>repeated .BondCoupons bondCoupons = 2;</code>
     */
    public java.util.List<? extends com.bcs.bm.catalog_of_instruments_rudata.client.grpc.BondCouponsOrBuilder> 
         getBondCouponsOrBuilderList() {
      if (bondCouponsBuilder_ != null) {
        return bondCouponsBuilder_.getMessageOrBuilderList();
      } else {
        return java.util.Collections.unmodifiableList(bondCoupons_);
      }
    }
    /**
     * <code>repeated .BondCoupons bondCoupons = 2;</code>
     */
    public com.bcs.bm.catalog_of_instruments_rudata.client.grpc.BondCoupons.Builder addBondCouponsBuilder() {
      return getBondCouponsFieldBuilder().addBuilder(
          com.bcs.bm.catalog_of_instruments_rudata.client.grpc.BondCoupons.getDefaultInstance());
    }
    /**
     * <code>repeated .BondCoupons bondCoupons = 2;</code>
     */
    public com.bcs.bm.catalog_of_instruments_rudata.client.grpc.BondCoupons.Builder addBondCouponsBuilder(
        int index) {
      return getBondCouponsFieldBuilder().addBuilder(
          index, com.bcs.bm.catalog_of_instruments_rudata.client.grpc.BondCoupons.getDefaultInstance());
    }
    /**
     * <code>repeated .BondCoupons bondCoupons = 2;</code>
     */
    public java.util.List<com.bcs.bm.catalog_of_instruments_rudata.client.grpc.BondCoupons.Builder> 
         getBondCouponsBuilderList() {
      return getBondCouponsFieldBuilder().getBuilderList();
    }
    private com.google.protobuf.RepeatedFieldBuilderV3<
        com.bcs.bm.catalog_of_instruments_rudata.client.grpc.BondCoupons, com.bcs.bm.catalog_of_instruments_rudata.client.grpc.BondCoupons.Builder, com.bcs.bm.catalog_of_instruments_rudata.client.grpc.BondCouponsOrBuilder> 
        getBondCouponsFieldBuilder() {
      if (bondCouponsBuilder_ == null) {
        bondCouponsBuilder_ = new com.google.protobuf.RepeatedFieldBuilderV3<
            com.bcs.bm.catalog_of_instruments_rudata.client.grpc.BondCoupons, com.bcs.bm.catalog_of_instruments_rudata.client.grpc.BondCoupons.Builder, com.bcs.bm.catalog_of_instruments_rudata.client.grpc.BondCouponsOrBuilder>(
                bondCoupons_,
                ((bitField0_ & 0x00000001) != 0),
                getParentForChildren(),
                isClean());
        bondCoupons_ = null;
      }
      return bondCouponsBuilder_;
    }
    @java.lang.Override
    public final Builder setUnknownFields(
        final com.google.protobuf.UnknownFieldSet unknownFields) {
      return super.setUnknownFields(unknownFields);
    }

    @java.lang.Override
    public final Builder mergeUnknownFields(
        final com.google.protobuf.UnknownFieldSet unknownFields) {
      return super.mergeUnknownFields(unknownFields);
    }


    // @@protoc_insertion_point(builder_scope:BondMaturitiesResponse)
  }

  // @@protoc_insertion_point(class_scope:BondMaturitiesResponse)
  private static final com.bcs.bm.catalog_of_instruments_rudata.client.grpc.BondMaturitiesResponse DEFAULT_INSTANCE;
  static {
    DEFAULT_INSTANCE = new com.bcs.bm.catalog_of_instruments_rudata.client.grpc.BondMaturitiesResponse();
  }

  public static com.bcs.bm.catalog_of_instruments_rudata.client.grpc.BondMaturitiesResponse getDefaultInstance() {
    return DEFAULT_INSTANCE;
  }

  private static final com.google.protobuf.Parser<BondMaturitiesResponse>
      PARSER = new com.google.protobuf.AbstractParser<BondMaturitiesResponse>() {
    @java.lang.Override
    public BondMaturitiesResponse parsePartialFrom(
        com.google.protobuf.CodedInputStream input,
        com.google.protobuf.ExtensionRegistryLite extensionRegistry)
        throws com.google.protobuf.InvalidProtocolBufferException {
      return new BondMaturitiesResponse(input, extensionRegistry);
    }
  };

  public static com.google.protobuf.Parser<BondMaturitiesResponse> parser() {
    return PARSER;
  }

  @java.lang.Override
  public com.google.protobuf.Parser<BondMaturitiesResponse> getParserForType() {
    return PARSER;
  }

  @java.lang.Override
  public com.bcs.bm.catalog_of_instruments_rudata.client.grpc.BondMaturitiesResponse getDefaultInstanceForType() {
    return DEFAULT_INSTANCE;
  }

}


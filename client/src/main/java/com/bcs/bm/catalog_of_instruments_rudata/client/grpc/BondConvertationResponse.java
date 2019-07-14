// Generated by the protocol buffer compiler.  DO NOT EDIT!
// source: GrpcService.proto

package com.bcs.bm.catalog_of_instruments_rudata.client.grpc;

/**
 * Protobuf type {@code BondConvertationResponse}
 */
public  final class BondConvertationResponse extends
    com.google.protobuf.GeneratedMessageV3 implements
    // @@protoc_insertion_point(message_implements:BondConvertationResponse)
    BondConvertationResponseOrBuilder {
private static final long serialVersionUID = 0L;
  // Use BondConvertationResponse.newBuilder() to construct.
  private BondConvertationResponse(com.google.protobuf.GeneratedMessageV3.Builder<?> builder) {
    super(builder);
  }
  private BondConvertationResponse() {
    reqId_ = "";
    bondConvertation_ = java.util.Collections.emptyList();
  }

  @java.lang.Override
  @SuppressWarnings({"unused"})
  protected java.lang.Object newInstance(
      UnusedPrivateParameter unused) {
    return new BondConvertationResponse();
  }

  @java.lang.Override
  public final com.google.protobuf.UnknownFieldSet
  getUnknownFields() {
    return this.unknownFields;
  }
  private BondConvertationResponse(
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
              bondConvertation_ = new java.util.ArrayList<com.bcs.bm.catalog_of_instruments_rudata.client.grpc.BondConvertation>();
              mutable_bitField0_ |= 0x00000001;
            }
            bondConvertation_.add(
                input.readMessage(com.bcs.bm.catalog_of_instruments_rudata.client.grpc.BondConvertation.parser(), extensionRegistry));
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
        bondConvertation_ = java.util.Collections.unmodifiableList(bondConvertation_);
      }
      this.unknownFields = unknownFields.build();
      makeExtensionsImmutable();
    }
  }
  public static final com.google.protobuf.Descriptors.Descriptor
      getDescriptor() {
    return com.bcs.bm.catalog_of_instruments_rudata.client.grpc.GrpcService.internal_static_BondConvertationResponse_descriptor;
  }

  @java.lang.Override
  protected com.google.protobuf.GeneratedMessageV3.FieldAccessorTable
      internalGetFieldAccessorTable() {
    return com.bcs.bm.catalog_of_instruments_rudata.client.grpc.GrpcService.internal_static_BondConvertationResponse_fieldAccessorTable
        .ensureFieldAccessorsInitialized(
            com.bcs.bm.catalog_of_instruments_rudata.client.grpc.BondConvertationResponse.class, com.bcs.bm.catalog_of_instruments_rudata.client.grpc.BondConvertationResponse.Builder.class);
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

  public static final int BONDCONVERTATION_FIELD_NUMBER = 2;
  private java.util.List<com.bcs.bm.catalog_of_instruments_rudata.client.grpc.BondConvertation> bondConvertation_;
  /**
   * <code>repeated .BondConvertation bondConvertation = 2;</code>
   */
  public java.util.List<com.bcs.bm.catalog_of_instruments_rudata.client.grpc.BondConvertation> getBondConvertationList() {
    return bondConvertation_;
  }
  /**
   * <code>repeated .BondConvertation bondConvertation = 2;</code>
   */
  public java.util.List<? extends com.bcs.bm.catalog_of_instruments_rudata.client.grpc.BondConvertationOrBuilder> 
      getBondConvertationOrBuilderList() {
    return bondConvertation_;
  }
  /**
   * <code>repeated .BondConvertation bondConvertation = 2;</code>
   */
  public int getBondConvertationCount() {
    return bondConvertation_.size();
  }
  /**
   * <code>repeated .BondConvertation bondConvertation = 2;</code>
   */
  public com.bcs.bm.catalog_of_instruments_rudata.client.grpc.BondConvertation getBondConvertation(int index) {
    return bondConvertation_.get(index);
  }
  /**
   * <code>repeated .BondConvertation bondConvertation = 2;</code>
   */
  public com.bcs.bm.catalog_of_instruments_rudata.client.grpc.BondConvertationOrBuilder getBondConvertationOrBuilder(
      int index) {
    return bondConvertation_.get(index);
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
    for (int i = 0; i < bondConvertation_.size(); i++) {
      output.writeMessage(2, bondConvertation_.get(i));
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
    for (int i = 0; i < bondConvertation_.size(); i++) {
      size += com.google.protobuf.CodedOutputStream
        .computeMessageSize(2, bondConvertation_.get(i));
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
    if (!(obj instanceof com.bcs.bm.catalog_of_instruments_rudata.client.grpc.BondConvertationResponse)) {
      return super.equals(obj);
    }
    com.bcs.bm.catalog_of_instruments_rudata.client.grpc.BondConvertationResponse other = (com.bcs.bm.catalog_of_instruments_rudata.client.grpc.BondConvertationResponse) obj;

    if (!getReqId()
        .equals(other.getReqId())) return false;
    if (!getBondConvertationList()
        .equals(other.getBondConvertationList())) return false;
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
    if (getBondConvertationCount() > 0) {
      hash = (37 * hash) + BONDCONVERTATION_FIELD_NUMBER;
      hash = (53 * hash) + getBondConvertationList().hashCode();
    }
    hash = (29 * hash) + unknownFields.hashCode();
    memoizedHashCode = hash;
    return hash;
  }

  public static com.bcs.bm.catalog_of_instruments_rudata.client.grpc.BondConvertationResponse parseFrom(
      java.nio.ByteBuffer data)
      throws com.google.protobuf.InvalidProtocolBufferException {
    return PARSER.parseFrom(data);
  }
  public static com.bcs.bm.catalog_of_instruments_rudata.client.grpc.BondConvertationResponse parseFrom(
      java.nio.ByteBuffer data,
      com.google.protobuf.ExtensionRegistryLite extensionRegistry)
      throws com.google.protobuf.InvalidProtocolBufferException {
    return PARSER.parseFrom(data, extensionRegistry);
  }
  public static com.bcs.bm.catalog_of_instruments_rudata.client.grpc.BondConvertationResponse parseFrom(
      com.google.protobuf.ByteString data)
      throws com.google.protobuf.InvalidProtocolBufferException {
    return PARSER.parseFrom(data);
  }
  public static com.bcs.bm.catalog_of_instruments_rudata.client.grpc.BondConvertationResponse parseFrom(
      com.google.protobuf.ByteString data,
      com.google.protobuf.ExtensionRegistryLite extensionRegistry)
      throws com.google.protobuf.InvalidProtocolBufferException {
    return PARSER.parseFrom(data, extensionRegistry);
  }
  public static com.bcs.bm.catalog_of_instruments_rudata.client.grpc.BondConvertationResponse parseFrom(byte[] data)
      throws com.google.protobuf.InvalidProtocolBufferException {
    return PARSER.parseFrom(data);
  }
  public static com.bcs.bm.catalog_of_instruments_rudata.client.grpc.BondConvertationResponse parseFrom(
      byte[] data,
      com.google.protobuf.ExtensionRegistryLite extensionRegistry)
      throws com.google.protobuf.InvalidProtocolBufferException {
    return PARSER.parseFrom(data, extensionRegistry);
  }
  public static com.bcs.bm.catalog_of_instruments_rudata.client.grpc.BondConvertationResponse parseFrom(java.io.InputStream input)
      throws java.io.IOException {
    return com.google.protobuf.GeneratedMessageV3
        .parseWithIOException(PARSER, input);
  }
  public static com.bcs.bm.catalog_of_instruments_rudata.client.grpc.BondConvertationResponse parseFrom(
      java.io.InputStream input,
      com.google.protobuf.ExtensionRegistryLite extensionRegistry)
      throws java.io.IOException {
    return com.google.protobuf.GeneratedMessageV3
        .parseWithIOException(PARSER, input, extensionRegistry);
  }
  public static com.bcs.bm.catalog_of_instruments_rudata.client.grpc.BondConvertationResponse parseDelimitedFrom(java.io.InputStream input)
      throws java.io.IOException {
    return com.google.protobuf.GeneratedMessageV3
        .parseDelimitedWithIOException(PARSER, input);
  }
  public static com.bcs.bm.catalog_of_instruments_rudata.client.grpc.BondConvertationResponse parseDelimitedFrom(
      java.io.InputStream input,
      com.google.protobuf.ExtensionRegistryLite extensionRegistry)
      throws java.io.IOException {
    return com.google.protobuf.GeneratedMessageV3
        .parseDelimitedWithIOException(PARSER, input, extensionRegistry);
  }
  public static com.bcs.bm.catalog_of_instruments_rudata.client.grpc.BondConvertationResponse parseFrom(
      com.google.protobuf.CodedInputStream input)
      throws java.io.IOException {
    return com.google.protobuf.GeneratedMessageV3
        .parseWithIOException(PARSER, input);
  }
  public static com.bcs.bm.catalog_of_instruments_rudata.client.grpc.BondConvertationResponse parseFrom(
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
  public static Builder newBuilder(com.bcs.bm.catalog_of_instruments_rudata.client.grpc.BondConvertationResponse prototype) {
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
   * Protobuf type {@code BondConvertationResponse}
   */
  public static final class Builder extends
      com.google.protobuf.GeneratedMessageV3.Builder<Builder> implements
      // @@protoc_insertion_point(builder_implements:BondConvertationResponse)
      com.bcs.bm.catalog_of_instruments_rudata.client.grpc.BondConvertationResponseOrBuilder {
    public static final com.google.protobuf.Descriptors.Descriptor
        getDescriptor() {
      return com.bcs.bm.catalog_of_instruments_rudata.client.grpc.GrpcService.internal_static_BondConvertationResponse_descriptor;
    }

    @java.lang.Override
    protected com.google.protobuf.GeneratedMessageV3.FieldAccessorTable
        internalGetFieldAccessorTable() {
      return com.bcs.bm.catalog_of_instruments_rudata.client.grpc.GrpcService.internal_static_BondConvertationResponse_fieldAccessorTable
          .ensureFieldAccessorsInitialized(
              com.bcs.bm.catalog_of_instruments_rudata.client.grpc.BondConvertationResponse.class, com.bcs.bm.catalog_of_instruments_rudata.client.grpc.BondConvertationResponse.Builder.class);
    }

    // Construct using com.bcs.bm.catalog_of_instruments_rudata.client.grpc.BondConvertationResponse.newBuilder()
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
        getBondConvertationFieldBuilder();
      }
    }
    @java.lang.Override
    public Builder clear() {
      super.clear();
      reqId_ = "";

      if (bondConvertationBuilder_ == null) {
        bondConvertation_ = java.util.Collections.emptyList();
        bitField0_ = (bitField0_ & ~0x00000001);
      } else {
        bondConvertationBuilder_.clear();
      }
      return this;
    }

    @java.lang.Override
    public com.google.protobuf.Descriptors.Descriptor
        getDescriptorForType() {
      return com.bcs.bm.catalog_of_instruments_rudata.client.grpc.GrpcService.internal_static_BondConvertationResponse_descriptor;
    }

    @java.lang.Override
    public com.bcs.bm.catalog_of_instruments_rudata.client.grpc.BondConvertationResponse getDefaultInstanceForType() {
      return com.bcs.bm.catalog_of_instruments_rudata.client.grpc.BondConvertationResponse.getDefaultInstance();
    }

    @java.lang.Override
    public com.bcs.bm.catalog_of_instruments_rudata.client.grpc.BondConvertationResponse build() {
      com.bcs.bm.catalog_of_instruments_rudata.client.grpc.BondConvertationResponse result = buildPartial();
      if (!result.isInitialized()) {
        throw newUninitializedMessageException(result);
      }
      return result;
    }

    @java.lang.Override
    public com.bcs.bm.catalog_of_instruments_rudata.client.grpc.BondConvertationResponse buildPartial() {
      com.bcs.bm.catalog_of_instruments_rudata.client.grpc.BondConvertationResponse result = new com.bcs.bm.catalog_of_instruments_rudata.client.grpc.BondConvertationResponse(this);
      int from_bitField0_ = bitField0_;
      result.reqId_ = reqId_;
      if (bondConvertationBuilder_ == null) {
        if (((bitField0_ & 0x00000001) != 0)) {
          bondConvertation_ = java.util.Collections.unmodifiableList(bondConvertation_);
          bitField0_ = (bitField0_ & ~0x00000001);
        }
        result.bondConvertation_ = bondConvertation_;
      } else {
        result.bondConvertation_ = bondConvertationBuilder_.build();
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
      if (other instanceof com.bcs.bm.catalog_of_instruments_rudata.client.grpc.BondConvertationResponse) {
        return mergeFrom((com.bcs.bm.catalog_of_instruments_rudata.client.grpc.BondConvertationResponse)other);
      } else {
        super.mergeFrom(other);
        return this;
      }
    }

    public Builder mergeFrom(com.bcs.bm.catalog_of_instruments_rudata.client.grpc.BondConvertationResponse other) {
      if (other == com.bcs.bm.catalog_of_instruments_rudata.client.grpc.BondConvertationResponse.getDefaultInstance()) return this;
      if (!other.getReqId().isEmpty()) {
        reqId_ = other.reqId_;
        onChanged();
      }
      if (bondConvertationBuilder_ == null) {
        if (!other.bondConvertation_.isEmpty()) {
          if (bondConvertation_.isEmpty()) {
            bondConvertation_ = other.bondConvertation_;
            bitField0_ = (bitField0_ & ~0x00000001);
          } else {
            ensureBondConvertationIsMutable();
            bondConvertation_.addAll(other.bondConvertation_);
          }
          onChanged();
        }
      } else {
        if (!other.bondConvertation_.isEmpty()) {
          if (bondConvertationBuilder_.isEmpty()) {
            bondConvertationBuilder_.dispose();
            bondConvertationBuilder_ = null;
            bondConvertation_ = other.bondConvertation_;
            bitField0_ = (bitField0_ & ~0x00000001);
            bondConvertationBuilder_ = 
              com.google.protobuf.GeneratedMessageV3.alwaysUseFieldBuilders ?
                 getBondConvertationFieldBuilder() : null;
          } else {
            bondConvertationBuilder_.addAllMessages(other.bondConvertation_);
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
      com.bcs.bm.catalog_of_instruments_rudata.client.grpc.BondConvertationResponse parsedMessage = null;
      try {
        parsedMessage = PARSER.parsePartialFrom(input, extensionRegistry);
      } catch (com.google.protobuf.InvalidProtocolBufferException e) {
        parsedMessage = (com.bcs.bm.catalog_of_instruments_rudata.client.grpc.BondConvertationResponse) e.getUnfinishedMessage();
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

    private java.util.List<com.bcs.bm.catalog_of_instruments_rudata.client.grpc.BondConvertation> bondConvertation_ =
      java.util.Collections.emptyList();
    private void ensureBondConvertationIsMutable() {
      if (!((bitField0_ & 0x00000001) != 0)) {
        bondConvertation_ = new java.util.ArrayList<com.bcs.bm.catalog_of_instruments_rudata.client.grpc.BondConvertation>(bondConvertation_);
        bitField0_ |= 0x00000001;
       }
    }

    private com.google.protobuf.RepeatedFieldBuilderV3<
        com.bcs.bm.catalog_of_instruments_rudata.client.grpc.BondConvertation, com.bcs.bm.catalog_of_instruments_rudata.client.grpc.BondConvertation.Builder, com.bcs.bm.catalog_of_instruments_rudata.client.grpc.BondConvertationOrBuilder> bondConvertationBuilder_;

    /**
     * <code>repeated .BondConvertation bondConvertation = 2;</code>
     */
    public java.util.List<com.bcs.bm.catalog_of_instruments_rudata.client.grpc.BondConvertation> getBondConvertationList() {
      if (bondConvertationBuilder_ == null) {
        return java.util.Collections.unmodifiableList(bondConvertation_);
      } else {
        return bondConvertationBuilder_.getMessageList();
      }
    }
    /**
     * <code>repeated .BondConvertation bondConvertation = 2;</code>
     */
    public int getBondConvertationCount() {
      if (bondConvertationBuilder_ == null) {
        return bondConvertation_.size();
      } else {
        return bondConvertationBuilder_.getCount();
      }
    }
    /**
     * <code>repeated .BondConvertation bondConvertation = 2;</code>
     */
    public com.bcs.bm.catalog_of_instruments_rudata.client.grpc.BondConvertation getBondConvertation(int index) {
      if (bondConvertationBuilder_ == null) {
        return bondConvertation_.get(index);
      } else {
        return bondConvertationBuilder_.getMessage(index);
      }
    }
    /**
     * <code>repeated .BondConvertation bondConvertation = 2;</code>
     */
    public Builder setBondConvertation(
        int index, com.bcs.bm.catalog_of_instruments_rudata.client.grpc.BondConvertation value) {
      if (bondConvertationBuilder_ == null) {
        if (value == null) {
          throw new NullPointerException();
        }
        ensureBondConvertationIsMutable();
        bondConvertation_.set(index, value);
        onChanged();
      } else {
        bondConvertationBuilder_.setMessage(index, value);
      }
      return this;
    }
    /**
     * <code>repeated .BondConvertation bondConvertation = 2;</code>
     */
    public Builder setBondConvertation(
        int index, com.bcs.bm.catalog_of_instruments_rudata.client.grpc.BondConvertation.Builder builderForValue) {
      if (bondConvertationBuilder_ == null) {
        ensureBondConvertationIsMutable();
        bondConvertation_.set(index, builderForValue.build());
        onChanged();
      } else {
        bondConvertationBuilder_.setMessage(index, builderForValue.build());
      }
      return this;
    }
    /**
     * <code>repeated .BondConvertation bondConvertation = 2;</code>
     */
    public Builder addBondConvertation(com.bcs.bm.catalog_of_instruments_rudata.client.grpc.BondConvertation value) {
      if (bondConvertationBuilder_ == null) {
        if (value == null) {
          throw new NullPointerException();
        }
        ensureBondConvertationIsMutable();
        bondConvertation_.add(value);
        onChanged();
      } else {
        bondConvertationBuilder_.addMessage(value);
      }
      return this;
    }
    /**
     * <code>repeated .BondConvertation bondConvertation = 2;</code>
     */
    public Builder addBondConvertation(
        int index, com.bcs.bm.catalog_of_instruments_rudata.client.grpc.BondConvertation value) {
      if (bondConvertationBuilder_ == null) {
        if (value == null) {
          throw new NullPointerException();
        }
        ensureBondConvertationIsMutable();
        bondConvertation_.add(index, value);
        onChanged();
      } else {
        bondConvertationBuilder_.addMessage(index, value);
      }
      return this;
    }
    /**
     * <code>repeated .BondConvertation bondConvertation = 2;</code>
     */
    public Builder addBondConvertation(
        com.bcs.bm.catalog_of_instruments_rudata.client.grpc.BondConvertation.Builder builderForValue) {
      if (bondConvertationBuilder_ == null) {
        ensureBondConvertationIsMutable();
        bondConvertation_.add(builderForValue.build());
        onChanged();
      } else {
        bondConvertationBuilder_.addMessage(builderForValue.build());
      }
      return this;
    }
    /**
     * <code>repeated .BondConvertation bondConvertation = 2;</code>
     */
    public Builder addBondConvertation(
        int index, com.bcs.bm.catalog_of_instruments_rudata.client.grpc.BondConvertation.Builder builderForValue) {
      if (bondConvertationBuilder_ == null) {
        ensureBondConvertationIsMutable();
        bondConvertation_.add(index, builderForValue.build());
        onChanged();
      } else {
        bondConvertationBuilder_.addMessage(index, builderForValue.build());
      }
      return this;
    }
    /**
     * <code>repeated .BondConvertation bondConvertation = 2;</code>
     */
    public Builder addAllBondConvertation(
        java.lang.Iterable<? extends com.bcs.bm.catalog_of_instruments_rudata.client.grpc.BondConvertation> values) {
      if (bondConvertationBuilder_ == null) {
        ensureBondConvertationIsMutable();
        com.google.protobuf.AbstractMessageLite.Builder.addAll(
            values, bondConvertation_);
        onChanged();
      } else {
        bondConvertationBuilder_.addAllMessages(values);
      }
      return this;
    }
    /**
     * <code>repeated .BondConvertation bondConvertation = 2;</code>
     */
    public Builder clearBondConvertation() {
      if (bondConvertationBuilder_ == null) {
        bondConvertation_ = java.util.Collections.emptyList();
        bitField0_ = (bitField0_ & ~0x00000001);
        onChanged();
      } else {
        bondConvertationBuilder_.clear();
      }
      return this;
    }
    /**
     * <code>repeated .BondConvertation bondConvertation = 2;</code>
     */
    public Builder removeBondConvertation(int index) {
      if (bondConvertationBuilder_ == null) {
        ensureBondConvertationIsMutable();
        bondConvertation_.remove(index);
        onChanged();
      } else {
        bondConvertationBuilder_.remove(index);
      }
      return this;
    }
    /**
     * <code>repeated .BondConvertation bondConvertation = 2;</code>
     */
    public com.bcs.bm.catalog_of_instruments_rudata.client.grpc.BondConvertation.Builder getBondConvertationBuilder(
        int index) {
      return getBondConvertationFieldBuilder().getBuilder(index);
    }
    /**
     * <code>repeated .BondConvertation bondConvertation = 2;</code>
     */
    public com.bcs.bm.catalog_of_instruments_rudata.client.grpc.BondConvertationOrBuilder getBondConvertationOrBuilder(
        int index) {
      if (bondConvertationBuilder_ == null) {
        return bondConvertation_.get(index);  } else {
        return bondConvertationBuilder_.getMessageOrBuilder(index);
      }
    }
    /**
     * <code>repeated .BondConvertation bondConvertation = 2;</code>
     */
    public java.util.List<? extends com.bcs.bm.catalog_of_instruments_rudata.client.grpc.BondConvertationOrBuilder> 
         getBondConvertationOrBuilderList() {
      if (bondConvertationBuilder_ != null) {
        return bondConvertationBuilder_.getMessageOrBuilderList();
      } else {
        return java.util.Collections.unmodifiableList(bondConvertation_);
      }
    }
    /**
     * <code>repeated .BondConvertation bondConvertation = 2;</code>
     */
    public com.bcs.bm.catalog_of_instruments_rudata.client.grpc.BondConvertation.Builder addBondConvertationBuilder() {
      return getBondConvertationFieldBuilder().addBuilder(
          com.bcs.bm.catalog_of_instruments_rudata.client.grpc.BondConvertation.getDefaultInstance());
    }
    /**
     * <code>repeated .BondConvertation bondConvertation = 2;</code>
     */
    public com.bcs.bm.catalog_of_instruments_rudata.client.grpc.BondConvertation.Builder addBondConvertationBuilder(
        int index) {
      return getBondConvertationFieldBuilder().addBuilder(
          index, com.bcs.bm.catalog_of_instruments_rudata.client.grpc.BondConvertation.getDefaultInstance());
    }
    /**
     * <code>repeated .BondConvertation bondConvertation = 2;</code>
     */
    public java.util.List<com.bcs.bm.catalog_of_instruments_rudata.client.grpc.BondConvertation.Builder> 
         getBondConvertationBuilderList() {
      return getBondConvertationFieldBuilder().getBuilderList();
    }
    private com.google.protobuf.RepeatedFieldBuilderV3<
        com.bcs.bm.catalog_of_instruments_rudata.client.grpc.BondConvertation, com.bcs.bm.catalog_of_instruments_rudata.client.grpc.BondConvertation.Builder, com.bcs.bm.catalog_of_instruments_rudata.client.grpc.BondConvertationOrBuilder> 
        getBondConvertationFieldBuilder() {
      if (bondConvertationBuilder_ == null) {
        bondConvertationBuilder_ = new com.google.protobuf.RepeatedFieldBuilderV3<
            com.bcs.bm.catalog_of_instruments_rudata.client.grpc.BondConvertation, com.bcs.bm.catalog_of_instruments_rudata.client.grpc.BondConvertation.Builder, com.bcs.bm.catalog_of_instruments_rudata.client.grpc.BondConvertationOrBuilder>(
                bondConvertation_,
                ((bitField0_ & 0x00000001) != 0),
                getParentForChildren(),
                isClean());
        bondConvertation_ = null;
      }
      return bondConvertationBuilder_;
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


    // @@protoc_insertion_point(builder_scope:BondConvertationResponse)
  }

  // @@protoc_insertion_point(class_scope:BondConvertationResponse)
  private static final com.bcs.bm.catalog_of_instruments_rudata.client.grpc.BondConvertationResponse DEFAULT_INSTANCE;
  static {
    DEFAULT_INSTANCE = new com.bcs.bm.catalog_of_instruments_rudata.client.grpc.BondConvertationResponse();
  }

  public static com.bcs.bm.catalog_of_instruments_rudata.client.grpc.BondConvertationResponse getDefaultInstance() {
    return DEFAULT_INSTANCE;
  }

  private static final com.google.protobuf.Parser<BondConvertationResponse>
      PARSER = new com.google.protobuf.AbstractParser<BondConvertationResponse>() {
    @java.lang.Override
    public BondConvertationResponse parsePartialFrom(
        com.google.protobuf.CodedInputStream input,
        com.google.protobuf.ExtensionRegistryLite extensionRegistry)
        throws com.google.protobuf.InvalidProtocolBufferException {
      return new BondConvertationResponse(input, extensionRegistry);
    }
  };

  public static com.google.protobuf.Parser<BondConvertationResponse> parser() {
    return PARSER;
  }

  @java.lang.Override
  public com.google.protobuf.Parser<BondConvertationResponse> getParserForType() {
    return PARSER;
  }

  @java.lang.Override
  public com.bcs.bm.catalog_of_instruments_rudata.client.grpc.BondConvertationResponse getDefaultInstanceForType() {
    return DEFAULT_INSTANCE;
  }

}


// Generated by the protocol buffer compiler.  DO NOT EDIT!
// source: GrpcService.proto

package com.bcs.bm.catalog_of_instruments_rudata.client.grpc;

/**
 * Protobuf type {@code CorporateActionKindsResponse}
 */
public  final class CorporateActionKindsResponse extends
    com.google.protobuf.GeneratedMessageV3 implements
    // @@protoc_insertion_point(message_implements:CorporateActionKindsResponse)
    CorporateActionKindsResponseOrBuilder {
private static final long serialVersionUID = 0L;
  // Use CorporateActionKindsResponse.newBuilder() to construct.
  private CorporateActionKindsResponse(com.google.protobuf.GeneratedMessageV3.Builder<?> builder) {
    super(builder);
  }
  private CorporateActionKindsResponse() {
    reqId_ = "";
    corporateActionKinds_ = java.util.Collections.emptyList();
  }

  @java.lang.Override
  @SuppressWarnings({"unused"})
  protected java.lang.Object newInstance(
      UnusedPrivateParameter unused) {
    return new CorporateActionKindsResponse();
  }

  @java.lang.Override
  public final com.google.protobuf.UnknownFieldSet
  getUnknownFields() {
    return this.unknownFields;
  }
  private CorporateActionKindsResponse(
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
              corporateActionKinds_ = new java.util.ArrayList<com.bcs.bm.catalog_of_instruments_rudata.client.grpc.CorporateActionKind>();
              mutable_bitField0_ |= 0x00000001;
            }
            corporateActionKinds_.add(
                input.readMessage(com.bcs.bm.catalog_of_instruments_rudata.client.grpc.CorporateActionKind.parser(), extensionRegistry));
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
        corporateActionKinds_ = java.util.Collections.unmodifiableList(corporateActionKinds_);
      }
      this.unknownFields = unknownFields.build();
      makeExtensionsImmutable();
    }
  }
  public static final com.google.protobuf.Descriptors.Descriptor
      getDescriptor() {
    return com.bcs.bm.catalog_of_instruments_rudata.client.grpc.GrpcService.internal_static_CorporateActionKindsResponse_descriptor;
  }

  @java.lang.Override
  protected com.google.protobuf.GeneratedMessageV3.FieldAccessorTable
      internalGetFieldAccessorTable() {
    return com.bcs.bm.catalog_of_instruments_rudata.client.grpc.GrpcService.internal_static_CorporateActionKindsResponse_fieldAccessorTable
        .ensureFieldAccessorsInitialized(
            com.bcs.bm.catalog_of_instruments_rudata.client.grpc.CorporateActionKindsResponse.class, com.bcs.bm.catalog_of_instruments_rudata.client.grpc.CorporateActionKindsResponse.Builder.class);
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

  public static final int CORPORATEACTIONKINDS_FIELD_NUMBER = 2;
  private java.util.List<com.bcs.bm.catalog_of_instruments_rudata.client.grpc.CorporateActionKind> corporateActionKinds_;
  /**
   * <code>repeated .CorporateActionKind corporateActionKinds = 2;</code>
   */
  public java.util.List<com.bcs.bm.catalog_of_instruments_rudata.client.grpc.CorporateActionKind> getCorporateActionKindsList() {
    return corporateActionKinds_;
  }
  /**
   * <code>repeated .CorporateActionKind corporateActionKinds = 2;</code>
   */
  public java.util.List<? extends com.bcs.bm.catalog_of_instruments_rudata.client.grpc.CorporateActionKindOrBuilder> 
      getCorporateActionKindsOrBuilderList() {
    return corporateActionKinds_;
  }
  /**
   * <code>repeated .CorporateActionKind corporateActionKinds = 2;</code>
   */
  public int getCorporateActionKindsCount() {
    return corporateActionKinds_.size();
  }
  /**
   * <code>repeated .CorporateActionKind corporateActionKinds = 2;</code>
   */
  public com.bcs.bm.catalog_of_instruments_rudata.client.grpc.CorporateActionKind getCorporateActionKinds(int index) {
    return corporateActionKinds_.get(index);
  }
  /**
   * <code>repeated .CorporateActionKind corporateActionKinds = 2;</code>
   */
  public com.bcs.bm.catalog_of_instruments_rudata.client.grpc.CorporateActionKindOrBuilder getCorporateActionKindsOrBuilder(
      int index) {
    return corporateActionKinds_.get(index);
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
    for (int i = 0; i < corporateActionKinds_.size(); i++) {
      output.writeMessage(2, corporateActionKinds_.get(i));
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
    for (int i = 0; i < corporateActionKinds_.size(); i++) {
      size += com.google.protobuf.CodedOutputStream
        .computeMessageSize(2, corporateActionKinds_.get(i));
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
    if (!(obj instanceof com.bcs.bm.catalog_of_instruments_rudata.client.grpc.CorporateActionKindsResponse)) {
      return super.equals(obj);
    }
    com.bcs.bm.catalog_of_instruments_rudata.client.grpc.CorporateActionKindsResponse other = (com.bcs.bm.catalog_of_instruments_rudata.client.grpc.CorporateActionKindsResponse) obj;

    if (!getReqId()
        .equals(other.getReqId())) return false;
    if (!getCorporateActionKindsList()
        .equals(other.getCorporateActionKindsList())) return false;
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
    if (getCorporateActionKindsCount() > 0) {
      hash = (37 * hash) + CORPORATEACTIONKINDS_FIELD_NUMBER;
      hash = (53 * hash) + getCorporateActionKindsList().hashCode();
    }
    hash = (29 * hash) + unknownFields.hashCode();
    memoizedHashCode = hash;
    return hash;
  }

  public static com.bcs.bm.catalog_of_instruments_rudata.client.grpc.CorporateActionKindsResponse parseFrom(
      java.nio.ByteBuffer data)
      throws com.google.protobuf.InvalidProtocolBufferException {
    return PARSER.parseFrom(data);
  }
  public static com.bcs.bm.catalog_of_instruments_rudata.client.grpc.CorporateActionKindsResponse parseFrom(
      java.nio.ByteBuffer data,
      com.google.protobuf.ExtensionRegistryLite extensionRegistry)
      throws com.google.protobuf.InvalidProtocolBufferException {
    return PARSER.parseFrom(data, extensionRegistry);
  }
  public static com.bcs.bm.catalog_of_instruments_rudata.client.grpc.CorporateActionKindsResponse parseFrom(
      com.google.protobuf.ByteString data)
      throws com.google.protobuf.InvalidProtocolBufferException {
    return PARSER.parseFrom(data);
  }
  public static com.bcs.bm.catalog_of_instruments_rudata.client.grpc.CorporateActionKindsResponse parseFrom(
      com.google.protobuf.ByteString data,
      com.google.protobuf.ExtensionRegistryLite extensionRegistry)
      throws com.google.protobuf.InvalidProtocolBufferException {
    return PARSER.parseFrom(data, extensionRegistry);
  }
  public static com.bcs.bm.catalog_of_instruments_rudata.client.grpc.CorporateActionKindsResponse parseFrom(byte[] data)
      throws com.google.protobuf.InvalidProtocolBufferException {
    return PARSER.parseFrom(data);
  }
  public static com.bcs.bm.catalog_of_instruments_rudata.client.grpc.CorporateActionKindsResponse parseFrom(
      byte[] data,
      com.google.protobuf.ExtensionRegistryLite extensionRegistry)
      throws com.google.protobuf.InvalidProtocolBufferException {
    return PARSER.parseFrom(data, extensionRegistry);
  }
  public static com.bcs.bm.catalog_of_instruments_rudata.client.grpc.CorporateActionKindsResponse parseFrom(java.io.InputStream input)
      throws java.io.IOException {
    return com.google.protobuf.GeneratedMessageV3
        .parseWithIOException(PARSER, input);
  }
  public static com.bcs.bm.catalog_of_instruments_rudata.client.grpc.CorporateActionKindsResponse parseFrom(
      java.io.InputStream input,
      com.google.protobuf.ExtensionRegistryLite extensionRegistry)
      throws java.io.IOException {
    return com.google.protobuf.GeneratedMessageV3
        .parseWithIOException(PARSER, input, extensionRegistry);
  }
  public static com.bcs.bm.catalog_of_instruments_rudata.client.grpc.CorporateActionKindsResponse parseDelimitedFrom(java.io.InputStream input)
      throws java.io.IOException {
    return com.google.protobuf.GeneratedMessageV3
        .parseDelimitedWithIOException(PARSER, input);
  }
  public static com.bcs.bm.catalog_of_instruments_rudata.client.grpc.CorporateActionKindsResponse parseDelimitedFrom(
      java.io.InputStream input,
      com.google.protobuf.ExtensionRegistryLite extensionRegistry)
      throws java.io.IOException {
    return com.google.protobuf.GeneratedMessageV3
        .parseDelimitedWithIOException(PARSER, input, extensionRegistry);
  }
  public static com.bcs.bm.catalog_of_instruments_rudata.client.grpc.CorporateActionKindsResponse parseFrom(
      com.google.protobuf.CodedInputStream input)
      throws java.io.IOException {
    return com.google.protobuf.GeneratedMessageV3
        .parseWithIOException(PARSER, input);
  }
  public static com.bcs.bm.catalog_of_instruments_rudata.client.grpc.CorporateActionKindsResponse parseFrom(
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
  public static Builder newBuilder(com.bcs.bm.catalog_of_instruments_rudata.client.grpc.CorporateActionKindsResponse prototype) {
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
   * Protobuf type {@code CorporateActionKindsResponse}
   */
  public static final class Builder extends
      com.google.protobuf.GeneratedMessageV3.Builder<Builder> implements
      // @@protoc_insertion_point(builder_implements:CorporateActionKindsResponse)
      com.bcs.bm.catalog_of_instruments_rudata.client.grpc.CorporateActionKindsResponseOrBuilder {
    public static final com.google.protobuf.Descriptors.Descriptor
        getDescriptor() {
      return com.bcs.bm.catalog_of_instruments_rudata.client.grpc.GrpcService.internal_static_CorporateActionKindsResponse_descriptor;
    }

    @java.lang.Override
    protected com.google.protobuf.GeneratedMessageV3.FieldAccessorTable
        internalGetFieldAccessorTable() {
      return com.bcs.bm.catalog_of_instruments_rudata.client.grpc.GrpcService.internal_static_CorporateActionKindsResponse_fieldAccessorTable
          .ensureFieldAccessorsInitialized(
              com.bcs.bm.catalog_of_instruments_rudata.client.grpc.CorporateActionKindsResponse.class, com.bcs.bm.catalog_of_instruments_rudata.client.grpc.CorporateActionKindsResponse.Builder.class);
    }

    // Construct using com.bcs.bm.catalog_of_instruments_rudata.client.grpc.CorporateActionKindsResponse.newBuilder()
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
        getCorporateActionKindsFieldBuilder();
      }
    }
    @java.lang.Override
    public Builder clear() {
      super.clear();
      reqId_ = "";

      if (corporateActionKindsBuilder_ == null) {
        corporateActionKinds_ = java.util.Collections.emptyList();
        bitField0_ = (bitField0_ & ~0x00000001);
      } else {
        corporateActionKindsBuilder_.clear();
      }
      return this;
    }

    @java.lang.Override
    public com.google.protobuf.Descriptors.Descriptor
        getDescriptorForType() {
      return com.bcs.bm.catalog_of_instruments_rudata.client.grpc.GrpcService.internal_static_CorporateActionKindsResponse_descriptor;
    }

    @java.lang.Override
    public com.bcs.bm.catalog_of_instruments_rudata.client.grpc.CorporateActionKindsResponse getDefaultInstanceForType() {
      return com.bcs.bm.catalog_of_instruments_rudata.client.grpc.CorporateActionKindsResponse.getDefaultInstance();
    }

    @java.lang.Override
    public com.bcs.bm.catalog_of_instruments_rudata.client.grpc.CorporateActionKindsResponse build() {
      com.bcs.bm.catalog_of_instruments_rudata.client.grpc.CorporateActionKindsResponse result = buildPartial();
      if (!result.isInitialized()) {
        throw newUninitializedMessageException(result);
      }
      return result;
    }

    @java.lang.Override
    public com.bcs.bm.catalog_of_instruments_rudata.client.grpc.CorporateActionKindsResponse buildPartial() {
      com.bcs.bm.catalog_of_instruments_rudata.client.grpc.CorporateActionKindsResponse result = new com.bcs.bm.catalog_of_instruments_rudata.client.grpc.CorporateActionKindsResponse(this);
      int from_bitField0_ = bitField0_;
      result.reqId_ = reqId_;
      if (corporateActionKindsBuilder_ == null) {
        if (((bitField0_ & 0x00000001) != 0)) {
          corporateActionKinds_ = java.util.Collections.unmodifiableList(corporateActionKinds_);
          bitField0_ = (bitField0_ & ~0x00000001);
        }
        result.corporateActionKinds_ = corporateActionKinds_;
      } else {
        result.corporateActionKinds_ = corporateActionKindsBuilder_.build();
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
      if (other instanceof com.bcs.bm.catalog_of_instruments_rudata.client.grpc.CorporateActionKindsResponse) {
        return mergeFrom((com.bcs.bm.catalog_of_instruments_rudata.client.grpc.CorporateActionKindsResponse)other);
      } else {
        super.mergeFrom(other);
        return this;
      }
    }

    public Builder mergeFrom(com.bcs.bm.catalog_of_instruments_rudata.client.grpc.CorporateActionKindsResponse other) {
      if (other == com.bcs.bm.catalog_of_instruments_rudata.client.grpc.CorporateActionKindsResponse.getDefaultInstance()) return this;
      if (!other.getReqId().isEmpty()) {
        reqId_ = other.reqId_;
        onChanged();
      }
      if (corporateActionKindsBuilder_ == null) {
        if (!other.corporateActionKinds_.isEmpty()) {
          if (corporateActionKinds_.isEmpty()) {
            corporateActionKinds_ = other.corporateActionKinds_;
            bitField0_ = (bitField0_ & ~0x00000001);
          } else {
            ensureCorporateActionKindsIsMutable();
            corporateActionKinds_.addAll(other.corporateActionKinds_);
          }
          onChanged();
        }
      } else {
        if (!other.corporateActionKinds_.isEmpty()) {
          if (corporateActionKindsBuilder_.isEmpty()) {
            corporateActionKindsBuilder_.dispose();
            corporateActionKindsBuilder_ = null;
            corporateActionKinds_ = other.corporateActionKinds_;
            bitField0_ = (bitField0_ & ~0x00000001);
            corporateActionKindsBuilder_ = 
              com.google.protobuf.GeneratedMessageV3.alwaysUseFieldBuilders ?
                 getCorporateActionKindsFieldBuilder() : null;
          } else {
            corporateActionKindsBuilder_.addAllMessages(other.corporateActionKinds_);
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
      com.bcs.bm.catalog_of_instruments_rudata.client.grpc.CorporateActionKindsResponse parsedMessage = null;
      try {
        parsedMessage = PARSER.parsePartialFrom(input, extensionRegistry);
      } catch (com.google.protobuf.InvalidProtocolBufferException e) {
        parsedMessage = (com.bcs.bm.catalog_of_instruments_rudata.client.grpc.CorporateActionKindsResponse) e.getUnfinishedMessage();
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

    private java.util.List<com.bcs.bm.catalog_of_instruments_rudata.client.grpc.CorporateActionKind> corporateActionKinds_ =
      java.util.Collections.emptyList();
    private void ensureCorporateActionKindsIsMutable() {
      if (!((bitField0_ & 0x00000001) != 0)) {
        corporateActionKinds_ = new java.util.ArrayList<com.bcs.bm.catalog_of_instruments_rudata.client.grpc.CorporateActionKind>(corporateActionKinds_);
        bitField0_ |= 0x00000001;
       }
    }

    private com.google.protobuf.RepeatedFieldBuilderV3<
        com.bcs.bm.catalog_of_instruments_rudata.client.grpc.CorporateActionKind, com.bcs.bm.catalog_of_instruments_rudata.client.grpc.CorporateActionKind.Builder, com.bcs.bm.catalog_of_instruments_rudata.client.grpc.CorporateActionKindOrBuilder> corporateActionKindsBuilder_;

    /**
     * <code>repeated .CorporateActionKind corporateActionKinds = 2;</code>
     */
    public java.util.List<com.bcs.bm.catalog_of_instruments_rudata.client.grpc.CorporateActionKind> getCorporateActionKindsList() {
      if (corporateActionKindsBuilder_ == null) {
        return java.util.Collections.unmodifiableList(corporateActionKinds_);
      } else {
        return corporateActionKindsBuilder_.getMessageList();
      }
    }
    /**
     * <code>repeated .CorporateActionKind corporateActionKinds = 2;</code>
     */
    public int getCorporateActionKindsCount() {
      if (corporateActionKindsBuilder_ == null) {
        return corporateActionKinds_.size();
      } else {
        return corporateActionKindsBuilder_.getCount();
      }
    }
    /**
     * <code>repeated .CorporateActionKind corporateActionKinds = 2;</code>
     */
    public com.bcs.bm.catalog_of_instruments_rudata.client.grpc.CorporateActionKind getCorporateActionKinds(int index) {
      if (corporateActionKindsBuilder_ == null) {
        return corporateActionKinds_.get(index);
      } else {
        return corporateActionKindsBuilder_.getMessage(index);
      }
    }
    /**
     * <code>repeated .CorporateActionKind corporateActionKinds = 2;</code>
     */
    public Builder setCorporateActionKinds(
        int index, com.bcs.bm.catalog_of_instruments_rudata.client.grpc.CorporateActionKind value) {
      if (corporateActionKindsBuilder_ == null) {
        if (value == null) {
          throw new NullPointerException();
        }
        ensureCorporateActionKindsIsMutable();
        corporateActionKinds_.set(index, value);
        onChanged();
      } else {
        corporateActionKindsBuilder_.setMessage(index, value);
      }
      return this;
    }
    /**
     * <code>repeated .CorporateActionKind corporateActionKinds = 2;</code>
     */
    public Builder setCorporateActionKinds(
        int index, com.bcs.bm.catalog_of_instruments_rudata.client.grpc.CorporateActionKind.Builder builderForValue) {
      if (corporateActionKindsBuilder_ == null) {
        ensureCorporateActionKindsIsMutable();
        corporateActionKinds_.set(index, builderForValue.build());
        onChanged();
      } else {
        corporateActionKindsBuilder_.setMessage(index, builderForValue.build());
      }
      return this;
    }
    /**
     * <code>repeated .CorporateActionKind corporateActionKinds = 2;</code>
     */
    public Builder addCorporateActionKinds(com.bcs.bm.catalog_of_instruments_rudata.client.grpc.CorporateActionKind value) {
      if (corporateActionKindsBuilder_ == null) {
        if (value == null) {
          throw new NullPointerException();
        }
        ensureCorporateActionKindsIsMutable();
        corporateActionKinds_.add(value);
        onChanged();
      } else {
        corporateActionKindsBuilder_.addMessage(value);
      }
      return this;
    }
    /**
     * <code>repeated .CorporateActionKind corporateActionKinds = 2;</code>
     */
    public Builder addCorporateActionKinds(
        int index, com.bcs.bm.catalog_of_instruments_rudata.client.grpc.CorporateActionKind value) {
      if (corporateActionKindsBuilder_ == null) {
        if (value == null) {
          throw new NullPointerException();
        }
        ensureCorporateActionKindsIsMutable();
        corporateActionKinds_.add(index, value);
        onChanged();
      } else {
        corporateActionKindsBuilder_.addMessage(index, value);
      }
      return this;
    }
    /**
     * <code>repeated .CorporateActionKind corporateActionKinds = 2;</code>
     */
    public Builder addCorporateActionKinds(
        com.bcs.bm.catalog_of_instruments_rudata.client.grpc.CorporateActionKind.Builder builderForValue) {
      if (corporateActionKindsBuilder_ == null) {
        ensureCorporateActionKindsIsMutable();
        corporateActionKinds_.add(builderForValue.build());
        onChanged();
      } else {
        corporateActionKindsBuilder_.addMessage(builderForValue.build());
      }
      return this;
    }
    /**
     * <code>repeated .CorporateActionKind corporateActionKinds = 2;</code>
     */
    public Builder addCorporateActionKinds(
        int index, com.bcs.bm.catalog_of_instruments_rudata.client.grpc.CorporateActionKind.Builder builderForValue) {
      if (corporateActionKindsBuilder_ == null) {
        ensureCorporateActionKindsIsMutable();
        corporateActionKinds_.add(index, builderForValue.build());
        onChanged();
      } else {
        corporateActionKindsBuilder_.addMessage(index, builderForValue.build());
      }
      return this;
    }
    /**
     * <code>repeated .CorporateActionKind corporateActionKinds = 2;</code>
     */
    public Builder addAllCorporateActionKinds(
        java.lang.Iterable<? extends com.bcs.bm.catalog_of_instruments_rudata.client.grpc.CorporateActionKind> values) {
      if (corporateActionKindsBuilder_ == null) {
        ensureCorporateActionKindsIsMutable();
        com.google.protobuf.AbstractMessageLite.Builder.addAll(
            values, corporateActionKinds_);
        onChanged();
      } else {
        corporateActionKindsBuilder_.addAllMessages(values);
      }
      return this;
    }
    /**
     * <code>repeated .CorporateActionKind corporateActionKinds = 2;</code>
     */
    public Builder clearCorporateActionKinds() {
      if (corporateActionKindsBuilder_ == null) {
        corporateActionKinds_ = java.util.Collections.emptyList();
        bitField0_ = (bitField0_ & ~0x00000001);
        onChanged();
      } else {
        corporateActionKindsBuilder_.clear();
      }
      return this;
    }
    /**
     * <code>repeated .CorporateActionKind corporateActionKinds = 2;</code>
     */
    public Builder removeCorporateActionKinds(int index) {
      if (corporateActionKindsBuilder_ == null) {
        ensureCorporateActionKindsIsMutable();
        corporateActionKinds_.remove(index);
        onChanged();
      } else {
        corporateActionKindsBuilder_.remove(index);
      }
      return this;
    }
    /**
     * <code>repeated .CorporateActionKind corporateActionKinds = 2;</code>
     */
    public com.bcs.bm.catalog_of_instruments_rudata.client.grpc.CorporateActionKind.Builder getCorporateActionKindsBuilder(
        int index) {
      return getCorporateActionKindsFieldBuilder().getBuilder(index);
    }
    /**
     * <code>repeated .CorporateActionKind corporateActionKinds = 2;</code>
     */
    public com.bcs.bm.catalog_of_instruments_rudata.client.grpc.CorporateActionKindOrBuilder getCorporateActionKindsOrBuilder(
        int index) {
      if (corporateActionKindsBuilder_ == null) {
        return corporateActionKinds_.get(index);  } else {
        return corporateActionKindsBuilder_.getMessageOrBuilder(index);
      }
    }
    /**
     * <code>repeated .CorporateActionKind corporateActionKinds = 2;</code>
     */
    public java.util.List<? extends com.bcs.bm.catalog_of_instruments_rudata.client.grpc.CorporateActionKindOrBuilder> 
         getCorporateActionKindsOrBuilderList() {
      if (corporateActionKindsBuilder_ != null) {
        return corporateActionKindsBuilder_.getMessageOrBuilderList();
      } else {
        return java.util.Collections.unmodifiableList(corporateActionKinds_);
      }
    }
    /**
     * <code>repeated .CorporateActionKind corporateActionKinds = 2;</code>
     */
    public com.bcs.bm.catalog_of_instruments_rudata.client.grpc.CorporateActionKind.Builder addCorporateActionKindsBuilder() {
      return getCorporateActionKindsFieldBuilder().addBuilder(
          com.bcs.bm.catalog_of_instruments_rudata.client.grpc.CorporateActionKind.getDefaultInstance());
    }
    /**
     * <code>repeated .CorporateActionKind corporateActionKinds = 2;</code>
     */
    public com.bcs.bm.catalog_of_instruments_rudata.client.grpc.CorporateActionKind.Builder addCorporateActionKindsBuilder(
        int index) {
      return getCorporateActionKindsFieldBuilder().addBuilder(
          index, com.bcs.bm.catalog_of_instruments_rudata.client.grpc.CorporateActionKind.getDefaultInstance());
    }
    /**
     * <code>repeated .CorporateActionKind corporateActionKinds = 2;</code>
     */
    public java.util.List<com.bcs.bm.catalog_of_instruments_rudata.client.grpc.CorporateActionKind.Builder> 
         getCorporateActionKindsBuilderList() {
      return getCorporateActionKindsFieldBuilder().getBuilderList();
    }
    private com.google.protobuf.RepeatedFieldBuilderV3<
        com.bcs.bm.catalog_of_instruments_rudata.client.grpc.CorporateActionKind, com.bcs.bm.catalog_of_instruments_rudata.client.grpc.CorporateActionKind.Builder, com.bcs.bm.catalog_of_instruments_rudata.client.grpc.CorporateActionKindOrBuilder> 
        getCorporateActionKindsFieldBuilder() {
      if (corporateActionKindsBuilder_ == null) {
        corporateActionKindsBuilder_ = new com.google.protobuf.RepeatedFieldBuilderV3<
            com.bcs.bm.catalog_of_instruments_rudata.client.grpc.CorporateActionKind, com.bcs.bm.catalog_of_instruments_rudata.client.grpc.CorporateActionKind.Builder, com.bcs.bm.catalog_of_instruments_rudata.client.grpc.CorporateActionKindOrBuilder>(
                corporateActionKinds_,
                ((bitField0_ & 0x00000001) != 0),
                getParentForChildren(),
                isClean());
        corporateActionKinds_ = null;
      }
      return corporateActionKindsBuilder_;
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


    // @@protoc_insertion_point(builder_scope:CorporateActionKindsResponse)
  }

  // @@protoc_insertion_point(class_scope:CorporateActionKindsResponse)
  private static final com.bcs.bm.catalog_of_instruments_rudata.client.grpc.CorporateActionKindsResponse DEFAULT_INSTANCE;
  static {
    DEFAULT_INSTANCE = new com.bcs.bm.catalog_of_instruments_rudata.client.grpc.CorporateActionKindsResponse();
  }

  public static com.bcs.bm.catalog_of_instruments_rudata.client.grpc.CorporateActionKindsResponse getDefaultInstance() {
    return DEFAULT_INSTANCE;
  }

  private static final com.google.protobuf.Parser<CorporateActionKindsResponse>
      PARSER = new com.google.protobuf.AbstractParser<CorporateActionKindsResponse>() {
    @java.lang.Override
    public CorporateActionKindsResponse parsePartialFrom(
        com.google.protobuf.CodedInputStream input,
        com.google.protobuf.ExtensionRegistryLite extensionRegistry)
        throws com.google.protobuf.InvalidProtocolBufferException {
      return new CorporateActionKindsResponse(input, extensionRegistry);
    }
  };

  public static com.google.protobuf.Parser<CorporateActionKindsResponse> parser() {
    return PARSER;
  }

  @java.lang.Override
  public com.google.protobuf.Parser<CorporateActionKindsResponse> getParserForType() {
    return PARSER;
  }

  @java.lang.Override
  public com.bcs.bm.catalog_of_instruments_rudata.client.grpc.CorporateActionKindsResponse getDefaultInstanceForType() {
    return DEFAULT_INSTANCE;
  }

}


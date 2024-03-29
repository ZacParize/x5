// Generated by the protocol buffer compiler.  DO NOT EDIT!
// source: GrpcService.proto

package com.bcs.bm.catalog_of_instruments_rudata.client.grpc;

/**
 * Protobuf type {@code InfoSecuritiesResponse}
 */
public  final class InfoSecuritiesResponse extends
    com.google.protobuf.GeneratedMessageV3 implements
    // @@protoc_insertion_point(message_implements:InfoSecuritiesResponse)
    InfoSecuritiesResponseOrBuilder {
private static final long serialVersionUID = 0L;
  // Use InfoSecuritiesResponse.newBuilder() to construct.
  private InfoSecuritiesResponse(com.google.protobuf.GeneratedMessageV3.Builder<?> builder) {
    super(builder);
  }
  private InfoSecuritiesResponse() {
    reqId_ = "";
    securities_ = java.util.Collections.emptyList();
  }

  @java.lang.Override
  @SuppressWarnings({"unused"})
  protected java.lang.Object newInstance(
      UnusedPrivateParameter unused) {
    return new InfoSecuritiesResponse();
  }

  @java.lang.Override
  public final com.google.protobuf.UnknownFieldSet
  getUnknownFields() {
    return this.unknownFields;
  }
  private InfoSecuritiesResponse(
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
              securities_ = new java.util.ArrayList<com.bcs.bm.catalog_of_instruments_rudata.client.grpc.Security>();
              mutable_bitField0_ |= 0x00000001;
            }
            securities_.add(
                input.readMessage(com.bcs.bm.catalog_of_instruments_rudata.client.grpc.Security.parser(), extensionRegistry));
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
        securities_ = java.util.Collections.unmodifiableList(securities_);
      }
      this.unknownFields = unknownFields.build();
      makeExtensionsImmutable();
    }
  }
  public static final com.google.protobuf.Descriptors.Descriptor
      getDescriptor() {
    return com.bcs.bm.catalog_of_instruments_rudata.client.grpc.GrpcService.internal_static_InfoSecuritiesResponse_descriptor;
  }

  @java.lang.Override
  protected com.google.protobuf.GeneratedMessageV3.FieldAccessorTable
      internalGetFieldAccessorTable() {
    return com.bcs.bm.catalog_of_instruments_rudata.client.grpc.GrpcService.internal_static_InfoSecuritiesResponse_fieldAccessorTable
        .ensureFieldAccessorsInitialized(
            com.bcs.bm.catalog_of_instruments_rudata.client.grpc.InfoSecuritiesResponse.class, com.bcs.bm.catalog_of_instruments_rudata.client.grpc.InfoSecuritiesResponse.Builder.class);
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

  public static final int SECURITIES_FIELD_NUMBER = 2;
  private java.util.List<com.bcs.bm.catalog_of_instruments_rudata.client.grpc.Security> securities_;
  /**
   * <code>repeated .Security securities = 2;</code>
   */
  public java.util.List<com.bcs.bm.catalog_of_instruments_rudata.client.grpc.Security> getSecuritiesList() {
    return securities_;
  }
  /**
   * <code>repeated .Security securities = 2;</code>
   */
  public java.util.List<? extends com.bcs.bm.catalog_of_instruments_rudata.client.grpc.SecurityOrBuilder> 
      getSecuritiesOrBuilderList() {
    return securities_;
  }
  /**
   * <code>repeated .Security securities = 2;</code>
   */
  public int getSecuritiesCount() {
    return securities_.size();
  }
  /**
   * <code>repeated .Security securities = 2;</code>
   */
  public com.bcs.bm.catalog_of_instruments_rudata.client.grpc.Security getSecurities(int index) {
    return securities_.get(index);
  }
  /**
   * <code>repeated .Security securities = 2;</code>
   */
  public com.bcs.bm.catalog_of_instruments_rudata.client.grpc.SecurityOrBuilder getSecuritiesOrBuilder(
      int index) {
    return securities_.get(index);
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
    for (int i = 0; i < securities_.size(); i++) {
      output.writeMessage(2, securities_.get(i));
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
    for (int i = 0; i < securities_.size(); i++) {
      size += com.google.protobuf.CodedOutputStream
        .computeMessageSize(2, securities_.get(i));
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
    if (!(obj instanceof com.bcs.bm.catalog_of_instruments_rudata.client.grpc.InfoSecuritiesResponse)) {
      return super.equals(obj);
    }
    com.bcs.bm.catalog_of_instruments_rudata.client.grpc.InfoSecuritiesResponse other = (com.bcs.bm.catalog_of_instruments_rudata.client.grpc.InfoSecuritiesResponse) obj;

    if (!getReqId()
        .equals(other.getReqId())) return false;
    if (!getSecuritiesList()
        .equals(other.getSecuritiesList())) return false;
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
    if (getSecuritiesCount() > 0) {
      hash = (37 * hash) + SECURITIES_FIELD_NUMBER;
      hash = (53 * hash) + getSecuritiesList().hashCode();
    }
    hash = (29 * hash) + unknownFields.hashCode();
    memoizedHashCode = hash;
    return hash;
  }

  public static com.bcs.bm.catalog_of_instruments_rudata.client.grpc.InfoSecuritiesResponse parseFrom(
      java.nio.ByteBuffer data)
      throws com.google.protobuf.InvalidProtocolBufferException {
    return PARSER.parseFrom(data);
  }
  public static com.bcs.bm.catalog_of_instruments_rudata.client.grpc.InfoSecuritiesResponse parseFrom(
      java.nio.ByteBuffer data,
      com.google.protobuf.ExtensionRegistryLite extensionRegistry)
      throws com.google.protobuf.InvalidProtocolBufferException {
    return PARSER.parseFrom(data, extensionRegistry);
  }
  public static com.bcs.bm.catalog_of_instruments_rudata.client.grpc.InfoSecuritiesResponse parseFrom(
      com.google.protobuf.ByteString data)
      throws com.google.protobuf.InvalidProtocolBufferException {
    return PARSER.parseFrom(data);
  }
  public static com.bcs.bm.catalog_of_instruments_rudata.client.grpc.InfoSecuritiesResponse parseFrom(
      com.google.protobuf.ByteString data,
      com.google.protobuf.ExtensionRegistryLite extensionRegistry)
      throws com.google.protobuf.InvalidProtocolBufferException {
    return PARSER.parseFrom(data, extensionRegistry);
  }
  public static com.bcs.bm.catalog_of_instruments_rudata.client.grpc.InfoSecuritiesResponse parseFrom(byte[] data)
      throws com.google.protobuf.InvalidProtocolBufferException {
    return PARSER.parseFrom(data);
  }
  public static com.bcs.bm.catalog_of_instruments_rudata.client.grpc.InfoSecuritiesResponse parseFrom(
      byte[] data,
      com.google.protobuf.ExtensionRegistryLite extensionRegistry)
      throws com.google.protobuf.InvalidProtocolBufferException {
    return PARSER.parseFrom(data, extensionRegistry);
  }
  public static com.bcs.bm.catalog_of_instruments_rudata.client.grpc.InfoSecuritiesResponse parseFrom(java.io.InputStream input)
      throws java.io.IOException {
    return com.google.protobuf.GeneratedMessageV3
        .parseWithIOException(PARSER, input);
  }
  public static com.bcs.bm.catalog_of_instruments_rudata.client.grpc.InfoSecuritiesResponse parseFrom(
      java.io.InputStream input,
      com.google.protobuf.ExtensionRegistryLite extensionRegistry)
      throws java.io.IOException {
    return com.google.protobuf.GeneratedMessageV3
        .parseWithIOException(PARSER, input, extensionRegistry);
  }
  public static com.bcs.bm.catalog_of_instruments_rudata.client.grpc.InfoSecuritiesResponse parseDelimitedFrom(java.io.InputStream input)
      throws java.io.IOException {
    return com.google.protobuf.GeneratedMessageV3
        .parseDelimitedWithIOException(PARSER, input);
  }
  public static com.bcs.bm.catalog_of_instruments_rudata.client.grpc.InfoSecuritiesResponse parseDelimitedFrom(
      java.io.InputStream input,
      com.google.protobuf.ExtensionRegistryLite extensionRegistry)
      throws java.io.IOException {
    return com.google.protobuf.GeneratedMessageV3
        .parseDelimitedWithIOException(PARSER, input, extensionRegistry);
  }
  public static com.bcs.bm.catalog_of_instruments_rudata.client.grpc.InfoSecuritiesResponse parseFrom(
      com.google.protobuf.CodedInputStream input)
      throws java.io.IOException {
    return com.google.protobuf.GeneratedMessageV3
        .parseWithIOException(PARSER, input);
  }
  public static com.bcs.bm.catalog_of_instruments_rudata.client.grpc.InfoSecuritiesResponse parseFrom(
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
  public static Builder newBuilder(com.bcs.bm.catalog_of_instruments_rudata.client.grpc.InfoSecuritiesResponse prototype) {
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
   * Protobuf type {@code InfoSecuritiesResponse}
   */
  public static final class Builder extends
      com.google.protobuf.GeneratedMessageV3.Builder<Builder> implements
      // @@protoc_insertion_point(builder_implements:InfoSecuritiesResponse)
      com.bcs.bm.catalog_of_instruments_rudata.client.grpc.InfoSecuritiesResponseOrBuilder {
    public static final com.google.protobuf.Descriptors.Descriptor
        getDescriptor() {
      return com.bcs.bm.catalog_of_instruments_rudata.client.grpc.GrpcService.internal_static_InfoSecuritiesResponse_descriptor;
    }

    @java.lang.Override
    protected com.google.protobuf.GeneratedMessageV3.FieldAccessorTable
        internalGetFieldAccessorTable() {
      return com.bcs.bm.catalog_of_instruments_rudata.client.grpc.GrpcService.internal_static_InfoSecuritiesResponse_fieldAccessorTable
          .ensureFieldAccessorsInitialized(
              com.bcs.bm.catalog_of_instruments_rudata.client.grpc.InfoSecuritiesResponse.class, com.bcs.bm.catalog_of_instruments_rudata.client.grpc.InfoSecuritiesResponse.Builder.class);
    }

    // Construct using com.bcs.bm.catalog_of_instruments_rudata.client.grpc.InfoSecuritiesResponse.newBuilder()
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
        getSecuritiesFieldBuilder();
      }
    }
    @java.lang.Override
    public Builder clear() {
      super.clear();
      reqId_ = "";

      if (securitiesBuilder_ == null) {
        securities_ = java.util.Collections.emptyList();
        bitField0_ = (bitField0_ & ~0x00000001);
      } else {
        securitiesBuilder_.clear();
      }
      return this;
    }

    @java.lang.Override
    public com.google.protobuf.Descriptors.Descriptor
        getDescriptorForType() {
      return com.bcs.bm.catalog_of_instruments_rudata.client.grpc.GrpcService.internal_static_InfoSecuritiesResponse_descriptor;
    }

    @java.lang.Override
    public com.bcs.bm.catalog_of_instruments_rudata.client.grpc.InfoSecuritiesResponse getDefaultInstanceForType() {
      return com.bcs.bm.catalog_of_instruments_rudata.client.grpc.InfoSecuritiesResponse.getDefaultInstance();
    }

    @java.lang.Override
    public com.bcs.bm.catalog_of_instruments_rudata.client.grpc.InfoSecuritiesResponse build() {
      com.bcs.bm.catalog_of_instruments_rudata.client.grpc.InfoSecuritiesResponse result = buildPartial();
      if (!result.isInitialized()) {
        throw newUninitializedMessageException(result);
      }
      return result;
    }

    @java.lang.Override
    public com.bcs.bm.catalog_of_instruments_rudata.client.grpc.InfoSecuritiesResponse buildPartial() {
      com.bcs.bm.catalog_of_instruments_rudata.client.grpc.InfoSecuritiesResponse result = new com.bcs.bm.catalog_of_instruments_rudata.client.grpc.InfoSecuritiesResponse(this);
      int from_bitField0_ = bitField0_;
      result.reqId_ = reqId_;
      if (securitiesBuilder_ == null) {
        if (((bitField0_ & 0x00000001) != 0)) {
          securities_ = java.util.Collections.unmodifiableList(securities_);
          bitField0_ = (bitField0_ & ~0x00000001);
        }
        result.securities_ = securities_;
      } else {
        result.securities_ = securitiesBuilder_.build();
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
      if (other instanceof com.bcs.bm.catalog_of_instruments_rudata.client.grpc.InfoSecuritiesResponse) {
        return mergeFrom((com.bcs.bm.catalog_of_instruments_rudata.client.grpc.InfoSecuritiesResponse)other);
      } else {
        super.mergeFrom(other);
        return this;
      }
    }

    public Builder mergeFrom(com.bcs.bm.catalog_of_instruments_rudata.client.grpc.InfoSecuritiesResponse other) {
      if (other == com.bcs.bm.catalog_of_instruments_rudata.client.grpc.InfoSecuritiesResponse.getDefaultInstance()) return this;
      if (!other.getReqId().isEmpty()) {
        reqId_ = other.reqId_;
        onChanged();
      }
      if (securitiesBuilder_ == null) {
        if (!other.securities_.isEmpty()) {
          if (securities_.isEmpty()) {
            securities_ = other.securities_;
            bitField0_ = (bitField0_ & ~0x00000001);
          } else {
            ensureSecuritiesIsMutable();
            securities_.addAll(other.securities_);
          }
          onChanged();
        }
      } else {
        if (!other.securities_.isEmpty()) {
          if (securitiesBuilder_.isEmpty()) {
            securitiesBuilder_.dispose();
            securitiesBuilder_ = null;
            securities_ = other.securities_;
            bitField0_ = (bitField0_ & ~0x00000001);
            securitiesBuilder_ = 
              com.google.protobuf.GeneratedMessageV3.alwaysUseFieldBuilders ?
                 getSecuritiesFieldBuilder() : null;
          } else {
            securitiesBuilder_.addAllMessages(other.securities_);
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
      com.bcs.bm.catalog_of_instruments_rudata.client.grpc.InfoSecuritiesResponse parsedMessage = null;
      try {
        parsedMessage = PARSER.parsePartialFrom(input, extensionRegistry);
      } catch (com.google.protobuf.InvalidProtocolBufferException e) {
        parsedMessage = (com.bcs.bm.catalog_of_instruments_rudata.client.grpc.InfoSecuritiesResponse) e.getUnfinishedMessage();
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

    private java.util.List<com.bcs.bm.catalog_of_instruments_rudata.client.grpc.Security> securities_ =
      java.util.Collections.emptyList();
    private void ensureSecuritiesIsMutable() {
      if (!((bitField0_ & 0x00000001) != 0)) {
        securities_ = new java.util.ArrayList<com.bcs.bm.catalog_of_instruments_rudata.client.grpc.Security>(securities_);
        bitField0_ |= 0x00000001;
       }
    }

    private com.google.protobuf.RepeatedFieldBuilderV3<
        com.bcs.bm.catalog_of_instruments_rudata.client.grpc.Security, com.bcs.bm.catalog_of_instruments_rudata.client.grpc.Security.Builder, com.bcs.bm.catalog_of_instruments_rudata.client.grpc.SecurityOrBuilder> securitiesBuilder_;

    /**
     * <code>repeated .Security securities = 2;</code>
     */
    public java.util.List<com.bcs.bm.catalog_of_instruments_rudata.client.grpc.Security> getSecuritiesList() {
      if (securitiesBuilder_ == null) {
        return java.util.Collections.unmodifiableList(securities_);
      } else {
        return securitiesBuilder_.getMessageList();
      }
    }
    /**
     * <code>repeated .Security securities = 2;</code>
     */
    public int getSecuritiesCount() {
      if (securitiesBuilder_ == null) {
        return securities_.size();
      } else {
        return securitiesBuilder_.getCount();
      }
    }
    /**
     * <code>repeated .Security securities = 2;</code>
     */
    public com.bcs.bm.catalog_of_instruments_rudata.client.grpc.Security getSecurities(int index) {
      if (securitiesBuilder_ == null) {
        return securities_.get(index);
      } else {
        return securitiesBuilder_.getMessage(index);
      }
    }
    /**
     * <code>repeated .Security securities = 2;</code>
     */
    public Builder setSecurities(
        int index, com.bcs.bm.catalog_of_instruments_rudata.client.grpc.Security value) {
      if (securitiesBuilder_ == null) {
        if (value == null) {
          throw new NullPointerException();
        }
        ensureSecuritiesIsMutable();
        securities_.set(index, value);
        onChanged();
      } else {
        securitiesBuilder_.setMessage(index, value);
      }
      return this;
    }
    /**
     * <code>repeated .Security securities = 2;</code>
     */
    public Builder setSecurities(
        int index, com.bcs.bm.catalog_of_instruments_rudata.client.grpc.Security.Builder builderForValue) {
      if (securitiesBuilder_ == null) {
        ensureSecuritiesIsMutable();
        securities_.set(index, builderForValue.build());
        onChanged();
      } else {
        securitiesBuilder_.setMessage(index, builderForValue.build());
      }
      return this;
    }
    /**
     * <code>repeated .Security securities = 2;</code>
     */
    public Builder addSecurities(com.bcs.bm.catalog_of_instruments_rudata.client.grpc.Security value) {
      if (securitiesBuilder_ == null) {
        if (value == null) {
          throw new NullPointerException();
        }
        ensureSecuritiesIsMutable();
        securities_.add(value);
        onChanged();
      } else {
        securitiesBuilder_.addMessage(value);
      }
      return this;
    }
    /**
     * <code>repeated .Security securities = 2;</code>
     */
    public Builder addSecurities(
        int index, com.bcs.bm.catalog_of_instruments_rudata.client.grpc.Security value) {
      if (securitiesBuilder_ == null) {
        if (value == null) {
          throw new NullPointerException();
        }
        ensureSecuritiesIsMutable();
        securities_.add(index, value);
        onChanged();
      } else {
        securitiesBuilder_.addMessage(index, value);
      }
      return this;
    }
    /**
     * <code>repeated .Security securities = 2;</code>
     */
    public Builder addSecurities(
        com.bcs.bm.catalog_of_instruments_rudata.client.grpc.Security.Builder builderForValue) {
      if (securitiesBuilder_ == null) {
        ensureSecuritiesIsMutable();
        securities_.add(builderForValue.build());
        onChanged();
      } else {
        securitiesBuilder_.addMessage(builderForValue.build());
      }
      return this;
    }
    /**
     * <code>repeated .Security securities = 2;</code>
     */
    public Builder addSecurities(
        int index, com.bcs.bm.catalog_of_instruments_rudata.client.grpc.Security.Builder builderForValue) {
      if (securitiesBuilder_ == null) {
        ensureSecuritiesIsMutable();
        securities_.add(index, builderForValue.build());
        onChanged();
      } else {
        securitiesBuilder_.addMessage(index, builderForValue.build());
      }
      return this;
    }
    /**
     * <code>repeated .Security securities = 2;</code>
     */
    public Builder addAllSecurities(
        java.lang.Iterable<? extends com.bcs.bm.catalog_of_instruments_rudata.client.grpc.Security> values) {
      if (securitiesBuilder_ == null) {
        ensureSecuritiesIsMutable();
        com.google.protobuf.AbstractMessageLite.Builder.addAll(
            values, securities_);
        onChanged();
      } else {
        securitiesBuilder_.addAllMessages(values);
      }
      return this;
    }
    /**
     * <code>repeated .Security securities = 2;</code>
     */
    public Builder clearSecurities() {
      if (securitiesBuilder_ == null) {
        securities_ = java.util.Collections.emptyList();
        bitField0_ = (bitField0_ & ~0x00000001);
        onChanged();
      } else {
        securitiesBuilder_.clear();
      }
      return this;
    }
    /**
     * <code>repeated .Security securities = 2;</code>
     */
    public Builder removeSecurities(int index) {
      if (securitiesBuilder_ == null) {
        ensureSecuritiesIsMutable();
        securities_.remove(index);
        onChanged();
      } else {
        securitiesBuilder_.remove(index);
      }
      return this;
    }
    /**
     * <code>repeated .Security securities = 2;</code>
     */
    public com.bcs.bm.catalog_of_instruments_rudata.client.grpc.Security.Builder getSecuritiesBuilder(
        int index) {
      return getSecuritiesFieldBuilder().getBuilder(index);
    }
    /**
     * <code>repeated .Security securities = 2;</code>
     */
    public com.bcs.bm.catalog_of_instruments_rudata.client.grpc.SecurityOrBuilder getSecuritiesOrBuilder(
        int index) {
      if (securitiesBuilder_ == null) {
        return securities_.get(index);  } else {
        return securitiesBuilder_.getMessageOrBuilder(index);
      }
    }
    /**
     * <code>repeated .Security securities = 2;</code>
     */
    public java.util.List<? extends com.bcs.bm.catalog_of_instruments_rudata.client.grpc.SecurityOrBuilder> 
         getSecuritiesOrBuilderList() {
      if (securitiesBuilder_ != null) {
        return securitiesBuilder_.getMessageOrBuilderList();
      } else {
        return java.util.Collections.unmodifiableList(securities_);
      }
    }
    /**
     * <code>repeated .Security securities = 2;</code>
     */
    public com.bcs.bm.catalog_of_instruments_rudata.client.grpc.Security.Builder addSecuritiesBuilder() {
      return getSecuritiesFieldBuilder().addBuilder(
          com.bcs.bm.catalog_of_instruments_rudata.client.grpc.Security.getDefaultInstance());
    }
    /**
     * <code>repeated .Security securities = 2;</code>
     */
    public com.bcs.bm.catalog_of_instruments_rudata.client.grpc.Security.Builder addSecuritiesBuilder(
        int index) {
      return getSecuritiesFieldBuilder().addBuilder(
          index, com.bcs.bm.catalog_of_instruments_rudata.client.grpc.Security.getDefaultInstance());
    }
    /**
     * <code>repeated .Security securities = 2;</code>
     */
    public java.util.List<com.bcs.bm.catalog_of_instruments_rudata.client.grpc.Security.Builder> 
         getSecuritiesBuilderList() {
      return getSecuritiesFieldBuilder().getBuilderList();
    }
    private com.google.protobuf.RepeatedFieldBuilderV3<
        com.bcs.bm.catalog_of_instruments_rudata.client.grpc.Security, com.bcs.bm.catalog_of_instruments_rudata.client.grpc.Security.Builder, com.bcs.bm.catalog_of_instruments_rudata.client.grpc.SecurityOrBuilder> 
        getSecuritiesFieldBuilder() {
      if (securitiesBuilder_ == null) {
        securitiesBuilder_ = new com.google.protobuf.RepeatedFieldBuilderV3<
            com.bcs.bm.catalog_of_instruments_rudata.client.grpc.Security, com.bcs.bm.catalog_of_instruments_rudata.client.grpc.Security.Builder, com.bcs.bm.catalog_of_instruments_rudata.client.grpc.SecurityOrBuilder>(
                securities_,
                ((bitField0_ & 0x00000001) != 0),
                getParentForChildren(),
                isClean());
        securities_ = null;
      }
      return securitiesBuilder_;
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


    // @@protoc_insertion_point(builder_scope:InfoSecuritiesResponse)
  }

  // @@protoc_insertion_point(class_scope:InfoSecuritiesResponse)
  private static final com.bcs.bm.catalog_of_instruments_rudata.client.grpc.InfoSecuritiesResponse DEFAULT_INSTANCE;
  static {
    DEFAULT_INSTANCE = new com.bcs.bm.catalog_of_instruments_rudata.client.grpc.InfoSecuritiesResponse();
  }

  public static com.bcs.bm.catalog_of_instruments_rudata.client.grpc.InfoSecuritiesResponse getDefaultInstance() {
    return DEFAULT_INSTANCE;
  }

  private static final com.google.protobuf.Parser<InfoSecuritiesResponse>
      PARSER = new com.google.protobuf.AbstractParser<InfoSecuritiesResponse>() {
    @java.lang.Override
    public InfoSecuritiesResponse parsePartialFrom(
        com.google.protobuf.CodedInputStream input,
        com.google.protobuf.ExtensionRegistryLite extensionRegistry)
        throws com.google.protobuf.InvalidProtocolBufferException {
      return new InfoSecuritiesResponse(input, extensionRegistry);
    }
  };

  public static com.google.protobuf.Parser<InfoSecuritiesResponse> parser() {
    return PARSER;
  }

  @java.lang.Override
  public com.google.protobuf.Parser<InfoSecuritiesResponse> getParserForType() {
    return PARSER;
  }

  @java.lang.Override
  public com.bcs.bm.catalog_of_instruments_rudata.client.grpc.InfoSecuritiesResponse getDefaultInstanceForType() {
    return DEFAULT_INSTANCE;
  }

}


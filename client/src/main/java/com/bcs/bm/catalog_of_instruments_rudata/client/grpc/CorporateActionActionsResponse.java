// Generated by the protocol buffer compiler.  DO NOT EDIT!
// source: GrpcService.proto

package com.bcs.bm.catalog_of_instruments_rudata.client.grpc;

/**
 * Protobuf type {@code CorporateActionActionsResponse}
 */
public  final class CorporateActionActionsResponse extends
    com.google.protobuf.GeneratedMessageV3 implements
    // @@protoc_insertion_point(message_implements:CorporateActionActionsResponse)
    CorporateActionActionsResponseOrBuilder {
private static final long serialVersionUID = 0L;
  // Use CorporateActionActionsResponse.newBuilder() to construct.
  private CorporateActionActionsResponse(com.google.protobuf.GeneratedMessageV3.Builder<?> builder) {
    super(builder);
  }
  private CorporateActionActionsResponse() {
    reqId_ = "";
    corporateActionActions_ = java.util.Collections.emptyList();
  }

  @java.lang.Override
  @SuppressWarnings({"unused"})
  protected java.lang.Object newInstance(
      UnusedPrivateParameter unused) {
    return new CorporateActionActionsResponse();
  }

  @java.lang.Override
  public final com.google.protobuf.UnknownFieldSet
  getUnknownFields() {
    return this.unknownFields;
  }
  private CorporateActionActionsResponse(
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
              corporateActionActions_ = new java.util.ArrayList<com.bcs.bm.catalog_of_instruments_rudata.client.grpc.CorporateActionActions>();
              mutable_bitField0_ |= 0x00000001;
            }
            corporateActionActions_.add(
                input.readMessage(com.bcs.bm.catalog_of_instruments_rudata.client.grpc.CorporateActionActions.parser(), extensionRegistry));
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
        corporateActionActions_ = java.util.Collections.unmodifiableList(corporateActionActions_);
      }
      this.unknownFields = unknownFields.build();
      makeExtensionsImmutable();
    }
  }
  public static final com.google.protobuf.Descriptors.Descriptor
      getDescriptor() {
    return com.bcs.bm.catalog_of_instruments_rudata.client.grpc.GrpcService.internal_static_CorporateActionActionsResponse_descriptor;
  }

  @java.lang.Override
  protected com.google.protobuf.GeneratedMessageV3.FieldAccessorTable
      internalGetFieldAccessorTable() {
    return com.bcs.bm.catalog_of_instruments_rudata.client.grpc.GrpcService.internal_static_CorporateActionActionsResponse_fieldAccessorTable
        .ensureFieldAccessorsInitialized(
            com.bcs.bm.catalog_of_instruments_rudata.client.grpc.CorporateActionActionsResponse.class, com.bcs.bm.catalog_of_instruments_rudata.client.grpc.CorporateActionActionsResponse.Builder.class);
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

  public static final int CORPORATEACTIONACTIONS_FIELD_NUMBER = 2;
  private java.util.List<com.bcs.bm.catalog_of_instruments_rudata.client.grpc.CorporateActionActions> corporateActionActions_;
  /**
   * <code>repeated .CorporateActionActions corporateActionActions = 2;</code>
   */
  public java.util.List<com.bcs.bm.catalog_of_instruments_rudata.client.grpc.CorporateActionActions> getCorporateActionActionsList() {
    return corporateActionActions_;
  }
  /**
   * <code>repeated .CorporateActionActions corporateActionActions = 2;</code>
   */
  public java.util.List<? extends com.bcs.bm.catalog_of_instruments_rudata.client.grpc.CorporateActionActionsOrBuilder> 
      getCorporateActionActionsOrBuilderList() {
    return corporateActionActions_;
  }
  /**
   * <code>repeated .CorporateActionActions corporateActionActions = 2;</code>
   */
  public int getCorporateActionActionsCount() {
    return corporateActionActions_.size();
  }
  /**
   * <code>repeated .CorporateActionActions corporateActionActions = 2;</code>
   */
  public com.bcs.bm.catalog_of_instruments_rudata.client.grpc.CorporateActionActions getCorporateActionActions(int index) {
    return corporateActionActions_.get(index);
  }
  /**
   * <code>repeated .CorporateActionActions corporateActionActions = 2;</code>
   */
  public com.bcs.bm.catalog_of_instruments_rudata.client.grpc.CorporateActionActionsOrBuilder getCorporateActionActionsOrBuilder(
      int index) {
    return corporateActionActions_.get(index);
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
    for (int i = 0; i < corporateActionActions_.size(); i++) {
      output.writeMessage(2, corporateActionActions_.get(i));
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
    for (int i = 0; i < corporateActionActions_.size(); i++) {
      size += com.google.protobuf.CodedOutputStream
        .computeMessageSize(2, corporateActionActions_.get(i));
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
    if (!(obj instanceof com.bcs.bm.catalog_of_instruments_rudata.client.grpc.CorporateActionActionsResponse)) {
      return super.equals(obj);
    }
    com.bcs.bm.catalog_of_instruments_rudata.client.grpc.CorporateActionActionsResponse other = (com.bcs.bm.catalog_of_instruments_rudata.client.grpc.CorporateActionActionsResponse) obj;

    if (!getReqId()
        .equals(other.getReqId())) return false;
    if (!getCorporateActionActionsList()
        .equals(other.getCorporateActionActionsList())) return false;
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
    if (getCorporateActionActionsCount() > 0) {
      hash = (37 * hash) + CORPORATEACTIONACTIONS_FIELD_NUMBER;
      hash = (53 * hash) + getCorporateActionActionsList().hashCode();
    }
    hash = (29 * hash) + unknownFields.hashCode();
    memoizedHashCode = hash;
    return hash;
  }

  public static com.bcs.bm.catalog_of_instruments_rudata.client.grpc.CorporateActionActionsResponse parseFrom(
      java.nio.ByteBuffer data)
      throws com.google.protobuf.InvalidProtocolBufferException {
    return PARSER.parseFrom(data);
  }
  public static com.bcs.bm.catalog_of_instruments_rudata.client.grpc.CorporateActionActionsResponse parseFrom(
      java.nio.ByteBuffer data,
      com.google.protobuf.ExtensionRegistryLite extensionRegistry)
      throws com.google.protobuf.InvalidProtocolBufferException {
    return PARSER.parseFrom(data, extensionRegistry);
  }
  public static com.bcs.bm.catalog_of_instruments_rudata.client.grpc.CorporateActionActionsResponse parseFrom(
      com.google.protobuf.ByteString data)
      throws com.google.protobuf.InvalidProtocolBufferException {
    return PARSER.parseFrom(data);
  }
  public static com.bcs.bm.catalog_of_instruments_rudata.client.grpc.CorporateActionActionsResponse parseFrom(
      com.google.protobuf.ByteString data,
      com.google.protobuf.ExtensionRegistryLite extensionRegistry)
      throws com.google.protobuf.InvalidProtocolBufferException {
    return PARSER.parseFrom(data, extensionRegistry);
  }
  public static com.bcs.bm.catalog_of_instruments_rudata.client.grpc.CorporateActionActionsResponse parseFrom(byte[] data)
      throws com.google.protobuf.InvalidProtocolBufferException {
    return PARSER.parseFrom(data);
  }
  public static com.bcs.bm.catalog_of_instruments_rudata.client.grpc.CorporateActionActionsResponse parseFrom(
      byte[] data,
      com.google.protobuf.ExtensionRegistryLite extensionRegistry)
      throws com.google.protobuf.InvalidProtocolBufferException {
    return PARSER.parseFrom(data, extensionRegistry);
  }
  public static com.bcs.bm.catalog_of_instruments_rudata.client.grpc.CorporateActionActionsResponse parseFrom(java.io.InputStream input)
      throws java.io.IOException {
    return com.google.protobuf.GeneratedMessageV3
        .parseWithIOException(PARSER, input);
  }
  public static com.bcs.bm.catalog_of_instruments_rudata.client.grpc.CorporateActionActionsResponse parseFrom(
      java.io.InputStream input,
      com.google.protobuf.ExtensionRegistryLite extensionRegistry)
      throws java.io.IOException {
    return com.google.protobuf.GeneratedMessageV3
        .parseWithIOException(PARSER, input, extensionRegistry);
  }
  public static com.bcs.bm.catalog_of_instruments_rudata.client.grpc.CorporateActionActionsResponse parseDelimitedFrom(java.io.InputStream input)
      throws java.io.IOException {
    return com.google.protobuf.GeneratedMessageV3
        .parseDelimitedWithIOException(PARSER, input);
  }
  public static com.bcs.bm.catalog_of_instruments_rudata.client.grpc.CorporateActionActionsResponse parseDelimitedFrom(
      java.io.InputStream input,
      com.google.protobuf.ExtensionRegistryLite extensionRegistry)
      throws java.io.IOException {
    return com.google.protobuf.GeneratedMessageV3
        .parseDelimitedWithIOException(PARSER, input, extensionRegistry);
  }
  public static com.bcs.bm.catalog_of_instruments_rudata.client.grpc.CorporateActionActionsResponse parseFrom(
      com.google.protobuf.CodedInputStream input)
      throws java.io.IOException {
    return com.google.protobuf.GeneratedMessageV3
        .parseWithIOException(PARSER, input);
  }
  public static com.bcs.bm.catalog_of_instruments_rudata.client.grpc.CorporateActionActionsResponse parseFrom(
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
  public static Builder newBuilder(com.bcs.bm.catalog_of_instruments_rudata.client.grpc.CorporateActionActionsResponse prototype) {
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
   * Protobuf type {@code CorporateActionActionsResponse}
   */
  public static final class Builder extends
      com.google.protobuf.GeneratedMessageV3.Builder<Builder> implements
      // @@protoc_insertion_point(builder_implements:CorporateActionActionsResponse)
      com.bcs.bm.catalog_of_instruments_rudata.client.grpc.CorporateActionActionsResponseOrBuilder {
    public static final com.google.protobuf.Descriptors.Descriptor
        getDescriptor() {
      return com.bcs.bm.catalog_of_instruments_rudata.client.grpc.GrpcService.internal_static_CorporateActionActionsResponse_descriptor;
    }

    @java.lang.Override
    protected com.google.protobuf.GeneratedMessageV3.FieldAccessorTable
        internalGetFieldAccessorTable() {
      return com.bcs.bm.catalog_of_instruments_rudata.client.grpc.GrpcService.internal_static_CorporateActionActionsResponse_fieldAccessorTable
          .ensureFieldAccessorsInitialized(
              com.bcs.bm.catalog_of_instruments_rudata.client.grpc.CorporateActionActionsResponse.class, com.bcs.bm.catalog_of_instruments_rudata.client.grpc.CorporateActionActionsResponse.Builder.class);
    }

    // Construct using com.bcs.bm.catalog_of_instruments_rudata.client.grpc.CorporateActionActionsResponse.newBuilder()
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
        getCorporateActionActionsFieldBuilder();
      }
    }
    @java.lang.Override
    public Builder clear() {
      super.clear();
      reqId_ = "";

      if (corporateActionActionsBuilder_ == null) {
        corporateActionActions_ = java.util.Collections.emptyList();
        bitField0_ = (bitField0_ & ~0x00000001);
      } else {
        corporateActionActionsBuilder_.clear();
      }
      return this;
    }

    @java.lang.Override
    public com.google.protobuf.Descriptors.Descriptor
        getDescriptorForType() {
      return com.bcs.bm.catalog_of_instruments_rudata.client.grpc.GrpcService.internal_static_CorporateActionActionsResponse_descriptor;
    }

    @java.lang.Override
    public com.bcs.bm.catalog_of_instruments_rudata.client.grpc.CorporateActionActionsResponse getDefaultInstanceForType() {
      return com.bcs.bm.catalog_of_instruments_rudata.client.grpc.CorporateActionActionsResponse.getDefaultInstance();
    }

    @java.lang.Override
    public com.bcs.bm.catalog_of_instruments_rudata.client.grpc.CorporateActionActionsResponse build() {
      com.bcs.bm.catalog_of_instruments_rudata.client.grpc.CorporateActionActionsResponse result = buildPartial();
      if (!result.isInitialized()) {
        throw newUninitializedMessageException(result);
      }
      return result;
    }

    @java.lang.Override
    public com.bcs.bm.catalog_of_instruments_rudata.client.grpc.CorporateActionActionsResponse buildPartial() {
      com.bcs.bm.catalog_of_instruments_rudata.client.grpc.CorporateActionActionsResponse result = new com.bcs.bm.catalog_of_instruments_rudata.client.grpc.CorporateActionActionsResponse(this);
      int from_bitField0_ = bitField0_;
      result.reqId_ = reqId_;
      if (corporateActionActionsBuilder_ == null) {
        if (((bitField0_ & 0x00000001) != 0)) {
          corporateActionActions_ = java.util.Collections.unmodifiableList(corporateActionActions_);
          bitField0_ = (bitField0_ & ~0x00000001);
        }
        result.corporateActionActions_ = corporateActionActions_;
      } else {
        result.corporateActionActions_ = corporateActionActionsBuilder_.build();
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
      if (other instanceof com.bcs.bm.catalog_of_instruments_rudata.client.grpc.CorporateActionActionsResponse) {
        return mergeFrom((com.bcs.bm.catalog_of_instruments_rudata.client.grpc.CorporateActionActionsResponse)other);
      } else {
        super.mergeFrom(other);
        return this;
      }
    }

    public Builder mergeFrom(com.bcs.bm.catalog_of_instruments_rudata.client.grpc.CorporateActionActionsResponse other) {
      if (other == com.bcs.bm.catalog_of_instruments_rudata.client.grpc.CorporateActionActionsResponse.getDefaultInstance()) return this;
      if (!other.getReqId().isEmpty()) {
        reqId_ = other.reqId_;
        onChanged();
      }
      if (corporateActionActionsBuilder_ == null) {
        if (!other.corporateActionActions_.isEmpty()) {
          if (corporateActionActions_.isEmpty()) {
            corporateActionActions_ = other.corporateActionActions_;
            bitField0_ = (bitField0_ & ~0x00000001);
          } else {
            ensureCorporateActionActionsIsMutable();
            corporateActionActions_.addAll(other.corporateActionActions_);
          }
          onChanged();
        }
      } else {
        if (!other.corporateActionActions_.isEmpty()) {
          if (corporateActionActionsBuilder_.isEmpty()) {
            corporateActionActionsBuilder_.dispose();
            corporateActionActionsBuilder_ = null;
            corporateActionActions_ = other.corporateActionActions_;
            bitField0_ = (bitField0_ & ~0x00000001);
            corporateActionActionsBuilder_ = 
              com.google.protobuf.GeneratedMessageV3.alwaysUseFieldBuilders ?
                 getCorporateActionActionsFieldBuilder() : null;
          } else {
            corporateActionActionsBuilder_.addAllMessages(other.corporateActionActions_);
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
      com.bcs.bm.catalog_of_instruments_rudata.client.grpc.CorporateActionActionsResponse parsedMessage = null;
      try {
        parsedMessage = PARSER.parsePartialFrom(input, extensionRegistry);
      } catch (com.google.protobuf.InvalidProtocolBufferException e) {
        parsedMessage = (com.bcs.bm.catalog_of_instruments_rudata.client.grpc.CorporateActionActionsResponse) e.getUnfinishedMessage();
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

    private java.util.List<com.bcs.bm.catalog_of_instruments_rudata.client.grpc.CorporateActionActions> corporateActionActions_ =
      java.util.Collections.emptyList();
    private void ensureCorporateActionActionsIsMutable() {
      if (!((bitField0_ & 0x00000001) != 0)) {
        corporateActionActions_ = new java.util.ArrayList<com.bcs.bm.catalog_of_instruments_rudata.client.grpc.CorporateActionActions>(corporateActionActions_);
        bitField0_ |= 0x00000001;
       }
    }

    private com.google.protobuf.RepeatedFieldBuilderV3<
        com.bcs.bm.catalog_of_instruments_rudata.client.grpc.CorporateActionActions, com.bcs.bm.catalog_of_instruments_rudata.client.grpc.CorporateActionActions.Builder, com.bcs.bm.catalog_of_instruments_rudata.client.grpc.CorporateActionActionsOrBuilder> corporateActionActionsBuilder_;

    /**
     * <code>repeated .CorporateActionActions corporateActionActions = 2;</code>
     */
    public java.util.List<com.bcs.bm.catalog_of_instruments_rudata.client.grpc.CorporateActionActions> getCorporateActionActionsList() {
      if (corporateActionActionsBuilder_ == null) {
        return java.util.Collections.unmodifiableList(corporateActionActions_);
      } else {
        return corporateActionActionsBuilder_.getMessageList();
      }
    }
    /**
     * <code>repeated .CorporateActionActions corporateActionActions = 2;</code>
     */
    public int getCorporateActionActionsCount() {
      if (corporateActionActionsBuilder_ == null) {
        return corporateActionActions_.size();
      } else {
        return corporateActionActionsBuilder_.getCount();
      }
    }
    /**
     * <code>repeated .CorporateActionActions corporateActionActions = 2;</code>
     */
    public com.bcs.bm.catalog_of_instruments_rudata.client.grpc.CorporateActionActions getCorporateActionActions(int index) {
      if (corporateActionActionsBuilder_ == null) {
        return corporateActionActions_.get(index);
      } else {
        return corporateActionActionsBuilder_.getMessage(index);
      }
    }
    /**
     * <code>repeated .CorporateActionActions corporateActionActions = 2;</code>
     */
    public Builder setCorporateActionActions(
        int index, com.bcs.bm.catalog_of_instruments_rudata.client.grpc.CorporateActionActions value) {
      if (corporateActionActionsBuilder_ == null) {
        if (value == null) {
          throw new NullPointerException();
        }
        ensureCorporateActionActionsIsMutable();
        corporateActionActions_.set(index, value);
        onChanged();
      } else {
        corporateActionActionsBuilder_.setMessage(index, value);
      }
      return this;
    }
    /**
     * <code>repeated .CorporateActionActions corporateActionActions = 2;</code>
     */
    public Builder setCorporateActionActions(
        int index, com.bcs.bm.catalog_of_instruments_rudata.client.grpc.CorporateActionActions.Builder builderForValue) {
      if (corporateActionActionsBuilder_ == null) {
        ensureCorporateActionActionsIsMutable();
        corporateActionActions_.set(index, builderForValue.build());
        onChanged();
      } else {
        corporateActionActionsBuilder_.setMessage(index, builderForValue.build());
      }
      return this;
    }
    /**
     * <code>repeated .CorporateActionActions corporateActionActions = 2;</code>
     */
    public Builder addCorporateActionActions(com.bcs.bm.catalog_of_instruments_rudata.client.grpc.CorporateActionActions value) {
      if (corporateActionActionsBuilder_ == null) {
        if (value == null) {
          throw new NullPointerException();
        }
        ensureCorporateActionActionsIsMutable();
        corporateActionActions_.add(value);
        onChanged();
      } else {
        corporateActionActionsBuilder_.addMessage(value);
      }
      return this;
    }
    /**
     * <code>repeated .CorporateActionActions corporateActionActions = 2;</code>
     */
    public Builder addCorporateActionActions(
        int index, com.bcs.bm.catalog_of_instruments_rudata.client.grpc.CorporateActionActions value) {
      if (corporateActionActionsBuilder_ == null) {
        if (value == null) {
          throw new NullPointerException();
        }
        ensureCorporateActionActionsIsMutable();
        corporateActionActions_.add(index, value);
        onChanged();
      } else {
        corporateActionActionsBuilder_.addMessage(index, value);
      }
      return this;
    }
    /**
     * <code>repeated .CorporateActionActions corporateActionActions = 2;</code>
     */
    public Builder addCorporateActionActions(
        com.bcs.bm.catalog_of_instruments_rudata.client.grpc.CorporateActionActions.Builder builderForValue) {
      if (corporateActionActionsBuilder_ == null) {
        ensureCorporateActionActionsIsMutable();
        corporateActionActions_.add(builderForValue.build());
        onChanged();
      } else {
        corporateActionActionsBuilder_.addMessage(builderForValue.build());
      }
      return this;
    }
    /**
     * <code>repeated .CorporateActionActions corporateActionActions = 2;</code>
     */
    public Builder addCorporateActionActions(
        int index, com.bcs.bm.catalog_of_instruments_rudata.client.grpc.CorporateActionActions.Builder builderForValue) {
      if (corporateActionActionsBuilder_ == null) {
        ensureCorporateActionActionsIsMutable();
        corporateActionActions_.add(index, builderForValue.build());
        onChanged();
      } else {
        corporateActionActionsBuilder_.addMessage(index, builderForValue.build());
      }
      return this;
    }
    /**
     * <code>repeated .CorporateActionActions corporateActionActions = 2;</code>
     */
    public Builder addAllCorporateActionActions(
        java.lang.Iterable<? extends com.bcs.bm.catalog_of_instruments_rudata.client.grpc.CorporateActionActions> values) {
      if (corporateActionActionsBuilder_ == null) {
        ensureCorporateActionActionsIsMutable();
        com.google.protobuf.AbstractMessageLite.Builder.addAll(
            values, corporateActionActions_);
        onChanged();
      } else {
        corporateActionActionsBuilder_.addAllMessages(values);
      }
      return this;
    }
    /**
     * <code>repeated .CorporateActionActions corporateActionActions = 2;</code>
     */
    public Builder clearCorporateActionActions() {
      if (corporateActionActionsBuilder_ == null) {
        corporateActionActions_ = java.util.Collections.emptyList();
        bitField0_ = (bitField0_ & ~0x00000001);
        onChanged();
      } else {
        corporateActionActionsBuilder_.clear();
      }
      return this;
    }
    /**
     * <code>repeated .CorporateActionActions corporateActionActions = 2;</code>
     */
    public Builder removeCorporateActionActions(int index) {
      if (corporateActionActionsBuilder_ == null) {
        ensureCorporateActionActionsIsMutable();
        corporateActionActions_.remove(index);
        onChanged();
      } else {
        corporateActionActionsBuilder_.remove(index);
      }
      return this;
    }
    /**
     * <code>repeated .CorporateActionActions corporateActionActions = 2;</code>
     */
    public com.bcs.bm.catalog_of_instruments_rudata.client.grpc.CorporateActionActions.Builder getCorporateActionActionsBuilder(
        int index) {
      return getCorporateActionActionsFieldBuilder().getBuilder(index);
    }
    /**
     * <code>repeated .CorporateActionActions corporateActionActions = 2;</code>
     */
    public com.bcs.bm.catalog_of_instruments_rudata.client.grpc.CorporateActionActionsOrBuilder getCorporateActionActionsOrBuilder(
        int index) {
      if (corporateActionActionsBuilder_ == null) {
        return corporateActionActions_.get(index);  } else {
        return corporateActionActionsBuilder_.getMessageOrBuilder(index);
      }
    }
    /**
     * <code>repeated .CorporateActionActions corporateActionActions = 2;</code>
     */
    public java.util.List<? extends com.bcs.bm.catalog_of_instruments_rudata.client.grpc.CorporateActionActionsOrBuilder> 
         getCorporateActionActionsOrBuilderList() {
      if (corporateActionActionsBuilder_ != null) {
        return corporateActionActionsBuilder_.getMessageOrBuilderList();
      } else {
        return java.util.Collections.unmodifiableList(corporateActionActions_);
      }
    }
    /**
     * <code>repeated .CorporateActionActions corporateActionActions = 2;</code>
     */
    public com.bcs.bm.catalog_of_instruments_rudata.client.grpc.CorporateActionActions.Builder addCorporateActionActionsBuilder() {
      return getCorporateActionActionsFieldBuilder().addBuilder(
          com.bcs.bm.catalog_of_instruments_rudata.client.grpc.CorporateActionActions.getDefaultInstance());
    }
    /**
     * <code>repeated .CorporateActionActions corporateActionActions = 2;</code>
     */
    public com.bcs.bm.catalog_of_instruments_rudata.client.grpc.CorporateActionActions.Builder addCorporateActionActionsBuilder(
        int index) {
      return getCorporateActionActionsFieldBuilder().addBuilder(
          index, com.bcs.bm.catalog_of_instruments_rudata.client.grpc.CorporateActionActions.getDefaultInstance());
    }
    /**
     * <code>repeated .CorporateActionActions corporateActionActions = 2;</code>
     */
    public java.util.List<com.bcs.bm.catalog_of_instruments_rudata.client.grpc.CorporateActionActions.Builder> 
         getCorporateActionActionsBuilderList() {
      return getCorporateActionActionsFieldBuilder().getBuilderList();
    }
    private com.google.protobuf.RepeatedFieldBuilderV3<
        com.bcs.bm.catalog_of_instruments_rudata.client.grpc.CorporateActionActions, com.bcs.bm.catalog_of_instruments_rudata.client.grpc.CorporateActionActions.Builder, com.bcs.bm.catalog_of_instruments_rudata.client.grpc.CorporateActionActionsOrBuilder> 
        getCorporateActionActionsFieldBuilder() {
      if (corporateActionActionsBuilder_ == null) {
        corporateActionActionsBuilder_ = new com.google.protobuf.RepeatedFieldBuilderV3<
            com.bcs.bm.catalog_of_instruments_rudata.client.grpc.CorporateActionActions, com.bcs.bm.catalog_of_instruments_rudata.client.grpc.CorporateActionActions.Builder, com.bcs.bm.catalog_of_instruments_rudata.client.grpc.CorporateActionActionsOrBuilder>(
                corporateActionActions_,
                ((bitField0_ & 0x00000001) != 0),
                getParentForChildren(),
                isClean());
        corporateActionActions_ = null;
      }
      return corporateActionActionsBuilder_;
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


    // @@protoc_insertion_point(builder_scope:CorporateActionActionsResponse)
  }

  // @@protoc_insertion_point(class_scope:CorporateActionActionsResponse)
  private static final com.bcs.bm.catalog_of_instruments_rudata.client.grpc.CorporateActionActionsResponse DEFAULT_INSTANCE;
  static {
    DEFAULT_INSTANCE = new com.bcs.bm.catalog_of_instruments_rudata.client.grpc.CorporateActionActionsResponse();
  }

  public static com.bcs.bm.catalog_of_instruments_rudata.client.grpc.CorporateActionActionsResponse getDefaultInstance() {
    return DEFAULT_INSTANCE;
  }

  private static final com.google.protobuf.Parser<CorporateActionActionsResponse>
      PARSER = new com.google.protobuf.AbstractParser<CorporateActionActionsResponse>() {
    @java.lang.Override
    public CorporateActionActionsResponse parsePartialFrom(
        com.google.protobuf.CodedInputStream input,
        com.google.protobuf.ExtensionRegistryLite extensionRegistry)
        throws com.google.protobuf.InvalidProtocolBufferException {
      return new CorporateActionActionsResponse(input, extensionRegistry);
    }
  };

  public static com.google.protobuf.Parser<CorporateActionActionsResponse> parser() {
    return PARSER;
  }

  @java.lang.Override
  public com.google.protobuf.Parser<CorporateActionActionsResponse> getParserForType() {
    return PARSER;
  }

  @java.lang.Override
  public com.bcs.bm.catalog_of_instruments_rudata.client.grpc.CorporateActionActionsResponse getDefaultInstanceForType() {
    return DEFAULT_INSTANCE;
  }

}


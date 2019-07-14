// Generated by the protocol buffer compiler.  DO NOT EDIT!
// source: GrpcService.proto

package com.bcs.bm.catalog_of_instruments_rudata.client.grpc;

/**
 * Protobuf type {@code CorporateActionActionsRequest}
 */
public  final class CorporateActionActionsRequest extends
    com.google.protobuf.GeneratedMessageV3 implements
    // @@protoc_insertion_point(message_implements:CorporateActionActionsRequest)
    CorporateActionActionsRequestOrBuilder {
private static final long serialVersionUID = 0L;
  // Use CorporateActionActionsRequest.newBuilder() to construct.
  private CorporateActionActionsRequest(com.google.protobuf.GeneratedMessageV3.Builder<?> builder) {
    super(builder);
  }
  private CorporateActionActionsRequest() {
    reqId_ = "";
    idFilter_ = java.util.Collections.emptyList();
  }

  @java.lang.Override
  @SuppressWarnings({"unused"})
  protected java.lang.Object newInstance(
      UnusedPrivateParameter unused) {
    return new CorporateActionActionsRequest();
  }

  @java.lang.Override
  public final com.google.protobuf.UnknownFieldSet
  getUnknownFields() {
    return this.unknownFields;
  }
  private CorporateActionActionsRequest(
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
              idFilter_ = new java.util.ArrayList<com.bcs.bm.catalog_of_instruments_rudata.client.grpc.Int64Keys>();
              mutable_bitField0_ |= 0x00000001;
            }
            idFilter_.add(
                input.readMessage(com.bcs.bm.catalog_of_instruments_rudata.client.grpc.Int64Keys.parser(), extensionRegistry));
            break;
          }
          case 24: {

            updateDate_ = input.readInt64();
            break;
          }
          case 32: {

            skipCount_ = input.readInt32();
            break;
          }
          case 40: {

            pageSize_ = input.readInt32();
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
        idFilter_ = java.util.Collections.unmodifiableList(idFilter_);
      }
      this.unknownFields = unknownFields.build();
      makeExtensionsImmutable();
    }
  }
  public static final com.google.protobuf.Descriptors.Descriptor
      getDescriptor() {
    return com.bcs.bm.catalog_of_instruments_rudata.client.grpc.GrpcService.internal_static_CorporateActionActionsRequest_descriptor;
  }

  @java.lang.Override
  protected com.google.protobuf.GeneratedMessageV3.FieldAccessorTable
      internalGetFieldAccessorTable() {
    return com.bcs.bm.catalog_of_instruments_rudata.client.grpc.GrpcService.internal_static_CorporateActionActionsRequest_fieldAccessorTable
        .ensureFieldAccessorsInitialized(
            com.bcs.bm.catalog_of_instruments_rudata.client.grpc.CorporateActionActionsRequest.class, com.bcs.bm.catalog_of_instruments_rudata.client.grpc.CorporateActionActionsRequest.Builder.class);
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

  public static final int IDFILTER_FIELD_NUMBER = 2;
  private java.util.List<com.bcs.bm.catalog_of_instruments_rudata.client.grpc.Int64Keys> idFilter_;
  /**
   * <code>repeated .Int64Keys idFilter = 2;</code>
   */
  public java.util.List<com.bcs.bm.catalog_of_instruments_rudata.client.grpc.Int64Keys> getIdFilterList() {
    return idFilter_;
  }
  /**
   * <code>repeated .Int64Keys idFilter = 2;</code>
   */
  public java.util.List<? extends com.bcs.bm.catalog_of_instruments_rudata.client.grpc.Int64KeysOrBuilder> 
      getIdFilterOrBuilderList() {
    return idFilter_;
  }
  /**
   * <code>repeated .Int64Keys idFilter = 2;</code>
   */
  public int getIdFilterCount() {
    return idFilter_.size();
  }
  /**
   * <code>repeated .Int64Keys idFilter = 2;</code>
   */
  public com.bcs.bm.catalog_of_instruments_rudata.client.grpc.Int64Keys getIdFilter(int index) {
    return idFilter_.get(index);
  }
  /**
   * <code>repeated .Int64Keys idFilter = 2;</code>
   */
  public com.bcs.bm.catalog_of_instruments_rudata.client.grpc.Int64KeysOrBuilder getIdFilterOrBuilder(
      int index) {
    return idFilter_.get(index);
  }

  public static final int UPDATE_DATE_FIELD_NUMBER = 3;
  private long updateDate_;
  /**
   * <code>int64 update_date = 3;</code>
   */
  public long getUpdateDate() {
    return updateDate_;
  }

  public static final int SKIPCOUNT_FIELD_NUMBER = 4;
  private int skipCount_;
  /**
   * <code>int32 skipCount = 4;</code>
   */
  public int getSkipCount() {
    return skipCount_;
  }

  public static final int PAGESIZE_FIELD_NUMBER = 5;
  private int pageSize_;
  /**
   * <code>int32 pageSize = 5;</code>
   */
  public int getPageSize() {
    return pageSize_;
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
    for (int i = 0; i < idFilter_.size(); i++) {
      output.writeMessage(2, idFilter_.get(i));
    }
    if (updateDate_ != 0L) {
      output.writeInt64(3, updateDate_);
    }
    if (skipCount_ != 0) {
      output.writeInt32(4, skipCount_);
    }
    if (pageSize_ != 0) {
      output.writeInt32(5, pageSize_);
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
    for (int i = 0; i < idFilter_.size(); i++) {
      size += com.google.protobuf.CodedOutputStream
        .computeMessageSize(2, idFilter_.get(i));
    }
    if (updateDate_ != 0L) {
      size += com.google.protobuf.CodedOutputStream
        .computeInt64Size(3, updateDate_);
    }
    if (skipCount_ != 0) {
      size += com.google.protobuf.CodedOutputStream
        .computeInt32Size(4, skipCount_);
    }
    if (pageSize_ != 0) {
      size += com.google.protobuf.CodedOutputStream
        .computeInt32Size(5, pageSize_);
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
    if (!(obj instanceof com.bcs.bm.catalog_of_instruments_rudata.client.grpc.CorporateActionActionsRequest)) {
      return super.equals(obj);
    }
    com.bcs.bm.catalog_of_instruments_rudata.client.grpc.CorporateActionActionsRequest other = (com.bcs.bm.catalog_of_instruments_rudata.client.grpc.CorporateActionActionsRequest) obj;

    if (!getReqId()
        .equals(other.getReqId())) return false;
    if (!getIdFilterList()
        .equals(other.getIdFilterList())) return false;
    if (getUpdateDate()
        != other.getUpdateDate()) return false;
    if (getSkipCount()
        != other.getSkipCount()) return false;
    if (getPageSize()
        != other.getPageSize()) return false;
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
    if (getIdFilterCount() > 0) {
      hash = (37 * hash) + IDFILTER_FIELD_NUMBER;
      hash = (53 * hash) + getIdFilterList().hashCode();
    }
    hash = (37 * hash) + UPDATE_DATE_FIELD_NUMBER;
    hash = (53 * hash) + com.google.protobuf.Internal.hashLong(
        getUpdateDate());
    hash = (37 * hash) + SKIPCOUNT_FIELD_NUMBER;
    hash = (53 * hash) + getSkipCount();
    hash = (37 * hash) + PAGESIZE_FIELD_NUMBER;
    hash = (53 * hash) + getPageSize();
    hash = (29 * hash) + unknownFields.hashCode();
    memoizedHashCode = hash;
    return hash;
  }

  public static com.bcs.bm.catalog_of_instruments_rudata.client.grpc.CorporateActionActionsRequest parseFrom(
      java.nio.ByteBuffer data)
      throws com.google.protobuf.InvalidProtocolBufferException {
    return PARSER.parseFrom(data);
  }
  public static com.bcs.bm.catalog_of_instruments_rudata.client.grpc.CorporateActionActionsRequest parseFrom(
      java.nio.ByteBuffer data,
      com.google.protobuf.ExtensionRegistryLite extensionRegistry)
      throws com.google.protobuf.InvalidProtocolBufferException {
    return PARSER.parseFrom(data, extensionRegistry);
  }
  public static com.bcs.bm.catalog_of_instruments_rudata.client.grpc.CorporateActionActionsRequest parseFrom(
      com.google.protobuf.ByteString data)
      throws com.google.protobuf.InvalidProtocolBufferException {
    return PARSER.parseFrom(data);
  }
  public static com.bcs.bm.catalog_of_instruments_rudata.client.grpc.CorporateActionActionsRequest parseFrom(
      com.google.protobuf.ByteString data,
      com.google.protobuf.ExtensionRegistryLite extensionRegistry)
      throws com.google.protobuf.InvalidProtocolBufferException {
    return PARSER.parseFrom(data, extensionRegistry);
  }
  public static com.bcs.bm.catalog_of_instruments_rudata.client.grpc.CorporateActionActionsRequest parseFrom(byte[] data)
      throws com.google.protobuf.InvalidProtocolBufferException {
    return PARSER.parseFrom(data);
  }
  public static com.bcs.bm.catalog_of_instruments_rudata.client.grpc.CorporateActionActionsRequest parseFrom(
      byte[] data,
      com.google.protobuf.ExtensionRegistryLite extensionRegistry)
      throws com.google.protobuf.InvalidProtocolBufferException {
    return PARSER.parseFrom(data, extensionRegistry);
  }
  public static com.bcs.bm.catalog_of_instruments_rudata.client.grpc.CorporateActionActionsRequest parseFrom(java.io.InputStream input)
      throws java.io.IOException {
    return com.google.protobuf.GeneratedMessageV3
        .parseWithIOException(PARSER, input);
  }
  public static com.bcs.bm.catalog_of_instruments_rudata.client.grpc.CorporateActionActionsRequest parseFrom(
      java.io.InputStream input,
      com.google.protobuf.ExtensionRegistryLite extensionRegistry)
      throws java.io.IOException {
    return com.google.protobuf.GeneratedMessageV3
        .parseWithIOException(PARSER, input, extensionRegistry);
  }
  public static com.bcs.bm.catalog_of_instruments_rudata.client.grpc.CorporateActionActionsRequest parseDelimitedFrom(java.io.InputStream input)
      throws java.io.IOException {
    return com.google.protobuf.GeneratedMessageV3
        .parseDelimitedWithIOException(PARSER, input);
  }
  public static com.bcs.bm.catalog_of_instruments_rudata.client.grpc.CorporateActionActionsRequest parseDelimitedFrom(
      java.io.InputStream input,
      com.google.protobuf.ExtensionRegistryLite extensionRegistry)
      throws java.io.IOException {
    return com.google.protobuf.GeneratedMessageV3
        .parseDelimitedWithIOException(PARSER, input, extensionRegistry);
  }
  public static com.bcs.bm.catalog_of_instruments_rudata.client.grpc.CorporateActionActionsRequest parseFrom(
      com.google.protobuf.CodedInputStream input)
      throws java.io.IOException {
    return com.google.protobuf.GeneratedMessageV3
        .parseWithIOException(PARSER, input);
  }
  public static com.bcs.bm.catalog_of_instruments_rudata.client.grpc.CorporateActionActionsRequest parseFrom(
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
  public static Builder newBuilder(com.bcs.bm.catalog_of_instruments_rudata.client.grpc.CorporateActionActionsRequest prototype) {
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
   * Protobuf type {@code CorporateActionActionsRequest}
   */
  public static final class Builder extends
      com.google.protobuf.GeneratedMessageV3.Builder<Builder> implements
      // @@protoc_insertion_point(builder_implements:CorporateActionActionsRequest)
      com.bcs.bm.catalog_of_instruments_rudata.client.grpc.CorporateActionActionsRequestOrBuilder {
    public static final com.google.protobuf.Descriptors.Descriptor
        getDescriptor() {
      return com.bcs.bm.catalog_of_instruments_rudata.client.grpc.GrpcService.internal_static_CorporateActionActionsRequest_descriptor;
    }

    @java.lang.Override
    protected com.google.protobuf.GeneratedMessageV3.FieldAccessorTable
        internalGetFieldAccessorTable() {
      return com.bcs.bm.catalog_of_instruments_rudata.client.grpc.GrpcService.internal_static_CorporateActionActionsRequest_fieldAccessorTable
          .ensureFieldAccessorsInitialized(
              com.bcs.bm.catalog_of_instruments_rudata.client.grpc.CorporateActionActionsRequest.class, com.bcs.bm.catalog_of_instruments_rudata.client.grpc.CorporateActionActionsRequest.Builder.class);
    }

    // Construct using com.bcs.bm.catalog_of_instruments_rudata.client.grpc.CorporateActionActionsRequest.newBuilder()
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
        getIdFilterFieldBuilder();
      }
    }
    @java.lang.Override
    public Builder clear() {
      super.clear();
      reqId_ = "";

      if (idFilterBuilder_ == null) {
        idFilter_ = java.util.Collections.emptyList();
        bitField0_ = (bitField0_ & ~0x00000001);
      } else {
        idFilterBuilder_.clear();
      }
      updateDate_ = 0L;

      skipCount_ = 0;

      pageSize_ = 0;

      return this;
    }

    @java.lang.Override
    public com.google.protobuf.Descriptors.Descriptor
        getDescriptorForType() {
      return com.bcs.bm.catalog_of_instruments_rudata.client.grpc.GrpcService.internal_static_CorporateActionActionsRequest_descriptor;
    }

    @java.lang.Override
    public com.bcs.bm.catalog_of_instruments_rudata.client.grpc.CorporateActionActionsRequest getDefaultInstanceForType() {
      return com.bcs.bm.catalog_of_instruments_rudata.client.grpc.CorporateActionActionsRequest.getDefaultInstance();
    }

    @java.lang.Override
    public com.bcs.bm.catalog_of_instruments_rudata.client.grpc.CorporateActionActionsRequest build() {
      com.bcs.bm.catalog_of_instruments_rudata.client.grpc.CorporateActionActionsRequest result = buildPartial();
      if (!result.isInitialized()) {
        throw newUninitializedMessageException(result);
      }
      return result;
    }

    @java.lang.Override
    public com.bcs.bm.catalog_of_instruments_rudata.client.grpc.CorporateActionActionsRequest buildPartial() {
      com.bcs.bm.catalog_of_instruments_rudata.client.grpc.CorporateActionActionsRequest result = new com.bcs.bm.catalog_of_instruments_rudata.client.grpc.CorporateActionActionsRequest(this);
      int from_bitField0_ = bitField0_;
      result.reqId_ = reqId_;
      if (idFilterBuilder_ == null) {
        if (((bitField0_ & 0x00000001) != 0)) {
          idFilter_ = java.util.Collections.unmodifiableList(idFilter_);
          bitField0_ = (bitField0_ & ~0x00000001);
        }
        result.idFilter_ = idFilter_;
      } else {
        result.idFilter_ = idFilterBuilder_.build();
      }
      result.updateDate_ = updateDate_;
      result.skipCount_ = skipCount_;
      result.pageSize_ = pageSize_;
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
      if (other instanceof com.bcs.bm.catalog_of_instruments_rudata.client.grpc.CorporateActionActionsRequest) {
        return mergeFrom((com.bcs.bm.catalog_of_instruments_rudata.client.grpc.CorporateActionActionsRequest)other);
      } else {
        super.mergeFrom(other);
        return this;
      }
    }

    public Builder mergeFrom(com.bcs.bm.catalog_of_instruments_rudata.client.grpc.CorporateActionActionsRequest other) {
      if (other == com.bcs.bm.catalog_of_instruments_rudata.client.grpc.CorporateActionActionsRequest.getDefaultInstance()) return this;
      if (!other.getReqId().isEmpty()) {
        reqId_ = other.reqId_;
        onChanged();
      }
      if (idFilterBuilder_ == null) {
        if (!other.idFilter_.isEmpty()) {
          if (idFilter_.isEmpty()) {
            idFilter_ = other.idFilter_;
            bitField0_ = (bitField0_ & ~0x00000001);
          } else {
            ensureIdFilterIsMutable();
            idFilter_.addAll(other.idFilter_);
          }
          onChanged();
        }
      } else {
        if (!other.idFilter_.isEmpty()) {
          if (idFilterBuilder_.isEmpty()) {
            idFilterBuilder_.dispose();
            idFilterBuilder_ = null;
            idFilter_ = other.idFilter_;
            bitField0_ = (bitField0_ & ~0x00000001);
            idFilterBuilder_ = 
              com.google.protobuf.GeneratedMessageV3.alwaysUseFieldBuilders ?
                 getIdFilterFieldBuilder() : null;
          } else {
            idFilterBuilder_.addAllMessages(other.idFilter_);
          }
        }
      }
      if (other.getUpdateDate() != 0L) {
        setUpdateDate(other.getUpdateDate());
      }
      if (other.getSkipCount() != 0) {
        setSkipCount(other.getSkipCount());
      }
      if (other.getPageSize() != 0) {
        setPageSize(other.getPageSize());
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
      com.bcs.bm.catalog_of_instruments_rudata.client.grpc.CorporateActionActionsRequest parsedMessage = null;
      try {
        parsedMessage = PARSER.parsePartialFrom(input, extensionRegistry);
      } catch (com.google.protobuf.InvalidProtocolBufferException e) {
        parsedMessage = (com.bcs.bm.catalog_of_instruments_rudata.client.grpc.CorporateActionActionsRequest) e.getUnfinishedMessage();
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

    private java.util.List<com.bcs.bm.catalog_of_instruments_rudata.client.grpc.Int64Keys> idFilter_ =
      java.util.Collections.emptyList();
    private void ensureIdFilterIsMutable() {
      if (!((bitField0_ & 0x00000001) != 0)) {
        idFilter_ = new java.util.ArrayList<com.bcs.bm.catalog_of_instruments_rudata.client.grpc.Int64Keys>(idFilter_);
        bitField0_ |= 0x00000001;
       }
    }

    private com.google.protobuf.RepeatedFieldBuilderV3<
        com.bcs.bm.catalog_of_instruments_rudata.client.grpc.Int64Keys, com.bcs.bm.catalog_of_instruments_rudata.client.grpc.Int64Keys.Builder, com.bcs.bm.catalog_of_instruments_rudata.client.grpc.Int64KeysOrBuilder> idFilterBuilder_;

    /**
     * <code>repeated .Int64Keys idFilter = 2;</code>
     */
    public java.util.List<com.bcs.bm.catalog_of_instruments_rudata.client.grpc.Int64Keys> getIdFilterList() {
      if (idFilterBuilder_ == null) {
        return java.util.Collections.unmodifiableList(idFilter_);
      } else {
        return idFilterBuilder_.getMessageList();
      }
    }
    /**
     * <code>repeated .Int64Keys idFilter = 2;</code>
     */
    public int getIdFilterCount() {
      if (idFilterBuilder_ == null) {
        return idFilter_.size();
      } else {
        return idFilterBuilder_.getCount();
      }
    }
    /**
     * <code>repeated .Int64Keys idFilter = 2;</code>
     */
    public com.bcs.bm.catalog_of_instruments_rudata.client.grpc.Int64Keys getIdFilter(int index) {
      if (idFilterBuilder_ == null) {
        return idFilter_.get(index);
      } else {
        return idFilterBuilder_.getMessage(index);
      }
    }
    /**
     * <code>repeated .Int64Keys idFilter = 2;</code>
     */
    public Builder setIdFilter(
        int index, com.bcs.bm.catalog_of_instruments_rudata.client.grpc.Int64Keys value) {
      if (idFilterBuilder_ == null) {
        if (value == null) {
          throw new NullPointerException();
        }
        ensureIdFilterIsMutable();
        idFilter_.set(index, value);
        onChanged();
      } else {
        idFilterBuilder_.setMessage(index, value);
      }
      return this;
    }
    /**
     * <code>repeated .Int64Keys idFilter = 2;</code>
     */
    public Builder setIdFilter(
        int index, com.bcs.bm.catalog_of_instruments_rudata.client.grpc.Int64Keys.Builder builderForValue) {
      if (idFilterBuilder_ == null) {
        ensureIdFilterIsMutable();
        idFilter_.set(index, builderForValue.build());
        onChanged();
      } else {
        idFilterBuilder_.setMessage(index, builderForValue.build());
      }
      return this;
    }
    /**
     * <code>repeated .Int64Keys idFilter = 2;</code>
     */
    public Builder addIdFilter(com.bcs.bm.catalog_of_instruments_rudata.client.grpc.Int64Keys value) {
      if (idFilterBuilder_ == null) {
        if (value == null) {
          throw new NullPointerException();
        }
        ensureIdFilterIsMutable();
        idFilter_.add(value);
        onChanged();
      } else {
        idFilterBuilder_.addMessage(value);
      }
      return this;
    }
    /**
     * <code>repeated .Int64Keys idFilter = 2;</code>
     */
    public Builder addIdFilter(
        int index, com.bcs.bm.catalog_of_instruments_rudata.client.grpc.Int64Keys value) {
      if (idFilterBuilder_ == null) {
        if (value == null) {
          throw new NullPointerException();
        }
        ensureIdFilterIsMutable();
        idFilter_.add(index, value);
        onChanged();
      } else {
        idFilterBuilder_.addMessage(index, value);
      }
      return this;
    }
    /**
     * <code>repeated .Int64Keys idFilter = 2;</code>
     */
    public Builder addIdFilter(
        com.bcs.bm.catalog_of_instruments_rudata.client.grpc.Int64Keys.Builder builderForValue) {
      if (idFilterBuilder_ == null) {
        ensureIdFilterIsMutable();
        idFilter_.add(builderForValue.build());
        onChanged();
      } else {
        idFilterBuilder_.addMessage(builderForValue.build());
      }
      return this;
    }
    /**
     * <code>repeated .Int64Keys idFilter = 2;</code>
     */
    public Builder addIdFilter(
        int index, com.bcs.bm.catalog_of_instruments_rudata.client.grpc.Int64Keys.Builder builderForValue) {
      if (idFilterBuilder_ == null) {
        ensureIdFilterIsMutable();
        idFilter_.add(index, builderForValue.build());
        onChanged();
      } else {
        idFilterBuilder_.addMessage(index, builderForValue.build());
      }
      return this;
    }
    /**
     * <code>repeated .Int64Keys idFilter = 2;</code>
     */
    public Builder addAllIdFilter(
        java.lang.Iterable<? extends com.bcs.bm.catalog_of_instruments_rudata.client.grpc.Int64Keys> values) {
      if (idFilterBuilder_ == null) {
        ensureIdFilterIsMutable();
        com.google.protobuf.AbstractMessageLite.Builder.addAll(
            values, idFilter_);
        onChanged();
      } else {
        idFilterBuilder_.addAllMessages(values);
      }
      return this;
    }
    /**
     * <code>repeated .Int64Keys idFilter = 2;</code>
     */
    public Builder clearIdFilter() {
      if (idFilterBuilder_ == null) {
        idFilter_ = java.util.Collections.emptyList();
        bitField0_ = (bitField0_ & ~0x00000001);
        onChanged();
      } else {
        idFilterBuilder_.clear();
      }
      return this;
    }
    /**
     * <code>repeated .Int64Keys idFilter = 2;</code>
     */
    public Builder removeIdFilter(int index) {
      if (idFilterBuilder_ == null) {
        ensureIdFilterIsMutable();
        idFilter_.remove(index);
        onChanged();
      } else {
        idFilterBuilder_.remove(index);
      }
      return this;
    }
    /**
     * <code>repeated .Int64Keys idFilter = 2;</code>
     */
    public com.bcs.bm.catalog_of_instruments_rudata.client.grpc.Int64Keys.Builder getIdFilterBuilder(
        int index) {
      return getIdFilterFieldBuilder().getBuilder(index);
    }
    /**
     * <code>repeated .Int64Keys idFilter = 2;</code>
     */
    public com.bcs.bm.catalog_of_instruments_rudata.client.grpc.Int64KeysOrBuilder getIdFilterOrBuilder(
        int index) {
      if (idFilterBuilder_ == null) {
        return idFilter_.get(index);  } else {
        return idFilterBuilder_.getMessageOrBuilder(index);
      }
    }
    /**
     * <code>repeated .Int64Keys idFilter = 2;</code>
     */
    public java.util.List<? extends com.bcs.bm.catalog_of_instruments_rudata.client.grpc.Int64KeysOrBuilder> 
         getIdFilterOrBuilderList() {
      if (idFilterBuilder_ != null) {
        return idFilterBuilder_.getMessageOrBuilderList();
      } else {
        return java.util.Collections.unmodifiableList(idFilter_);
      }
    }
    /**
     * <code>repeated .Int64Keys idFilter = 2;</code>
     */
    public com.bcs.bm.catalog_of_instruments_rudata.client.grpc.Int64Keys.Builder addIdFilterBuilder() {
      return getIdFilterFieldBuilder().addBuilder(
          com.bcs.bm.catalog_of_instruments_rudata.client.grpc.Int64Keys.getDefaultInstance());
    }
    /**
     * <code>repeated .Int64Keys idFilter = 2;</code>
     */
    public com.bcs.bm.catalog_of_instruments_rudata.client.grpc.Int64Keys.Builder addIdFilterBuilder(
        int index) {
      return getIdFilterFieldBuilder().addBuilder(
          index, com.bcs.bm.catalog_of_instruments_rudata.client.grpc.Int64Keys.getDefaultInstance());
    }
    /**
     * <code>repeated .Int64Keys idFilter = 2;</code>
     */
    public java.util.List<com.bcs.bm.catalog_of_instruments_rudata.client.grpc.Int64Keys.Builder> 
         getIdFilterBuilderList() {
      return getIdFilterFieldBuilder().getBuilderList();
    }
    private com.google.protobuf.RepeatedFieldBuilderV3<
        com.bcs.bm.catalog_of_instruments_rudata.client.grpc.Int64Keys, com.bcs.bm.catalog_of_instruments_rudata.client.grpc.Int64Keys.Builder, com.bcs.bm.catalog_of_instruments_rudata.client.grpc.Int64KeysOrBuilder> 
        getIdFilterFieldBuilder() {
      if (idFilterBuilder_ == null) {
        idFilterBuilder_ = new com.google.protobuf.RepeatedFieldBuilderV3<
            com.bcs.bm.catalog_of_instruments_rudata.client.grpc.Int64Keys, com.bcs.bm.catalog_of_instruments_rudata.client.grpc.Int64Keys.Builder, com.bcs.bm.catalog_of_instruments_rudata.client.grpc.Int64KeysOrBuilder>(
                idFilter_,
                ((bitField0_ & 0x00000001) != 0),
                getParentForChildren(),
                isClean());
        idFilter_ = null;
      }
      return idFilterBuilder_;
    }

    private long updateDate_ ;
    /**
     * <code>int64 update_date = 3;</code>
     */
    public long getUpdateDate() {
      return updateDate_;
    }
    /**
     * <code>int64 update_date = 3;</code>
     */
    public Builder setUpdateDate(long value) {
      
      updateDate_ = value;
      onChanged();
      return this;
    }
    /**
     * <code>int64 update_date = 3;</code>
     */
    public Builder clearUpdateDate() {
      
      updateDate_ = 0L;
      onChanged();
      return this;
    }

    private int skipCount_ ;
    /**
     * <code>int32 skipCount = 4;</code>
     */
    public int getSkipCount() {
      return skipCount_;
    }
    /**
     * <code>int32 skipCount = 4;</code>
     */
    public Builder setSkipCount(int value) {
      
      skipCount_ = value;
      onChanged();
      return this;
    }
    /**
     * <code>int32 skipCount = 4;</code>
     */
    public Builder clearSkipCount() {
      
      skipCount_ = 0;
      onChanged();
      return this;
    }

    private int pageSize_ ;
    /**
     * <code>int32 pageSize = 5;</code>
     */
    public int getPageSize() {
      return pageSize_;
    }
    /**
     * <code>int32 pageSize = 5;</code>
     */
    public Builder setPageSize(int value) {
      
      pageSize_ = value;
      onChanged();
      return this;
    }
    /**
     * <code>int32 pageSize = 5;</code>
     */
    public Builder clearPageSize() {
      
      pageSize_ = 0;
      onChanged();
      return this;
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


    // @@protoc_insertion_point(builder_scope:CorporateActionActionsRequest)
  }

  // @@protoc_insertion_point(class_scope:CorporateActionActionsRequest)
  private static final com.bcs.bm.catalog_of_instruments_rudata.client.grpc.CorporateActionActionsRequest DEFAULT_INSTANCE;
  static {
    DEFAULT_INSTANCE = new com.bcs.bm.catalog_of_instruments_rudata.client.grpc.CorporateActionActionsRequest();
  }

  public static com.bcs.bm.catalog_of_instruments_rudata.client.grpc.CorporateActionActionsRequest getDefaultInstance() {
    return DEFAULT_INSTANCE;
  }

  private static final com.google.protobuf.Parser<CorporateActionActionsRequest>
      PARSER = new com.google.protobuf.AbstractParser<CorporateActionActionsRequest>() {
    @java.lang.Override
    public CorporateActionActionsRequest parsePartialFrom(
        com.google.protobuf.CodedInputStream input,
        com.google.protobuf.ExtensionRegistryLite extensionRegistry)
        throws com.google.protobuf.InvalidProtocolBufferException {
      return new CorporateActionActionsRequest(input, extensionRegistry);
    }
  };

  public static com.google.protobuf.Parser<CorporateActionActionsRequest> parser() {
    return PARSER;
  }

  @java.lang.Override
  public com.google.protobuf.Parser<CorporateActionActionsRequest> getParserForType() {
    return PARSER;
  }

  @java.lang.Override
  public com.bcs.bm.catalog_of_instruments_rudata.client.grpc.CorporateActionActionsRequest getDefaultInstanceForType() {
    return DEFAULT_INSTANCE;
  }

}


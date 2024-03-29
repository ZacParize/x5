// Generated by the protocol buffer compiler.  DO NOT EDIT!
// source: GrpcService.proto

package com.bcs.bm.catalog_of_instruments_rudata.client.grpc;

/**
 * Protobuf type {@code BondOffersRequest}
 */
public  final class BondOffersRequest extends
    com.google.protobuf.GeneratedMessageV3 implements
    // @@protoc_insertion_point(message_implements:BondOffersRequest)
    BondOffersRequestOrBuilder {
private static final long serialVersionUID = 0L;
  // Use BondOffersRequest.newBuilder() to construct.
  private BondOffersRequest(com.google.protobuf.GeneratedMessageV3.Builder<?> builder) {
    super(builder);
  }
  private BondOffersRequest() {
    reqId_ = "";
    idFilters_ = emptyLongList();
  }

  @java.lang.Override
  @SuppressWarnings({"unused"})
  protected java.lang.Object newInstance(
      UnusedPrivateParameter unused) {
    return new BondOffersRequest();
  }

  @java.lang.Override
  public final com.google.protobuf.UnknownFieldSet
  getUnknownFields() {
    return this.unknownFields;
  }
  private BondOffersRequest(
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
          case 16: {
            if (!((mutable_bitField0_ & 0x00000001) != 0)) {
              idFilters_ = newLongList();
              mutable_bitField0_ |= 0x00000001;
            }
            idFilters_.addLong(input.readInt64());
            break;
          }
          case 18: {
            int length = input.readRawVarint32();
            int limit = input.pushLimit(length);
            if (!((mutable_bitField0_ & 0x00000001) != 0) && input.getBytesUntilLimit() > 0) {
              idFilters_ = newLongList();
              mutable_bitField0_ |= 0x00000001;
            }
            while (input.getBytesUntilLimit() > 0) {
              idFilters_.addLong(input.readInt64());
            }
            input.popLimit(limit);
            break;
          }
          case 24: {

            updateDate_ = input.readInt64();
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
        idFilters_.makeImmutable(); // C
      }
      this.unknownFields = unknownFields.build();
      makeExtensionsImmutable();
    }
  }
  public static final com.google.protobuf.Descriptors.Descriptor
      getDescriptor() {
    return com.bcs.bm.catalog_of_instruments_rudata.client.grpc.GrpcService.internal_static_BondOffersRequest_descriptor;
  }

  @java.lang.Override
  protected com.google.protobuf.GeneratedMessageV3.FieldAccessorTable
      internalGetFieldAccessorTable() {
    return com.bcs.bm.catalog_of_instruments_rudata.client.grpc.GrpcService.internal_static_BondOffersRequest_fieldAccessorTable
        .ensureFieldAccessorsInitialized(
            com.bcs.bm.catalog_of_instruments_rudata.client.grpc.BondOffersRequest.class, com.bcs.bm.catalog_of_instruments_rudata.client.grpc.BondOffersRequest.Builder.class);
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

  public static final int IDFILTERS_FIELD_NUMBER = 2;
  private com.google.protobuf.Internal.LongList idFilters_;
  /**
   * <code>repeated int64 idFilters = 2;</code>
   */
  public java.util.List<java.lang.Long>
      getIdFiltersList() {
    return idFilters_;
  }
  /**
   * <code>repeated int64 idFilters = 2;</code>
   */
  public int getIdFiltersCount() {
    return idFilters_.size();
  }
  /**
   * <code>repeated int64 idFilters = 2;</code>
   */
  public long getIdFilters(int index) {
    return idFilters_.getLong(index);
  }
  private int idFiltersMemoizedSerializedSize = -1;

  public static final int UPDATE_DATE_FIELD_NUMBER = 3;
  private long updateDate_;
  /**
   * <code>int64 update_date = 3;</code>
   */
  public long getUpdateDate() {
    return updateDate_;
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
    getSerializedSize();
    if (!getReqIdBytes().isEmpty()) {
      com.google.protobuf.GeneratedMessageV3.writeString(output, 1, reqId_);
    }
    if (getIdFiltersList().size() > 0) {
      output.writeUInt32NoTag(18);
      output.writeUInt32NoTag(idFiltersMemoizedSerializedSize);
    }
    for (int i = 0; i < idFilters_.size(); i++) {
      output.writeInt64NoTag(idFilters_.getLong(i));
    }
    if (updateDate_ != 0L) {
      output.writeInt64(3, updateDate_);
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
    {
      int dataSize = 0;
      for (int i = 0; i < idFilters_.size(); i++) {
        dataSize += com.google.protobuf.CodedOutputStream
          .computeInt64SizeNoTag(idFilters_.getLong(i));
      }
      size += dataSize;
      if (!getIdFiltersList().isEmpty()) {
        size += 1;
        size += com.google.protobuf.CodedOutputStream
            .computeInt32SizeNoTag(dataSize);
      }
      idFiltersMemoizedSerializedSize = dataSize;
    }
    if (updateDate_ != 0L) {
      size += com.google.protobuf.CodedOutputStream
        .computeInt64Size(3, updateDate_);
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
    if (!(obj instanceof com.bcs.bm.catalog_of_instruments_rudata.client.grpc.BondOffersRequest)) {
      return super.equals(obj);
    }
    com.bcs.bm.catalog_of_instruments_rudata.client.grpc.BondOffersRequest other = (com.bcs.bm.catalog_of_instruments_rudata.client.grpc.BondOffersRequest) obj;

    if (!getReqId()
        .equals(other.getReqId())) return false;
    if (!getIdFiltersList()
        .equals(other.getIdFiltersList())) return false;
    if (getUpdateDate()
        != other.getUpdateDate()) return false;
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
    if (getIdFiltersCount() > 0) {
      hash = (37 * hash) + IDFILTERS_FIELD_NUMBER;
      hash = (53 * hash) + getIdFiltersList().hashCode();
    }
    hash = (37 * hash) + UPDATE_DATE_FIELD_NUMBER;
    hash = (53 * hash) + com.google.protobuf.Internal.hashLong(
        getUpdateDate());
    hash = (29 * hash) + unknownFields.hashCode();
    memoizedHashCode = hash;
    return hash;
  }

  public static com.bcs.bm.catalog_of_instruments_rudata.client.grpc.BondOffersRequest parseFrom(
      java.nio.ByteBuffer data)
      throws com.google.protobuf.InvalidProtocolBufferException {
    return PARSER.parseFrom(data);
  }
  public static com.bcs.bm.catalog_of_instruments_rudata.client.grpc.BondOffersRequest parseFrom(
      java.nio.ByteBuffer data,
      com.google.protobuf.ExtensionRegistryLite extensionRegistry)
      throws com.google.protobuf.InvalidProtocolBufferException {
    return PARSER.parseFrom(data, extensionRegistry);
  }
  public static com.bcs.bm.catalog_of_instruments_rudata.client.grpc.BondOffersRequest parseFrom(
      com.google.protobuf.ByteString data)
      throws com.google.protobuf.InvalidProtocolBufferException {
    return PARSER.parseFrom(data);
  }
  public static com.bcs.bm.catalog_of_instruments_rudata.client.grpc.BondOffersRequest parseFrom(
      com.google.protobuf.ByteString data,
      com.google.protobuf.ExtensionRegistryLite extensionRegistry)
      throws com.google.protobuf.InvalidProtocolBufferException {
    return PARSER.parseFrom(data, extensionRegistry);
  }
  public static com.bcs.bm.catalog_of_instruments_rudata.client.grpc.BondOffersRequest parseFrom(byte[] data)
      throws com.google.protobuf.InvalidProtocolBufferException {
    return PARSER.parseFrom(data);
  }
  public static com.bcs.bm.catalog_of_instruments_rudata.client.grpc.BondOffersRequest parseFrom(
      byte[] data,
      com.google.protobuf.ExtensionRegistryLite extensionRegistry)
      throws com.google.protobuf.InvalidProtocolBufferException {
    return PARSER.parseFrom(data, extensionRegistry);
  }
  public static com.bcs.bm.catalog_of_instruments_rudata.client.grpc.BondOffersRequest parseFrom(java.io.InputStream input)
      throws java.io.IOException {
    return com.google.protobuf.GeneratedMessageV3
        .parseWithIOException(PARSER, input);
  }
  public static com.bcs.bm.catalog_of_instruments_rudata.client.grpc.BondOffersRequest parseFrom(
      java.io.InputStream input,
      com.google.protobuf.ExtensionRegistryLite extensionRegistry)
      throws java.io.IOException {
    return com.google.protobuf.GeneratedMessageV3
        .parseWithIOException(PARSER, input, extensionRegistry);
  }
  public static com.bcs.bm.catalog_of_instruments_rudata.client.grpc.BondOffersRequest parseDelimitedFrom(java.io.InputStream input)
      throws java.io.IOException {
    return com.google.protobuf.GeneratedMessageV3
        .parseDelimitedWithIOException(PARSER, input);
  }
  public static com.bcs.bm.catalog_of_instruments_rudata.client.grpc.BondOffersRequest parseDelimitedFrom(
      java.io.InputStream input,
      com.google.protobuf.ExtensionRegistryLite extensionRegistry)
      throws java.io.IOException {
    return com.google.protobuf.GeneratedMessageV3
        .parseDelimitedWithIOException(PARSER, input, extensionRegistry);
  }
  public static com.bcs.bm.catalog_of_instruments_rudata.client.grpc.BondOffersRequest parseFrom(
      com.google.protobuf.CodedInputStream input)
      throws java.io.IOException {
    return com.google.protobuf.GeneratedMessageV3
        .parseWithIOException(PARSER, input);
  }
  public static com.bcs.bm.catalog_of_instruments_rudata.client.grpc.BondOffersRequest parseFrom(
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
  public static Builder newBuilder(com.bcs.bm.catalog_of_instruments_rudata.client.grpc.BondOffersRequest prototype) {
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
   * Protobuf type {@code BondOffersRequest}
   */
  public static final class Builder extends
      com.google.protobuf.GeneratedMessageV3.Builder<Builder> implements
      // @@protoc_insertion_point(builder_implements:BondOffersRequest)
      com.bcs.bm.catalog_of_instruments_rudata.client.grpc.BondOffersRequestOrBuilder {
    public static final com.google.protobuf.Descriptors.Descriptor
        getDescriptor() {
      return com.bcs.bm.catalog_of_instruments_rudata.client.grpc.GrpcService.internal_static_BondOffersRequest_descriptor;
    }

    @java.lang.Override
    protected com.google.protobuf.GeneratedMessageV3.FieldAccessorTable
        internalGetFieldAccessorTable() {
      return com.bcs.bm.catalog_of_instruments_rudata.client.grpc.GrpcService.internal_static_BondOffersRequest_fieldAccessorTable
          .ensureFieldAccessorsInitialized(
              com.bcs.bm.catalog_of_instruments_rudata.client.grpc.BondOffersRequest.class, com.bcs.bm.catalog_of_instruments_rudata.client.grpc.BondOffersRequest.Builder.class);
    }

    // Construct using com.bcs.bm.catalog_of_instruments_rudata.client.grpc.BondOffersRequest.newBuilder()
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
      }
    }
    @java.lang.Override
    public Builder clear() {
      super.clear();
      reqId_ = "";

      idFilters_ = emptyLongList();
      bitField0_ = (bitField0_ & ~0x00000001);
      updateDate_ = 0L;

      return this;
    }

    @java.lang.Override
    public com.google.protobuf.Descriptors.Descriptor
        getDescriptorForType() {
      return com.bcs.bm.catalog_of_instruments_rudata.client.grpc.GrpcService.internal_static_BondOffersRequest_descriptor;
    }

    @java.lang.Override
    public com.bcs.bm.catalog_of_instruments_rudata.client.grpc.BondOffersRequest getDefaultInstanceForType() {
      return com.bcs.bm.catalog_of_instruments_rudata.client.grpc.BondOffersRequest.getDefaultInstance();
    }

    @java.lang.Override
    public com.bcs.bm.catalog_of_instruments_rudata.client.grpc.BondOffersRequest build() {
      com.bcs.bm.catalog_of_instruments_rudata.client.grpc.BondOffersRequest result = buildPartial();
      if (!result.isInitialized()) {
        throw newUninitializedMessageException(result);
      }
      return result;
    }

    @java.lang.Override
    public com.bcs.bm.catalog_of_instruments_rudata.client.grpc.BondOffersRequest buildPartial() {
      com.bcs.bm.catalog_of_instruments_rudata.client.grpc.BondOffersRequest result = new com.bcs.bm.catalog_of_instruments_rudata.client.grpc.BondOffersRequest(this);
      int from_bitField0_ = bitField0_;
      result.reqId_ = reqId_;
      if (((bitField0_ & 0x00000001) != 0)) {
        idFilters_.makeImmutable();
        bitField0_ = (bitField0_ & ~0x00000001);
      }
      result.idFilters_ = idFilters_;
      result.updateDate_ = updateDate_;
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
      if (other instanceof com.bcs.bm.catalog_of_instruments_rudata.client.grpc.BondOffersRequest) {
        return mergeFrom((com.bcs.bm.catalog_of_instruments_rudata.client.grpc.BondOffersRequest)other);
      } else {
        super.mergeFrom(other);
        return this;
      }
    }

    public Builder mergeFrom(com.bcs.bm.catalog_of_instruments_rudata.client.grpc.BondOffersRequest other) {
      if (other == com.bcs.bm.catalog_of_instruments_rudata.client.grpc.BondOffersRequest.getDefaultInstance()) return this;
      if (!other.getReqId().isEmpty()) {
        reqId_ = other.reqId_;
        onChanged();
      }
      if (!other.idFilters_.isEmpty()) {
        if (idFilters_.isEmpty()) {
          idFilters_ = other.idFilters_;
          bitField0_ = (bitField0_ & ~0x00000001);
        } else {
          ensureIdFiltersIsMutable();
          idFilters_.addAll(other.idFilters_);
        }
        onChanged();
      }
      if (other.getUpdateDate() != 0L) {
        setUpdateDate(other.getUpdateDate());
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
      com.bcs.bm.catalog_of_instruments_rudata.client.grpc.BondOffersRequest parsedMessage = null;
      try {
        parsedMessage = PARSER.parsePartialFrom(input, extensionRegistry);
      } catch (com.google.protobuf.InvalidProtocolBufferException e) {
        parsedMessage = (com.bcs.bm.catalog_of_instruments_rudata.client.grpc.BondOffersRequest) e.getUnfinishedMessage();
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

    private com.google.protobuf.Internal.LongList idFilters_ = emptyLongList();
    private void ensureIdFiltersIsMutable() {
      if (!((bitField0_ & 0x00000001) != 0)) {
        idFilters_ = mutableCopy(idFilters_);
        bitField0_ |= 0x00000001;
       }
    }
    /**
     * <code>repeated int64 idFilters = 2;</code>
     */
    public java.util.List<java.lang.Long>
        getIdFiltersList() {
      return ((bitField0_ & 0x00000001) != 0) ?
               java.util.Collections.unmodifiableList(idFilters_) : idFilters_;
    }
    /**
     * <code>repeated int64 idFilters = 2;</code>
     */
    public int getIdFiltersCount() {
      return idFilters_.size();
    }
    /**
     * <code>repeated int64 idFilters = 2;</code>
     */
    public long getIdFilters(int index) {
      return idFilters_.getLong(index);
    }
    /**
     * <code>repeated int64 idFilters = 2;</code>
     */
    public Builder setIdFilters(
        int index, long value) {
      ensureIdFiltersIsMutable();
      idFilters_.setLong(index, value);
      onChanged();
      return this;
    }
    /**
     * <code>repeated int64 idFilters = 2;</code>
     */
    public Builder addIdFilters(long value) {
      ensureIdFiltersIsMutable();
      idFilters_.addLong(value);
      onChanged();
      return this;
    }
    /**
     * <code>repeated int64 idFilters = 2;</code>
     */
    public Builder addAllIdFilters(
        java.lang.Iterable<? extends java.lang.Long> values) {
      ensureIdFiltersIsMutable();
      com.google.protobuf.AbstractMessageLite.Builder.addAll(
          values, idFilters_);
      onChanged();
      return this;
    }
    /**
     * <code>repeated int64 idFilters = 2;</code>
     */
    public Builder clearIdFilters() {
      idFilters_ = emptyLongList();
      bitField0_ = (bitField0_ & ~0x00000001);
      onChanged();
      return this;
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


    // @@protoc_insertion_point(builder_scope:BondOffersRequest)
  }

  // @@protoc_insertion_point(class_scope:BondOffersRequest)
  private static final com.bcs.bm.catalog_of_instruments_rudata.client.grpc.BondOffersRequest DEFAULT_INSTANCE;
  static {
    DEFAULT_INSTANCE = new com.bcs.bm.catalog_of_instruments_rudata.client.grpc.BondOffersRequest();
  }

  public static com.bcs.bm.catalog_of_instruments_rudata.client.grpc.BondOffersRequest getDefaultInstance() {
    return DEFAULT_INSTANCE;
  }

  private static final com.google.protobuf.Parser<BondOffersRequest>
      PARSER = new com.google.protobuf.AbstractParser<BondOffersRequest>() {
    @java.lang.Override
    public BondOffersRequest parsePartialFrom(
        com.google.protobuf.CodedInputStream input,
        com.google.protobuf.ExtensionRegistryLite extensionRegistry)
        throws com.google.protobuf.InvalidProtocolBufferException {
      return new BondOffersRequest(input, extensionRegistry);
    }
  };

  public static com.google.protobuf.Parser<BondOffersRequest> parser() {
    return PARSER;
  }

  @java.lang.Override
  public com.google.protobuf.Parser<BondOffersRequest> getParserForType() {
    return PARSER;
  }

  @java.lang.Override
  public com.bcs.bm.catalog_of_instruments_rudata.client.grpc.BondOffersRequest getDefaultInstanceForType() {
    return DEFAULT_INSTANCE;
  }

}


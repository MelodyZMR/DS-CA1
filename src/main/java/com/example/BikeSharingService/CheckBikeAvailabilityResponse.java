// Generated by the protocol buffer compiler.  DO NOT EDIT!
// source: BikeSharingService.proto

package com.example.BikeSharingService;

/**
 * Protobuf type {@code BikeSharingService.CheckBikeAvailabilityResponse}
 */
public  final class CheckBikeAvailabilityResponse extends
    com.google.protobuf.GeneratedMessageV3 implements
    // @@protoc_insertion_point(message_implements:BikeSharingService.CheckBikeAvailabilityResponse)
    CheckBikeAvailabilityResponseOrBuilder {
private static final long serialVersionUID = 0L;
  // Use CheckBikeAvailabilityResponse.newBuilder() to construct.
  private CheckBikeAvailabilityResponse(com.google.protobuf.GeneratedMessageV3.Builder<?> builder) {
    super(builder);
  }
  private CheckBikeAvailabilityResponse() {
    availableBikes_ = 0;
  }

  @java.lang.Override
  public final com.google.protobuf.UnknownFieldSet
  getUnknownFields() {
    return this.unknownFields;
  }
  private CheckBikeAvailabilityResponse(
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
          case 8: {

            availableBikes_ = input.readInt32();
            break;
          }
          default: {
            if (!parseUnknownFieldProto3(
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
      this.unknownFields = unknownFields.build();
      makeExtensionsImmutable();
    }
  }
  public static final com.google.protobuf.Descriptors.Descriptor
      getDescriptor() {
    return com.example.BikeSharingService.BikeSharingServiceProto.internal_static_BikeSharingService_CheckBikeAvailabilityResponse_descriptor;
  }

  @java.lang.Override
  protected com.google.protobuf.GeneratedMessageV3.FieldAccessorTable
      internalGetFieldAccessorTable() {
    return com.example.BikeSharingService.BikeSharingServiceProto.internal_static_BikeSharingService_CheckBikeAvailabilityResponse_fieldAccessorTable
        .ensureFieldAccessorsInitialized(
            com.example.BikeSharingService.CheckBikeAvailabilityResponse.class, com.example.BikeSharingService.CheckBikeAvailabilityResponse.Builder.class);
  }

  public static final int AVAILABLE_BIKES_FIELD_NUMBER = 1;
  private int availableBikes_;
  /**
   * <pre>
   * The number of available bikes at the station
   * </pre>
   *
   * <code>int32 available_bikes = 1;</code>
   */
  public int getAvailableBikes() {
    return availableBikes_;
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
    if (availableBikes_ != 0) {
      output.writeInt32(1, availableBikes_);
    }
    unknownFields.writeTo(output);
  }

  @java.lang.Override
  public int getSerializedSize() {
    int size = memoizedSize;
    if (size != -1) return size;

    size = 0;
    if (availableBikes_ != 0) {
      size += com.google.protobuf.CodedOutputStream
        .computeInt32Size(1, availableBikes_);
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
    if (!(obj instanceof com.example.BikeSharingService.CheckBikeAvailabilityResponse)) {
      return super.equals(obj);
    }
    com.example.BikeSharingService.CheckBikeAvailabilityResponse other = (com.example.BikeSharingService.CheckBikeAvailabilityResponse) obj;

    boolean result = true;
    result = result && (getAvailableBikes()
        == other.getAvailableBikes());
    result = result && unknownFields.equals(other.unknownFields);
    return result;
  }

  @java.lang.Override
  public int hashCode() {
    if (memoizedHashCode != 0) {
      return memoizedHashCode;
    }
    int hash = 41;
    hash = (19 * hash) + getDescriptor().hashCode();
    hash = (37 * hash) + AVAILABLE_BIKES_FIELD_NUMBER;
    hash = (53 * hash) + getAvailableBikes();
    hash = (29 * hash) + unknownFields.hashCode();
    memoizedHashCode = hash;
    return hash;
  }

  public static com.example.BikeSharingService.CheckBikeAvailabilityResponse parseFrom(
      java.nio.ByteBuffer data)
      throws com.google.protobuf.InvalidProtocolBufferException {
    return PARSER.parseFrom(data);
  }
  public static com.example.BikeSharingService.CheckBikeAvailabilityResponse parseFrom(
      java.nio.ByteBuffer data,
      com.google.protobuf.ExtensionRegistryLite extensionRegistry)
      throws com.google.protobuf.InvalidProtocolBufferException {
    return PARSER.parseFrom(data, extensionRegistry);
  }
  public static com.example.BikeSharingService.CheckBikeAvailabilityResponse parseFrom(
      com.google.protobuf.ByteString data)
      throws com.google.protobuf.InvalidProtocolBufferException {
    return PARSER.parseFrom(data);
  }
  public static com.example.BikeSharingService.CheckBikeAvailabilityResponse parseFrom(
      com.google.protobuf.ByteString data,
      com.google.protobuf.ExtensionRegistryLite extensionRegistry)
      throws com.google.protobuf.InvalidProtocolBufferException {
    return PARSER.parseFrom(data, extensionRegistry);
  }
  public static com.example.BikeSharingService.CheckBikeAvailabilityResponse parseFrom(byte[] data)
      throws com.google.protobuf.InvalidProtocolBufferException {
    return PARSER.parseFrom(data);
  }
  public static com.example.BikeSharingService.CheckBikeAvailabilityResponse parseFrom(
      byte[] data,
      com.google.protobuf.ExtensionRegistryLite extensionRegistry)
      throws com.google.protobuf.InvalidProtocolBufferException {
    return PARSER.parseFrom(data, extensionRegistry);
  }
  public static com.example.BikeSharingService.CheckBikeAvailabilityResponse parseFrom(java.io.InputStream input)
      throws java.io.IOException {
    return com.google.protobuf.GeneratedMessageV3
        .parseWithIOException(PARSER, input);
  }
  public static com.example.BikeSharingService.CheckBikeAvailabilityResponse parseFrom(
      java.io.InputStream input,
      com.google.protobuf.ExtensionRegistryLite extensionRegistry)
      throws java.io.IOException {
    return com.google.protobuf.GeneratedMessageV3
        .parseWithIOException(PARSER, input, extensionRegistry);
  }
  public static com.example.BikeSharingService.CheckBikeAvailabilityResponse parseDelimitedFrom(java.io.InputStream input)
      throws java.io.IOException {
    return com.google.protobuf.GeneratedMessageV3
        .parseDelimitedWithIOException(PARSER, input);
  }
  public static com.example.BikeSharingService.CheckBikeAvailabilityResponse parseDelimitedFrom(
      java.io.InputStream input,
      com.google.protobuf.ExtensionRegistryLite extensionRegistry)
      throws java.io.IOException {
    return com.google.protobuf.GeneratedMessageV3
        .parseDelimitedWithIOException(PARSER, input, extensionRegistry);
  }
  public static com.example.BikeSharingService.CheckBikeAvailabilityResponse parseFrom(
      com.google.protobuf.CodedInputStream input)
      throws java.io.IOException {
    return com.google.protobuf.GeneratedMessageV3
        .parseWithIOException(PARSER, input);
  }
  public static com.example.BikeSharingService.CheckBikeAvailabilityResponse parseFrom(
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
  public static Builder newBuilder(com.example.BikeSharingService.CheckBikeAvailabilityResponse prototype) {
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
   * Protobuf type {@code BikeSharingService.CheckBikeAvailabilityResponse}
   */
  public static final class Builder extends
      com.google.protobuf.GeneratedMessageV3.Builder<Builder> implements
      // @@protoc_insertion_point(builder_implements:BikeSharingService.CheckBikeAvailabilityResponse)
      com.example.BikeSharingService.CheckBikeAvailabilityResponseOrBuilder {
    public static final com.google.protobuf.Descriptors.Descriptor
        getDescriptor() {
      return com.example.BikeSharingService.BikeSharingServiceProto.internal_static_BikeSharingService_CheckBikeAvailabilityResponse_descriptor;
    }

    @java.lang.Override
    protected com.google.protobuf.GeneratedMessageV3.FieldAccessorTable
        internalGetFieldAccessorTable() {
      return com.example.BikeSharingService.BikeSharingServiceProto.internal_static_BikeSharingService_CheckBikeAvailabilityResponse_fieldAccessorTable
          .ensureFieldAccessorsInitialized(
              com.example.BikeSharingService.CheckBikeAvailabilityResponse.class, com.example.BikeSharingService.CheckBikeAvailabilityResponse.Builder.class);
    }

    // Construct using com.example.BikeSharingService.CheckBikeAvailabilityResponse.newBuilder()
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
      availableBikes_ = 0;

      return this;
    }

    @java.lang.Override
    public com.google.protobuf.Descriptors.Descriptor
        getDescriptorForType() {
      return com.example.BikeSharingService.BikeSharingServiceProto.internal_static_BikeSharingService_CheckBikeAvailabilityResponse_descriptor;
    }

    @java.lang.Override
    public com.example.BikeSharingService.CheckBikeAvailabilityResponse getDefaultInstanceForType() {
      return com.example.BikeSharingService.CheckBikeAvailabilityResponse.getDefaultInstance();
    }

    @java.lang.Override
    public com.example.BikeSharingService.CheckBikeAvailabilityResponse build() {
      com.example.BikeSharingService.CheckBikeAvailabilityResponse result = buildPartial();
      if (!result.isInitialized()) {
        throw newUninitializedMessageException(result);
      }
      return result;
    }

    @java.lang.Override
    public com.example.BikeSharingService.CheckBikeAvailabilityResponse buildPartial() {
      com.example.BikeSharingService.CheckBikeAvailabilityResponse result = new com.example.BikeSharingService.CheckBikeAvailabilityResponse(this);
      result.availableBikes_ = availableBikes_;
      onBuilt();
      return result;
    }

    @java.lang.Override
    public Builder clone() {
      return (Builder) super.clone();
    }
    @java.lang.Override
    public Builder setField(
        com.google.protobuf.Descriptors.FieldDescriptor field,
        java.lang.Object value) {
      return (Builder) super.setField(field, value);
    }
    @java.lang.Override
    public Builder clearField(
        com.google.protobuf.Descriptors.FieldDescriptor field) {
      return (Builder) super.clearField(field);
    }
    @java.lang.Override
    public Builder clearOneof(
        com.google.protobuf.Descriptors.OneofDescriptor oneof) {
      return (Builder) super.clearOneof(oneof);
    }
    @java.lang.Override
    public Builder setRepeatedField(
        com.google.protobuf.Descriptors.FieldDescriptor field,
        int index, java.lang.Object value) {
      return (Builder) super.setRepeatedField(field, index, value);
    }
    @java.lang.Override
    public Builder addRepeatedField(
        com.google.protobuf.Descriptors.FieldDescriptor field,
        java.lang.Object value) {
      return (Builder) super.addRepeatedField(field, value);
    }
    @java.lang.Override
    public Builder mergeFrom(com.google.protobuf.Message other) {
      if (other instanceof com.example.BikeSharingService.CheckBikeAvailabilityResponse) {
        return mergeFrom((com.example.BikeSharingService.CheckBikeAvailabilityResponse)other);
      } else {
        super.mergeFrom(other);
        return this;
      }
    }

    public Builder mergeFrom(com.example.BikeSharingService.CheckBikeAvailabilityResponse other) {
      if (other == com.example.BikeSharingService.CheckBikeAvailabilityResponse.getDefaultInstance()) return this;
      if (other.getAvailableBikes() != 0) {
        setAvailableBikes(other.getAvailableBikes());
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
      com.example.BikeSharingService.CheckBikeAvailabilityResponse parsedMessage = null;
      try {
        parsedMessage = PARSER.parsePartialFrom(input, extensionRegistry);
      } catch (com.google.protobuf.InvalidProtocolBufferException e) {
        parsedMessage = (com.example.BikeSharingService.CheckBikeAvailabilityResponse) e.getUnfinishedMessage();
        throw e.unwrapIOException();
      } finally {
        if (parsedMessage != null) {
          mergeFrom(parsedMessage);
        }
      }
      return this;
    }

    private int availableBikes_ ;
    /**
     * <pre>
     * The number of available bikes at the station
     * </pre>
     *
     * <code>int32 available_bikes = 1;</code>
     */
    public int getAvailableBikes() {
      return availableBikes_;
    }
    /**
     * <pre>
     * The number of available bikes at the station
     * </pre>
     *
     * <code>int32 available_bikes = 1;</code>
     */
    public Builder setAvailableBikes(int value) {
      
      availableBikes_ = value;
      onChanged();
      return this;
    }
    /**
     * <pre>
     * The number of available bikes at the station
     * </pre>
     *
     * <code>int32 available_bikes = 1;</code>
     */
    public Builder clearAvailableBikes() {
      
      availableBikes_ = 0;
      onChanged();
      return this;
    }
    @java.lang.Override
    public final Builder setUnknownFields(
        final com.google.protobuf.UnknownFieldSet unknownFields) {
      return super.setUnknownFieldsProto3(unknownFields);
    }

    @java.lang.Override
    public final Builder mergeUnknownFields(
        final com.google.protobuf.UnknownFieldSet unknownFields) {
      return super.mergeUnknownFields(unknownFields);
    }


    // @@protoc_insertion_point(builder_scope:BikeSharingService.CheckBikeAvailabilityResponse)
  }

  // @@protoc_insertion_point(class_scope:BikeSharingService.CheckBikeAvailabilityResponse)
  private static final com.example.BikeSharingService.CheckBikeAvailabilityResponse DEFAULT_INSTANCE;
  static {
    DEFAULT_INSTANCE = new com.example.BikeSharingService.CheckBikeAvailabilityResponse();
  }

  public static com.example.BikeSharingService.CheckBikeAvailabilityResponse getDefaultInstance() {
    return DEFAULT_INSTANCE;
  }

  private static final com.google.protobuf.Parser<CheckBikeAvailabilityResponse>
      PARSER = new com.google.protobuf.AbstractParser<CheckBikeAvailabilityResponse>() {
    @java.lang.Override
    public CheckBikeAvailabilityResponse parsePartialFrom(
        com.google.protobuf.CodedInputStream input,
        com.google.protobuf.ExtensionRegistryLite extensionRegistry)
        throws com.google.protobuf.InvalidProtocolBufferException {
      return new CheckBikeAvailabilityResponse(input, extensionRegistry);
    }
  };

  public static com.google.protobuf.Parser<CheckBikeAvailabilityResponse> parser() {
    return PARSER;
  }

  @java.lang.Override
  public com.google.protobuf.Parser<CheckBikeAvailabilityResponse> getParserForType() {
    return PARSER;
  }

  @java.lang.Override
  public com.example.BikeSharingService.CheckBikeAvailabilityResponse getDefaultInstanceForType() {
    return DEFAULT_INSTANCE;
  }

}


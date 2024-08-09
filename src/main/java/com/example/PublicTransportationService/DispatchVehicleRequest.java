// Generated by the protocol buffer compiler.  DO NOT EDIT!
// source: PublicTransportationService.proto

package com.example.PublicTransportationService;

/**
 * <pre>
 *Server Streaming RPC
 * </pre>
 *
 * Protobuf type {@code PublicTransportationService.DispatchVehicleRequest}
 */
public  final class DispatchVehicleRequest extends
    com.google.protobuf.GeneratedMessageV3 implements
    // @@protoc_insertion_point(message_implements:PublicTransportationService.DispatchVehicleRequest)
    DispatchVehicleRequestOrBuilder {
private static final long serialVersionUID = 0L;
  // Use DispatchVehicleRequest.newBuilder() to construct.
  private DispatchVehicleRequest(com.google.protobuf.GeneratedMessageV3.Builder<?> builder) {
    super(builder);
  }
  private DispatchVehicleRequest() {
    vehicleType_ = "";
    destinationLocation_ = "";
  }

  @java.lang.Override
  public final com.google.protobuf.UnknownFieldSet
  getUnknownFields() {
    return this.unknownFields;
  }
  private DispatchVehicleRequest(
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

            vehicleType_ = s;
            break;
          }
          case 18: {
            java.lang.String s = input.readStringRequireUtf8();

            destinationLocation_ = s;
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
    return com.example.PublicTransportationService.TransitProto.internal_static_PublicTransportationService_DispatchVehicleRequest_descriptor;
  }

  @java.lang.Override
  protected com.google.protobuf.GeneratedMessageV3.FieldAccessorTable
      internalGetFieldAccessorTable() {
    return com.example.PublicTransportationService.TransitProto.internal_static_PublicTransportationService_DispatchVehicleRequest_fieldAccessorTable
        .ensureFieldAccessorsInitialized(
            com.example.PublicTransportationService.DispatchVehicleRequest.class, com.example.PublicTransportationService.DispatchVehicleRequest.Builder.class);
  }

  public static final int VEHICLE_TYPE_FIELD_NUMBER = 1;
  private volatile java.lang.Object vehicleType_;
  /**
   * <code>string vehicle_type = 1;</code>
   */
  public java.lang.String getVehicleType() {
    java.lang.Object ref = vehicleType_;
    if (ref instanceof java.lang.String) {
      return (java.lang.String) ref;
    } else {
      com.google.protobuf.ByteString bs = 
          (com.google.protobuf.ByteString) ref;
      java.lang.String s = bs.toStringUtf8();
      vehicleType_ = s;
      return s;
    }
  }
  /**
   * <code>string vehicle_type = 1;</code>
   */
  public com.google.protobuf.ByteString
      getVehicleTypeBytes() {
    java.lang.Object ref = vehicleType_;
    if (ref instanceof java.lang.String) {
      com.google.protobuf.ByteString b = 
          com.google.protobuf.ByteString.copyFromUtf8(
              (java.lang.String) ref);
      vehicleType_ = b;
      return b;
    } else {
      return (com.google.protobuf.ByteString) ref;
    }
  }

  public static final int DESTINATION_LOCATION_FIELD_NUMBER = 2;
  private volatile java.lang.Object destinationLocation_;
  /**
   * <code>string destination_location = 2;</code>
   */
  public java.lang.String getDestinationLocation() {
    java.lang.Object ref = destinationLocation_;
    if (ref instanceof java.lang.String) {
      return (java.lang.String) ref;
    } else {
      com.google.protobuf.ByteString bs = 
          (com.google.protobuf.ByteString) ref;
      java.lang.String s = bs.toStringUtf8();
      destinationLocation_ = s;
      return s;
    }
  }
  /**
   * <code>string destination_location = 2;</code>
   */
  public com.google.protobuf.ByteString
      getDestinationLocationBytes() {
    java.lang.Object ref = destinationLocation_;
    if (ref instanceof java.lang.String) {
      com.google.protobuf.ByteString b = 
          com.google.protobuf.ByteString.copyFromUtf8(
              (java.lang.String) ref);
      destinationLocation_ = b;
      return b;
    } else {
      return (com.google.protobuf.ByteString) ref;
    }
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
    if (!getVehicleTypeBytes().isEmpty()) {
      com.google.protobuf.GeneratedMessageV3.writeString(output, 1, vehicleType_);
    }
    if (!getDestinationLocationBytes().isEmpty()) {
      com.google.protobuf.GeneratedMessageV3.writeString(output, 2, destinationLocation_);
    }
    unknownFields.writeTo(output);
  }

  @java.lang.Override
  public int getSerializedSize() {
    int size = memoizedSize;
    if (size != -1) return size;

    size = 0;
    if (!getVehicleTypeBytes().isEmpty()) {
      size += com.google.protobuf.GeneratedMessageV3.computeStringSize(1, vehicleType_);
    }
    if (!getDestinationLocationBytes().isEmpty()) {
      size += com.google.protobuf.GeneratedMessageV3.computeStringSize(2, destinationLocation_);
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
    if (!(obj instanceof com.example.PublicTransportationService.DispatchVehicleRequest)) {
      return super.equals(obj);
    }
    com.example.PublicTransportationService.DispatchVehicleRequest other = (com.example.PublicTransportationService.DispatchVehicleRequest) obj;

    boolean result = true;
    result = result && getVehicleType()
        .equals(other.getVehicleType());
    result = result && getDestinationLocation()
        .equals(other.getDestinationLocation());
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
    hash = (37 * hash) + VEHICLE_TYPE_FIELD_NUMBER;
    hash = (53 * hash) + getVehicleType().hashCode();
    hash = (37 * hash) + DESTINATION_LOCATION_FIELD_NUMBER;
    hash = (53 * hash) + getDestinationLocation().hashCode();
    hash = (29 * hash) + unknownFields.hashCode();
    memoizedHashCode = hash;
    return hash;
  }

  public static com.example.PublicTransportationService.DispatchVehicleRequest parseFrom(
      java.nio.ByteBuffer data)
      throws com.google.protobuf.InvalidProtocolBufferException {
    return PARSER.parseFrom(data);
  }
  public static com.example.PublicTransportationService.DispatchVehicleRequest parseFrom(
      java.nio.ByteBuffer data,
      com.google.protobuf.ExtensionRegistryLite extensionRegistry)
      throws com.google.protobuf.InvalidProtocolBufferException {
    return PARSER.parseFrom(data, extensionRegistry);
  }
  public static com.example.PublicTransportationService.DispatchVehicleRequest parseFrom(
      com.google.protobuf.ByteString data)
      throws com.google.protobuf.InvalidProtocolBufferException {
    return PARSER.parseFrom(data);
  }
  public static com.example.PublicTransportationService.DispatchVehicleRequest parseFrom(
      com.google.protobuf.ByteString data,
      com.google.protobuf.ExtensionRegistryLite extensionRegistry)
      throws com.google.protobuf.InvalidProtocolBufferException {
    return PARSER.parseFrom(data, extensionRegistry);
  }
  public static com.example.PublicTransportationService.DispatchVehicleRequest parseFrom(byte[] data)
      throws com.google.protobuf.InvalidProtocolBufferException {
    return PARSER.parseFrom(data);
  }
  public static com.example.PublicTransportationService.DispatchVehicleRequest parseFrom(
      byte[] data,
      com.google.protobuf.ExtensionRegistryLite extensionRegistry)
      throws com.google.protobuf.InvalidProtocolBufferException {
    return PARSER.parseFrom(data, extensionRegistry);
  }
  public static com.example.PublicTransportationService.DispatchVehicleRequest parseFrom(java.io.InputStream input)
      throws java.io.IOException {
    return com.google.protobuf.GeneratedMessageV3
        .parseWithIOException(PARSER, input);
  }
  public static com.example.PublicTransportationService.DispatchVehicleRequest parseFrom(
      java.io.InputStream input,
      com.google.protobuf.ExtensionRegistryLite extensionRegistry)
      throws java.io.IOException {
    return com.google.protobuf.GeneratedMessageV3
        .parseWithIOException(PARSER, input, extensionRegistry);
  }
  public static com.example.PublicTransportationService.DispatchVehicleRequest parseDelimitedFrom(java.io.InputStream input)
      throws java.io.IOException {
    return com.google.protobuf.GeneratedMessageV3
        .parseDelimitedWithIOException(PARSER, input);
  }
  public static com.example.PublicTransportationService.DispatchVehicleRequest parseDelimitedFrom(
      java.io.InputStream input,
      com.google.protobuf.ExtensionRegistryLite extensionRegistry)
      throws java.io.IOException {
    return com.google.protobuf.GeneratedMessageV3
        .parseDelimitedWithIOException(PARSER, input, extensionRegistry);
  }
  public static com.example.PublicTransportationService.DispatchVehicleRequest parseFrom(
      com.google.protobuf.CodedInputStream input)
      throws java.io.IOException {
    return com.google.protobuf.GeneratedMessageV3
        .parseWithIOException(PARSER, input);
  }
  public static com.example.PublicTransportationService.DispatchVehicleRequest parseFrom(
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
  public static Builder newBuilder(com.example.PublicTransportationService.DispatchVehicleRequest prototype) {
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
   * <pre>
   *Server Streaming RPC
   * </pre>
   *
   * Protobuf type {@code PublicTransportationService.DispatchVehicleRequest}
   */
  public static final class Builder extends
      com.google.protobuf.GeneratedMessageV3.Builder<Builder> implements
      // @@protoc_insertion_point(builder_implements:PublicTransportationService.DispatchVehicleRequest)
      com.example.PublicTransportationService.DispatchVehicleRequestOrBuilder {
    public static final com.google.protobuf.Descriptors.Descriptor
        getDescriptor() {
      return com.example.PublicTransportationService.TransitProto.internal_static_PublicTransportationService_DispatchVehicleRequest_descriptor;
    }

    @java.lang.Override
    protected com.google.protobuf.GeneratedMessageV3.FieldAccessorTable
        internalGetFieldAccessorTable() {
      return com.example.PublicTransportationService.TransitProto.internal_static_PublicTransportationService_DispatchVehicleRequest_fieldAccessorTable
          .ensureFieldAccessorsInitialized(
              com.example.PublicTransportationService.DispatchVehicleRequest.class, com.example.PublicTransportationService.DispatchVehicleRequest.Builder.class);
    }

    // Construct using com.example.PublicTransportationService.DispatchVehicleRequest.newBuilder()
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
      vehicleType_ = "";

      destinationLocation_ = "";

      return this;
    }

    @java.lang.Override
    public com.google.protobuf.Descriptors.Descriptor
        getDescriptorForType() {
      return com.example.PublicTransportationService.TransitProto.internal_static_PublicTransportationService_DispatchVehicleRequest_descriptor;
    }

    @java.lang.Override
    public com.example.PublicTransportationService.DispatchVehicleRequest getDefaultInstanceForType() {
      return com.example.PublicTransportationService.DispatchVehicleRequest.getDefaultInstance();
    }

    @java.lang.Override
    public com.example.PublicTransportationService.DispatchVehicleRequest build() {
      com.example.PublicTransportationService.DispatchVehicleRequest result = buildPartial();
      if (!result.isInitialized()) {
        throw newUninitializedMessageException(result);
      }
      return result;
    }

    @java.lang.Override
    public com.example.PublicTransportationService.DispatchVehicleRequest buildPartial() {
      com.example.PublicTransportationService.DispatchVehicleRequest result = new com.example.PublicTransportationService.DispatchVehicleRequest(this);
      result.vehicleType_ = vehicleType_;
      result.destinationLocation_ = destinationLocation_;
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
      if (other instanceof com.example.PublicTransportationService.DispatchVehicleRequest) {
        return mergeFrom((com.example.PublicTransportationService.DispatchVehicleRequest)other);
      } else {
        super.mergeFrom(other);
        return this;
      }
    }

    public Builder mergeFrom(com.example.PublicTransportationService.DispatchVehicleRequest other) {
      if (other == com.example.PublicTransportationService.DispatchVehicleRequest.getDefaultInstance()) return this;
      if (!other.getVehicleType().isEmpty()) {
        vehicleType_ = other.vehicleType_;
        onChanged();
      }
      if (!other.getDestinationLocation().isEmpty()) {
        destinationLocation_ = other.destinationLocation_;
        onChanged();
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
      com.example.PublicTransportationService.DispatchVehicleRequest parsedMessage = null;
      try {
        parsedMessage = PARSER.parsePartialFrom(input, extensionRegistry);
      } catch (com.google.protobuf.InvalidProtocolBufferException e) {
        parsedMessage = (com.example.PublicTransportationService.DispatchVehicleRequest) e.getUnfinishedMessage();
        throw e.unwrapIOException();
      } finally {
        if (parsedMessage != null) {
          mergeFrom(parsedMessage);
        }
      }
      return this;
    }

    private java.lang.Object vehicleType_ = "";
    /**
     * <code>string vehicle_type = 1;</code>
     */
    public java.lang.String getVehicleType() {
      java.lang.Object ref = vehicleType_;
      if (!(ref instanceof java.lang.String)) {
        com.google.protobuf.ByteString bs =
            (com.google.protobuf.ByteString) ref;
        java.lang.String s = bs.toStringUtf8();
        vehicleType_ = s;
        return s;
      } else {
        return (java.lang.String) ref;
      }
    }
    /**
     * <code>string vehicle_type = 1;</code>
     */
    public com.google.protobuf.ByteString
        getVehicleTypeBytes() {
      java.lang.Object ref = vehicleType_;
      if (ref instanceof String) {
        com.google.protobuf.ByteString b = 
            com.google.protobuf.ByteString.copyFromUtf8(
                (java.lang.String) ref);
        vehicleType_ = b;
        return b;
      } else {
        return (com.google.protobuf.ByteString) ref;
      }
    }
    /**
     * <code>string vehicle_type = 1;</code>
     */
    public Builder setVehicleType(
        java.lang.String value) {
      if (value == null) {
    throw new NullPointerException();
  }
  
      vehicleType_ = value;
      onChanged();
      return this;
    }
    /**
     * <code>string vehicle_type = 1;</code>
     */
    public Builder clearVehicleType() {
      
      vehicleType_ = getDefaultInstance().getVehicleType();
      onChanged();
      return this;
    }
    /**
     * <code>string vehicle_type = 1;</code>
     */
    public Builder setVehicleTypeBytes(
        com.google.protobuf.ByteString value) {
      if (value == null) {
    throw new NullPointerException();
  }
  checkByteStringIsUtf8(value);
      
      vehicleType_ = value;
      onChanged();
      return this;
    }

    private java.lang.Object destinationLocation_ = "";
    /**
     * <code>string destination_location = 2;</code>
     */
    public java.lang.String getDestinationLocation() {
      java.lang.Object ref = destinationLocation_;
      if (!(ref instanceof java.lang.String)) {
        com.google.protobuf.ByteString bs =
            (com.google.protobuf.ByteString) ref;
        java.lang.String s = bs.toStringUtf8();
        destinationLocation_ = s;
        return s;
      } else {
        return (java.lang.String) ref;
      }
    }
    /**
     * <code>string destination_location = 2;</code>
     */
    public com.google.protobuf.ByteString
        getDestinationLocationBytes() {
      java.lang.Object ref = destinationLocation_;
      if (ref instanceof String) {
        com.google.protobuf.ByteString b = 
            com.google.protobuf.ByteString.copyFromUtf8(
                (java.lang.String) ref);
        destinationLocation_ = b;
        return b;
      } else {
        return (com.google.protobuf.ByteString) ref;
      }
    }
    /**
     * <code>string destination_location = 2;</code>
     */
    public Builder setDestinationLocation(
        java.lang.String value) {
      if (value == null) {
    throw new NullPointerException();
  }
  
      destinationLocation_ = value;
      onChanged();
      return this;
    }
    /**
     * <code>string destination_location = 2;</code>
     */
    public Builder clearDestinationLocation() {
      
      destinationLocation_ = getDefaultInstance().getDestinationLocation();
      onChanged();
      return this;
    }
    /**
     * <code>string destination_location = 2;</code>
     */
    public Builder setDestinationLocationBytes(
        com.google.protobuf.ByteString value) {
      if (value == null) {
    throw new NullPointerException();
  }
  checkByteStringIsUtf8(value);
      
      destinationLocation_ = value;
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


    // @@protoc_insertion_point(builder_scope:PublicTransportationService.DispatchVehicleRequest)
  }

  // @@protoc_insertion_point(class_scope:PublicTransportationService.DispatchVehicleRequest)
  private static final com.example.PublicTransportationService.DispatchVehicleRequest DEFAULT_INSTANCE;
  static {
    DEFAULT_INSTANCE = new com.example.PublicTransportationService.DispatchVehicleRequest();
  }

  public static com.example.PublicTransportationService.DispatchVehicleRequest getDefaultInstance() {
    return DEFAULT_INSTANCE;
  }

  private static final com.google.protobuf.Parser<DispatchVehicleRequest>
      PARSER = new com.google.protobuf.AbstractParser<DispatchVehicleRequest>() {
    @java.lang.Override
    public DispatchVehicleRequest parsePartialFrom(
        com.google.protobuf.CodedInputStream input,
        com.google.protobuf.ExtensionRegistryLite extensionRegistry)
        throws com.google.protobuf.InvalidProtocolBufferException {
      return new DispatchVehicleRequest(input, extensionRegistry);
    }
  };

  public static com.google.protobuf.Parser<DispatchVehicleRequest> parser() {
    return PARSER;
  }

  @java.lang.Override
  public com.google.protobuf.Parser<DispatchVehicleRequest> getParserForType() {
    return PARSER;
  }

  @java.lang.Override
  public com.example.PublicTransportationService.DispatchVehicleRequest getDefaultInstanceForType() {
    return DEFAULT_INSTANCE;
  }

}


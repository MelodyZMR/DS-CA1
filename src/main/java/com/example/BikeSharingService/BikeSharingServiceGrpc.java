package com.example.BikeSharingService;

import static io.grpc.MethodDescriptor.generateFullMethodName;
import static io.grpc.stub.ClientCalls.asyncBidiStreamingCall;
import static io.grpc.stub.ClientCalls.asyncClientStreamingCall;
import static io.grpc.stub.ClientCalls.asyncServerStreamingCall;
import static io.grpc.stub.ClientCalls.asyncUnaryCall;
import static io.grpc.stub.ClientCalls.blockingServerStreamingCall;
import static io.grpc.stub.ClientCalls.blockingUnaryCall;
import static io.grpc.stub.ClientCalls.futureUnaryCall;
import static io.grpc.stub.ServerCalls.asyncBidiStreamingCall;
import static io.grpc.stub.ServerCalls.asyncClientStreamingCall;
import static io.grpc.stub.ServerCalls.asyncServerStreamingCall;
import static io.grpc.stub.ServerCalls.asyncUnaryCall;
import static io.grpc.stub.ServerCalls.asyncUnimplementedStreamingCall;
import static io.grpc.stub.ServerCalls.asyncUnimplementedUnaryCall;

/**
 * <pre>
 * Interface exported by the server.
 * </pre>
 */
@javax.annotation.Generated(
    value = "by gRPC proto compiler (version 1.15.0)",
    comments = "Source: BikeSharingService.proto")
public final class BikeSharingServiceGrpc {

  private BikeSharingServiceGrpc() {}

  public static final String SERVICE_NAME = "BikeSharingService.BikeSharingService";

  // Static method descriptors that strictly reflect the proto.
  private static volatile io.grpc.MethodDescriptor<com.example.BikeSharingService.CheckBikeAvailabilityRequest,
      com.example.BikeSharingService.CheckBikeAvailabilityResponse> getCheckBikeAvailabilityMethod;

  @io.grpc.stub.annotations.RpcMethod(
      fullMethodName = SERVICE_NAME + '/' + "CheckBikeAvailability",
      requestType = com.example.BikeSharingService.CheckBikeAvailabilityRequest.class,
      responseType = com.example.BikeSharingService.CheckBikeAvailabilityResponse.class,
      methodType = io.grpc.MethodDescriptor.MethodType.UNARY)
  public static io.grpc.MethodDescriptor<com.example.BikeSharingService.CheckBikeAvailabilityRequest,
      com.example.BikeSharingService.CheckBikeAvailabilityResponse> getCheckBikeAvailabilityMethod() {
    io.grpc.MethodDescriptor<com.example.BikeSharingService.CheckBikeAvailabilityRequest, com.example.BikeSharingService.CheckBikeAvailabilityResponse> getCheckBikeAvailabilityMethod;
    if ((getCheckBikeAvailabilityMethod = BikeSharingServiceGrpc.getCheckBikeAvailabilityMethod) == null) {
      synchronized (BikeSharingServiceGrpc.class) {
        if ((getCheckBikeAvailabilityMethod = BikeSharingServiceGrpc.getCheckBikeAvailabilityMethod) == null) {
          BikeSharingServiceGrpc.getCheckBikeAvailabilityMethod = getCheckBikeAvailabilityMethod = 
              io.grpc.MethodDescriptor.<com.example.BikeSharingService.CheckBikeAvailabilityRequest, com.example.BikeSharingService.CheckBikeAvailabilityResponse>newBuilder()
              .setType(io.grpc.MethodDescriptor.MethodType.UNARY)
              .setFullMethodName(generateFullMethodName(
                  "BikeSharingService.BikeSharingService", "CheckBikeAvailability"))
              .setSampledToLocalTracing(true)
              .setRequestMarshaller(io.grpc.protobuf.ProtoUtils.marshaller(
                  com.example.BikeSharingService.CheckBikeAvailabilityRequest.getDefaultInstance()))
              .setResponseMarshaller(io.grpc.protobuf.ProtoUtils.marshaller(
                  com.example.BikeSharingService.CheckBikeAvailabilityResponse.getDefaultInstance()))
                  .setSchemaDescriptor(new BikeSharingServiceMethodDescriptorSupplier("CheckBikeAvailability"))
                  .build();
          }
        }
     }
     return getCheckBikeAvailabilityMethod;
  }

  private static volatile io.grpc.MethodDescriptor<com.example.BikeSharingService.ReserveAndUnlockBikeRequest,
      com.example.BikeSharingService.ReserveAndUnlockBikeResponse> getReserveAndUnlockBikeMethod;

  @io.grpc.stub.annotations.RpcMethod(
      fullMethodName = SERVICE_NAME + '/' + "ReserveAndUnlockBike",
      requestType = com.example.BikeSharingService.ReserveAndUnlockBikeRequest.class,
      responseType = com.example.BikeSharingService.ReserveAndUnlockBikeResponse.class,
      methodType = io.grpc.MethodDescriptor.MethodType.BIDI_STREAMING)
  public static io.grpc.MethodDescriptor<com.example.BikeSharingService.ReserveAndUnlockBikeRequest,
      com.example.BikeSharingService.ReserveAndUnlockBikeResponse> getReserveAndUnlockBikeMethod() {
    io.grpc.MethodDescriptor<com.example.BikeSharingService.ReserveAndUnlockBikeRequest, com.example.BikeSharingService.ReserveAndUnlockBikeResponse> getReserveAndUnlockBikeMethod;
    if ((getReserveAndUnlockBikeMethod = BikeSharingServiceGrpc.getReserveAndUnlockBikeMethod) == null) {
      synchronized (BikeSharingServiceGrpc.class) {
        if ((getReserveAndUnlockBikeMethod = BikeSharingServiceGrpc.getReserveAndUnlockBikeMethod) == null) {
          BikeSharingServiceGrpc.getReserveAndUnlockBikeMethod = getReserveAndUnlockBikeMethod = 
              io.grpc.MethodDescriptor.<com.example.BikeSharingService.ReserveAndUnlockBikeRequest, com.example.BikeSharingService.ReserveAndUnlockBikeResponse>newBuilder()
              .setType(io.grpc.MethodDescriptor.MethodType.BIDI_STREAMING)
              .setFullMethodName(generateFullMethodName(
                  "BikeSharingService.BikeSharingService", "ReserveAndUnlockBike"))
              .setSampledToLocalTracing(true)
              .setRequestMarshaller(io.grpc.protobuf.ProtoUtils.marshaller(
                  com.example.BikeSharingService.ReserveAndUnlockBikeRequest.getDefaultInstance()))
              .setResponseMarshaller(io.grpc.protobuf.ProtoUtils.marshaller(
                  com.example.BikeSharingService.ReserveAndUnlockBikeResponse.getDefaultInstance()))
                  .setSchemaDescriptor(new BikeSharingServiceMethodDescriptorSupplier("ReserveAndUnlockBike"))
                  .build();
          }
        }
     }
     return getReserveAndUnlockBikeMethod;
  }

  /**
   * Creates a new async stub that supports all call types for the service
   */
  public static BikeSharingServiceStub newStub(io.grpc.Channel channel) {
    return new BikeSharingServiceStub(channel);
  }

  /**
   * Creates a new blocking-style stub that supports unary and streaming output calls on the service
   */
  public static BikeSharingServiceBlockingStub newBlockingStub(
      io.grpc.Channel channel) {
    return new BikeSharingServiceBlockingStub(channel);
  }

  /**
   * Creates a new ListenableFuture-style stub that supports unary calls on the service
   */
  public static BikeSharingServiceFutureStub newFutureStub(
      io.grpc.Channel channel) {
    return new BikeSharingServiceFutureStub(channel);
  }

  /**
   * <pre>
   * Interface exported by the server.
   * </pre>
   */
  public static abstract class BikeSharingServiceImplBase implements io.grpc.BindableService {

    /**
     */
    public void checkBikeAvailability(com.example.BikeSharingService.CheckBikeAvailabilityRequest request,
        io.grpc.stub.StreamObserver<com.example.BikeSharingService.CheckBikeAvailabilityResponse> responseObserver) {
      asyncUnimplementedUnaryCall(getCheckBikeAvailabilityMethod(), responseObserver);
    }

    /**
     */
    public io.grpc.stub.StreamObserver<com.example.BikeSharingService.ReserveAndUnlockBikeRequest> reserveAndUnlockBike(
        io.grpc.stub.StreamObserver<com.example.BikeSharingService.ReserveAndUnlockBikeResponse> responseObserver) {
      return asyncUnimplementedStreamingCall(getReserveAndUnlockBikeMethod(), responseObserver);
    }

    @java.lang.Override public final io.grpc.ServerServiceDefinition bindService() {
      return io.grpc.ServerServiceDefinition.builder(getServiceDescriptor())
          .addMethod(
            getCheckBikeAvailabilityMethod(),
            asyncUnaryCall(
              new MethodHandlers<
                com.example.BikeSharingService.CheckBikeAvailabilityRequest,
                com.example.BikeSharingService.CheckBikeAvailabilityResponse>(
                  this, METHODID_CHECK_BIKE_AVAILABILITY)))
          .addMethod(
            getReserveAndUnlockBikeMethod(),
            asyncBidiStreamingCall(
              new MethodHandlers<
                com.example.BikeSharingService.ReserveAndUnlockBikeRequest,
                com.example.BikeSharingService.ReserveAndUnlockBikeResponse>(
                  this, METHODID_RESERVE_AND_UNLOCK_BIKE)))
          .build();
    }
  }

  /**
   * <pre>
   * Interface exported by the server.
   * </pre>
   */
  public static final class BikeSharingServiceStub extends io.grpc.stub.AbstractStub<BikeSharingServiceStub> {
    private BikeSharingServiceStub(io.grpc.Channel channel) {
      super(channel);
    }

    private BikeSharingServiceStub(io.grpc.Channel channel,
        io.grpc.CallOptions callOptions) {
      super(channel, callOptions);
    }

    @java.lang.Override
    protected BikeSharingServiceStub build(io.grpc.Channel channel,
        io.grpc.CallOptions callOptions) {
      return new BikeSharingServiceStub(channel, callOptions);
    }

    /**
     */
    public void checkBikeAvailability(com.example.BikeSharingService.CheckBikeAvailabilityRequest request,
        io.grpc.stub.StreamObserver<com.example.BikeSharingService.CheckBikeAvailabilityResponse> responseObserver) {
      asyncUnaryCall(
          getChannel().newCall(getCheckBikeAvailabilityMethod(), getCallOptions()), request, responseObserver);
    }

    /**
     */
    public io.grpc.stub.StreamObserver<com.example.BikeSharingService.ReserveAndUnlockBikeRequest> reserveAndUnlockBike(
        io.grpc.stub.StreamObserver<com.example.BikeSharingService.ReserveAndUnlockBikeResponse> responseObserver) {
      return asyncBidiStreamingCall(
          getChannel().newCall(getReserveAndUnlockBikeMethod(), getCallOptions()), responseObserver);
    }
  }

  /**
   * <pre>
   * Interface exported by the server.
   * </pre>
   */
  public static final class BikeSharingServiceBlockingStub extends io.grpc.stub.AbstractStub<BikeSharingServiceBlockingStub> {
    private BikeSharingServiceBlockingStub(io.grpc.Channel channel) {
      super(channel);
    }

    private BikeSharingServiceBlockingStub(io.grpc.Channel channel,
        io.grpc.CallOptions callOptions) {
      super(channel, callOptions);
    }

    @java.lang.Override
    protected BikeSharingServiceBlockingStub build(io.grpc.Channel channel,
        io.grpc.CallOptions callOptions) {
      return new BikeSharingServiceBlockingStub(channel, callOptions);
    }

    /**
     */
    public com.example.BikeSharingService.CheckBikeAvailabilityResponse checkBikeAvailability(com.example.BikeSharingService.CheckBikeAvailabilityRequest request) {
      return blockingUnaryCall(
          getChannel(), getCheckBikeAvailabilityMethod(), getCallOptions(), request);
    }
  }

  /**
   * <pre>
   * Interface exported by the server.
   * </pre>
   */
  public static final class BikeSharingServiceFutureStub extends io.grpc.stub.AbstractStub<BikeSharingServiceFutureStub> {
    private BikeSharingServiceFutureStub(io.grpc.Channel channel) {
      super(channel);
    }

    private BikeSharingServiceFutureStub(io.grpc.Channel channel,
        io.grpc.CallOptions callOptions) {
      super(channel, callOptions);
    }

    @java.lang.Override
    protected BikeSharingServiceFutureStub build(io.grpc.Channel channel,
        io.grpc.CallOptions callOptions) {
      return new BikeSharingServiceFutureStub(channel, callOptions);
    }

    /**
     */
    public com.google.common.util.concurrent.ListenableFuture<com.example.BikeSharingService.CheckBikeAvailabilityResponse> checkBikeAvailability(
        com.example.BikeSharingService.CheckBikeAvailabilityRequest request) {
      return futureUnaryCall(
          getChannel().newCall(getCheckBikeAvailabilityMethod(), getCallOptions()), request);
    }
  }

  private static final int METHODID_CHECK_BIKE_AVAILABILITY = 0;
  private static final int METHODID_RESERVE_AND_UNLOCK_BIKE = 1;

  private static final class MethodHandlers<Req, Resp> implements
      io.grpc.stub.ServerCalls.UnaryMethod<Req, Resp>,
      io.grpc.stub.ServerCalls.ServerStreamingMethod<Req, Resp>,
      io.grpc.stub.ServerCalls.ClientStreamingMethod<Req, Resp>,
      io.grpc.stub.ServerCalls.BidiStreamingMethod<Req, Resp> {
    private final BikeSharingServiceImplBase serviceImpl;
    private final int methodId;

    MethodHandlers(BikeSharingServiceImplBase serviceImpl, int methodId) {
      this.serviceImpl = serviceImpl;
      this.methodId = methodId;
    }

    @java.lang.Override
    @java.lang.SuppressWarnings("unchecked")
    public void invoke(Req request, io.grpc.stub.StreamObserver<Resp> responseObserver) {
      switch (methodId) {
        case METHODID_CHECK_BIKE_AVAILABILITY:
          serviceImpl.checkBikeAvailability((com.example.BikeSharingService.CheckBikeAvailabilityRequest) request,
              (io.grpc.stub.StreamObserver<com.example.BikeSharingService.CheckBikeAvailabilityResponse>) responseObserver);
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
        case METHODID_RESERVE_AND_UNLOCK_BIKE:
          return (io.grpc.stub.StreamObserver<Req>) serviceImpl.reserveAndUnlockBike(
              (io.grpc.stub.StreamObserver<com.example.BikeSharingService.ReserveAndUnlockBikeResponse>) responseObserver);
        default:
          throw new AssertionError();
      }
    }
  }

  private static abstract class BikeSharingServiceBaseDescriptorSupplier
      implements io.grpc.protobuf.ProtoFileDescriptorSupplier, io.grpc.protobuf.ProtoServiceDescriptorSupplier {
    BikeSharingServiceBaseDescriptorSupplier() {}

    @java.lang.Override
    public com.google.protobuf.Descriptors.FileDescriptor getFileDescriptor() {
      return com.example.BikeSharingService.BikeSharingServiceProto.getDescriptor();
    }

    @java.lang.Override
    public com.google.protobuf.Descriptors.ServiceDescriptor getServiceDescriptor() {
      return getFileDescriptor().findServiceByName("BikeSharingService");
    }
  }

  private static final class BikeSharingServiceFileDescriptorSupplier
      extends BikeSharingServiceBaseDescriptorSupplier {
    BikeSharingServiceFileDescriptorSupplier() {}
  }

  private static final class BikeSharingServiceMethodDescriptorSupplier
      extends BikeSharingServiceBaseDescriptorSupplier
      implements io.grpc.protobuf.ProtoMethodDescriptorSupplier {
    private final String methodName;

    BikeSharingServiceMethodDescriptorSupplier(String methodName) {
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
      synchronized (BikeSharingServiceGrpc.class) {
        result = serviceDescriptor;
        if (result == null) {
          serviceDescriptor = result = io.grpc.ServiceDescriptor.newBuilder(SERVICE_NAME)
              .setSchemaDescriptor(new BikeSharingServiceFileDescriptorSupplier())
              .addMethod(getCheckBikeAvailabilityMethod())
              .addMethod(getReserveAndUnlockBikeMethod())
              .build();
        }
      }
    }
    return result;
  }
}

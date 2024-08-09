package com.example.PublicTransportationService;

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
    comments = "Source: PublicTransportationService.proto")
public final class PublicTransportationServiceGrpc {

  private PublicTransportationServiceGrpc() {}

  public static final String SERVICE_NAME = "PublicTransportationService.PublicTransportationService";

  // Static method descriptors that strictly reflect the proto.
  private static volatile io.grpc.MethodDescriptor<com.example.PublicTransportationService.GetRealTimeInfoRequest,
      com.example.PublicTransportationService.StopArrivalTimeResponse> getGetRealTimeTransitInfoMethod;

  @io.grpc.stub.annotations.RpcMethod(
      fullMethodName = SERVICE_NAME + '/' + "GetRealTimeTransitInfo",
      requestType = com.example.PublicTransportationService.GetRealTimeInfoRequest.class,
      responseType = com.example.PublicTransportationService.StopArrivalTimeResponse.class,
      methodType = io.grpc.MethodDescriptor.MethodType.UNARY)
  public static io.grpc.MethodDescriptor<com.example.PublicTransportationService.GetRealTimeInfoRequest,
      com.example.PublicTransportationService.StopArrivalTimeResponse> getGetRealTimeTransitInfoMethod() {
    io.grpc.MethodDescriptor<com.example.PublicTransportationService.GetRealTimeInfoRequest, com.example.PublicTransportationService.StopArrivalTimeResponse> getGetRealTimeTransitInfoMethod;
    if ((getGetRealTimeTransitInfoMethod = PublicTransportationServiceGrpc.getGetRealTimeTransitInfoMethod) == null) {
      synchronized (PublicTransportationServiceGrpc.class) {
        if ((getGetRealTimeTransitInfoMethod = PublicTransportationServiceGrpc.getGetRealTimeTransitInfoMethod) == null) {
          PublicTransportationServiceGrpc.getGetRealTimeTransitInfoMethod = getGetRealTimeTransitInfoMethod = 
              io.grpc.MethodDescriptor.<com.example.PublicTransportationService.GetRealTimeInfoRequest, com.example.PublicTransportationService.StopArrivalTimeResponse>newBuilder()
              .setType(io.grpc.MethodDescriptor.MethodType.UNARY)
              .setFullMethodName(generateFullMethodName(
                  "PublicTransportationService.PublicTransportationService", "GetRealTimeTransitInfo"))
              .setSampledToLocalTracing(true)
              .setRequestMarshaller(io.grpc.protobuf.ProtoUtils.marshaller(
                  com.example.PublicTransportationService.GetRealTimeInfoRequest.getDefaultInstance()))
              .setResponseMarshaller(io.grpc.protobuf.ProtoUtils.marshaller(
                  com.example.PublicTransportationService.StopArrivalTimeResponse.getDefaultInstance()))
                  .setSchemaDescriptor(new PublicTransportationServiceMethodDescriptorSupplier("GetRealTimeTransitInfo"))
                  .build();
          }
        }
     }
     return getGetRealTimeTransitInfoMethod;
  }

  private static volatile io.grpc.MethodDescriptor<com.example.PublicTransportationService.DispatchVehicleRequest,
      com.example.PublicTransportationService.DispatchVehicleResponse> getDispatchVehicleMethod;

  @io.grpc.stub.annotations.RpcMethod(
      fullMethodName = SERVICE_NAME + '/' + "DispatchVehicle",
      requestType = com.example.PublicTransportationService.DispatchVehicleRequest.class,
      responseType = com.example.PublicTransportationService.DispatchVehicleResponse.class,
      methodType = io.grpc.MethodDescriptor.MethodType.SERVER_STREAMING)
  public static io.grpc.MethodDescriptor<com.example.PublicTransportationService.DispatchVehicleRequest,
      com.example.PublicTransportationService.DispatchVehicleResponse> getDispatchVehicleMethod() {
    io.grpc.MethodDescriptor<com.example.PublicTransportationService.DispatchVehicleRequest, com.example.PublicTransportationService.DispatchVehicleResponse> getDispatchVehicleMethod;
    if ((getDispatchVehicleMethod = PublicTransportationServiceGrpc.getDispatchVehicleMethod) == null) {
      synchronized (PublicTransportationServiceGrpc.class) {
        if ((getDispatchVehicleMethod = PublicTransportationServiceGrpc.getDispatchVehicleMethod) == null) {
          PublicTransportationServiceGrpc.getDispatchVehicleMethod = getDispatchVehicleMethod = 
              io.grpc.MethodDescriptor.<com.example.PublicTransportationService.DispatchVehicleRequest, com.example.PublicTransportationService.DispatchVehicleResponse>newBuilder()
              .setType(io.grpc.MethodDescriptor.MethodType.SERVER_STREAMING)
              .setFullMethodName(generateFullMethodName(
                  "PublicTransportationService.PublicTransportationService", "DispatchVehicle"))
              .setSampledToLocalTracing(true)
              .setRequestMarshaller(io.grpc.protobuf.ProtoUtils.marshaller(
                  com.example.PublicTransportationService.DispatchVehicleRequest.getDefaultInstance()))
              .setResponseMarshaller(io.grpc.protobuf.ProtoUtils.marshaller(
                  com.example.PublicTransportationService.DispatchVehicleResponse.getDefaultInstance()))
                  .setSchemaDescriptor(new PublicTransportationServiceMethodDescriptorSupplier("DispatchVehicle"))
                  .build();
          }
        }
     }
     return getDispatchVehicleMethod;
  }

  /**
   * Creates a new async stub that supports all call types for the service
   */
  public static PublicTransportationServiceStub newStub(io.grpc.Channel channel) {
    return new PublicTransportationServiceStub(channel);
  }

  /**
   * Creates a new blocking-style stub that supports unary and streaming output calls on the service
   */
  public static PublicTransportationServiceBlockingStub newBlockingStub(
      io.grpc.Channel channel) {
    return new PublicTransportationServiceBlockingStub(channel);
  }

  /**
   * Creates a new ListenableFuture-style stub that supports unary calls on the service
   */
  public static PublicTransportationServiceFutureStub newFutureStub(
      io.grpc.Channel channel) {
    return new PublicTransportationServiceFutureStub(channel);
  }

  /**
   * <pre>
   * Interface exported by the server.
   * </pre>
   */
  public static abstract class PublicTransportationServiceImplBase implements io.grpc.BindableService {

    /**
     * <pre>
     * RPC method to get real-time transit info
     * </pre>
     */
    public void getRealTimeTransitInfo(com.example.PublicTransportationService.GetRealTimeInfoRequest request,
        io.grpc.stub.StreamObserver<com.example.PublicTransportationService.StopArrivalTimeResponse> responseObserver) {
      asyncUnimplementedUnaryCall(getGetRealTimeTransitInfoMethod(), responseObserver);
    }

    /**
     * <pre>
     *RPC method to Dispatch vehicle
     * </pre>
     */
    public void dispatchVehicle(com.example.PublicTransportationService.DispatchVehicleRequest request,
        io.grpc.stub.StreamObserver<com.example.PublicTransportationService.DispatchVehicleResponse> responseObserver) {
      asyncUnimplementedUnaryCall(getDispatchVehicleMethod(), responseObserver);
    }

    @java.lang.Override public final io.grpc.ServerServiceDefinition bindService() {
      return io.grpc.ServerServiceDefinition.builder(getServiceDescriptor())
          .addMethod(
            getGetRealTimeTransitInfoMethod(),
            asyncUnaryCall(
              new MethodHandlers<
                com.example.PublicTransportationService.GetRealTimeInfoRequest,
                com.example.PublicTransportationService.StopArrivalTimeResponse>(
                  this, METHODID_GET_REAL_TIME_TRANSIT_INFO)))
          .addMethod(
            getDispatchVehicleMethod(),
            asyncServerStreamingCall(
              new MethodHandlers<
                com.example.PublicTransportationService.DispatchVehicleRequest,
                com.example.PublicTransportationService.DispatchVehicleResponse>(
                  this, METHODID_DISPATCH_VEHICLE)))
          .build();
    }
  }

  /**
   * <pre>
   * Interface exported by the server.
   * </pre>
   */
  public static final class PublicTransportationServiceStub extends io.grpc.stub.AbstractStub<PublicTransportationServiceStub> {
    private PublicTransportationServiceStub(io.grpc.Channel channel) {
      super(channel);
    }

    private PublicTransportationServiceStub(io.grpc.Channel channel,
        io.grpc.CallOptions callOptions) {
      super(channel, callOptions);
    }

    @java.lang.Override
    protected PublicTransportationServiceStub build(io.grpc.Channel channel,
        io.grpc.CallOptions callOptions) {
      return new PublicTransportationServiceStub(channel, callOptions);
    }

    /**
     * <pre>
     * RPC method to get real-time transit info
     * </pre>
     */
    public void getRealTimeTransitInfo(com.example.PublicTransportationService.GetRealTimeInfoRequest request,
        io.grpc.stub.StreamObserver<com.example.PublicTransportationService.StopArrivalTimeResponse> responseObserver) {
      asyncUnaryCall(
          getChannel().newCall(getGetRealTimeTransitInfoMethod(), getCallOptions()), request, responseObserver);
    }

    /**
     * <pre>
     *RPC method to Dispatch vehicle
     * </pre>
     */
    public void dispatchVehicle(com.example.PublicTransportationService.DispatchVehicleRequest request,
        io.grpc.stub.StreamObserver<com.example.PublicTransportationService.DispatchVehicleResponse> responseObserver) {
      asyncServerStreamingCall(
          getChannel().newCall(getDispatchVehicleMethod(), getCallOptions()), request, responseObserver);
    }
  }

  /**
   * <pre>
   * Interface exported by the server.
   * </pre>
   */
  public static final class PublicTransportationServiceBlockingStub extends io.grpc.stub.AbstractStub<PublicTransportationServiceBlockingStub> {
    private PublicTransportationServiceBlockingStub(io.grpc.Channel channel) {
      super(channel);
    }

    private PublicTransportationServiceBlockingStub(io.grpc.Channel channel,
        io.grpc.CallOptions callOptions) {
      super(channel, callOptions);
    }

    @java.lang.Override
    protected PublicTransportationServiceBlockingStub build(io.grpc.Channel channel,
        io.grpc.CallOptions callOptions) {
      return new PublicTransportationServiceBlockingStub(channel, callOptions);
    }

    /**
     * <pre>
     * RPC method to get real-time transit info
     * </pre>
     */
    public com.example.PublicTransportationService.StopArrivalTimeResponse getRealTimeTransitInfo(com.example.PublicTransportationService.GetRealTimeInfoRequest request) {
      return blockingUnaryCall(
          getChannel(), getGetRealTimeTransitInfoMethod(), getCallOptions(), request);
    }

    /**
     * <pre>
     *RPC method to Dispatch vehicle
     * </pre>
     */
    public java.util.Iterator<com.example.PublicTransportationService.DispatchVehicleResponse> dispatchVehicle(
        com.example.PublicTransportationService.DispatchVehicleRequest request) {
      return blockingServerStreamingCall(
          getChannel(), getDispatchVehicleMethod(), getCallOptions(), request);
    }
  }

  /**
   * <pre>
   * Interface exported by the server.
   * </pre>
   */
  public static final class PublicTransportationServiceFutureStub extends io.grpc.stub.AbstractStub<PublicTransportationServiceFutureStub> {
    private PublicTransportationServiceFutureStub(io.grpc.Channel channel) {
      super(channel);
    }

    private PublicTransportationServiceFutureStub(io.grpc.Channel channel,
        io.grpc.CallOptions callOptions) {
      super(channel, callOptions);
    }

    @java.lang.Override
    protected PublicTransportationServiceFutureStub build(io.grpc.Channel channel,
        io.grpc.CallOptions callOptions) {
      return new PublicTransportationServiceFutureStub(channel, callOptions);
    }

    /**
     * <pre>
     * RPC method to get real-time transit info
     * </pre>
     */
    public com.google.common.util.concurrent.ListenableFuture<com.example.PublicTransportationService.StopArrivalTimeResponse> getRealTimeTransitInfo(
        com.example.PublicTransportationService.GetRealTimeInfoRequest request) {
      return futureUnaryCall(
          getChannel().newCall(getGetRealTimeTransitInfoMethod(), getCallOptions()), request);
    }
  }

  private static final int METHODID_GET_REAL_TIME_TRANSIT_INFO = 0;
  private static final int METHODID_DISPATCH_VEHICLE = 1;

  private static final class MethodHandlers<Req, Resp> implements
      io.grpc.stub.ServerCalls.UnaryMethod<Req, Resp>,
      io.grpc.stub.ServerCalls.ServerStreamingMethod<Req, Resp>,
      io.grpc.stub.ServerCalls.ClientStreamingMethod<Req, Resp>,
      io.grpc.stub.ServerCalls.BidiStreamingMethod<Req, Resp> {
    private final PublicTransportationServiceImplBase serviceImpl;
    private final int methodId;

    MethodHandlers(PublicTransportationServiceImplBase serviceImpl, int methodId) {
      this.serviceImpl = serviceImpl;
      this.methodId = methodId;
    }

    @java.lang.Override
    @java.lang.SuppressWarnings("unchecked")
    public void invoke(Req request, io.grpc.stub.StreamObserver<Resp> responseObserver) {
      switch (methodId) {
        case METHODID_GET_REAL_TIME_TRANSIT_INFO:
          serviceImpl.getRealTimeTransitInfo((com.example.PublicTransportationService.GetRealTimeInfoRequest) request,
              (io.grpc.stub.StreamObserver<com.example.PublicTransportationService.StopArrivalTimeResponse>) responseObserver);
          break;
        case METHODID_DISPATCH_VEHICLE:
          serviceImpl.dispatchVehicle((com.example.PublicTransportationService.DispatchVehicleRequest) request,
              (io.grpc.stub.StreamObserver<com.example.PublicTransportationService.DispatchVehicleResponse>) responseObserver);
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
        default:
          throw new AssertionError();
      }
    }
  }

  private static abstract class PublicTransportationServiceBaseDescriptorSupplier
      implements io.grpc.protobuf.ProtoFileDescriptorSupplier, io.grpc.protobuf.ProtoServiceDescriptorSupplier {
    PublicTransportationServiceBaseDescriptorSupplier() {}

    @java.lang.Override
    public com.google.protobuf.Descriptors.FileDescriptor getFileDescriptor() {
      return com.example.PublicTransportationService.TransitProto.getDescriptor();
    }

    @java.lang.Override
    public com.google.protobuf.Descriptors.ServiceDescriptor getServiceDescriptor() {
      return getFileDescriptor().findServiceByName("PublicTransportationService");
    }
  }

  private static final class PublicTransportationServiceFileDescriptorSupplier
      extends PublicTransportationServiceBaseDescriptorSupplier {
    PublicTransportationServiceFileDescriptorSupplier() {}
  }

  private static final class PublicTransportationServiceMethodDescriptorSupplier
      extends PublicTransportationServiceBaseDescriptorSupplier
      implements io.grpc.protobuf.ProtoMethodDescriptorSupplier {
    private final String methodName;

    PublicTransportationServiceMethodDescriptorSupplier(String methodName) {
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
      synchronized (PublicTransportationServiceGrpc.class) {
        result = serviceDescriptor;
        if (result == null) {
          serviceDescriptor = result = io.grpc.ServiceDescriptor.newBuilder(SERVICE_NAME)
              .setSchemaDescriptor(new PublicTransportationServiceFileDescriptorSupplier())
              .addMethod(getGetRealTimeTransitInfoMethod())
              .addMethod(getDispatchVehicleMethod())
              .build();
        }
      }
    }
    return result;
  }
}

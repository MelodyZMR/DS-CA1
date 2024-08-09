package com.example.ParkingService;

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
    comments = "Source: ParkingService.proto")
public final class ParkingServiceGrpc {

  private ParkingServiceGrpc() {}

  public static final String SERVICE_NAME = "ParkingService.ParkingService";

  // Static method descriptors that strictly reflect the proto.
  private static volatile io.grpc.MethodDescriptor<com.example.ParkingService.ParkingLotRequest,
      com.example.ParkingService.ParkingLotResponse> getFindAvailableParkingSpaceMethod;

  @io.grpc.stub.annotations.RpcMethod(
      fullMethodName = SERVICE_NAME + '/' + "FindAvailableParkingSpace",
      requestType = com.example.ParkingService.ParkingLotRequest.class,
      responseType = com.example.ParkingService.ParkingLotResponse.class,
      methodType = io.grpc.MethodDescriptor.MethodType.UNARY)
  public static io.grpc.MethodDescriptor<com.example.ParkingService.ParkingLotRequest,
      com.example.ParkingService.ParkingLotResponse> getFindAvailableParkingSpaceMethod() {
    io.grpc.MethodDescriptor<com.example.ParkingService.ParkingLotRequest, com.example.ParkingService.ParkingLotResponse> getFindAvailableParkingSpaceMethod;
    if ((getFindAvailableParkingSpaceMethod = ParkingServiceGrpc.getFindAvailableParkingSpaceMethod) == null) {
      synchronized (ParkingServiceGrpc.class) {
        if ((getFindAvailableParkingSpaceMethod = ParkingServiceGrpc.getFindAvailableParkingSpaceMethod) == null) {
          ParkingServiceGrpc.getFindAvailableParkingSpaceMethod = getFindAvailableParkingSpaceMethod = 
              io.grpc.MethodDescriptor.<com.example.ParkingService.ParkingLotRequest, com.example.ParkingService.ParkingLotResponse>newBuilder()
              .setType(io.grpc.MethodDescriptor.MethodType.UNARY)
              .setFullMethodName(generateFullMethodName(
                  "ParkingService.ParkingService", "FindAvailableParkingSpace"))
              .setSampledToLocalTracing(true)
              .setRequestMarshaller(io.grpc.protobuf.ProtoUtils.marshaller(
                  com.example.ParkingService.ParkingLotRequest.getDefaultInstance()))
              .setResponseMarshaller(io.grpc.protobuf.ProtoUtils.marshaller(
                  com.example.ParkingService.ParkingLotResponse.getDefaultInstance()))
                  .setSchemaDescriptor(new ParkingServiceMethodDescriptorSupplier("FindAvailableParkingSpace"))
                  .build();
          }
        }
     }
     return getFindAvailableParkingSpaceMethod;
  }

  private static volatile io.grpc.MethodDescriptor<com.example.ParkingService.ParkingReservationRequest,
      com.example.ParkingService.ParkingReservationResponse> getBookParkingSpacesMethod;

  @io.grpc.stub.annotations.RpcMethod(
      fullMethodName = SERVICE_NAME + '/' + "BookParkingSpaces",
      requestType = com.example.ParkingService.ParkingReservationRequest.class,
      responseType = com.example.ParkingService.ParkingReservationResponse.class,
      methodType = io.grpc.MethodDescriptor.MethodType.CLIENT_STREAMING)
  public static io.grpc.MethodDescriptor<com.example.ParkingService.ParkingReservationRequest,
      com.example.ParkingService.ParkingReservationResponse> getBookParkingSpacesMethod() {
    io.grpc.MethodDescriptor<com.example.ParkingService.ParkingReservationRequest, com.example.ParkingService.ParkingReservationResponse> getBookParkingSpacesMethod;
    if ((getBookParkingSpacesMethod = ParkingServiceGrpc.getBookParkingSpacesMethod) == null) {
      synchronized (ParkingServiceGrpc.class) {
        if ((getBookParkingSpacesMethod = ParkingServiceGrpc.getBookParkingSpacesMethod) == null) {
          ParkingServiceGrpc.getBookParkingSpacesMethod = getBookParkingSpacesMethod = 
              io.grpc.MethodDescriptor.<com.example.ParkingService.ParkingReservationRequest, com.example.ParkingService.ParkingReservationResponse>newBuilder()
              .setType(io.grpc.MethodDescriptor.MethodType.CLIENT_STREAMING)
              .setFullMethodName(generateFullMethodName(
                  "ParkingService.ParkingService", "BookParkingSpaces"))
              .setSampledToLocalTracing(true)
              .setRequestMarshaller(io.grpc.protobuf.ProtoUtils.marshaller(
                  com.example.ParkingService.ParkingReservationRequest.getDefaultInstance()))
              .setResponseMarshaller(io.grpc.protobuf.ProtoUtils.marshaller(
                  com.example.ParkingService.ParkingReservationResponse.getDefaultInstance()))
                  .setSchemaDescriptor(new ParkingServiceMethodDescriptorSupplier("BookParkingSpaces"))
                  .build();
          }
        }
     }
     return getBookParkingSpacesMethod;
  }

  /**
   * Creates a new async stub that supports all call types for the service
   */
  public static ParkingServiceStub newStub(io.grpc.Channel channel) {
    return new ParkingServiceStub(channel);
  }

  /**
   * Creates a new blocking-style stub that supports unary and streaming output calls on the service
   */
  public static ParkingServiceBlockingStub newBlockingStub(
      io.grpc.Channel channel) {
    return new ParkingServiceBlockingStub(channel);
  }

  /**
   * Creates a new ListenableFuture-style stub that supports unary calls on the service
   */
  public static ParkingServiceFutureStub newFutureStub(
      io.grpc.Channel channel) {
    return new ParkingServiceFutureStub(channel);
  }

  /**
   * <pre>
   * Interface exported by the server.
   * </pre>
   */
  public static abstract class ParkingServiceImplBase implements io.grpc.BindableService {

    /**
     * <pre>
     * RPC method to find available parking spaces
     * </pre>
     */
    public void findAvailableParkingSpace(com.example.ParkingService.ParkingLotRequest request,
        io.grpc.stub.StreamObserver<com.example.ParkingService.ParkingLotResponse> responseObserver) {
      asyncUnimplementedUnaryCall(getFindAvailableParkingSpaceMethod(), responseObserver);
    }

    /**
     * <pre>
     *Client Streaming RPC method to reserve parking spaces
     * </pre>
     */
    public io.grpc.stub.StreamObserver<com.example.ParkingService.ParkingReservationRequest> bookParkingSpaces(
        io.grpc.stub.StreamObserver<com.example.ParkingService.ParkingReservationResponse> responseObserver) {
      return asyncUnimplementedStreamingCall(getBookParkingSpacesMethod(), responseObserver);
    }

    @java.lang.Override public final io.grpc.ServerServiceDefinition bindService() {
      return io.grpc.ServerServiceDefinition.builder(getServiceDescriptor())
          .addMethod(
            getFindAvailableParkingSpaceMethod(),
            asyncUnaryCall(
              new MethodHandlers<
                com.example.ParkingService.ParkingLotRequest,
                com.example.ParkingService.ParkingLotResponse>(
                  this, METHODID_FIND_AVAILABLE_PARKING_SPACE)))
          .addMethod(
            getBookParkingSpacesMethod(),
            asyncClientStreamingCall(
              new MethodHandlers<
                com.example.ParkingService.ParkingReservationRequest,
                com.example.ParkingService.ParkingReservationResponse>(
                  this, METHODID_BOOK_PARKING_SPACES)))
          .build();
    }
  }

  /**
   * <pre>
   * Interface exported by the server.
   * </pre>
   */
  public static final class ParkingServiceStub extends io.grpc.stub.AbstractStub<ParkingServiceStub> {
    private ParkingServiceStub(io.grpc.Channel channel) {
      super(channel);
    }

    private ParkingServiceStub(io.grpc.Channel channel,
        io.grpc.CallOptions callOptions) {
      super(channel, callOptions);
    }

    @java.lang.Override
    protected ParkingServiceStub build(io.grpc.Channel channel,
        io.grpc.CallOptions callOptions) {
      return new ParkingServiceStub(channel, callOptions);
    }

    /**
     * <pre>
     * RPC method to find available parking spaces
     * </pre>
     */
    public void findAvailableParkingSpace(com.example.ParkingService.ParkingLotRequest request,
        io.grpc.stub.StreamObserver<com.example.ParkingService.ParkingLotResponse> responseObserver) {
      asyncUnaryCall(
          getChannel().newCall(getFindAvailableParkingSpaceMethod(), getCallOptions()), request, responseObserver);
    }

    /**
     * <pre>
     *Client Streaming RPC method to reserve parking spaces
     * </pre>
     */
    public io.grpc.stub.StreamObserver<com.example.ParkingService.ParkingReservationRequest> bookParkingSpaces(
        io.grpc.stub.StreamObserver<com.example.ParkingService.ParkingReservationResponse> responseObserver) {
      return asyncClientStreamingCall(
          getChannel().newCall(getBookParkingSpacesMethod(), getCallOptions()), responseObserver);
    }
  }

  /**
   * <pre>
   * Interface exported by the server.
   * </pre>
   */
  public static final class ParkingServiceBlockingStub extends io.grpc.stub.AbstractStub<ParkingServiceBlockingStub> {
    private ParkingServiceBlockingStub(io.grpc.Channel channel) {
      super(channel);
    }

    private ParkingServiceBlockingStub(io.grpc.Channel channel,
        io.grpc.CallOptions callOptions) {
      super(channel, callOptions);
    }

    @java.lang.Override
    protected ParkingServiceBlockingStub build(io.grpc.Channel channel,
        io.grpc.CallOptions callOptions) {
      return new ParkingServiceBlockingStub(channel, callOptions);
    }

    /**
     * <pre>
     * RPC method to find available parking spaces
     * </pre>
     */
    public com.example.ParkingService.ParkingLotResponse findAvailableParkingSpace(com.example.ParkingService.ParkingLotRequest request) {
      return blockingUnaryCall(
          getChannel(), getFindAvailableParkingSpaceMethod(), getCallOptions(), request);
    }
  }

  /**
   * <pre>
   * Interface exported by the server.
   * </pre>
   */
  public static final class ParkingServiceFutureStub extends io.grpc.stub.AbstractStub<ParkingServiceFutureStub> {
    private ParkingServiceFutureStub(io.grpc.Channel channel) {
      super(channel);
    }

    private ParkingServiceFutureStub(io.grpc.Channel channel,
        io.grpc.CallOptions callOptions) {
      super(channel, callOptions);
    }

    @java.lang.Override
    protected ParkingServiceFutureStub build(io.grpc.Channel channel,
        io.grpc.CallOptions callOptions) {
      return new ParkingServiceFutureStub(channel, callOptions);
    }

    /**
     * <pre>
     * RPC method to find available parking spaces
     * </pre>
     */
    public com.google.common.util.concurrent.ListenableFuture<com.example.ParkingService.ParkingLotResponse> findAvailableParkingSpace(
        com.example.ParkingService.ParkingLotRequest request) {
      return futureUnaryCall(
          getChannel().newCall(getFindAvailableParkingSpaceMethod(), getCallOptions()), request);
    }
  }

  private static final int METHODID_FIND_AVAILABLE_PARKING_SPACE = 0;
  private static final int METHODID_BOOK_PARKING_SPACES = 1;

  private static final class MethodHandlers<Req, Resp> implements
      io.grpc.stub.ServerCalls.UnaryMethod<Req, Resp>,
      io.grpc.stub.ServerCalls.ServerStreamingMethod<Req, Resp>,
      io.grpc.stub.ServerCalls.ClientStreamingMethod<Req, Resp>,
      io.grpc.stub.ServerCalls.BidiStreamingMethod<Req, Resp> {
    private final ParkingServiceImplBase serviceImpl;
    private final int methodId;

    MethodHandlers(ParkingServiceImplBase serviceImpl, int methodId) {
      this.serviceImpl = serviceImpl;
      this.methodId = methodId;
    }

    @java.lang.Override
    @java.lang.SuppressWarnings("unchecked")
    public void invoke(Req request, io.grpc.stub.StreamObserver<Resp> responseObserver) {
      switch (methodId) {
        case METHODID_FIND_AVAILABLE_PARKING_SPACE:
          serviceImpl.findAvailableParkingSpace((com.example.ParkingService.ParkingLotRequest) request,
              (io.grpc.stub.StreamObserver<com.example.ParkingService.ParkingLotResponse>) responseObserver);
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
        case METHODID_BOOK_PARKING_SPACES:
          return (io.grpc.stub.StreamObserver<Req>) serviceImpl.bookParkingSpaces(
              (io.grpc.stub.StreamObserver<com.example.ParkingService.ParkingReservationResponse>) responseObserver);
        default:
          throw new AssertionError();
      }
    }
  }

  private static abstract class ParkingServiceBaseDescriptorSupplier
      implements io.grpc.protobuf.ProtoFileDescriptorSupplier, io.grpc.protobuf.ProtoServiceDescriptorSupplier {
    ParkingServiceBaseDescriptorSupplier() {}

    @java.lang.Override
    public com.google.protobuf.Descriptors.FileDescriptor getFileDescriptor() {
      return com.example.ParkingService.ParkingServiceProto.getDescriptor();
    }

    @java.lang.Override
    public com.google.protobuf.Descriptors.ServiceDescriptor getServiceDescriptor() {
      return getFileDescriptor().findServiceByName("ParkingService");
    }
  }

  private static final class ParkingServiceFileDescriptorSupplier
      extends ParkingServiceBaseDescriptorSupplier {
    ParkingServiceFileDescriptorSupplier() {}
  }

  private static final class ParkingServiceMethodDescriptorSupplier
      extends ParkingServiceBaseDescriptorSupplier
      implements io.grpc.protobuf.ProtoMethodDescriptorSupplier {
    private final String methodName;

    ParkingServiceMethodDescriptorSupplier(String methodName) {
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
      synchronized (ParkingServiceGrpc.class) {
        result = serviceDescriptor;
        if (result == null) {
          serviceDescriptor = result = io.grpc.ServiceDescriptor.newBuilder(SERVICE_NAME)
              .setSchemaDescriptor(new ParkingServiceFileDescriptorSupplier())
              .addMethod(getFindAvailableParkingSpaceMethod())
              .addMethod(getBookParkingSpacesMethod())
              .build();
        }
      }
    }
    return result;
  }
}

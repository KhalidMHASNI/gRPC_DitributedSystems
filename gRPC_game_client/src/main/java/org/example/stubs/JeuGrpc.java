package org.example.stubs;

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
 */
@javax.annotation.Generated(
    value = "by gRPC proto compiler (version 1.15.0)",
    comments = "Source: jeu.proto")
public final class JeuGrpc {

  private JeuGrpc() {}

  public static final String SERVICE_NAME = "Jeu";

  // Static method descriptors that strictly reflect the proto.
  private static volatile io.grpc.MethodDescriptor<org.example.stubs.JeuOuterClass.Empty,
      org.example.stubs.JeuOuterClass.Result> getStartMethod;

  @io.grpc.stub.annotations.RpcMethod(
      fullMethodName = SERVICE_NAME + '/' + "Start",
      requestType = org.example.stubs.JeuOuterClass.Empty.class,
      responseType = org.example.stubs.JeuOuterClass.Result.class,
      methodType = io.grpc.MethodDescriptor.MethodType.SERVER_STREAMING)
  public static io.grpc.MethodDescriptor<org.example.stubs.JeuOuterClass.Empty,
      org.example.stubs.JeuOuterClass.Result> getStartMethod() {
    io.grpc.MethodDescriptor<org.example.stubs.JeuOuterClass.Empty, org.example.stubs.JeuOuterClass.Result> getStartMethod;
    if ((getStartMethod = JeuGrpc.getStartMethod) == null) {
      synchronized (JeuGrpc.class) {
        if ((getStartMethod = JeuGrpc.getStartMethod) == null) {
          JeuGrpc.getStartMethod = getStartMethod = 
              io.grpc.MethodDescriptor.<org.example.stubs.JeuOuterClass.Empty, org.example.stubs.JeuOuterClass.Result>newBuilder()
              .setType(io.grpc.MethodDescriptor.MethodType.SERVER_STREAMING)
              .setFullMethodName(generateFullMethodName(
                  "Jeu", "Start"))
              .setSampledToLocalTracing(true)
              .setRequestMarshaller(io.grpc.protobuf.ProtoUtils.marshaller(
                  org.example.stubs.JeuOuterClass.Empty.getDefaultInstance()))
              .setResponseMarshaller(io.grpc.protobuf.ProtoUtils.marshaller(
                  org.example.stubs.JeuOuterClass.Result.getDefaultInstance()))
                  .setSchemaDescriptor(new JeuMethodDescriptorSupplier("Start"))
                  .build();
          }
        }
     }
     return getStartMethod;
  }

  private static volatile io.grpc.MethodDescriptor<org.example.stubs.JeuOuterClass.GuessRequest,
      org.example.stubs.JeuOuterClass.Result> getGuessMethod;

  @io.grpc.stub.annotations.RpcMethod(
      fullMethodName = SERVICE_NAME + '/' + "Guess",
      requestType = org.example.stubs.JeuOuterClass.GuessRequest.class,
      responseType = org.example.stubs.JeuOuterClass.Result.class,
      methodType = io.grpc.MethodDescriptor.MethodType.BIDI_STREAMING)
  public static io.grpc.MethodDescriptor<org.example.stubs.JeuOuterClass.GuessRequest,
      org.example.stubs.JeuOuterClass.Result> getGuessMethod() {
    io.grpc.MethodDescriptor<org.example.stubs.JeuOuterClass.GuessRequest, org.example.stubs.JeuOuterClass.Result> getGuessMethod;
    if ((getGuessMethod = JeuGrpc.getGuessMethod) == null) {
      synchronized (JeuGrpc.class) {
        if ((getGuessMethod = JeuGrpc.getGuessMethod) == null) {
          JeuGrpc.getGuessMethod = getGuessMethod = 
              io.grpc.MethodDescriptor.<org.example.stubs.JeuOuterClass.GuessRequest, org.example.stubs.JeuOuterClass.Result>newBuilder()
              .setType(io.grpc.MethodDescriptor.MethodType.BIDI_STREAMING)
              .setFullMethodName(generateFullMethodName(
                  "Jeu", "Guess"))
              .setSampledToLocalTracing(true)
              .setRequestMarshaller(io.grpc.protobuf.ProtoUtils.marshaller(
                  org.example.stubs.JeuOuterClass.GuessRequest.getDefaultInstance()))
              .setResponseMarshaller(io.grpc.protobuf.ProtoUtils.marshaller(
                  org.example.stubs.JeuOuterClass.Result.getDefaultInstance()))
                  .setSchemaDescriptor(new JeuMethodDescriptorSupplier("Guess"))
                  .build();
          }
        }
     }
     return getGuessMethod;
  }

  private static volatile io.grpc.MethodDescriptor<org.example.stubs.JeuOuterClass.Empty,
      org.example.stubs.JeuOuterClass.Result> getStopMethod;

  @io.grpc.stub.annotations.RpcMethod(
      fullMethodName = SERVICE_NAME + '/' + "Stop",
      requestType = org.example.stubs.JeuOuterClass.Empty.class,
      responseType = org.example.stubs.JeuOuterClass.Result.class,
      methodType = io.grpc.MethodDescriptor.MethodType.UNARY)
  public static io.grpc.MethodDescriptor<org.example.stubs.JeuOuterClass.Empty,
      org.example.stubs.JeuOuterClass.Result> getStopMethod() {
    io.grpc.MethodDescriptor<org.example.stubs.JeuOuterClass.Empty, org.example.stubs.JeuOuterClass.Result> getStopMethod;
    if ((getStopMethod = JeuGrpc.getStopMethod) == null) {
      synchronized (JeuGrpc.class) {
        if ((getStopMethod = JeuGrpc.getStopMethod) == null) {
          JeuGrpc.getStopMethod = getStopMethod = 
              io.grpc.MethodDescriptor.<org.example.stubs.JeuOuterClass.Empty, org.example.stubs.JeuOuterClass.Result>newBuilder()
              .setType(io.grpc.MethodDescriptor.MethodType.UNARY)
              .setFullMethodName(generateFullMethodName(
                  "Jeu", "Stop"))
              .setSampledToLocalTracing(true)
              .setRequestMarshaller(io.grpc.protobuf.ProtoUtils.marshaller(
                  org.example.stubs.JeuOuterClass.Empty.getDefaultInstance()))
              .setResponseMarshaller(io.grpc.protobuf.ProtoUtils.marshaller(
                  org.example.stubs.JeuOuterClass.Result.getDefaultInstance()))
                  .setSchemaDescriptor(new JeuMethodDescriptorSupplier("Stop"))
                  .build();
          }
        }
     }
     return getStopMethod;
  }

  /**
   * Creates a new async stub that supports all call types for the service
   */
  public static JeuStub newStub(io.grpc.Channel channel) {
    return new JeuStub(channel);
  }

  /**
   * Creates a new blocking-style stub that supports unary and streaming output calls on the service
   */
  public static JeuBlockingStub newBlockingStub(
      io.grpc.Channel channel) {
    return new JeuBlockingStub(channel);
  }

  /**
   * Creates a new ListenableFuture-style stub that supports unary calls on the service
   */
  public static JeuFutureStub newFutureStub(
      io.grpc.Channel channel) {
    return new JeuFutureStub(channel);
  }

  /**
   */
  public static abstract class JeuImplBase implements io.grpc.BindableService {

    /**
     * <pre>
     * The server generates a random number between 1 and 1000
     * </pre>
     */
    public void start(org.example.stubs.JeuOuterClass.Empty request,
        io.grpc.stub.StreamObserver<org.example.stubs.JeuOuterClass.Result> responseObserver) {
      asyncUnimplementedUnaryCall(getStartMethod(), responseObserver);
    }

    /**
     * <pre>
     * The client guesses a number and the server responds with a hint
     * </pre>
     */
    public io.grpc.stub.StreamObserver<org.example.stubs.JeuOuterClass.GuessRequest> guess(
        io.grpc.stub.StreamObserver<org.example.stubs.JeuOuterClass.Result> responseObserver) {
      return asyncUnimplementedStreamingCall(getGuessMethod(), responseObserver);
    }

    /**
     * <pre>
     * The server announces the winner and the game is over
     * </pre>
     */
    public void stop(org.example.stubs.JeuOuterClass.Empty request,
        io.grpc.stub.StreamObserver<org.example.stubs.JeuOuterClass.Result> responseObserver) {
      asyncUnimplementedUnaryCall(getStopMethod(), responseObserver);
    }

    @java.lang.Override public final io.grpc.ServerServiceDefinition bindService() {
      return io.grpc.ServerServiceDefinition.builder(getServiceDescriptor())
          .addMethod(
            getStartMethod(),
            asyncServerStreamingCall(
              new MethodHandlers<
                org.example.stubs.JeuOuterClass.Empty,
                org.example.stubs.JeuOuterClass.Result>(
                  this, METHODID_START)))
          .addMethod(
            getGuessMethod(),
            asyncBidiStreamingCall(
              new MethodHandlers<
                org.example.stubs.JeuOuterClass.GuessRequest,
                org.example.stubs.JeuOuterClass.Result>(
                  this, METHODID_GUESS)))
          .addMethod(
            getStopMethod(),
            asyncUnaryCall(
              new MethodHandlers<
                org.example.stubs.JeuOuterClass.Empty,
                org.example.stubs.JeuOuterClass.Result>(
                  this, METHODID_STOP)))
          .build();
    }
  }

  /**
   */
  public static final class JeuStub extends io.grpc.stub.AbstractStub<JeuStub> {
    private JeuStub(io.grpc.Channel channel) {
      super(channel);
    }

    private JeuStub(io.grpc.Channel channel,
        io.grpc.CallOptions callOptions) {
      super(channel, callOptions);
    }

    @java.lang.Override
    protected JeuStub build(io.grpc.Channel channel,
        io.grpc.CallOptions callOptions) {
      return new JeuStub(channel, callOptions);
    }

    /**
     * <pre>
     * The server generates a random number between 1 and 1000
     * </pre>
     */
    public void start(org.example.stubs.JeuOuterClass.Empty request,
        io.grpc.stub.StreamObserver<org.example.stubs.JeuOuterClass.Result> responseObserver) {
      asyncServerStreamingCall(
          getChannel().newCall(getStartMethod(), getCallOptions()), request, responseObserver);
    }

    /**
     * <pre>
     * The client guesses a number and the server responds with a hint
     * </pre>
     */
    public io.grpc.stub.StreamObserver<org.example.stubs.JeuOuterClass.GuessRequest> guess(
        io.grpc.stub.StreamObserver<org.example.stubs.JeuOuterClass.Result> responseObserver) {
      return asyncBidiStreamingCall(
          getChannel().newCall(getGuessMethod(), getCallOptions()), responseObserver);
    }

    /**
     * <pre>
     * The server announces the winner and the game is over
     * </pre>
     */
    public void stop(org.example.stubs.JeuOuterClass.Empty request,
        io.grpc.stub.StreamObserver<org.example.stubs.JeuOuterClass.Result> responseObserver) {
      asyncUnaryCall(
          getChannel().newCall(getStopMethod(), getCallOptions()), request, responseObserver);
    }
  }

  /**
   */
  public static final class JeuBlockingStub extends io.grpc.stub.AbstractStub<JeuBlockingStub> {
    private JeuBlockingStub(io.grpc.Channel channel) {
      super(channel);
    }

    private JeuBlockingStub(io.grpc.Channel channel,
        io.grpc.CallOptions callOptions) {
      super(channel, callOptions);
    }

    @java.lang.Override
    protected JeuBlockingStub build(io.grpc.Channel channel,
        io.grpc.CallOptions callOptions) {
      return new JeuBlockingStub(channel, callOptions);
    }

    /**
     * <pre>
     * The server generates a random number between 1 and 1000
     * </pre>
     */
    public java.util.Iterator<org.example.stubs.JeuOuterClass.Result> start(
        org.example.stubs.JeuOuterClass.Empty request) {
      return blockingServerStreamingCall(
          getChannel(), getStartMethod(), getCallOptions(), request);
    }

    /**
     * <pre>
     * The server announces the winner and the game is over
     * </pre>
     */
    public org.example.stubs.JeuOuterClass.Result stop(org.example.stubs.JeuOuterClass.Empty request) {
      return blockingUnaryCall(
          getChannel(), getStopMethod(), getCallOptions(), request);
    }
  }

  /**
   */
  public static final class JeuFutureStub extends io.grpc.stub.AbstractStub<JeuFutureStub> {
    private JeuFutureStub(io.grpc.Channel channel) {
      super(channel);
    }

    private JeuFutureStub(io.grpc.Channel channel,
        io.grpc.CallOptions callOptions) {
      super(channel, callOptions);
    }

    @java.lang.Override
    protected JeuFutureStub build(io.grpc.Channel channel,
        io.grpc.CallOptions callOptions) {
      return new JeuFutureStub(channel, callOptions);
    }

    /**
     * <pre>
     * The server announces the winner and the game is over
     * </pre>
     */
    public com.google.common.util.concurrent.ListenableFuture<org.example.stubs.JeuOuterClass.Result> stop(
        org.example.stubs.JeuOuterClass.Empty request) {
      return futureUnaryCall(
          getChannel().newCall(getStopMethod(), getCallOptions()), request);
    }
  }

  private static final int METHODID_START = 0;
  private static final int METHODID_STOP = 1;
  private static final int METHODID_GUESS = 2;

  private static final class MethodHandlers<Req, Resp> implements
      io.grpc.stub.ServerCalls.UnaryMethod<Req, Resp>,
      io.grpc.stub.ServerCalls.ServerStreamingMethod<Req, Resp>,
      io.grpc.stub.ServerCalls.ClientStreamingMethod<Req, Resp>,
      io.grpc.stub.ServerCalls.BidiStreamingMethod<Req, Resp> {
    private final JeuImplBase serviceImpl;
    private final int methodId;

    MethodHandlers(JeuImplBase serviceImpl, int methodId) {
      this.serviceImpl = serviceImpl;
      this.methodId = methodId;
    }

    @java.lang.Override
    @java.lang.SuppressWarnings("unchecked")
    public void invoke(Req request, io.grpc.stub.StreamObserver<Resp> responseObserver) {
      switch (methodId) {
        case METHODID_START:
          serviceImpl.start((org.example.stubs.JeuOuterClass.Empty) request,
              (io.grpc.stub.StreamObserver<org.example.stubs.JeuOuterClass.Result>) responseObserver);
          break;
        case METHODID_STOP:
          serviceImpl.stop((org.example.stubs.JeuOuterClass.Empty) request,
              (io.grpc.stub.StreamObserver<org.example.stubs.JeuOuterClass.Result>) responseObserver);
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
        case METHODID_GUESS:
          return (io.grpc.stub.StreamObserver<Req>) serviceImpl.guess(
              (io.grpc.stub.StreamObserver<org.example.stubs.JeuOuterClass.Result>) responseObserver);
        default:
          throw new AssertionError();
      }
    }
  }

  private static abstract class JeuBaseDescriptorSupplier
      implements io.grpc.protobuf.ProtoFileDescriptorSupplier, io.grpc.protobuf.ProtoServiceDescriptorSupplier {
    JeuBaseDescriptorSupplier() {}

    @java.lang.Override
    public com.google.protobuf.Descriptors.FileDescriptor getFileDescriptor() {
      return org.example.stubs.JeuOuterClass.getDescriptor();
    }

    @java.lang.Override
    public com.google.protobuf.Descriptors.ServiceDescriptor getServiceDescriptor() {
      return getFileDescriptor().findServiceByName("Jeu");
    }
  }

  private static final class JeuFileDescriptorSupplier
      extends JeuBaseDescriptorSupplier {
    JeuFileDescriptorSupplier() {}
  }

  private static final class JeuMethodDescriptorSupplier
      extends JeuBaseDescriptorSupplier
      implements io.grpc.protobuf.ProtoMethodDescriptorSupplier {
    private final String methodName;

    JeuMethodDescriptorSupplier(String methodName) {
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
      synchronized (JeuGrpc.class) {
        result = serviceDescriptor;
        if (result == null) {
          serviceDescriptor = result = io.grpc.ServiceDescriptor.newBuilder(SERVICE_NAME)
              .setSchemaDescriptor(new JeuFileDescriptorSupplier())
              .addMethod(getStartMethod())
              .addMethod(getGuessMethod())
              .addMethod(getStopMethod())
              .build();
        }
      }
    }
    return result;
  }
}

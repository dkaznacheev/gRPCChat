package com.example.grpc.chat;

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
    value = "by gRPC proto compiler (version 1.20.0)",
    comments = "Source: chat.proto")
public final class MessageSenderGrpc {

  private MessageSenderGrpc() {}

  public static final String SERVICE_NAME = "com.example.grpc.chat.MessageSender";

  // Static method descriptors that strictly reflect the proto.
  private static volatile io.grpc.MethodDescriptor<com.example.grpc.chat.Chat.Message,
      com.example.grpc.chat.Chat.Reply> getSendMessageMethod;

  @io.grpc.stub.annotations.RpcMethod(
      fullMethodName = SERVICE_NAME + '/' + "sendMessage",
      requestType = com.example.grpc.chat.Chat.Message.class,
      responseType = com.example.grpc.chat.Chat.Reply.class,
      methodType = io.grpc.MethodDescriptor.MethodType.UNARY)
  public static io.grpc.MethodDescriptor<com.example.grpc.chat.Chat.Message,
      com.example.grpc.chat.Chat.Reply> getSendMessageMethod() {
    io.grpc.MethodDescriptor<com.example.grpc.chat.Chat.Message, com.example.grpc.chat.Chat.Reply> getSendMessageMethod;
    if ((getSendMessageMethod = MessageSenderGrpc.getSendMessageMethod) == null) {
      synchronized (MessageSenderGrpc.class) {
        if ((getSendMessageMethod = MessageSenderGrpc.getSendMessageMethod) == null) {
          MessageSenderGrpc.getSendMessageMethod = getSendMessageMethod = 
              io.grpc.MethodDescriptor.<com.example.grpc.chat.Chat.Message, com.example.grpc.chat.Chat.Reply>newBuilder()
              .setType(io.grpc.MethodDescriptor.MethodType.UNARY)
              .setFullMethodName(generateFullMethodName(
                  "com.example.grpc.chat.MessageSender", "sendMessage"))
              .setSampledToLocalTracing(true)
              .setRequestMarshaller(io.grpc.protobuf.ProtoUtils.marshaller(
                  com.example.grpc.chat.Chat.Message.getDefaultInstance()))
              .setResponseMarshaller(io.grpc.protobuf.ProtoUtils.marshaller(
                  com.example.grpc.chat.Chat.Reply.getDefaultInstance()))
                  .setSchemaDescriptor(new MessageSenderMethodDescriptorSupplier("sendMessage"))
                  .build();
          }
        }
     }
     return getSendMessageMethod;
  }

  /**
   * Creates a new async stub that supports all call types for the service
   */
  public static MessageSenderStub newStub(io.grpc.Channel channel) {
    return new MessageSenderStub(channel);
  }

  /**
   * Creates a new blocking-style stub that supports unary and streaming output calls on the service
   */
  public static MessageSenderBlockingStub newBlockingStub(
      io.grpc.Channel channel) {
    return new MessageSenderBlockingStub(channel);
  }

  /**
   * Creates a new ListenableFuture-style stub that supports unary calls on the service
   */
  public static MessageSenderFutureStub newFutureStub(
      io.grpc.Channel channel) {
    return new MessageSenderFutureStub(channel);
  }

  /**
   */
  public static abstract class MessageSenderImplBase implements io.grpc.BindableService {

    /**
     */
    public void sendMessage(com.example.grpc.chat.Chat.Message request,
        io.grpc.stub.StreamObserver<com.example.grpc.chat.Chat.Reply> responseObserver) {
      asyncUnimplementedUnaryCall(getSendMessageMethod(), responseObserver);
    }

    @java.lang.Override public final io.grpc.ServerServiceDefinition bindService() {
      return io.grpc.ServerServiceDefinition.builder(getServiceDescriptor())
          .addMethod(
            getSendMessageMethod(),
            asyncUnaryCall(
              new MethodHandlers<
                com.example.grpc.chat.Chat.Message,
                com.example.grpc.chat.Chat.Reply>(
                  this, METHODID_SEND_MESSAGE)))
          .build();
    }
  }

  /**
   */
  public static final class MessageSenderStub extends io.grpc.stub.AbstractStub<MessageSenderStub> {
    private MessageSenderStub(io.grpc.Channel channel) {
      super(channel);
    }

    private MessageSenderStub(io.grpc.Channel channel,
        io.grpc.CallOptions callOptions) {
      super(channel, callOptions);
    }

    @java.lang.Override
    protected MessageSenderStub build(io.grpc.Channel channel,
        io.grpc.CallOptions callOptions) {
      return new MessageSenderStub(channel, callOptions);
    }

    /**
     */
    public void sendMessage(com.example.grpc.chat.Chat.Message request,
        io.grpc.stub.StreamObserver<com.example.grpc.chat.Chat.Reply> responseObserver) {
      asyncUnaryCall(
          getChannel().newCall(getSendMessageMethod(), getCallOptions()), request, responseObserver);
    }
  }

  /**
   */
  public static final class MessageSenderBlockingStub extends io.grpc.stub.AbstractStub<MessageSenderBlockingStub> {
    private MessageSenderBlockingStub(io.grpc.Channel channel) {
      super(channel);
    }

    private MessageSenderBlockingStub(io.grpc.Channel channel,
        io.grpc.CallOptions callOptions) {
      super(channel, callOptions);
    }

    @java.lang.Override
    protected MessageSenderBlockingStub build(io.grpc.Channel channel,
        io.grpc.CallOptions callOptions) {
      return new MessageSenderBlockingStub(channel, callOptions);
    }

    /**
     */
    public com.example.grpc.chat.Chat.Reply sendMessage(com.example.grpc.chat.Chat.Message request) {
      return blockingUnaryCall(
          getChannel(), getSendMessageMethod(), getCallOptions(), request);
    }
  }

  /**
   */
  public static final class MessageSenderFutureStub extends io.grpc.stub.AbstractStub<MessageSenderFutureStub> {
    private MessageSenderFutureStub(io.grpc.Channel channel) {
      super(channel);
    }

    private MessageSenderFutureStub(io.grpc.Channel channel,
        io.grpc.CallOptions callOptions) {
      super(channel, callOptions);
    }

    @java.lang.Override
    protected MessageSenderFutureStub build(io.grpc.Channel channel,
        io.grpc.CallOptions callOptions) {
      return new MessageSenderFutureStub(channel, callOptions);
    }

    /**
     */
    public com.google.common.util.concurrent.ListenableFuture<com.example.grpc.chat.Chat.Reply> sendMessage(
        com.example.grpc.chat.Chat.Message request) {
      return futureUnaryCall(
          getChannel().newCall(getSendMessageMethod(), getCallOptions()), request);
    }
  }

  private static final int METHODID_SEND_MESSAGE = 0;

  private static final class MethodHandlers<Req, Resp> implements
      io.grpc.stub.ServerCalls.UnaryMethod<Req, Resp>,
      io.grpc.stub.ServerCalls.ServerStreamingMethod<Req, Resp>,
      io.grpc.stub.ServerCalls.ClientStreamingMethod<Req, Resp>,
      io.grpc.stub.ServerCalls.BidiStreamingMethod<Req, Resp> {
    private final MessageSenderImplBase serviceImpl;
    private final int methodId;

    MethodHandlers(MessageSenderImplBase serviceImpl, int methodId) {
      this.serviceImpl = serviceImpl;
      this.methodId = methodId;
    }

    @java.lang.Override
    @java.lang.SuppressWarnings("unchecked")
    public void invoke(Req request, io.grpc.stub.StreamObserver<Resp> responseObserver) {
      switch (methodId) {
        case METHODID_SEND_MESSAGE:
          serviceImpl.sendMessage((com.example.grpc.chat.Chat.Message) request,
              (io.grpc.stub.StreamObserver<com.example.grpc.chat.Chat.Reply>) responseObserver);
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

  private static abstract class MessageSenderBaseDescriptorSupplier
      implements io.grpc.protobuf.ProtoFileDescriptorSupplier, io.grpc.protobuf.ProtoServiceDescriptorSupplier {
    MessageSenderBaseDescriptorSupplier() {}

    @java.lang.Override
    public com.google.protobuf.Descriptors.FileDescriptor getFileDescriptor() {
      return com.example.grpc.chat.Chat.getDescriptor();
    }

    @java.lang.Override
    public com.google.protobuf.Descriptors.ServiceDescriptor getServiceDescriptor() {
      return getFileDescriptor().findServiceByName("MessageSender");
    }
  }

  private static final class MessageSenderFileDescriptorSupplier
      extends MessageSenderBaseDescriptorSupplier {
    MessageSenderFileDescriptorSupplier() {}
  }

  private static final class MessageSenderMethodDescriptorSupplier
      extends MessageSenderBaseDescriptorSupplier
      implements io.grpc.protobuf.ProtoMethodDescriptorSupplier {
    private final String methodName;

    MessageSenderMethodDescriptorSupplier(String methodName) {
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
      synchronized (MessageSenderGrpc.class) {
        result = serviceDescriptor;
        if (result == null) {
          serviceDescriptor = result = io.grpc.ServiceDescriptor.newBuilder(SERVICE_NAME)
              .setSchemaDescriptor(new MessageSenderFileDescriptorSupplier())
              .addMethod(getSendMessageMethod())
              .build();
        }
      }
    }
    return result;
  }
}

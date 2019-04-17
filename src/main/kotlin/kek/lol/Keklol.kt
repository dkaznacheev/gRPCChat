package kek.lol

import com.example.grpc.chat.Chat
import com.example.grpc.chat.MessageSenderGrpc
import io.grpc.stub.StreamObserver

class Keklol : MessageSenderGrpc.MessageSenderImplBase() {
    val messages = mutableListOf<Chat.Message>()

    override fun sendMessage(
        request: Chat.Message,
        responseObserver: StreamObserver<Chat.Reply>
    ) {
        messages.add(request)

        val reply = Chat.Reply.newBuilder().setIsSent(true).build()
        responseObserver.onNext(reply)
        responseObserver.onCompleted()
    }
}
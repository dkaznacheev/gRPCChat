package kek.lol

import io.grpc.ServerBuilder

fun main() {
    ServerBuilder.forPort(8081)
        .addService(Keklol())
        .build()
        .start()
}
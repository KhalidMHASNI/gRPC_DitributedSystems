package org.example.server;

import io.grpc.Server;
import io.grpc.ServerBuilder;
import service.GamegRPCservice;

import java.io.IOException;
public class GamegRPCserver {
    public static void main(String[] args) throws IOException, InterruptedException {

        Server server= ServerBuilder.forPort(6969)
                .addService(new GamegRPCservice())
                .build();
        server.start();
        server.awaitTermination();
    }
}

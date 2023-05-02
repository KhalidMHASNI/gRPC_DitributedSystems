package org.example.server;
import io.grpc.Server;
import io.grpc.ServerBuilder;
import org.example.service.ChatgRPCService;

import java.io.IOException;
public class ChatgRPCServer {
    public static void main(String[] args) throws IOException, InterruptedException {
        Server server= ServerBuilder.forPort(6969)
                .addService(new ChatgRPCService())
                .build();
        server.start();
        server.awaitTermination();
    }
}

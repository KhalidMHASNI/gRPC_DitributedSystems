package org.example.client;
import io.grpc.ManagedChannel;
import io.grpc.ManagedChannelBuilder;
import io.grpc.stub.StreamObserver;
import org.example.stubs.ChatGrpc;
import org.example.stubs.ChatOuterClass.Message;

import java.time.LocalDateTime;
import java.util.Scanner;
import java.util.concurrent.CountDownLatch;
public class chatgRPCClient {
    public static void main(String[] args) throws Exception {
        ManagedChannel managedChannel = ManagedChannelBuilder.forAddress("localhost", 6969)
                .usePlaintext()
                .build();
        ChatGrpc.ChatStub asyncstub = ChatGrpc.newStub(managedChannel);
        CountDownLatch latch = new CountDownLatch(1);
        StreamObserver<Message> requestObserver = asyncstub.chat(new StreamObserver<Message>() {
            @Override
            public void onNext(Message message) {
                System.out.println("[" + message.getTimestamp().getSeconds() + "] " + message.getUserId() + ": " + message.getText());
            }

            @Override
            public void onError(Throwable throwable)  {
                System.out.println(throwable.getMessage());
                latch.countDown();
            }

            @Override
            public void onCompleted()  {
                System.out.println("END");
                latch.countDown();
            }
        });
        Scanner scanner = new Scanner(System.in);
        while (scanner.hasNextLine()) {
            String text = scanner.nextLine();
            if (text.equalsIgnoreCase("exit")) {
                requestObserver.onCompleted();
                break;
            }
            Message message = Message.newBuilder()
                    .setUserId("Client")
                    .setText(text)
                    .setTimestamp(com.google.protobuf.Timestamp.newBuilder().setSeconds(LocalDateTime.now().getSecond()).build())
                    .build();
            requestObserver.onNext(message);
        }

        latch.await();
    }

}

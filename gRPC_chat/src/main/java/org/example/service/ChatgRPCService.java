package org.example.service;
import org.example.stubs.ChatGrpc;
import io.grpc.stub.StreamObserver;
import org.example.stubs.ChatOuterClass.Message;
import com.google.protobuf.Timestamp;
public class ChatgRPCService extends ChatGrpc.ChatImplBase {

    @Override
    public StreamObserver<Message> chat(StreamObserver<Message> responseObserver) {
        // Create a new stream observer that will receive messages from the client
        StreamObserver<Message> requestObserver = new StreamObserver<Message>() {
            @Override
            public void onNext(Message message) {
                // Do something with the received message
                System.out.println("Received message from user " + message.getUserId() + ": " + message.getText());

                // Create a response message with the same timestamp
                Timestamp timestamp = message.getTimestamp();
                Message responseMessage = Message.newBuilder()
                        .setUserId("Server")
                        .setText("Received your message!")
                        .setTimestamp(timestamp)
                        .build();

                // Send the response message back to the client
                responseObserver.onNext(responseMessage);
            }

            @Override
            public void onError(Throwable t) {
                System.err.println("Error in chat() method: " + t);
            }

            @Override
            public void onCompleted() {
                responseObserver.onCompleted();
            }
        };

        // Return the new stream observer that will receive messages from the client
        return requestObserver;
    }

}

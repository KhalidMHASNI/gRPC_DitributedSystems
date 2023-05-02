import grpc
import chat_pb2
import chat_pb2_grpc

def chat():
    # Create a channel to the gRPC server
    channel = grpc.insecure_channel('localhost:6969')

    # Create a stub for the service
    stub = chat_pb2_grpc.ChatStub(channel)

    # Prompt the user to enter a stream of messages
    print("Enter a stream of messages (type 'exit' to end the stream):")
    while True:
        # Read a message from the user
        message_text = input("> ")
        if message_text == "exit":
            break

        # Create a message object
        message = chat_pb2.Message(
            user_id='Python Client',
            text=message_text
        )

        # Send the message to the server and print the response
        response = stub.Chat(iter([message]))
        for message in response:
            print(message)

if __name__ == '__main__':
    chat()
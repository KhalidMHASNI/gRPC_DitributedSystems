import grpc
import jeu_pb2
import jeu_pb2_grpc

def run():
    # Prompt user to enter their name
    username = input("Please enter your name: ")

    with grpc.insecure_channel('localhost:6969') as channel:
        stub = jeu_pb2_grpc.JeuStub(channel)

        # Call the Start method to initiate the game
        start_response = stub.Start(jeu_pb2.Empty())
        print(next(start_response).message)

        # Loop until the game is over
        while True:
            guess = input("Guess a number between 1 and 1000: ")
            try:
                guess = int(guess)
            except ValueError:
                print("Please enter a valid integer.")
                continue

            # Send the guess to the server and get a response
            guess_request = jeu_pb2.GuessRequest(guess=guess, username=username)
            guess_response = stub.Guess(iter([guess_request]))

            # Print the server's response
            for result in guess_response:
                print(result.message)
                if result.winner:
                    print("The winner is: {}".format(result.winner))
                    return

if __name__ == '__main__':
    run()
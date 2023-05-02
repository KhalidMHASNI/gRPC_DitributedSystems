package service;
import io.grpc.stub.StreamObserver;
import org.example.stubs.JeuGrpc;
import org.example.stubs.JeuOuterClass.Empty;
import org.example.stubs.JeuOuterClass.GuessRequest;
import org.example.stubs.JeuOuterClass.Result;

import java.util.ArrayList;
import java.util.List;
import java.util.Random;
public class GamegRPCservice extends JeuGrpc.JeuImplBase {
    private int secretNumber;
    private String winnerName;
    private boolean gameOver;
    private List<String> winners = new ArrayList<>();
    private StreamObserver<Result> startResponseObserver;

    public GamegRPCservice() {
        // Generate a random number between 1 and 1000 at server startup
        Random random = new Random();
        secretNumber = random.nextInt(1000) + 1;
        System.out.println("Le nombre secret est : " + secretNumber);
    }

    @Override
    public void start(Empty request, StreamObserver<Result> responseObserver) {
        startResponseObserver = responseObserver;
        startResponseObserver.onNext(Result.newBuilder().setMessage("The game has started and the secret number has been generated. Guess a number between 1 and 1000!").build());
    }

    @Override
    public StreamObserver<GuessRequest> guess(StreamObserver<Result> responseObserver) {
        // Create a new stream observer that will receive guess requests from the client
        StreamObserver<GuessRequest> requestObserver = new StreamObserver<GuessRequest>() {
            private int guessCount = 0;

            @Override
            public void onNext(GuessRequest guessRequest) {
                // Check if game is over
                if (gameOver) {
                    return;
                }
                guessCount++;

                // Check if the guess is higher or lower than the secret number
                int guess = guessRequest.getGuess();
                String message;
                if (guess < secretNumber) {
                    message = "Votre nombre est plus petit";
                } else if (guess > secretNumber) {
                    message = "Votre nombre est plus grand";
                } else {
                    synchronized (winners) {
                        winners.add(guessRequest.getUsername());
                        winnerName = guessRequest.getUsername();
                        gameOver = true;
                        if (winners.size() == 1) {
                            message = "BRAVO " + guessRequest.getUsername() + " est le gagnant !";
                        } else {
                            message = "BRAVO " + String.join(" et ", winners) + " sont les gagnants !";
                        }
                        startResponseObserver.onNext(Result.newBuilder().setMessage("Game over " + message).build());
                        startResponseObserver.onCompleted();
                        responseObserver.onNext(Result.newBuilder().setMessage(message).build());
                    }

                }
                if (!gameOver) {
                    responseObserver.onNext(Result.newBuilder().setMessage(message).build());
                }
            }

            @Override
            public void onError(Throwable throwable) {
                System.err.println("Error in guess() method: " + throwable);
            }

            @Override
            public void onCompleted() {
                responseObserver.onCompleted();

            }
        };
        return requestObserver;
    }

    @Override
    public void stop(Empty request, StreamObserver<Result> responseObserver) {
        // Check if the game is over
        if (gameOver) {
            String message = "Game over, the winner is " + winnerName + " and the secret number is " + secretNumber;
            Result result = Result.newBuilder().setMessage(message).setWinner(winnerName).build();
            responseObserver.onNext(result);
        } else {
            responseObserver.onError(new RuntimeException("The game has not finished yet"));
        }
    }
}
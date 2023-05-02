package org.example.Client;

import io.grpc.ManagedChannel;
import io.grpc.ManagedChannelBuilder;
import org.example.stubs.Bank;
import org.example.stubs.BankServiceGrpc;

public class BankGrpcClient1 {
    public static void main(String[] args) {
        ManagedChannel managedChannel = ManagedChannelBuilder.forAddress("localhost", 5555)
                .usePlaintext()
                .build();
        BankServiceGrpc.BankServiceBlockingStub blockingStub = BankServiceGrpc.newBlockingStub(managedChannel);
        Bank.ConvertCurrencyRequest request = Bank.ConvertCurrencyRequest.newBuilder()
                .setCurrencyFrom("DH").setCurrencyTo("USD").setAmount(6500).build();
        Bank.ConvertCurrencyResponse convertResponse = blockingStub.convert(request);
        System.out.println(convertResponse.toString());

    }
}

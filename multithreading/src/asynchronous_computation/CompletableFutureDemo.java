package asynchronous_computation;

import java.util.concurrent.CompletableFuture;

public class CompletableFutureDemo {
    public static void main(String[] args) {
        CompletableFuture<String> future1  = CompletableFuture.supplyAsync(()-> "hello");
        CompletableFuture<String> future2 = CompletableFuture.supplyAsync(()->"beautiful");
        CompletableFuture<String> future3 = CompletableFuture.supplyAsync(()->"World");

        CompletableFuture<Void> combinedFutures = CompletableFuture.allOf(future1,future2,future3);

    }
}

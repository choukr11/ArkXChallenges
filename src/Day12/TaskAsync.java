package Day12;

import java.util.concurrent.CompletableFuture;
import java.util.concurrent.ExecutionException;

public class TaskAsync extends Task implements Runnable {
    String[] taskName = {"Task X", "Task Y", "Task Z"};
    int[] duration = {2000, 1500, 3000};

    @Override
    public void run() {
        System.out.println("Asynchronous Task Execution:");

        CompletableFuture<Void> future0 = CompletableFuture.runAsync(() -> {
            System.out.println("Task " + taskName[0] + " started asynchronously.");
            try {
                Thread.sleep(duration[0]);
            } catch (InterruptedException e) {
                throw new RuntimeException(e);
            }
            System.out.println("Task " + taskName[0] + " completed asynchronously! (Duration: " + duration[0] + " ms)");
        });

        CompletableFuture<Void> future1 = CompletableFuture.runAsync(() -> {
            System.out.println("Task " + taskName[1] + " started asynchronously.");
            try {
                Thread.sleep(duration[1]);
            } catch (InterruptedException e) {
                throw new RuntimeException(e);
            }
            System.out.println("Task " + taskName[1] + " completed asynchronously! (Duration: " + duration[1] + " ms)");
        });

        CompletableFuture<Void> future2 = CompletableFuture.runAsync(() -> {
            System.out.println("Task " + taskName[2] + " started asynchronously.");
            try {
                Thread.sleep(duration[2]);
            } catch (InterruptedException e) {
                throw new RuntimeException(e);
            }
            System.out.println("Task " + taskName[2] + " completed asynchronously! (Duration: " + duration[2] + " ms)");
        });

        try {
            future0.get();
            future1.get();
            future2.get();
        } catch (InterruptedException | ExecutionException e) {
            throw new RuntimeException(e);
        }
    }
}
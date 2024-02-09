package Day12;

public class Main {
    public static void main(String[] args) throws InterruptedException {

        // Sync Thread:
        TaskSync syncTasks = new TaskSync();
        Thread thread1 = new Thread(syncTasks);

        // Async Thread:
        TaskAsync asyncTask = new TaskAsync();
        Thread thread2 = new Thread(asyncTask);

        // Concurrency Thread:
        Task concurrencyTasks = new Task();
        Thread conccurrencyThread = new Thread(concurrencyTasks);

        //Sync:
        thread1.start();
        thread1.join();

        // Async:
        thread2.start();
        thread2.join();

        // Concurrency
        conccurrencyThread.start();

    }
}
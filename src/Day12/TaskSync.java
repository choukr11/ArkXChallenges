package Day12;

public class TaskSync extends Task implements Runnable {
    String[] taskName = {"A", "B", "C"};
    int[] duration = {2000, 1500, 3000};


    @Override
    public void run() {
        System.out.println("Synchronous Task Execution:");
        for (int i = 0; i < 3; i++) {
            System.out.print("Executing " + taskName[i] + " ...");
            try {
                Thread.sleep(duration[i]);
                System.out.println(" Completed! (Duration:  " + duration[i] + " ms)");
            } catch (InterruptedException e) {
                throw new RuntimeException(e);
            }
        }
    }
}
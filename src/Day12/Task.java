package Day12;

public class Task extends Thread implements Runnable {
    String[] taskId = {"A-001", "B-002", "C-003"};
    String[] taskName = {"Alpha", "Beta", "Gamma"};
    int[] duration = {2000, 1500, 1000};

    @Override
    public void run() {
        System.out.println("Concurrent Task Execution:");

// Using the Thread class:
        Thread conc1 = new Thread(() -> {

            System.out.println("Task " + taskName[0] + " started concurrently.");
//            Thread.currentThread().setPriority(Thread.MIN_PRIORITY);
            try {
                Thread.sleep(duration[0]);
                System.out.println(" Task " + taskName[0] + " completed concurrently! (Duration:  " + duration[0] + " ms)");
            } catch (InterruptedException e) {
                throw new RuntimeException(e);
            }
        });
        Thread conc2 = new Thread(() -> {
            System.out.println("Task " + taskName[1] + " started concurrently.");
//            Thread.currentThread().setPriority(Thread.NORM_PRIORITY);

            try {
                        Thread.sleep(duration[1]);
                        System.out.println(" Task " + taskName[1] + " completed concurrently! (Duration:  " + duration[1] + " ms)");
                    } catch (InterruptedException e) {
                        throw new RuntimeException(e);
                    }
                });
        Thread conc3 = new Thread(() -> {
            System.out.println("Task " + taskName[2] + " started concurrently.");
//            Thread.currentThread().setPriority(Thread.MAX_PRIORITY);
            try {
                Thread.sleep(duration[2]);
                System.out.println(" Task " + taskName[2] + " completed concurrently! (Duration:  " + duration[2] + " ms)");
            } catch (InterruptedException e) {
                throw new RuntimeException(e);
            }
        });

        conc1.setPriority(1);
        conc2.setPriority(5);
        conc3.setPriority(10);

        conc1.start();
        conc2.start();
        conc3.start();
    }
}
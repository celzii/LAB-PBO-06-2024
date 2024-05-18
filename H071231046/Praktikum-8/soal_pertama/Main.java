import java.util.concurrent.*;
import java.util.concurrent.atomic.AtomicInteger;

class BackgroundThread implements Runnable {
    private int id;
    private CountDownLatch latch;
    private AtomicInteger successCounter;
    private AtomicInteger failureCounter;

    public BackgroundThread(int id, CountDownLatch latch, AtomicInteger successCounter, AtomicInteger failureCounter) {
        this.id = id;
        this.latch = latch;
        this.successCounter = successCounter;
        this.failureCounter = failureCounter;
    }

    // Method to be executed when thread is started
    @Override
    public void run() {
        try {
            // Get random execution time for this thread
            int executionTime = TaskTimeHelper.getRandomTime();
            if (executionTime > 4) {
                failureCounter.incrementAndGet();
            } else {
                TimeUnit.SECONDS.sleep(executionTime);
                successCounter.incrementAndGet();
            }
        } catch (InterruptedException e) {
            e.printStackTrace();
        } finally {
            latch.countDown();
        }
    }
}

public class Main {
    public static void main(String[] args) throws InterruptedException {
        int dataSources = 4; // jumlah_data_sumber
        System.out.println("Start load " + dataSources + " Data");

        // Create a thread pool with 3 threads
        ExecutorService executor = Executors.newFixedThreadPool(3);
        CountDownLatch latch = new CountDownLatch(dataSources);
        AtomicInteger successCounter = new AtomicInteger(0); // jumlah data yang berhasil di load
        AtomicInteger failureCounter = new AtomicInteger(0); // jumlah data yang gagal di load

        // Create and execute a BackgroundThread for each data source
        for (int i = 1; i <= dataSources; i++) {
            executor.submit(new BackgroundThread(i, latch, successCounter, failureCounter));
        }
        executor.shutdown();
        int seconds = 0;

         // Selama executor belum selesai, cetak "Loading..." setiap detik
        while (!latch.await(1, TimeUnit.SECONDS)) {
            int finalSeconds = ++seconds; // waktu eksekusi dalam detik
            System.out.println("Loading... (" + finalSeconds + "s)");
        }
        int finalSeconds1 = seconds; // waktu yang dibutuhkan untuk meload semua data
        System.out.println("\nTask Finish.");
        System.out.println("Time Execution : " + finalSeconds1 + "s");
        int successCount = successCounter.get();
        int failureCount = failureCounter.get();
        if (failureCount == 0) {
            System.out.println("All data is successfully loaded");
        } else {
            System.out.println(successCount + " Data Successfully loaded & " + failureCount + " Data failed to load");
        }
    }
}



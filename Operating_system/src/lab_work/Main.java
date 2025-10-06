package lab_work;

import java.util.concurrent.Semaphore;
import java.util.Random;

public class Main {
    static Semaphore mutex = new Semaphore(1);  
    static Semaphore wrt = new Semaphore(1);    
    static int readerCount = 0;
    static Random random = new Random();

    static void log(String msg) {
        System.out.println(msg);
    }

    public static void main(String[] args) {
        log("=== Readers-Writers Problem ===\n");

        // Create 3 readers using lambda
        for (int i = 1; i <= 3; i++) {
            final int id = i;
            Thread reader = new Thread(() -> {
                try {
                    while (true) {
                        mutex.acquire();
                        readerCount++;
                        if (readerCount == 1) wrt.acquire();
                        mutex.release();
                        
                        log("Reader " + id + " READING (Active: " + readerCount + ")");
                        Thread.sleep(500 + random.nextInt(1000));
                        
                        mutex.acquire();
                        readerCount--;
                        if (readerCount == 0) wrt.release();
                        mutex.release();
                        
                        Thread.sleep(1000 + random.nextInt(1000));
                    }
                } catch (InterruptedException e) {
                    Thread.currentThread().interrupt();
                }
            });
            reader.setDaemon(true);
            reader.start();
        }

        // Create 2 writers using lambda
        for (int i = 1; i <= 2; i++) {
            final int id = i;
            Thread writer = new Thread(() -> {
                try {
                    while (true) {
                        wrt.acquire();
                        log("Writer " + id + " WRITING...");
                        Thread.sleep(1000 + random.nextInt(1000));
                        wrt.release();
                        Thread.sleep(2000 + random.nextInt(1000));
                    }
                } catch (InterruptedException e) {
                    Thread.currentThread().interrupt();
                }
            });
            writer.setDaemon(true);
            writer.start();
        }

        try {
            Thread.sleep(15000);
            log("\n=== Simulation Complete ===");
        } catch (InterruptedException e) {
            e.printStackTrace();
        }
    }
}
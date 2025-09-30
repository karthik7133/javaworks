package lab_work;

import java.util.Arrays;

public class BankerAlgorithm {

    private int[] available;
    private int[][] maximum;
    private int[][] allocation;
    private int[][] need;
    private int numProcesses;
    private int numResources;

    public BankerAlgorithm(int[] available, int[][] maximum, int[][] allocation) {
        this.available = available;
        this.maximum = maximum;
        this.allocation = allocation;
        this.numProcesses = maximum.length;
        this.numResources = available.length;
        this.need = new int[numProcesses][numResources];
        calculateNeedMatrix();
    }

    private void calculateNeedMatrix() {
        for (int i = 0; i < numProcesses; i++) {
            for (int j = 0; j < numResources; j++) {
                need[i][j] = maximum[i][j] - allocation[i][j];
            }
        }
    }

    public boolean isSafeState() {
        int[] work = Arrays.copyOf(available, numResources);
        boolean[] finish = new boolean[numProcesses];
        int[] safeSequence = new int[numProcesses];
        int count = 0;

        while (count < numProcesses) {
            boolean found = false;
            for (int p = 0; p < numProcesses; p++) {
                if (!finish[p]) {
                    boolean canExecute = true;
                    for (int j = 0; j < numResources; j++) {
                        if (need[p][j] > work[j]) {
                            canExecute = false;
                            break;
                        }
                    }

                    if (canExecute) {
                        for (int j = 0; j < numResources; j++) {
                            work[j] += allocation[p][j];
                        }
                        safeSequence[count++] = p;
                        finish[p] = true;
                        found = true;
                    }
                }
            }
            if (!found) {
                System.out.println("System is in an unsafe state. Deadlock may occur.");
                return false;
            }
        }

        System.out.print("System is in a safe state. Safe sequence is: ");
        for (int i = 0; i < numProcesses; i++) {
            System.out.print("P" + safeSequence[i]);
            if (i < numProcesses - 1) {
                System.out.print(" -> ");
            }
        }
        System.out.println();
        return true;
    }

    public static void main(String[] args) {
        // Given data
        int[] available = {3, 3, 2};
        int[][] maximum = {
            {7, 5, 3}, // p0
            {3, 2, 2}, // p1
            {9, 0, 2}, // p2
            {2, 2, 2}, // p3
            {4, 3, 3}  // p4
        };
        int[][] allocation = {
            {0, 1, 0}, // p0
            {2, 0, 0}, // p1
            {3, 0, 2}, // p2
            {2, 1, 1}, // p3
            {0, 0, 2}  // p4
        };

        BankerAlgorithm banker = new BankerAlgorithm(available, maximum, allocation);
        banker.isSafeState();
    }
}
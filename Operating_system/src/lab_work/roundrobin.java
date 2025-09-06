package lab_work;
import java.util.*;

public class RoundRobin {
    public static void main(String[] args) {
        Scanner scanner = new Scanner(System.in);
        
        System.out.print("Enter number of processes: ");
        int n = scanner.nextInt();
        
        System.out.print("Enter time quantum: ");
        int timeQuantum = scanner.nextInt();
        
        List<Process> processes = new ArrayList<>();
        
        System.out.println("Enter PID, Arrival Time, Burst Time for each process:");
        for (int i = 0; i < n; i++) {
            System.out.print("Process " + (i + 1) + ": ");
            int pid = scanner.nextInt();
            int arrivalTime = scanner.nextInt();
            int burstTime = scanner.nextInt();
            processes.add(new Process(pid, arrivalTime, burstTime));
        }
        
        // Sort processes by arrival time
        processes.sort(Comparator.comparingInt(p -> p.arrivalTime));
        
        calculateRoundRobin(processes, timeQuantum);
        
        scanner.close();
    }
    
    static void calculateRoundRobin(List<Process> processes, int timeQuantum) {
        int n = processes.size();
        int[] remainingTime = new int[n];
        int[] completionTime = new int[n];
        int[] turnaroundTime = new int[n];
        int[] waitingTime = new int[n];
        
        // Initialize remaining time
        for (int i = 0; i < n; i++) {
            remainingTime[i] = processes.get(i).burstTime;
        }
        
        int currentTime = 0;
        int completed = 0;
        Queue<Integer> queue = new LinkedList<>();
        
        // Add first process that arrives at time 0
        int index = 0;
        while (index < n && processes.get(index).arrivalTime <= currentTime) {
            queue.add(index);
            index++;
        }
        
        while (completed < n) {
            if (queue.isEmpty()) {
                currentTime++;
                // Check if any new processes arrived during this time
                while (index < n && processes.get(index).arrivalTime <= currentTime) {
                    queue.add(index);
                    index++;
                }
                continue;
            }
            
            int currentIndex = queue.poll();
            Process currentProcess = processes.get(currentIndex);
            
            // Execute for time quantum or remaining time, whichever is smaller
            int executionTime = Math.min(remainingTime[currentIndex], timeQuantum);
            remainingTime[currentIndex] -= executionTime;
            currentTime += executionTime;
            
            // Add any new processes that arrived during execution
            while (index < n && processes.get(index).arrivalTime <= currentTime) {
                queue.add(index);
                index++;
            }
            
            // If process is not completed, add it back to queue
            if (remainingTime[currentIndex] > 0) {
                queue.add(currentIndex);
            } else {
                // Process completed
                completed++;
                completionTime[currentIndex] = currentTime;
                turnaroundTime[currentIndex] = completionTime[currentIndex] - currentProcess.arrivalTime;
                waitingTime[currentIndex] = turnaroundTime[currentIndex] - currentProcess.burstTime;
            }
        }
        
        // Calculate averages
        double avgTAT = 0, avgWT = 0;
        System.out.println("\nRound Robin Scheduling Results:");
        System.out.println("PID\tAT\tBT\tCT\tTAT\tWT");
        for (int i = 0; i < n; i++) {
            Process p = processes.get(i);
            System.out.println(p.pid + "\t" + p.arrivalTime + "\t" + p.burstTime + "\t" + 
                             completionTime[i] + "\t" + turnaroundTime[i] + "\t" + waitingTime[i]);
            
            avgTAT += turnaroundTime[i];
            avgWT += waitingTime[i];
        }
        
        avgTAT /= n;
        avgWT /= n;
        
        System.out.printf("\nAverage Turnaround Time: %.2f", avgTAT);
        System.out.printf("\nAverage Waiting Time: %.2f", avgWT);
    }
    
    static class Process {
        int pid;
        int arrivalTime;
        int burstTime;
        
        public Process(int pid, int arrivalTime, int burstTime) {
            this.pid = pid;
            this.arrivalTime = arrivalTime;
            this.burstTime = burstTime;
        }
    }
}
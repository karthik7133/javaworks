package lab_work;
import java.util.*;

class Process {
    int id;     // Process ID
    int at;     // Arrival Time
    int bt;     // Burst Time
    int rt;     // Remaining Time
    int ct;     // Completion Time
    int tat;    // Turnaround Time
    int wt;     // Waiting Time

    Process(int id, int at, int bt) {
        this.id = id;
        this.at = at;
        this.bt = bt;
        this.rt = bt;  // Initially remaining = burst
    }
}

public class srj {
    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);

        // Input section
        System.out.print("Enter number of processes: ");
        int n = sc.nextInt();

        List<Process> processes = new ArrayList<>();
        for (int i = 0; i < n; i++) {
            System.out.print("Enter arrival and burst time for P" + (i+1) + ": ");
            int at = sc.nextInt();
            int bt = sc.nextInt();
            processes.add(new Process(i+1, at, bt));
        }

        int time = 0, completed = 0;
        while (completed < n) {
            Process current = null;

            // Find process with minimum remaining time (that has arrived)
            for (Process p : processes) {
                if (p.at <= time && p.rt > 0) {
                    if (current == null || p.rt < current.rt) {
                        current = p;
                    }
                }
            }

            if (current == null) { // No process available now
                time++;
                continue;
            }

            // Run process for 1 unit of time
            current.rt--;
            time++;

            if (current.rt == 0) { // Process finished
                completed++;
                current.ct = time;
                current.tat = current.ct - current.at;
                current.wt = current.tat - current.bt;
            }
        }

        // Display output
        System.out.println("\nP\tAT\tBT\tCT\tTAT\tWT");
        int totalTAT = 0, totalWT = 0;
        for (Process p : processes) {
            totalTAT += p.tat;
            totalWT += p.wt;
            System.out.println("P" + p.id + "\t" + p.at + "\t" + p.bt + "\t" +
                               p.ct + "\t" + p.tat + "\t" + p.wt);
        }

        System.out.println("\nAverage TAT = " + (double) totalTAT / n);
        System.out.println("Average WT = " + (double) totalWT / n);

        sc.close();
    }
}

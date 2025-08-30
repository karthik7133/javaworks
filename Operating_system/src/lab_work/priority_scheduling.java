package lab_work;
import java.util.*;
public class priority_scheduling {
	public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);
        
        System.out.print("Enter number of processes: ");
        int n = sc.nextInt();
        List<Process> processes = new ArrayList<>();
        
        for (int i = 0; i < n; i++) {
            System.out.print("Enter AT, BT and Priority of process P" + (i + 1) + ": ");
            int at = sc.nextInt();
            int bt = sc.nextInt();
            int priority = sc.nextInt();
            processes.add(new Process(i + 1, at, bt, priority));
        }
        
        processes.sort((p1, p2) -> p1.at - p2.at);
        
        int time = 0, completed = 0;
        Process current = null;
        
        while (completed < n) {
            Process highest = null;
            for (Process p : processes) {
                if (!p.completed && p.at <= time) {
                    if (highest == null || p.priority > highest.priority) {
                        highest = p;
                    }
                }
            }
            
            if (highest != null) {
                if (current != highest && highest.st == -1) {
                    highest.st = time;
                }
                current = highest;
                highest.rt--;
                time++;
                
                if (highest.rt == 0) {
                    highest.ct = time;
                    highest.tat = highest.ct - highest.at;
                    highest.wt = highest.tat - highest.bt;
                    highest.completed = true;
                    completed++;
                    current = null;
                }
            } else {
                time++;
            }
        }
        
        double avgWT = 0, avgTAT = 0;
        System.out.println("\nPID\tAT\tBT\tPriority\tCT\tTAT\tWT");
        System.out.println("-------------------------------------------------------");
        
        for (Process p : processes) {
            avgWT += p.wt;
            avgTAT += p.tat;
            System.out.printf("P%d\t%d\t%d\t%d\t\t%d\t%d\t%d\n", 
                p.id, p.at, p.bt, p.priority, p.ct, p.tat, p.wt);
        }
        
        System.out.printf("\nAverage Waiting Time: %.2f\n", avgWT / n);
        System.out.printf("Average Turnaround Time: %.2f\n", avgTAT / n);
        
        sc.close();
    }
}

class Process {
    int id, at, bt, priority, rt, st = -1, ct, wt, tat;
    boolean completed;

    public Process(int id, int at, int bt, int priority) {
        this.id = id;
        this.at = at;
        this.bt = bt;
        this.priority = priority;
        this.rt = bt;
    }
}



	
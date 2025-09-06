package lab_work;
import java.util.*;

class roundrobin {
    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);

        System.out.print("Enter number of processes: ");
        int n = sc.nextInt();

        int[] at = new int[n];
        int[] bt = new int[n];
        int[] rt = new int[n];
        int[] ct = new int[n];
        int[] tat = new int[n];
        int[] wt = new int[n];
        System.out.print("Enter arrival time and burst time of process : ");
        for (int i = 0; i < n; i++) {
            
            at[i] = sc.nextInt();
            bt[i] = sc.nextInt();
            rt[i] = bt[i];
        }

        System.out.print("Enter time quantum: ");
        int tq = sc.nextInt();

        Queue<Integer> q = new LinkedList<>();
        int time = 0;
        boolean[] inQueue = new boolean[n];
        int completed = 0;

        while (completed < n) {
            for (int i = 0; i < n; i++) {
                if (at[i] <= time && rt[i] > 0 && !inQueue[i]) {
                    q.add(i);
                    inQueue[i] = true;
                }
            }

            if (q.isEmpty()) {
                time++;
                continue;
            }

            int i = q.poll();
            int exec = Math.min(tq, rt[i]);
            rt[i] -= exec;
            time += exec;

            for (int j = 0; j < n; j++) {
                if (at[j] <= time && rt[j] > 0 && !inQueue[j]) {
                    q.add(j);
                    inQueue[j] = true;
                }
            }

            if (rt[i] > 0) {
                q.add(i);
            } else {
                ct[i] = time;
                completed++;
            }
        }

        for (int i = 0; i < n; i++) {
            tat[i] = ct[i] - at[i];
            wt[i] = tat[i] - bt[i];
        }

        System.out.println("\nProcess\tAT\tBT\tCT\tTAT\tWT");
        for (int i = 0; i < n; i++) {
            System.out.println("P" + (i + 1) + "\t" + at[i] + "\t" + bt[i] + "\t" + ct[i] + "\t" + tat[i] + "\t" + wt[i]);
        }

        float avgWT = 0, avgTAT = 0;
        for (int i = 0; i < n; i++) {
            avgWT += wt[i];
            avgTAT += tat[i];
        }
        System.out.println("\nAverage Waiting Time: " + (avgWT / n));
        System.out.println("Average Turnaround Time: " + (avgTAT / n));
    }
}
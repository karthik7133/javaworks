package week_4;

import java.util.*;

class RoundRobin
{
	public static void main(String[] args) {
		Scanner sc=new Scanner(System.in);
		int n=sc.nextInt();
		
		int[] at=new int[n];
		int[] bt=new int[n];
		int[] rt=new int[n];
		int[] ct=new int[n];
		int[] wt=new int[n];
		int[] tat=new int[n];
		
		for(int i=0;i<n;i++)
		{
			at[i]=sc.nextInt();
			bt[i]=sc.nextInt();
			rt[i]=bt[i];
		}
		
		int tq=sc.nextInt();
		
		int t=0,c=0;
		Queue<Integer> q=new LinkedList<>();
		boolean[] v=new boolean[n];
		
		while(c<n)
		{
			for(int i=0;i<n;i++)
			{
				if(at[i]<=t && rt[i]>0 && !v[i])
				{
					q.add(i);
					v[i]=true;
				}
			}
			
			if(q.isEmpty())
			{
				t++;
				continue;
			}
			
			int x=q.poll();
			int e=Math.min(rt[x],tq);
			rt[x]-=e;
			t+=e;
			
			for(int i=0;i<n;i++)
			{
				if(at[i]<=t && rt[i]>0 && !v[i])
				{
					q.add(i);
					v[i]=true;
				}
			}
			
			if(rt[x]>0)
			{
				q.add(x);
			}
			else
			{
				ct[x]=t;
				c++;
			}
			
		}
		double w1=0,t1=0;
		System.out.println("\nProcess\tAT\tBT\tCT\tTAT\tWT");
        for (int i = 0; i < n; i++) {
            tat[i]=ct[i]-at[i];
            wt[i]=tat[i]-bt[i];
            w1 += wt[i];
            t1 += tat[i];
            System.out.println("P" + (i + 1) + "\t" + at[i] + "\t" + bt[i] + "\t" + ct[i] + "\t" + tat[i] + "\t" + wt[i]);
        }
        System.out.println("\nAverage Waiting Time: " + (w1/ n));
        System.out.println("Average Turnaround Time: " + (t1 / n));
		
	}
}


//import java.util.*;
//public class RoundRobin {
//
//	public static void main(String[] args) {
//		// TODO Auto-generated method stub
//		Scanner sc=new Scanner(System.in);
//		int n=sc.nextInt();
//		
//		int []at=new int[n];
//		int []bt=new int[n];
//		int []rt=new int[n];
//		int []ct=new int[n];
//		int []tat=new int[n];
//		int []wt=new int[n];
//		
//		for(int i=0;i<n;i++)
//		{
//			at[i]=sc.nextInt();
//			bt[i]=sc.nextInt();
//			rt[i]=bt[i];
//		}
//		System.out.println("Enter tq:");
//		int tq=sc.nextInt();
//		
//		int t=0,c=0;
//		Queue<Integer> q=new LinkedList<>();
//		boolean[] v=new boolean[n];
//		
//		while(c<n)
//		{
//			for(int i=0;i<n;i++)
//			{
//				if(at[i]<=t && rt[i]>0 && !v[i])
//				{
//					q.add(i);
//					v[i]=true;
//				}
//			}
//			
//			if(q.isEmpty())
//			{
//				t++;
//				continue;
//			}
//			
//			int x=q.poll();
//			int e=Math.min(tq, rt[x]);
//			rt[x]-=e;
//			t+=e;
//			
//			for(int i=0;i<n;i++)
//			{
//				if(at[i]<=t && rt[i]>0 && !v[i])
//				{
//					q.add(i);
//					v[i]=true;
//				}
//			}
//			
//			if(rt[x] > 0)
//			{
//				q.add(x);
//			}
//			else
//			{
//				ct[x]=t;
//				c++;
//			}
//			
//		}
//
//        float avgWT = 0, avgTAT = 0;
//		System.out.println("\nProcess\tAT\tBT\tCT\tTAT\tWT");
//        for (int i = 0; i < n; i++) {
//            tat[i]=ct[i]-at[i];
//            wt[i]=tat[i]-bt[i];
//            avgWT += wt[i];
//            avgTAT += tat[i];
//            System.out.println("P" + (i + 1) + "\t" + at[i] + "\t" + bt[i] + "\t" + ct[i] + "\t" + tat[i] + "\t" + wt[i]);
//        }
//        System.out.println("\nAverage Waiting Time: " + (avgWT / n));
//        System.out.println("Average Turnaround Time: " + (avgTAT / n));
//    
//	}
//
//}
//
//import java.util.*;
//
//public class RoundRobin{
//    public static void main(String[] args) {
//        Scanner sc = new Scanner(System.in);
//
//        System.out.print("Enter number of processes: ");
//        int n = sc.nextInt();
//
//        int[] at = new int[n];
//        int[] bt = new int[n];
//        int[] rt = new int[n];
//        int[] ct = new int[n];
//        int[] tat = new int[n];
//        int[] wt = new int[n];
//
//        for (int i = 0; i < n; i++) {
//            System.out.print("Enter Arrival and Burst time for P" + (i + 1) + ": ");
//            at[i] = sc.nextInt();
//            bt[i] = sc.nextInt();
//            rt[i] = bt[i];
//        }
//
//        System.out.print("Enter Time Quantum: ");
//        int tq = sc.nextInt();
//
//        Queue<Integer> q = new LinkedList<>();
//        boolean[] inQueue = new boolean[n];
//
//        int time = 0, completed = 0;
//
//        while (completed < n) {
//            // Add new arrivals to the queue
//            for (int i = 0; i < n; i++) {
//                if (at[i] <= time && rt[i] > 0 && !inQueue[i]) {
//                    q.add(i);
//                    inQueue[i] = true;
//                }
//            }
//
//            // If queue is empty, move time forward
//            if (q.isEmpty()) {
//                time++;
//                continue;
//            }
//
//            int idx = q.poll();
//            inQueue[idx] = false;
//
//            // Execute for min(remaining, tq)
//            int exec = Math.min(rt[idx], tq);
//            rt[idx] -= exec;
//            time += exec;
//
//            // Add any newly arrived processes during this exec
//            for (int i = 0; i < n; i++) {
//                if (at[i] <= time && rt[i] > 0 && !inQueue[i]) {
//                    q.add(i);
//                    inQueue[i] = true;
//                }
//            }
//
//            // If process still needs time, requeue it
//            if (rt[idx] > 0) {
//                q.add(idx);
//                inQueue[idx] = true;
//            } else {
//                // Process finished
//                completed++;
//                ct[idx] = time;
//            }
//        }
//
//        // Calculate TAT and WT
//        double totalTAT = 0, totalWT = 0;
//        System.out.println("\nP\tAT\tBT\tCT\tTAT\tWT");
//        for (int i = 0; i < n; i++) {
//            tat[i] = ct[i] - at[i];
//            wt[i] = tat[i] - bt[i];
//            totalTAT += tat[i];
//            totalWT += wt[i];
//            System.out.println("P" + (i + 1) + "\t" + at[i] + "\t" + bt[i] + "\t" +
//                    ct[i] + "\t" + tat[i] + "\t" + wt[i]);
//        }
//
//        System.out.println("\nAverage TAT = " + (totalTAT / n));
//        System.out.println("Average WT = " + (totalWT / n));
//
//        sc.close();
//    }
//}

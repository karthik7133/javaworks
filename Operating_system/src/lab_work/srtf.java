package lab_work;
import java.util.*;
public class srtf {
	public static void main(String[] args) {
		Scanner x = new Scanner(System.in);
		int n=x.nextInt();
		int at[]=new int[n];
		int bt[] = new int[n];
		int rt[]= new int[n];
		int ct[]= new int[n];
		int tat[] =new int[n];
		int wt[] = new int[n];
		
		for(int i=0;i<n;i++) {
			at[i]=x.nextInt();
			rt[i]=bt[i]=x.nextInt();
		}
		
		int time=0,completed=0;
		while(completed<n) {
			int ind=-1;
			int min=Integer.MAX_VALUE;
			for(int i=0;i<n;i++) {
				if(at[i]<=time && rt[i]<min && rt[i]>0) {
					min=rt[i];
					ind=i;
				}
			}
			if(ind==-1) {
				time++;continue;
			}
			rt[ind]--;time++;
			
			if(rt[ind]==0) {
				completed++;
				ct[ind]=time;
				tat[ind]=ct[ind]-at[ind];
				wt[ind]=tat[ind]-bt[ind];
			}
		}
	}
}

package lab_work;
import java.util.*;
import java.util.concurrent.*;

class practise{
	static Semaphore mutex =new Semaphore(1);
	static Semaphore wrt = new Semaphore(1);
	static int readerCount=0;
	static Random random=new Random();
	static void log(String mes) {
		System.out.print(mes);
	}
	public static void main(String[] args) {
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
		for(int i=0;i<2;i++) {
			final int id=i;
			Thread writer = new Thread(()->{
				
				try {
					while(true) {
						wrt.acquire();
						log("writer"+id+" is writing");
						Thread.sleep(1000 + random.nextInt(1000));
						wrt.release();
						Thread.sleep(1000 + random.nextInt(1000));
						log("writer"+ id +"completed writing");
					}
				}catch(Exception e) {
					log(e.getMessage().toString());
				}
			});writer.setDaemon(true);writer.start();
		}
	}
	
}
//bankers alg
//public class practise{
//	static Scanner x = new Scanner(System.in);
//	public static void main(String[] args) {
//		int n=x.nextInt(),m=x.nextInt();
//		int av[][]= {
//				{0,1,0},
//				{2,0,0},
//				{3,0,2},
//				{2,1,1},
//				{0,0,2}
//		};
//		int max[][]= {
//				{7, 5, 3},
//				 {3, 2, 2},
//				 {9, 0, 2},
//				 {2, 2, 2},
//				 {4, 3, 3}
//		};
//		int avail[]= {3,3,2};
//		int need[][]=new int[n][m];
//		for(int i=0;i<n;i++) {
//			for(int j=0;j<m;j++) {
//				need[i][j]=max[i][j]-av[i][j];
//			}
//		}
//		int count=0;
//		boolean finish[]= new boolean [n];
//		int safeseq[]= new int[n];
//		while(count<n) {
//			boolean found=false;
//			for(int p=0;p<n;p++) {
//				if(!finish[p]) {
//					int j;
//					for(j=0;j<m;j++) {
//						if(need[p][j]>avail[j])break;
//					}
//					if(j==m) {
//						for(int k=0;k<m;k++) {
//							avail[k]+=av[p][j];
//						}
//						found=true;
//						safeseq[count++]=p;
//						finish[p]=true;
//					}
//				}
//			}if(!found)break;
//		}
//	}
//}

//priority
//class practise{
//	public static void main(String[] args) {
//		Scanner x = new Scanner(System.in);
//		int n=x.nextInt();
//		int at[] = new int[n];
//		int bt[] = new int[n];
//		int rt[] = new int[n];
//		int pt[] = new int[n];
//		int tat[] = new int[n];
//		int wt[] = new int[n];
//		int ct[] = new int[n];
//		for(int i=0;i<n;i++) {
//			at[i]=x.nextInt();
//			bt[i]=rt[i]=x.nextInt();
//			pt[i]=x.nextInt();
//		}
//		int time=0,com=0;
//		while(com<n) {
//			int ind=-1,maxpri=Integer.MIN_VALUE;
//			for(int i=0;i<n;i++) {
//				if(at[i]<=time && rt[i]>0 && pt[i]>maxpri) {
//					maxpri=pt[i];
//					ind=i;
//				}
//			}
//			if(ind==-1) {
//				time++; continue;
//			}
//			rt[ind]--;
//			time++;
//			if(rt[ind]==0) {
//				com++;
//				ct[ind]=time;
//				tat[ind]=ct[ind]-at[ind];
//				wt[ind]=tat[ind]-bt[ind];
//			}
//		}
//	}
//}

//round robin
//public class practise {
//	public static void main(String[] args) {
//		Scanner x = new Scanner(System.in);
//		int n=x.nextInt();
//		int at[]= new int[n];
//		int bt[]= new int[n];
//		int ct[]= new int[n];
//		int rt[]= new int[n];
//		int tat[]= new int[n];
//		int wt[]= new int[n];
//		int tq=x.nextInt();
//		for(int i=0;i<n;i++) {
//			at[i]=x.nextInt();
//			bt[i]=rt[i]=x.nextInt();
//		}
//		int time=0,com=0;
//		boolean v[]= new boolean [n];
//		int q[] = new int[100];
//		int end=0,st=0,ind=-1;
//		while(com<n) {
//			if(st==end) {
//				time++;
//				for(int i=0;i<n;i++) {
//					if(at[i]<=time&&!v[i]) {
//						q[end++]=i;
//						v[i]=true;
//					}
//				}
//				continue;
//			}ind=q[st++];
//			int exetime=Math.min(tq, time);
//			 time+=exetime;
//			 rt[ind]-=exetime;
//			for(int i=0;i<n;i++) {
//				if(at[i]<=time&&!v[i]) {
//					q[end++]=i;
//					v[i]=true;
//				}
//			}
//			if(rt[ind]>0) {
//				q[end++]=ind;
//			}else {
//				com++;
//				ct[ind]=time;
//				tat[ind]=ct[ind]-at[ind];
//				wt[ind]=tat[ind]-bt[ind];
//			}
//			
//		}
//	}
//}


//sjf
//public class practise{
//	public static void main(String[] args) {
//		Scanner x= new Scanner(System.in);
//		int n=x.nextInt();
//		int at[] = new int[n];
//		int bt[] = new int[n];
//		int rt[] = new int[n];
//		int ct[] = new int[n];
//		int tat[] = new int[n];
//		int wt[] = new int[n];
//		for(int i=0;i<n;i++) {
//			at[i]=x.nextInt();
//			bt[i]=rt[i]=x.nextInt();
//		}
//		int time=0,com=0;int ind=-1;
//		while(com<n) {
//			int min=Integer.MAX_VALUE;
//			for(int i=0;i<n;i++) {
//				if(at[i]<=time && rt[i]>0 && rt[i]<min) {
//					min=rt[i];
//					ind=i;
//				}
//			}
//			if(ind==-1) {
//				time++;continue;
//			}
//			rt[ind]--;
//			time++;
//			if(rt[ind]==0) {
//				com++;
//				ct[ind]=time;
//				tat[ind]=ct[ind]-at[ind];
//				wt[ind]=tat[ind]-bt[ind];
//			}
//		}
//		
//		
//	}
//}


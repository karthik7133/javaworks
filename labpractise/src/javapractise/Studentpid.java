package javapractise;
import java.util.*;
class ProjectidException extends Exception{
	public ProjectidException(String message) {
		super(message);
	}
}
public class Studentpid {
	public static void main(String[] args) {
		Scanner x = new Scanner(System.in);
		ArrayList<String> k = new ArrayList<String>();
		System.out.printf("%-10s%s\n","Batch ","ID's Range");
		System.out.printf("%-10d%s\n",1,"202124PID100-202124PID200");
		System.out.printf("%-10d%s\n",2,"202124PID200-202124PID300");
		System.out.printf("%-10d%s\n",3,"202124PID300-202124PID400");
		System.out.println("Enter the batch no:");
		int b = x.nextInt();
		System.out.println("Enter the last 3 numbers of Pid:");
		int c = x.nextInt();
		if (b==1 & (c>100 & c<=200)) {
			String n = "202124PID"+String.valueOf(c);
			System.out.println("Valid PID");
		}
		if (b==1 & (c>200 & c<=300)) {
			String n = "202124PID"+String.valueOf(c);
			System.out.println("Valid PID");
		}
		if (b==3 & (c>300 & c<=400)) {
			String n = "202124PID"+String.valueOf(c);
			System.out.println("Valid PID");
		}
		try {if (b==1 & (c<100 |c>200)){
			throw new ProjectidException("Invalid PID");
		}else if(b==2 & (c<200 |c>300)) {
			throw new ProjectidException("Invalid PID");
		}else if(b==3 & (c<300 |c>400)) {
			throw new ProjectidException("Invalid PID");
		}	
		}catch(ProjectidException e) {
			System.out.println("Invalied PID");
		}
		
	}
}

package climate_SLR;
import java.util.*;

public class SLR_temp {
	static Scanner y = new Scanner(System.in);
	public static double [] Read_SLR() {
		double [] a = new double[5];
		for (int i =0 ;i<a.length;i++) {
			System.out.println("Enter " +i+ " value :");
			a[i]= y.nextDouble();
		}
		return a; 
	}public static void Disp_SLR(){
		double [] a =Read_SLR();
		System.out.println(Arrays.toString(a));
	}
	public static void main(String[] args) {
		Disp_SLR();
	}
}

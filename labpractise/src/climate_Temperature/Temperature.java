package climate_Temperature;
import java.util.*;
public class Temperature{
	static Scanner x = new Scanner(System.in);
	public static double [] Read_Temp() {
		double [] a = new double [5];
		for(int i=0 ;i<5;i++) {
			System.out.println("Enter " +i +"value :");
			a[i] = x.nextDouble();
		}return a;
	}
	static void Disp_SLR() {
		 double [] k =Read_Temp();
		 System.out.println("Temps data :");
		 System.out.println(Arrays.toString(k));
	}
	public static void main(String[] args) {
		Disp_SLR();
	}
}
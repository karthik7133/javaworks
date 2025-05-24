package cc_mean;
import climate_Temperature.Temperature;
import climate_SLR.SLR_temp;
public class Printf {
		public static void main(String[] args) {
		Temperature x = new Temperature();
		SLR_temp k =  new SLR_temp();
		double [] temps = x.Read_Temp();
		double [] slr = k.Read_SLR();
		System.out.printf("%-10s%-20s%-20s%-20s\n","s.no","year","Tempmean","slrtemp");
		System.out.printf("%-10d%-20s%-20.2f%-20.2f\n",1,"1981-1990",temps[0],slr[0]);
		System.out.printf("%-10d%-20s%-20.2f%-20.2f\n",1,"1981-1990",temps[1],slr[1]);
		System.out.printf("%-10d%-20s%-20.2f%-20.2f\n",1,"1981-1990",temps[2],slr[2]);
		System.out.printf("%-10d%-20s%-20.2f%-20.2f\n",1,"1981-1990",temps[3],slr[3]);
	}
}

package practise;

public class ex_7 {
	public static void main(String[] args) {
		int a[]= {50,40,65,70,90};
		int total=0;
		for(int item:a) {
			if(item>50)total+=(0.85*item);
			else total+=item;
					
		}System.out.println("Total bill is :"+total);
	}
}

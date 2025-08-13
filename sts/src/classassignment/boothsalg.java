package classassignment;

public class boothsalg {
	public static void main(String[] args) {
		int a=2;
		int b=4;
		int p=0;
		int len=Integer.toBinaryString(a).length();
		for(int i=0;i<len;i++) {
			int currentbit=a&1;
			if(currentbit==1) {
				p+=b;
			}
			b=b<<1;
			a=a>>1;
			
		}System.out.println(p);
	}
}

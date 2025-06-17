package practise;
import java.util.*;
public class ex_40 {
	public static void main(String[] args) throws Exception {
		Scanner x= new Scanner(System.in);
		List<Integer> l=new ArrayList<>();
		try {
			while(true) {
				System.out.print("Enter temp values:");
				int j=x.nextInt();
				if(j==-1)break;
				else if(j>100 |j <0) {
					throw new Exception("Not valied");
				}else {
					l.add(j);
				}
			}
			
		}catch(Exception e) {
			System.out.println(e);
		}
		System.out.println("Elements are:");
		for(int i :l) {
			
			System.out.println(i);
		}
		
	}
}

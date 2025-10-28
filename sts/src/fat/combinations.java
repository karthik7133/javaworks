package fat;
import java.util.*;
public class combinations {
	public static void main(String[] args) {
		Scanner x = new Scanner(System.in);
		String a=x.nextLine();
		int n=x.nextInt();
		comb(a,0,new StringBuilder(),n);
	}
	static void comb(String a,int k,StringBuilder current,int n) {
		if(current.length()==n) {
			System.out.println(current.toString());
		}
		for(int i=k;i<a.length();i++) {
			current.append(a.charAt(i));//add new char and explore all the combinations of it 
			comb(a,i+1,current,n);
			current.deleteCharAt(current.length()-1 );
			/*delete that char after exploring and 
			go with new char to explore further*/
		}
	}
}

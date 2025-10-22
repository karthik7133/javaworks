package fat;
import java.util.*;
public class josephus_trap {
	public static void main(String[] args) {
		List<Integer>l=new ArrayList<>();
		Scanner x = new Scanner(System.in);
		int n=x.nextInt();
		for(int i=0;i<n;i++) {
			l.add(i);
		}
		int r=x.nextInt();
		int index = 0;
        while(l.size() > 1) {
            index = (index + r - 1) % l.size();
            l.remove(index);
        }
        
        System.out.println(l.get(0));
		
	}
}

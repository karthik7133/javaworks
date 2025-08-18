package practise;
import java.util.*;
public class strobogramatic {
	public static void main(String[] args) {
		Scanner x=new Scanner(System.in);
		System.out.println("enter the number to check:");
		HashMap<Character,Character> map=new HashMap<>();
		map.put('0','0');
		map.put('8','8');
		map.put('9','6');
		map.put('6','9');
		
		
		String n=x.nextLine();
		for(int i=0;i<(n.length()/2);i++) {
			char c=n.charAt(i);char m=n.charAt(n.length()-i-1);
			Character mirror=map.get(c);
			if(mirror==null | mirror!=m) {
				System.out.println("False");return;
			}
			
		}System.out.println("true");
	}
}

package practise;
import java.util.*;
public class ex_21 {
	public static void main(String[] args) {
		HashMap<Integer, String> has=new HashMap();
		has.put(123, "karthik");
		has.put(124, "kingkobra");
		has.put(125, "natasha");
		
		Set entryset=has.entrySet();
		for(Object o:entryset) {
			Map.Entry entry=(Map.Entry) o;
			System.out.println("Rool no:"+entry.getKey()+"\nName : "+entry.getValue());
		}
		
		for(Integer i :has.keySet() ) {
			System.out.println("Rool no:"+i+" Name is: "+has.get(i));
		}
	}
}


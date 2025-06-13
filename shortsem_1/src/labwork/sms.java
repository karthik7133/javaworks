package labwork;
import java.util.*;
public class sms {
	public static void main(String[] args) {
		HashMap<String ,Integer> student=new HashMap<>();
		student.put("karthik", 90);
		student.put("Mohith", 99);
		student.put("karthik1", 100);
//		Collection<Integer> a=student.values();
//		a.toArray().toString();
//		System.out.println(a);
		int total=0;
		for (String k:student.keySet()) {
			System.out.println(k);
		}
		for(int s:student.values()) {
			total+=s;
		}
		
		System.out.println("Total is:"+total);
		System.out.println("avg is:"+total/(student.size()*1.0));
		
	}
}

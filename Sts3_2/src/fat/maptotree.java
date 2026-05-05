package fat;
import java.util.*;
public class maptotree {
	public static void main(String[] args) {
		HashMap<String ,Integer>m=new HashMap<>();
		m.put("karthik", 80);
		m.put("keerthi", 90);
		m.put("krithika", 100);
		m.put("Namandeep", 20);
		TreeMap<String ,Integer>t= new TreeMap<>(m);
		
		for(Map.Entry<String ,Integer>e:t.entrySet()) {
			System.out.print(e.getKey()+":"+e.getValue()+"\n");
		}
	}
}

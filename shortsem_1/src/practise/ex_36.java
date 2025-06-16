package practise;

import java.util.*;

public class ex_36 {
	public static void main(String[] args) {
		Scanner x = new Scanner(System.in);
		System.out.print("Enter id:");
		String id=x.next();
		System.out.print("Enter price:");
		double price=x.nextDouble();
		inventory i=new inventory();
		if(id.matches("\\d+")) {
			i.Register(Integer.valueOf(id), price);
		}else System.out.println("Wrong input!");
	}
}
class inventory{
	HashMap<Integer,Double> map=new HashMap<>();
	public void Register(int id,double price) {
		map.put(id, price);
		System.out.println("Item Registered");
	}
	public void Re_evaluate(int id,double price){
		map.replace(id, price);
		System.out.println("price Replaced");
	}
	public void Discontinue(int id) {
		map.remove(id);
		System.out.println("Item Removed");
	}
	public void Query(int id) {
		if(map.containsKey(id))
		System.out.println("Price of product is:"+map.get(id));
		else System.out.println("Product not found!");
	}
}
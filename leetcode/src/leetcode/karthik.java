package leetcode;

import java.util.Scanner;

public class karthik {
	public static void main(String[] args) {
		Scanner sc = new Scanner(System.in);
		System.out.println("Enter number of bikes:");
        int n = Integer.parseInt(sc.nextLine());
        Bike[] bikes = new Bike[n];

        for (int i = 0; i < n; i++) {
            System.out.println("Enter ID for bike " + (i + 1) + ":");
            int id = Integer.parseInt(sc.nextLine());

            System.out.println("Enter Quantity for bike " + (i + 1) + ":");
            int quantity = Integer.parseInt(sc.nextLine());

            System.out.println("Enter Name for bike " + (i + 1) + ":");
            String name = sc.nextLine();

            System.out.println("Enter Price for bike " + (i + 1) + ":");
            int price = Integer.parseInt(sc.nextLine());

            bikes[i] = new Bike(id, quantity, name, price);
        }

        System.out.println("Enter bike name to search:");
        String searchName = sc.nextLine();

        Bike maxPriceBike = findMaxPriceOfBike(bikes);
        if (maxPriceBike != null && maxPriceBike.getprice() > 0) {
            System.out.println("id-" + maxPriceBike.getid());
            System.out.println("quantity-" + maxPriceBike.getquantity());
            System.out.println("name-" + maxPriceBike.getname());
            System.out.println("price-" + maxPriceBike.getprice());
        } else {
            System.out.println("No Bike found with mentioned attribute");
        }

        Bike foundBike = searchBikeByName(bikes, searchName);
        if (foundBike != null) {
            System.out.println("id-" + foundBike.getid());
            System.out.println("quantity-" + foundBike.getquantity());
            System.out.println("name-" + foundBike.getname());
            System.out.println("price-" + foundBike.getprice());
        } else {
            System.out.println("No Bike found with mentioned attribute");
        }
		
	}
	public static Bike findMaxPriceOfBike(Bike [] a) {
		if (a == null || a.length == 0) return null;
		int max=0;
		Bike maxbike=null;
		for(Bike b:a) {
			if(b.price>max) {max=b.price;maxbike=b;}
		}return maxbike;
	}
	public static Bike searchBikeByName(Bike [] a,String b) {
		if (a == null || a.length == 0) return null;
		Bike alpha=null;
		for(Bike c:a) {
			if (c.name.equalsIgnoreCase(b)){
				alpha=c;
				break;
			}
		}return alpha;
	}
	
}
class Bike{
	int id,quantity,price;
	String name;
	Bike(int i,int q,String n,int p){
		id=i;
		quantity=q;
		price=p;
		name=n;
	}
	public void setid(int id) {
		this.id=id;
	}
	public void setquantity(int q) {
		this.quantity=q;
	}
	public void setprice(int p) {
		this.price=p;
	}
	public void setname(String s) {
		this.name=s;
	}
	public int getid() {
		return(this.id);
	}
	public int getquantity() {
		return(quantity);
	}
	public int getprice() {
		return(price);
	}
	public String getname() {
		return(name);
	}
	
}
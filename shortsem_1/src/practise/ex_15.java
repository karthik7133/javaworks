package practise;
import java.util.*;
public class ex_15 {
	public static void main(String[] args) {
		HotelOrder hotel=new HotelOrder("a",20,2,"b",50,3);
		HashMap<Integer,HotelOrder> map=new HashMap<>();
		map.put(123, hotel);
		hotel.calculate();
		System.out.println(map.get(123).luch +"\n"+map.get(123).tiffin+"\n"+map.get(123).totalprice);
	}
}
class HotelOrder{
	String tiffin;
	int tiffenprice,tiffenqty;
	String luch;
	int luchprice,lunchqty;
	int totalprice;
	HotelOrder(String tiffin,int tp,int tifqty,String l,int lp,int lqty){
		this.tiffin=tiffin;
		tiffenprice=tp;
		tiffenqty=tifqty;
		luch=l;
		luchprice=lp;
		lunchqty=lqty;
	}
	public void calculate() {
		this.totalprice=(tiffenprice*tiffenqty)+(luchprice*lunchqty);
		
	}
	
}

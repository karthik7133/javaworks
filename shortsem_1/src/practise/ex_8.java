package practise;
import java.util.*;
public class ex_8 {
	public static void main(String[] args) {
		demo d=new demo("1234","actiontype1");
		System.out.println(d.gettimestamp());
		System.out.println(d.getuserid());
		System.out.println(d.getactiontype());
	}

}
class demo{
	private final long timestamp=System.currentTimeMillis();
	private final String userid;
	private final String actiontype;
	demo(String b,String c){
		this.userid=b;
		this.actiontype=c;
	}
	
	public long gettimestamp() {
		return timestamp;
	}
	public String getuserid() {
		return userid;
	}
	public String getactiontype() {
		return actiontype;
	}
}

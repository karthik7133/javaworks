package practise;

public class ex_25 {
	public static void main(String[] args) {
		outer o=new outer();
		outer.inner i=o.new inner();
		//i.setString("karthik");
		i.display();
	}
}
class outer{
	static String a="king";
	
	class inner{
		public void setString(String alpha) {
			a=alpha;
		}
		public void display() {
			System.out.println(a);
		}
	}
}

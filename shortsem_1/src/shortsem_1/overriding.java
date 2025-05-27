package shortsem_1;
class sumbase{
	int sum(int a,int b) {
		return a+b;
	}
	
}
class sumchild extends sumbase{
	@Override
	int sum(int a,int b) {
		System.out.println("method is ovveriden");
		return a+b+10;
	}
	
}
public class overriding {
	public static void main(String[] args) {
		sumbase b=new sumchild();
		System.out.println(b.sum(1, 2));
	}

}

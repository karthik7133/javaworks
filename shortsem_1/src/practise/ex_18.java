package practise;

public class ex_18 {
	public static void main(String[] args) {
		randi r1=new randi() {

			@Override
			public void run() {
				System.out.println("Hello world!");
				
			}
			
		};
		randi r2=()->{
			System.out.println("Hello");
		};
		r1.run();
	}
}
@FunctionalInterface
interface randi{
	public void run();
}

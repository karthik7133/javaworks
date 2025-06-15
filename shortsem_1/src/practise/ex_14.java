package practise;

public class ex_14 {
	public static void main(String[] args) throws Exception  {
		String [] log= {"3","4"};
		FitenessTracker.counter(log);
	}
}
class FitenessTracker{
	public static  void counter(String [] a) {
		int count=0;
		try {
			for(String b:a) {
				try {
					count+=Integer.parseInt(b);
				}catch(Exception e) {
					System.out.println(e);
				}
				
			}if (count>24) throw new ActivityLimitException("Not possible bro!");
			else  System.out.println("total workout hrs: "+count);;
		}catch(ActivityLimitException e) {
			System.out.println(e);
		}
	}
}
class ActivityLimitException extends Exception{
	ActivityLimitException(String message){
		super(message);
	}
}

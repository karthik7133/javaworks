package practise;

public class ex_12 {
	public static void main(String[] args) {
		Exam e=new Exam(2,"scheduled");
		Exam.Timer t=e.new Timer("Karthik","23bce20022");
		t.modifyvalues(3, "not scheduled");
		t.display();
	}
}
class  Exam{
	private double duration;
	private String status;
	Exam(double d,String s){
		this.duration=d;
		this.status=s;
	}
	 class Timer{
		String name;
		String regno;
		Timer(String name,String regno){
			super();
			this.name=name;
			this.regno=regno;
			
		}
		public void modifyvalues(double d,String c) {
			duration=d;
			status =c;
		}
		public void display() {
			System.out.printf("Name: %s \nregno:%s \nDuration :%.2f \nstatus: %s",name,regno,duration,status);
		}
	}
}

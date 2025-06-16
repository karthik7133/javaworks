package Education;
public class OnlineCourse{
	private String courseName;
	private int duration;
	private double feeperweek;
	private boolean materialRequired;
	public OnlineCourse(String a,int b,double c,boolean d){
		this.courseName=a;
		this.duration=b;
		this.feeperweek=c;
		this.materialRequired=d;
	}
	public void display() {
		System.out.printf("Name:%s Duration:%d feeperweek :%.2f materialrequired:%b\n",courseName,duration,feeperweek,materialRequired);
	}
	
	public double claculateCourseFee() {
		return duration*feeperweek;
	}
}

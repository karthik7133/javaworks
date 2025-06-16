package practise;

public class ex_29 {
	public static void main(String[] args) {
		patient p1=new patient("a","123","x");
		patient p2=new patient("b","124","y");
		p1.display();
		p2.display();
		patient.hospitalName();
	}
}
class patient{
	private String name;
	private String patientid;
	private String disease;
	patient(String a,String b,String c){
		name=a;
		patientid=b;
		disease=c;
	}
	public String getname() {
		return name;
	}
	public String getid() {
		return patientid;
	}
	public String getdisease() {
		return disease;
	}
	public void display() {
		System.out.printf("Name :%s Patiend id:%s Disease:%s \n",name,patientid,disease);
	}
	public static void hospitalName() {
		System.out.println("Hospitalname: xyz");
	}
}
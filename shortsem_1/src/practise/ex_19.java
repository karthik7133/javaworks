package practise;

public class ex_19 {
	public static void main(String[] args) {
		vecation v=new vecation();
		Thread f1=new Thread(()->v.slotBooking("karthik"));
		Thread f2=new Thread(()->v.slotBooking("raja"));
		Thread f3=new Thread(()->v.slotBooking("raja"));
		f1.start();
		f2.start();
		f3.start();
	}
}
class vecation{
	char slot;
	int slot1=2,slot2=2,slot3=2;
	public synchronized void slotBooking(String name) {
		if(slot1>0) {
			slot='A';
			slot1--;
			System.out.println(name+" your slot booking is done in slot: "+slot);
		}else if(slot2>0) {
			slot='B';
			slot2--;
			System.out.println(name+"your slot booking is done in slot: "+slot);
		}else if(slot3>0) {
			slot='C';
			slot3--;
			System.out.println(name+"your slot booking is done in slot: "+slot);
		}else {
			System.out.println("no slot is free to book");
		}
	}
}
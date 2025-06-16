package practise;

public class ex_27 {
	public static void main(String[] args) {
		Smartcar s=new Smartcar();
		s.facilities();
	}
}
class GPSNavigator {
	public void navigateTo(String destination) {
		System.out.println("Navigating to "+destination);
	}
}
class EntertainmentSystem extends GPSNavigator {
	public void playMedia(String track) {
		System.out.println(track+"is playing!");
	}
}
class Smartcar extends EntertainmentSystem{
	
	public void facilities() {
		navigateTo("kavali");
		playMedia("track 1");
	}
}

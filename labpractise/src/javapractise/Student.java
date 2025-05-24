package javapractise;
import java.util.*;
public class Student {

    public static void main(String[] args)  {
        ordinary x = new ordinary();
        x.karthik("karthik");
        x.karthik(123); 
    }
}
class ordinary <k>{
	public void karthik(k a){
		System.out.println(a);
	}
}
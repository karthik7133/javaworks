package dsa;
import java.util.*;
public class Main {
	public static void main(String[] args) {
		Stackcustom s= new Stackcustom();
		s.stackcustom(5);
		s.pushelement(6);
		s.pushelement(5);
		s.pop();
		s.peak();
	}
}
class Stackcustom {
	int size;
	int a[];
	int top;
void stackcustom(int size){
		this.size= size;
		this.a=new int[size];
		this.top=-1;
	}
public void pushelement(int pushele) {
	if(top!=size-1) {
		top++;
		a[top]=pushele;
		System.out.println("pushed element is:"+pushele);
		
	}else {
		System.out.println("Stack is full !");
	}
}
public void pop() {
	if(top!=-1) {
		int top_element=a[top];
		top--;
		System.out.println("Poped element is:"+top_element);
	}else {
		System.out.println("Stack is empty!");
	}
}
public void peak() {
	if(top!=1) {
		int te=a[top];
		System.out.println("The top element is :"+te);
	}else {
		System.out.println("Stack is empty!");
	}
}

}
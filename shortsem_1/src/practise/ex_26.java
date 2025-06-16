package practise;

public class ex_26 {
	public static void main(String[] args) {
		Animal a=new Animal();
		Animal b=new Dog();
		Animal c=new Cat();
		a.makeSound();
		b.makeSound();
		c.makeSound();
	}
}
class Animal{
	void makeSound() {
		System.out.println("this is from parent class!");
	}
}
class Dog extends Animal{
	void makeSound() {
		System.out.println("Dog barks");
	}
}class Cat extends Animal{
	@Override
	void makeSound() {
		System.out.println("Cat meow");
	}
}

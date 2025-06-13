package practise;

public class ex_4 {
	public static void main(String[] args) {
		Book b=new Ebook("t","A","isbn",400);
		Book p=new PrintedBook("t","A","isbn",400);
		b.displayDetails();
		p.displayDetails();
	}
}
abstract class Book{
	String title;
	String author;
	String isbn;
	double price;
	Book(String title,String author,String isbn,double price){
		this.title=title;
		this.author=author;
		this.isbn=isbn;
		this.price=price;
	}
	abstract void displayDetails();
	
}
class Ebook extends Book{

	Ebook(String title, String author, String isbn, double price) {
		super(title, author, isbn, price);
	}

	@Override
	void displayDetails() {
		System.out.println("Title :"+title);
		System.out.println("author :"+author);
		System.out.println("isbn :"+isbn);
		if(price<500)System.out.println("price :"+price);
		else System.out.println("price is invalied");
	}
	
}
class PrintedBook extends Book{

	PrintedBook(String title, String author, String isbn, double price) {
		super(title, author, isbn, price);
	}

	@Override
	void displayDetails() {
		System.out.println("Title :"+title);
		System.out.println("author :"+author);
		System.out.println("isbn :"+isbn);
		if(price>=500)System.out.println("price :"+price);
		else System.out.println("price is invalied");
		
	}
	
}
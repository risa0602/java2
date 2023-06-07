import java.util.*;
public class BookApp{
	public static void main(String[] args){
		Book b1= new Book("すっきりJava入門",2600,"インプレス");
		b1.showInfo();
		Book b2 = new Book("すっきりMySQLインプレス",2200,"インプレス");
		b2.showInfo();
	}
}
class Book{
	String name;
	int price;
	String publisher;
	public Book(String name,int price,String publisher){
		this.name = name;
		this.price = price;
		this.publisher = publisher;
	}
	public void showInfo(){
		System.out.printf("%s:%s(%d円)%n",this.name,this.publisher,this.price);
	}
}

package Practicals;

interface LibraryUsers {
	void registerAccount();
	void requestBook();
}
class KidUser implements LibraryUsers {
	private int age;
	private String BookType;
	
	 public KidUser(int age, String bookType) {
		super();
		this.age = age;
		BookType = bookType;
	}
	@Override
	public void registerAccount() {
		// TODO Auto-generated method stub
		if(age>12) {
			System.err.println("Sorry, Age must be less than 12 to register as Kid");
		}else System.out.println("You have successfully registered under Kids accouct");
		
	}

	@Override
	public void requestBook() {
		// TODO Auto-generated method stub
		if(BookType=="Kids") {
			System.out.println("Book issued Successfully");
		}else System.err.println("Oops, you are allowed to take only kids books");
	}
	
}

class AdultUser implements LibraryUsers
{	
	private int age;
	private String BookType;
	public AdultUser(int age, String bookType) {
		super();
		this.age = age;
		BookType = bookType;
	}

	@Override
	public void registerAccount() {
		// TODO Auto-generated method stub
		if(age>12) {
			System.out.println("You have successfully registered under adults accouct");
		}else System.err.println("Sorry, Age must be greater than 12 to register as Adult");
		
	}

	@Override
	public void requestBook() {
		// TODO Auto-generated method stub
		if(BookType=="Fiction") {
			System.out.println("Book issued Successfully");
		}else System.err.println("Oops, you are allowed to take only Adult Fiction books");
	}
	}
	

public class Libraryinterface_demo {
	public static void main(String[] args) {
		KidUser kid1=new KidUser(10,"Kids");
		kid1.registerAccount();
		kid1.requestBook();
		KidUser kid2=new KidUser(18,"Fiction");
		kid2.registerAccount();
		kid2.requestBook();
		AdultUser adult1=new AdultUser(5,"Kids");
		adult1.registerAccount();
		adult1.requestBook();
		AdultUser adult2=new AdultUser(23,"Fiction");
		adult2.registerAccount();
		adult2.requestBook();
}

}

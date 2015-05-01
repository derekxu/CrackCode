package algorithm;
import java.util.*;


class Book{
	private long ID;
	private String details;
	private static Set<Book> books;
	
	public Book(long id, String details) {}
	public static void addBook(long id, String details){
		books.add(new Book(id, details));
	}
	
	public void update() {}
	public static void delete(Book b) { books.remove(b); }
	public static Book find(long id){
		for(Book b:books)
			if(b.getID()==id) return b;
		return null;
	}
	public long getID()
	{
		return ID;
	}
}

class User {
	private long ID;
	private String details;
	private int accountType;
	private static Set<User> users;
	
	public Book searchLibrary(long id) {return Book.find(id);}
	public void renewMembership() {}
	public long getID() {return ID;}
	public static User find(long ID){
		for(User u : users){
			if(u.getID()==ID) return u;
		}
		return null;
	}
	public static void addUser(long ID, String details, int accountType){
		users.add(new User(ID, details, accountType));
	}
	public User(long id, String details, int accountType){
		this.ID = id;
		this.details = details;
		this.accountType = accountType;
	}
	
}
public class OnlineBooking {
	private Book b;
	private User u;
	public OnlineBooking(Book b, User u) {}
	public void listenRequest() {}
	public Book searchBook(long ID) { return Book.find(ID); }
	public User searchUser(long ID) { return User.find(ID); }
	public void display() {}
}

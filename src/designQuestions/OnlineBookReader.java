package designQuestions;

import java.sql.*;
import java.util.*;
class Server{
	public int id;
	public String ipAddress;
}
class DataNode extends Server{
	String userName="user";
	String passWord="xxx";
	String url="xxx";
	public DataNode(){
		
	}
	public String[] getContentFromDb (int bookId, int[] pages){
		String baseQueryStr = "...";
		String[] queryResults = new String[pages.length];
		try{
			Connection conn = DriverManager.getConnection(url, userName, passWord);
			Statement statement = conn.createStatement();
			for(int i=0;i<pages.length;i++){
				ResultSet result = statement.executeQuery(getQueryString(baseQueryStr, bookId, pages[i]));
				while(result.next()){
					queryResults[i]=queryResults[i]+result.getString(1);
				}
			}
			
		}catch (Exception e){
			e.printStackTrace();
		}
		return queryResults;
	}
	public String getQueryString(String baseQueryStr, int bookId, int pageId){
		StringBuilder queryStrBuilder = new StringBuilder(baseQueryStr);
		//...
		
		return queryStrBuilder.toString();
	}
}

class Book{
	public int id;
	private String details;
	private Set<Book> books;
	public Book(int id, String details){
		this.id = id;
		this.details = details;
	}
	public int getServerId(){
		int serverId = 0;
		
		return serverId;
	}
	public String getDetails(int bookId){
		Iterator<Book> iter = books.iterator();
		while(iter.hasNext()){
			Book book = iter.next();
			if(book.id==bookId){
				return book.details;
			}
		}
		
		throw new NoSuchElementException();
	}
}
class User{
	public int id;
	private static Set<User> users;
	private Set<Integer> recentBookIds;
	
	public Book getMostRecentBook(){
		
		return new Book(0,"");
	}

}
public class OnlineBookReader {
	public List<Book> books;
	public List<User> users;
	public List<Server> servers;
}

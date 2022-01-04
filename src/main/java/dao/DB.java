package dao;
import java.sql.*;
//Database connection method
public class DB {
	static Connection con;
public static Connection getCon(){
	
        String user = "root";
        String pass ="*****";//write your password
	try{
		Class.forName("com.mysql.cj.jdbc.Driver");
		con=DriverManager.getConnection("jdbc:mysql://localhost:3306/jdbcdb",user,pass);
		
	}
	catch(Exception e){
		System.out.println(e);
		}
	return con;
}
}

/* public class DB {
	//public static void main(String[] args) 
	public static Connection getCon(){
		try {
			// load the driver:
			Class.forName("com.mysql.cj.jdbc.Driver");
			
			// creating a connection
			
			String url="jdbc:mysql://localhost:3306/jdbcdb";
			String username="root";
			String password="78626";
			
			Connection con=DriverManager.getConnection(url,username,password);
			
			if(con.isClosed()) {
				System.out.println("Connection is Closed");
				
				
			}
			else {
				System.out.println("Connection created..");
			}
			
			
			
			
			
		}
		catch(Exception e) {
			e.printStackTrace();
		}
	}
}
*/
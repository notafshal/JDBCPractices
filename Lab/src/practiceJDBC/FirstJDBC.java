package practiceJDBC;
import java.sql.*;

public class FirstJDBC {
	
public static void main(String[] args) {
	try {
		//load the driver
		Class.forName("com.mysql.cj.jdbc.Driver");
		//Create a connection
		String url = "jdbc:mysql://localhost:3306/youtube";
		String username= "root";
		String password ="yes";
		
		Connection con = DriverManager.getConnection(url,username,password);
		
		if(con.isClosed()) {
			System.out.println("connection is closed");
		}else {
			System.out.println("Connection created....");
		}
	}catch(Exception e) {
		e.printStackTrace();
	}
}
}

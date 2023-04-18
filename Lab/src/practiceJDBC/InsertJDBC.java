package practiceJDBC;
import java.sql.*;
public class InsertJDBC {

	public static void main(String[] args) {
		try {
			
			Class.forName("com.mysql.cj.jdbc.Driver");
			
			String url = "jdbc:mysql://localhost:3306/youtube";
			String username= "root";
			String password ="afshal123";
			Connection con = DriverManager.getConnection(url,username,password);
			//creating a query
			String q = "create table avengers(ID int(20) primary key auto_increment,"
					+ "Name varchar(200) not null , Super_Power varchar(400), planet varchar(200))";
			
			//create a statement
			Statement stmt =con.createStatement();
			stmt.executeUpdate(q);
			System.out.println("table is created");
			con.close();
		}
		catch(Exception e) {
			e.printStackTrace();
		}

	}

}

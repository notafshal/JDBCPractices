package practiceJDBC;
import java.sql.*;
public class mysqlconn {
public static void main(String[] args) {
	try {
		Class.forName("com.mysql.cj.jdbc.Driver");
		Connection con =DriverManager.getConnection(
				"jdbc:mysql://localhost:3306/demo","root","root");
		Statement stmt = con.createStatement();
		ResultSet rs =stmt.executeQuery("select * form youtube");
		while(rs.next());
		System.out.println("Running");
		
	}catch(Exception e){
		
	}
}
}

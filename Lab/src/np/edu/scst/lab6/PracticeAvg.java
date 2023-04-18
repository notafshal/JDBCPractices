package np.edu.scst.lab6;
import java.sql.*;
public class PracticeAvg {
public static void main(String[] args) {
	try {
		Class.forName("com.mysql.cj.jdbc.Driver");
		Connection con = DriverManager.getConnection(
				"jdbc:mysql://localhost:3306/youtube","root","afshal123");
		String q = "Select Name FROM avengers where planet ='Earth'";
		PreparedStatement stmt = con.prepareStatement(q);
		ResultSet rs = stmt.executeQuery();
		while(rs.next()) {
			String name = rs.getString("name");
			System.out.println(name);
			
		}
	}
	catch(Exception e) {
		
	}
}
}

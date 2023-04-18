package np.edu.scst.lab6;
import java.sql.*;
public class Avengers {
public static void main(String[] args) {
	try {	
		Class.forName("com.mysql.cj.jdbc.Driver");
		Connection con = DriverManager.getConnection(
				"jdbc:mysql://localhost:3306/youtube","root","afshal123");;
		String q ="SELECT Name FROM avengers WHERE planet = 'Earth'";
		PreparedStatement pstmt = con.prepareStatement(q);

		ResultSet rs= pstmt.executeQuery();
		while (rs.next()) {
            String name = rs.getString("name");
            System.out.println(name);
        }
		rs.close();
        pstmt.close();
		con.close();
	}
	catch(Exception e) {
		e.printStackTrace();
	}}}

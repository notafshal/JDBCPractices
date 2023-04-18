package practiceJDBC;
import java.sql.*;
import java.io.*;
public class UpdateJDBC {
public static void main(String[] args) {
	try {
		Class.forName("com.mysql.cj.jdbc.Driver");
		Connection con = DriverManager.getConnection(
				"jdbc:mysql://localhost:3306/youtube","root","afshal123");
		String q ="update table1 set tName=?,tCity=? where tID=?";
		BufferedReader br = new BufferedReader (new InputStreamReader(System.in));
		System.out.println("Enter new Name: ");
		String name =br.readLine();
		System.out.println("Enter new City Name: ");
		String city =br.readLine();
	 System.out.println("Enter the student id");
	 int id =Integer.parseInt(br.readLine());
	 PreparedStatement pstmt =con.prepareStatement(q);
	 pstmt.setString(1, name);;
	 pstmt.setString(2, city);
	 pstmt.setInt(3, id);
	 pstmt.executeUpdate();
	 System.out.println("updated...");
	 pstmt.close();	
	}catch(Exception e) {
		e.printStackTrace();
	}}}

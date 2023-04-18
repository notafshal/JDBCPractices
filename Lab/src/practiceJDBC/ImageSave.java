package practiceJDBC;
import java.sql.*;
import java.io.*;
public class ImageSave {
public static void main(String[] args) {
	try {
		Class.forName("com.mysql.cj.jdbc.Driver");
		Connection con = DriverManager.getConnection("jdbc:mysql://localhost:3306/youtube",
				"root","afshal123");
		String q = "insert into images(pic) values(?)";
		PreparedStatement pstmt = con.prepareStatement(q);
		FileInputStream fis = new FileInputStream("D:\\doc.png");
		pstmt.setBinaryStream(1,fis,fis.available());
		pstmt.executeUpdate();
		System.out.println("Inserted...");
		
		
	}
	catch(Exception e){
		e.printStackTrace();
	}
}
}

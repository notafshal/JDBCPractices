package practiceJDBC;

import java.sql.*;
import java.io.*;

public class Fun {
public static void main(String[] args) {
	try {
		Class.forName("com.mysql.cj.jdbc.Driver");
		
		String url = "jdbc:mysql://localhost:3306/youtube";
		String username= "root";
		String password ="afshal123";
		Connection con = DriverManager.getConnection(url,username,password);
		//create a query
		String q ="insert into table1(tName,tCity)values(?,?)";
		//get the PreparedStatement Object
		PreparedStatement pstmt = con.prepareStatement(q);
		BufferedReader br = new BufferedReader(new InputStreamReader(System.in));
		System.out.println("Enter name : ");
		String name =br.readLine();
		System.out.println("Enter City: ");
		String city =br.readLine();		
		
		//set values to query
		pstmt.setString(1,name);
		pstmt.setString(2,city);
		pstmt.executeUpdate();
		System.out.println("inserted....");
		con.close();
		
	}catch(Exception e) {
		e.printStackTrace();
	}
}
}

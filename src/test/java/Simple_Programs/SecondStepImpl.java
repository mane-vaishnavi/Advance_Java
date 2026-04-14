package Simple_Programs;

import java.sql.Connection;
import java.sql.DriverManager;
import java.sql.SQLException;

public class SecondStepImpl {
 
	public static void main(String[] args) {
		
		String url = "jdbc:postgresql://localhost:5432/school?user=postgres&password=root";
		try {
			Class.forName("org.postgresql.Driver");
		
		System.out.println("DriverLoaded");
		Connection connection = DriverManager.getConnection(url);
		System.out.println("Connection Establishd");
		} 
		catch (ClassNotFoundException | SQLException  e) {
			// TODO Auto-generated catch block
			e.printStackTrace();
		}
	}

}

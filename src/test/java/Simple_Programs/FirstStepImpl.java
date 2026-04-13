package Simple_Programs;

import java.sql.Connection;
import java.sql.DriverManager;
import java.sql.SQLException;

public class FirstStepImpl {
 
	
	public static void main(String[] args) {
		
		try {
			Class.forName("org.postgresql.Driver");
		
		System.out.println("DriverLoaded");
		Connection connection = DriverManager.getConnection("jdbc:postgresql://localhost:5432/school?user=postgres&password=root");
		System.out.println("Connection Establish");
		} 
		catch (ClassNotFoundException | SQLException  e) {
			// TODO Auto-generated catch block
			e.printStackTrace();
		}
	}

}

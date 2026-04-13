package Simple_Programs;

import java.sql.Connection;
import java.sql.DriverManager;
import java.sql.SQLException;
import java.sql.Statement;

public class UpdateRecordsExecuteUpdate {
	public static void main(String[] args) {
		String url = "jdbc:postgresql://localhost:5432/school?user=postgres&password=root";

		    //first step
		try {
		  	Class.forName("org.postgresql.Driver");
			
		  	System.out.println("DriverLoaded");
			
			//second step
		 	Connection connection = DriverManager.getConnection(url);
			System.out.println("Connection Establishd");
			
		    //third step
			Statement statement = connection.createStatement();
			System.out.println("Statement printed");
			
			//forth step
		    String update = "UPDATE student SET name ='pallavi' where id=102";
			int b = statement.executeUpdate(update);
			if(b>0) {
				System.out.println(b + "rows affected.");	
				System.out.println("record updated");
			}else
				System.out.println("record not updated.");
			
			//fifth step
			connection.close();
			
		}catch (ClassNotFoundException | SQLException e) {
			
			e.printStackTrace();
		}
	}

}

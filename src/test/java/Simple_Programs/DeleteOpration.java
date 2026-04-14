package Simple_Programs;

import java.sql.Connection;
import java.sql.DriverManager;
import java.sql.SQLException;
import java.sql.Statement;

public class DeleteOpration {

	public static void main(String[] args) {
		String url = "jdbc:postgresql://localhost:5432/school?user=postgres&password=root";

		    //1st step
		try {
		  	Class.forName("org.postgresql.Driver");
			
		  	System.out.println("DriverLoaded");
			
			//2nd step
		 	Connection connection = DriverManager.getConnection(url);
			System.out.println("Connection Establishd");
			
		    //3rd step
			Statement statement = connection.createStatement();
			System.out.print("Statement printed  ");
			
			//4th step
			String delete = "DELETE from student where id=101";
			boolean b = statement.execute(delete);
			System.out.println(b);
			System.out.println("record delete");
			
			//5th step
			connection.close();
			
			
		}catch (ClassNotFoundException | SQLException e) {
			
			e.printStackTrace();
		}
	}
}

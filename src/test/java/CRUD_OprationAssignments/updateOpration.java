package CRUD_OprationAssignments;


import java.sql.Connection;
import java.sql.DriverManager;
import java.sql.SQLException;
import java.sql.Statement;

public class updateOpration { 

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
			System.out.print("Statement printed");
			
			//forth step
		    String update = "UPDATE employee SET name ='pallavi' where id=101";
			boolean b = statement.execute(update);
			System.out.println(b);
			System.out.println("record updated");
			
			//fifth step
			connection.close();
			
		}catch (ClassNotFoundException | SQLException e) {
			
			e.printStackTrace();
		}
	}
}

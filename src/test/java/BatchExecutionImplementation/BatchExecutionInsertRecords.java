package BatchExecutionImplementation;

import java.sql.Connection;
import java.sql.DriverManager;
import java.sql.PreparedStatement;
import java.sql.SQLException;
import java.sql.Statement;

public class BatchExecutionInsertRecords {

	public static void main(String[] args) {

		    //first step
		try {
		  	Class.forName("org.postgresql.Driver");
			
		  	System.out.println("DriverLoaded");
			
			//second step
		 	Connection connection = DriverManager.getConnection("jdbc:postgresql://localhost:5432/school?user=postgres&password=root");
			System.out.println("Connection Establishd");
			
		   PreparedStatement statement = connection.prepareStatement("INSERT INTO department VALUES(?,?)");
			statement.setInt(1,202);
			statement.setString(2,"Manager");
			statement.addBatch();//--------void
			
			statement.setInt(1,107);
			statement.setString(2,"SAP");
			statement.addBatch();//--------void
			
			statement.setInt(1,108);
			statement.setString(2,"CustomerSupport");
			statement.addBatch();//--------void
			
			statement.setInt(1,109);
			statement.setString(2,"ProjectManagers");
			statement.addBatch();//--------void
			
			statement.setInt(1,110);
			statement.setString(2,"Trainers");
			statement.addBatch();//--------void
			
			statement.executeBatch();
			
			System.out.println("insert records");
			//fifth step
			connection.close();
			
		}catch (ClassNotFoundException | SQLException e) {
			
			e.printStackTrace();
		}
	}
	
}

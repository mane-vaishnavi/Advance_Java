package BatchExecutionImplementation;

import java.sql.Connection;
import java.sql.DriverManager;
import java.sql.PreparedStatement;
import java.sql.SQLException;
import java.sql.Statement;
import java.util.Scanner;

public class BatchExecutionInsertRecordsUsingScannerClass {

	public static void main(String[] args) {

		    //first step
		try {
		  	Class.forName("org.postgresql.Driver");
			
		  	System.out.println("DriverLoaded");
			
			//second step
		 	Connection connection = DriverManager.getConnection("jdbc:postgresql://localhost:5432/school?user=postgres&password=root");
			System.out.println("Connection Establishd");
			
		   PreparedStatement statement = connection.prepareStatement("INSERT INTO department VALUES(?,?)");
		   
		   Scanner scanner = new Scanner(System.in);
           System.out.println("enter how many records you want to add");
		   int count = scanner.nextInt();
		   for(int i=1;i<=count;i++) {
			   
			   
           System.out.println("ENTER ID:");
           int id = scanner.nextInt();

           System.out.println("ENTER DEPARTMENT NAME:");
           String name = scanner.next();
           
           statement.setInt(1, id);
           statement.setString(2, name);
           statement.addBatch();//--------void
		   }
			
		    statement.executeBatch();
			
			System.out.println("insert records");
			
			
			//fifth step
			connection.close();
			
		}catch (ClassNotFoundException | SQLException e) {
			
			e.printStackTrace();
		}
	}
	
}

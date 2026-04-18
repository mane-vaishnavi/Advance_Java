package Transaction_management;

//this program is define the how to use commit and rollback command

import java.sql.Connection;
import java.sql.DriverManager;
import java.sql.SQLException;
import java.sql.Statement;

public class Transaction_program {
		
	public static boolean isSuccess() {
		// TODO Auto-generated method stub
		return true;
	}
	
   //------------------------------Main mathod-----------------------------------------//
	public static void main(String[] args) {
		// TODO Auto-generated method stub
		
		String booking_info = "insert into booking_info values(402,'airindia','mumbai','banglore')";		
		
		String passenger_info = "insert into passenger_info values(502,'pratiksha',5475839150,'pratiksha228@gmail.com')";	
		
		String payment_info = "insert into payment_info values(602,6000,'online')";	
		
		try {
			Class.forName("org.postgresql.Driver");
			
		Connection connection = DriverManager.getConnection("jdbc:postgresql://localhost:5432/flighttransaction?user=postgres&password=root");
		connection.setAutoCommit(false);
		
	    //should insert the data into booking_info table
		Statement statement = connection.createStatement();
		statement.execute(booking_info);
				
				
		Statement statement2 = connection.createStatement();
		statement.execute(passenger_info);
		
		
		if(isSuccess()) {
			
			//statement--> which will store the data in payment table
			Statement statement3 = connection.createStatement();
			statement.execute(payment_info);
			connection.commit();
			System.out.println("Booking Comfirmed");
		}else {
			
			connection.rollback();
			System.out.println("payment not done");
		}
				
		
		} catch (ClassNotFoundException e) {
			// TODO Auto-generated catch block
			e.printStackTrace();
		} catch (SQLException e) {
			// TODO Auto-generated catch block
			e.printStackTrace();
		}

	}

	

}

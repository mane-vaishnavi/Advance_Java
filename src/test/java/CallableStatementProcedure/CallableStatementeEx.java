package CallableStatementProcedure;

import java.sql.CallableStatement;
import java.sql.Connection;
import java.sql.DriverManager;
import java.sql.SQLException;

public class CallableStatementeEx {

	public static void main(String[] args) throws SQLException {
		// TODO Auto-generated method stub

		try {
			Class.forName("org.postgresql.Driver");
			
            System.out.println("DriverLoaded");
			
			//second step
		 	Connection connection = DriverManager.getConnection("jdbc:postgresql://localhost:5432/collage?user=postgres&password=root");
			System.out.println("Connection Establishd");
			
			CallableStatement call = connection.prepareCall("Call insert_records(?,?,?,?,?,?,?,?,?,?,?,?)");
			call.setInt(1, 101);
			call.setString(2,"vaishnavi");
			call.setString(3,"female");
			call.setInt(4,23);
			
			call.setInt(5,201);
			call.setString(6,"snehahawaldar");
			call.setString(7,"advancejava");
			call.setString(8,"female");
			
			call.setInt(9,301);
			call.setString(10,"technical");
			call.setInt(11,401);
			call.setDouble(12,20000);
			
			call.execute();
			
			System.out.println("record inserted");
			
			connection.close();
		} catch (ClassNotFoundException e) {
			// TODO Auto-generated catch block
			e.printStackTrace();
		}
	}

}

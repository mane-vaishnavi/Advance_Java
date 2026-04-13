package Simple_Programs;

import java.sql.Connection;
import java.sql.DriverManager;
import java.sql.SQLException;
import java.sql.Statement;

public class InsertRecords {

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
			String insert = "INSERT INTO student VALUES(103,'sainath',19)";
			statement.execute(insert);
			System.out.println("insert records");
			
			//fifth step
			connection.close();
			
		} catch (ClassNotFoundException | SQLException e) {
			
			e.printStackTrace();
		}
	}
}

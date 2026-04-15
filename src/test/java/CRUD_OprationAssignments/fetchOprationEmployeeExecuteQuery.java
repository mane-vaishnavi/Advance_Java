package CRUD_OprationAssignments;



import java.sql.Connection;
import java.sql.DriverManager;
import java.sql.ResultSet;
import java.sql.SQLException;
import java.sql.Statement;

public class fetchOprationEmployeeExecuteQuery  {

	public static void main(String[] args) {
		
		String url = "jdbc:postgresql://localhost:5432/school?user=postgres&password=root";
		
		try {
			Class.forName("org.postgresql.Driver");
			
            System.out.println("DriverLoaded");
			
			//second step
		 	Connection connection = DriverManager.getConnection("jdbc:postgresql://localhost:5432/school?user=postgres&password=root");
			System.out.println("Connection Establishd");
			
		    //third step
			Statement statement = connection.createStatement();
			System.out.print("Statement printed");
			
			String fetch = "SELECT * FROM employee";
			
			//forth step
			ResultSet rs = statement.executeQuery(fetch);
			while(rs.next()) {
			
			System.out.println(rs.getInt(1));
			System.out.println(rs.getString("name"));
			System.out.println(rs.getInt("age"));
			}
			
			//fifth step
			connection.close();
		} catch (ClassNotFoundException | SQLException e) {
			// TODO Auto-generated catch block
			e.printStackTrace();
		}

	}

}

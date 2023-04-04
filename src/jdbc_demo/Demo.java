package jdbc_demo;

import java.sql.Connection;
import java.sql.DriverManager;
import java.sql.SQLException;
import java.sql.Statement;

public class Demo {
	public static void main(String[] args) {
		String url="jdbc:mysql://localhost:3306/javabatch";
		String username ="root";
		String password="YukTA@3110";
		String query = " INSERT INTO car VALUES(5,'SWIFT','MARUTI')";
		Connection connection =null;
	//load/register driver
		try {
			Class.forName("com.mysql.cj.jdbc.Driver");
			
	//establishing connection
		 connection =DriverManager.getConnection(url,username,password);
			
		//creating statement
			Statement statement=connection.createStatement();
			
		//executing statement
			
			statement.execute(query);
			System.out.println("query excuted");
			
		} catch (ClassNotFoundException | SQLException e) {
			// TODO Auto-generated catch block
			e.printStackTrace();
		}
		finally {
			try {
				connection.close();
				System.out.println("connection closed");
			} catch (SQLException e) {
				// TODO Auto-generated catch block
				e.printStackTrace();
			}
		}

		
		
	}

}

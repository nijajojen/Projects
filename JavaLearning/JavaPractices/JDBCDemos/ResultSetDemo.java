package JDBCDemos;

import java.sql.Connection;
import java.sql.DriverManager;
import java.sql.PreparedStatement;
import java.sql.ResultSet;
import java.sql.SQLException;
import java.sql.Statement;
public class ResultSetDemo {

	public static void main(String[] args) throws SQLException {
		Connection conn= null;
		try {
			conn= DriverManager.getConnection("jdbc:mysql://localhost:3306/kgs_Database?serverTimezone=PST8PDT"
					, "root","NijaBinoy");
			PreparedStatement statement= conn.prepareStatement("select * from user"); 
			ResultSet result= statement.executeQuery();
			while(result.next()) {
				System.out.println(result.getInt("id")+" "+result.getString("name")+ " "
						+ result.getString("phone")+ " "+result.getDate("dob")+" "
						+ result.getString("username")+ " "+ result.getString("password"));
			}
			
			
		}
		catch(Exception e) {
			
		}
		finally {
		conn.close();
		}
		
	}

}

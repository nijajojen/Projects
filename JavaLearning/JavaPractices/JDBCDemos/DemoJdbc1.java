package JDBCDemos;

import java.sql.Connection;
import java.sql.DriverManager;
import java.sql.PreparedStatement;
import java.sql.SQLException;
import java.sql.Statement;
/*
 * package name should not start with caps.
 * initially the statements in * were used. Now instead of Statement ,PreparedStatement is used.
 */
public class DemoJdbc1 {

	public static void main(String[] args) throws SQLException {
		Connection conn = null;
		try {
			String id="1";
		 conn= DriverManager.getConnection("jdbc:mysql://localhost:3306/kgs_Database?serverTimezone=PST8PDT"
				, "root","NijaBinoy");
		 //**Below is an old usage.
		//Statement statement= conn.createStatement();
		//* PreparedStatement statement= conn.prepareStatement("update user set phone='4089871767' where id=1"); 
		 PreparedStatement statement= conn.prepareStatement("update user set phone='4089871767' where id=?"); 
		 statement.setString(1, id);
		//**Statement.executeUpdate("update user set phone='4089871767' where id=1");
		 statement.executeUpdate();
		}
		catch(Exception e) {
			
		}
		finally {
			try {
				conn.close();
			}
			catch(Exception ex) {
				
			}
			
		}
	}

}

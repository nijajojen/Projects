package JDBCDemos;

import java.sql.Connection;
import java.sql.DriverManager;
import java.sql.PreparedStatement;
import java.sql.ResultSet;
import java.sql.ResultSetMetaData;
import java.sql.SQLException;

public class DescTableDemo {

	public static void main(String[] args) throws SQLException {
		Connection con =null;
		try {
			con= DriverManager.getConnection("jdbc:mysql://localhost:3306/kgs_Database?serverTimezone=PST8PDT","root", "NijaBinoy");
			PreparedStatement stmt =con.prepareStatement("select * from Orders");
			
			ResultSet rs3 = stmt.executeQuery();
			 ResultSetMetaData rsmd = rs3.getMetaData();
			 System.out.println("No. of columns : " + rsmd.getColumnCount());
			 System.out.println("Column name of 1st column : " + rsmd.getColumnName(1));
			 System.out.println("Column type of 1st column : " + rsmd.getColumnTypeName(1));
			while(rs3.next()) {
				System.out.println(  rs3.getInt("OrderId")+ " "+rs3.getInt("OrderNo")+ " "+rs3.getInt("id"));
			}
		}
		catch(Exception e) {
			System.out.println(e.getMessage());
		}
		finally {
			
			con.close();
		}

	}

}

package JDBCDemos;

import java.sql.Connection;
import java.sql.DriverManager;
import java.sql.PreparedStatement;
import java.sql.ResultSet;
import java.sql.SQLException;

public class ForeignKeyDemo1 {

	public static void main(String[] args) throws SQLException {
		Connection con =null;
		try {
			con= DriverManager.getConnection("jdbc:mysql://localhost:3306/kgs_Database?serverTimezone=PST8PDT","root", "NijaBinoy");
			//PreparedStatement statement1= con.prepareStatement("create table Orders (OrderId int NOT NULL,OrderNo int NOT NULL, id int , PRIMARY KEY(OrderId), FOREIGN KEY(id) REFERENCES user(id))");
			PreparedStatement statement2 =con.prepareStatement("insert into Orders (OrderId,OrderNo,id) values(?,?,?)");
			//statement1.execute();
			statement2.setLong(1, 1000);
			statement2.setLong(2, 999);
			statement2.setLong(3, 1);
			int rs2=statement2.executeUpdate();
			PreparedStatement statement3= con.prepareStatement("select * from Orders");
			ResultSet rs3 = statement3.executeQuery();
			while(rs3.next()) {
				System.out.println(rs3.getInt("OrderId")+ " "+rs3.getInt("OrderNo")+ " "+rs3.getInt("id"));
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

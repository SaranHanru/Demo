package dataDrivenTesting;

import java.sql.Connection;
import java.sql.DriverManager;
import java.sql.ResultSet;
import java.sql.SQLException;
import java.sql.Statement;

import com.mysql.cj.jdbc.Driver;
/**
 * 
 * 
 */

public class ReadDataFromJDBC {
	Connection con;
	
	public void readDataFromJDBC() throws SQLException {
		
		Driver driverRef =new Driver();
		DriverManager.registerDriver(driverRef);
		con=DriverManager.getConnection("jdbc:mysql://localhost:3306/sdet", "root", "root");
	}
	public void create(String query,int columnIndex,String expectedValue) throws SQLException { 
		Statement stat=con.createStatement();
		ResultSet result = stat.executeQuery(query);
		boolean flag = false;
		
		while(result.next()) {
			String actualValue = result.getString(columnIndex);
			if(expectedValue.equalsIgnoreCase(actualValue)) {
				flag = true;
				break;
			}
		}
if(flag == true) {
	System.out.println("Found in db");
}
else {
	System.out.println("not found in db");
}
}
	
	public void close() throws SQLException {
		con.close();
	}
}



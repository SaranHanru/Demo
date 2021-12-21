package readJDBC;

import java.sql.SQLException;

import org.testng.annotations.AfterTest;
import org.testng.annotations.BeforeTest;
import org.testng.annotations.Test;

import dataDrivenTesting.ReadDataFromJDBC;
/**
 * 
 * @author admin
 *
 */
public class ReadDataFromJDBCUtility {
	ReadDataFromJDBC du=new ReadDataFromJDBC();
	/**
	 * 
	 * @throws SQLException
	 */
	@BeforeTest
	public void connectToDb() throws SQLException {
		du.readDataFromJDBC();
	}
	/**
	 * 
	 * @throws SQLException
	 */
	@Test
	public void execute() throws SQLException {
		du.create("Select * from info", 1, "Saran");
	}
	/**
	 * 
	 * @throws SQLException
	 */
@AfterTest
public void closeDb( ) throws SQLException {
	du.close();
}
}

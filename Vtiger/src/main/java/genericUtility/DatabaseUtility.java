package genericUtility;

import java.sql.Connection;
import java.sql.DriverManager;
import java.sql.ResultSet;
import java.sql.SQLException;

import com.mysql.cj.jdbc.Driver;

public class DatabaseUtility {

	Connection con;
	
	/**
	 * THis is method is used to connect Database
	 * @author KalpanaShetty
	 * @throws SQLException
	 */
	public void connectToDB() throws SQLException
	{
		Driver driver = new Driver();
		DriverManager.registerDriver(driver);
		con = DriverManager.getConnection(IpathConstants.dbUrl, IpathConstants.dbUserName, IpathConstants.dbPassword);
	
	}
	
	/**
	 * This method is used to execute query and get the data
	 * @author KalpanaShetty
	 * @param query
	 * @param columnNo
	 * @param ExpData
	 * @return
	 * @throws SQLException
	 */
	public String executeQueryAndGetData(String query, int columnNo, String ExpData) throws SQLException
	{
		
		ResultSet result = con.createStatement().executeQuery(query);
		boolean flag = false;
		while(result.next())
		{
			String data = result.getString(columnNo);
			if(data.equalsIgnoreCase(ExpData))
			{
				flag =true;
				break;
			}
		}
		if(flag==true)
		{
			System.out.println("-- Data is Varified");
			return ExpData;
		}
		else
		{
			System.out.println("-- Data is not present");
			return "";
		} 
		
	}
	
	/**
	 * This method is used close Database connection
	 * @throws SQLException
	 */
	public void closeDB() throws SQLException
	{
		con.close();
	}
	
	
}

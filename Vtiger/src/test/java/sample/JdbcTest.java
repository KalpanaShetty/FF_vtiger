package sample;

import java.sql.Connection;
import java.sql.DriverManager;
import java.sql.SQLException;

import com.mysql.jdbc.Driver;

public class JdbcTest {

	public static void main(String[] args) throws Throwable {
		Connection conn= null;
		try {
			Driver driverRef=new Driver();
			DriverManager.registerDriver(driverRef);
			conn=DriverManager.getConnection("jdbc:mysql://3306/projects", "root", "root");
		} catch (Exception e) {
			
		}
		
	}

}

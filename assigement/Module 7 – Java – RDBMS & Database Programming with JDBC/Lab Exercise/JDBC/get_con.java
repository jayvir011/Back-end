package JDBC;
import java.sql.*;

public class get_con {

	public static Connection getconnection() throws ClassNotFoundException, SQLException {
		// TODO Auto-generated method stub
		Class.forName("com.mysql.cj.jdbc.Driver");
		System.out.println("Driver loaded succesfully");
		Connection conn=DriverManager.getConnection("jdbc:mysql://localhost:3306/tops_db","root","");
		System.out.println("connection established");
		return conn;
	}

}

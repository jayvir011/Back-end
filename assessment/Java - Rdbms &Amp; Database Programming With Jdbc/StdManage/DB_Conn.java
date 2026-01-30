package StdManage;

import java.sql.*;

public class DB_Conn {
	public static Connection getConnection() throws SQLException, ClassNotFoundException
	{
		Class.forName("com.mysql.cj.jdbc.Driver");
		Connection conn=DriverManager.getConnection("jdbc:mysql://localhost:3306/assessment","root","");
		return conn;
	}

}

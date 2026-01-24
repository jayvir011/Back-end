package JDBC;

import java.sql.*;

public class insert_query {

	public static void main(String[] args)throws ClassNotFoundException, SQLException {
		// TODO Auto-generated method stub
		//Connection conn=get_con.Getconnection();
		Connection con=get_con.getconnection();
		Statement st=con.createStatement();
		String query="insert into emp(name,city) values('tanishq','mumbai');";
		int result=st.executeUpdate(query);
		if(result==1)
		{
			System.out.println("data inserted");
		}
		else
		{
			System.out.println("data does not insertted");
		}
		con.close();

	}

}

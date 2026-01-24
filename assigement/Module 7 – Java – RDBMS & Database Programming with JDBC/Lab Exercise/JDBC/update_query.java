package JDBC;

import java.sql.*;

public class update_query {

	public static void main(String[] args) throws ClassNotFoundException, SQLException {
		// TODO Auto-generated method stub
		Connection conn=get_con.getconnection();
		Statement st=conn.createStatement();
		String query="UPDATE emp SET city = 'delhi' WHERE id = 2;";
		int result=st.executeUpdate(query);
		if(result==1)
		{
			System.out.println("data updated succesfully");
		}
		else
		{
			System.out.println("data updation failed");
		}

	}

}

package JDBC;

import java.sql.*;

public class delete_query {

	public static void main(String[] args) throws ClassNotFoundException, SQLException {
		// TODO Auto-generated method stub
		Connection conn=get_con.getconnection();
		Statement st=conn.createStatement();
		String query="DELETE FROM emp WHERE id = 3;";
		int result=st.executeUpdate(query);
		if(result==1)
		{
			System.out.println("data deleted succesfully");
		}
		else
		{
			System.out.println("data deletion failed");
		}

	}

}

package JDBC;

import java.sql.Connection;
import java.sql.ResultSet;
import java.sql.ResultSetMetaData;
import java.sql.SQLException;
import java.sql.Statement;

public class ResultsetMetadata {

	public static void main(String[] args) throws ClassNotFoundException, SQLException {
		// TODO Auto-generated method stub
		Connection conn=get_con.getconnection();
		Statement st=conn.createStatement();
		String query="select * from student";
		ResultSet rs=st.executeQuery(query);
		ResultSetMetaData rsmd=rs.getMetaData();
		
		int columncount=rsmd.getColumnCount();
		System.out.println("Total columns :"+columncount);
		
		for(int i=1;i<=columncount;i++)
		{
			System.out.println("Column "+i+" name :"+rsmd.getColumnName(i));
			System.out.println("Column "+i+" datatype :"+rsmd.getColumnTypeName(i));
			System.out.println("presicion of column "+i+" :"+rsmd.getPrecision(i));
			System.out.println("Scale of column "+i+" :"+rsmd.getScale(i));
			System.out.println("Is column "+i+" nullable :"+rsmd.isNullable(i));
			System.out.println("is auto incremented column "+i+" :"+rsmd.isAutoIncrement(i));
		}

	}

}

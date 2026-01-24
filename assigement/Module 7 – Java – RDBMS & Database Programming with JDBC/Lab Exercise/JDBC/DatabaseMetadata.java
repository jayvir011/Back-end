package JDBC;

import java.sql.Connection;
import java.sql.DatabaseMetaData;
import java.sql.ResultSet;
import java.sql.SQLException;

public class DatabaseMetadata {

	public static void main(String[] args) throws ClassNotFoundException, SQLException {
		// TODO Auto-generated method stub
		Connection con=get_con.getconnection();
		DatabaseMetaData dbmd=con.getMetaData();
		System.out.println("Database Product Name: "+dbmd.getDatabaseProductName());
		System.out.println("Database Version :"+dbmd.getDatabaseProductVersion());
		System.out.println("driver name :"+dbmd.getDriverName());
		System.out.println("driver version :"+dbmd.getDriverVersion());
		System.out.println("UserName :"+dbmd.getUserName());
		
		ResultSet tables=dbmd.getTables(null, null, "%", new String[] {"TABLE"});
		System.out.println("List of tables :");
		
		while(tables.next())
		{
			String tableName=tables.getString("TABLE_NAME");
			System.out.println("table"+tableName);
			ResultSet columns=dbmd.getColumns(null, null, tableName, "%");
			while(columns.next())
			{
				System.out.println("column: "+columns.getString("COLUMN_NAME")+" datatype: "+columns.getString("TYPE_NAME")+
						" size: "+columns.getInt("COLUMN_SIZE"));
			}
			columns.close();
			}
		tables.close();
		con.close();

	}

}

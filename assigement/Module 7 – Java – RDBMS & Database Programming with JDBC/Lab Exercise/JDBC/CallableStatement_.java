package JDBC;

import java.sql.Connection;
import java.sql.*;
import java.sql.Statement;

import model.emp_model;


public class CallableStatement_ {

	public static void main(String[] args) throws ClassNotFoundException, SQLException {
		// TODO Auto-generated method stub
		Connection conn=get_con.getconnection();
		Statement st=conn.createStatement();
		emp_model e1=new emp_model();
		CallableStatement cs=conn.prepareCall("{call getEmpName(?,?)}");
		int id=2;
		cs.setInt(1, id);
		cs.registerOutParameter(2,Types.VARCHAR);
		cs.execute();
		String name=cs.getString(2);System.out.println("id :"+id+" name :"+name);

		
	}

}

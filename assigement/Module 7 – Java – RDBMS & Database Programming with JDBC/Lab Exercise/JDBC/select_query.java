package JDBC;

import java.sql.*;
import java.sql.SQLException;
import java.util.ArrayList;
import java.util.List;

import model.emp_model;

public class select_query {

	public static void main(String[] args) throws ClassNotFoundException, SQLException {
		// TODO Auto-generated method stub
		Connection conn=get_con.getconnection();
		Statement st=conn.createStatement();
		String query="SELECT * FROM emp;";
		ResultSet rs=st.executeQuery(query);
		List<emp_model> empList = new ArrayList<>();
		while(rs.next())
		{
			emp_model emp = new emp_model();
			emp.setId(rs.getInt("id"));
			emp.setName(rs.getString("name"));
			emp.setCity(rs.getString("city"));
			empList.add(emp);
		}
		for(emp_model emp : empList) {
			System.out.println("ID: " + emp.getId() + ", Name: " + emp.getName() + ", City: " + emp.getCity());
		}

	}

}

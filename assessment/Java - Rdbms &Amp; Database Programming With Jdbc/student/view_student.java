package student;

import java.sql.*;
import java.util.ArrayList;
import java.util.List;

import StdManage.DB_Conn;

public class view_student {

	public static void main(String[] args) throws ClassNotFoundException, SQLException {
		// TODO Auto-generated method stub
		Connection conn=DB_Conn.getConnection();
		Statement st=conn.createStatement();
		String query="select * from student";
		ResultSet rs=st.executeQuery(query);
		List<StudentModel> students=new ArrayList<>();
		while(rs.next())
		{
			StudentModel obj=new StudentModel();
			obj.setId(rs.getInt("id"));
			obj.setName(rs.getString("name"));
			
			students.add(obj);
		}
		for(StudentModel obj : students)
		{
			System.out.println("ID: "+obj.getId()+" Name: "+obj.getName());
		}

	}

}

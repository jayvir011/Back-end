package student;

import java.sql.Connection;
import java.sql.SQLException;
import java.util.Scanner;
import java.sql.*;

import StdManage.DB_Conn;

public class delete_student {

	public static void main(String[] args) throws ClassNotFoundException, SQLException {
		// TODO Auto-generated method stub
		Connection conn=DB_Conn.getConnection();
		Statement st=conn.createStatement();
		Scanner sc=new Scanner(System.in);
		StudentModel s1=new StudentModel();
		System.out.println("Enter Student ID to delete:");
		int id=sc.nextInt();
		s1.setId(id);
		ResultSet rs=st.executeQuery("select * from student where id="+s1.getId());
		if(rs.next())
		{
			String query="delete from student where id="+s1.getId();
			int success=st.executeUpdate(query);
			if(success==1)
			{
				System.out.println("Record Deleted");
			}
			else
			{
				System.out.println("Not Deleted");
			}
		}
		else
		{
			System.out.println("Student ID not found.");
		} 

	}

}

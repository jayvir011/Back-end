package student;

import java.sql.Connection;
import java.sql.ResultSet;
import java.sql.*;
import java.util.Scanner;

import StdManage.DB_Conn;

public class Search_Student {

	public static void main(String[] args) throws ClassNotFoundException, SQLException {
		// TODO Auto-generated method stub
		Connection conn=DB_Conn.getConnection();
		StudentModel s1=new StudentModel();
		Statement st=conn.createStatement();
		Scanner sc=new Scanner(System.in);
		System.out.println("Enter Student name to search:");
		String n=sc.nextLine();
		s1.setName(n);
		String query="select * from student where name='"+s1.getName()+"'";
		ResultSet rs=st.executeQuery(query);
		if(rs.next())
		{
			StudentModel obj=new StudentModel();
			obj.setId(rs.getInt("id"));
			obj.setName(rs.getString("name"));
			System.out.println("Student Found: ID: "+obj.getId()+" Name: "+obj.getName());
		}
		else
		{
			System.out.println("Student Not Found");
		}


	}

}

package student;

import java.sql.*;
import java.util.Scanner;

import StdManage.DB_Conn;

public class insert_student {

	public static void main(String[] args) throws ClassNotFoundException, SQLException {
		// TODO Auto-generated method stub
		Connection conn=DB_Conn.getConnection();
		Statement st=conn.createStatement();
		Scanner sc=new Scanner(System.in);
		StudentModel s1=new StudentModel();
		System.out.println("enter name:");
		String n=sc.nextLine();
		s1.setName(n);
		String query="insert into student(Name) values('"+s1.getName()+"')";
		int success=st.executeUpdate(query);
		if(success==1)
		{
			System.out.println("Record Inserted");
		}
		else
		{
			System.out.println("Not Inserted");
		}
		

	}

}

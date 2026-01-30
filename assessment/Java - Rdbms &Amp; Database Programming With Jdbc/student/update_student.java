package student;

import java.sql.Connection;
import java.sql.ResultSet;
import java.sql.SQLException;
import java.sql.Statement;
import java.util.Scanner;

import StdManage.DB_Conn;

public class update_student {

	public static void main(String[] args) throws ClassNotFoundException, SQLException {
		// TODO Auto-generated method stub
		Scanner sc=new Scanner(System.in);
		Connection conn=DB_Conn.getConnection();
		Statement st=conn.createStatement();
		StudentModel s1=new StudentModel();
		System.out.println("Enter Student ID to update:");
		int id=sc.nextInt();
		s1.setId(id);
		
		ResultSet rs=st.executeQuery("select * from student where id="+s1.getId());
		if(rs.next())
		{
			System.out.println("Enter new name:");
			sc.nextLine(); // consume newline
			String n=sc.nextLine();
			s1.setName(n);
			String query="update student set name='"+s1.getName()+"' where id="+s1.getId();
			int success=st.executeUpdate(query);
			if(success==1)
			{
				System.out.println("Record Updated");
			}
			else
			{
				System.out.println("Not Updated");
			}
		}
		else
		{
			System.out.println("Student ID not found.");
		}

	}

}

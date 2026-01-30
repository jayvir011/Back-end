package course;

import java.sql.*;
import java.util.Scanner;

import StdManage.DB_Conn;

public class insert_course {

	public static void main(String[] args) throws ClassNotFoundException, SQLException {
		// TODO Auto-generated method stub
		Connection conn=DB_Conn.getConnection();
		CourseModel c1=new CourseModel();
		Statement st=conn.createStatement();
		Scanner sc=new Scanner(System.in);
		System.out.println("enter course name:");
		String n=sc.nextLine();
		c1.setCourse_name(n);
		System.out.println("enter course Fees:");
		double f=sc.nextInt();
		c1.setFees(f);
		System.out.println("enter course duration in months:");
		int d=sc.nextInt();
		c1.setDuration(d);
		String q="insert into course(course_name,fees,duration) values('"+c1.getCourse_name()+"',"+c1.getFees()+","+c1.getDuration()+")";
		int success=st.executeUpdate(q);
	    if(success>0) {
	    	System.out.println("course inserted successfully");
	    }
	    else {
	    	System.out.println("insertion failed");
	    }
		
		
		

	}

}

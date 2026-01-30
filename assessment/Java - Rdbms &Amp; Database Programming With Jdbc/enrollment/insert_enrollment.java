package enrollment;

import java.sql.*;
import java.util.Scanner;

import StdManage.DB_Conn;

public class insert_enrollment {

	public static void main(String[] args) throws ClassNotFoundException, SQLException {
		// TODO Auto-generated method stub
		Connection conn=DB_Conn.getConnection();
		Statement st=conn.createStatement();
		EnrollmentModel e1=new EnrollmentModel();
		Scanner sc=new Scanner(System.in);
		System.out.println("enter student id:");
		int sid=sc.nextInt();
		e1.setStudent_id(sid);
		System.out.println("enter course id:");
		int cid=sc.nextInt();
		e1.setCourse_id(cid);
		String q="insert into enrollment(student_id,course_id) values("+e1.getStudent_id()+","+e1.getCourse_id()+")";
		int success=st.executeUpdate(q);
	    if(success>0) {
	    	System.out.println("enrollment inserted successfully");
	    }
	    else {
	    	System.out.println("insertion failed");
	    }
	}

}

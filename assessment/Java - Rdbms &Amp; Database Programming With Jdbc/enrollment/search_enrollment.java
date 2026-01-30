package enrollment;

import java.sql.*;
import java.util.Scanner;

import StdManage.DB_Conn;

public class search_enrollment {

	public static void main(String[] args) throws ClassNotFoundException, SQLException {
		// TODO Auto-generated method stub
		Connection conn=DB_Conn.getConnection();
		Scanner sc=new Scanner(System.in);
		Statement st=conn.createStatement();
		EnrollmentModel e1=new EnrollmentModel();
		System.out.println("enter student id to search enrollments:");
		int sid=sc.nextInt();
		e1.setStudent_id(sid);
		String searchQuery = "SELECT s.name, c.course_name, c.fees, c.duration FROM enrollment e JOIN student s ON e.student_id = s.id JOIN course c ON e.course_id = c.course_id WHERE e.student_id = " + e1.getStudent_id();
		ResultSet rs=st.executeQuery(searchQuery);
		while(rs.next()) {
			System.out.println("Student Name: " + rs.getString("name") + ", Course Name: " + rs.getString("course_name") + ", Fees: " + rs.getDouble("fees") + ", Duration (months): " + rs.getInt("duration"));
		}
		
		

	}

}

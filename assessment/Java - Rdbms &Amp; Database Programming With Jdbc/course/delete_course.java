package course;

import java.sql.Connection;
import java.sql.ResultSet;
import java.sql.SQLException;
import java.sql.Statement;
import java.util.Scanner;

import StdManage.DB_Conn;

public class delete_course {

	public static void main(String[] args) throws ClassNotFoundException, SQLException {
		// TODO Auto-generated method stub
		Connection conn=DB_Conn.getConnection();
		Scanner sc=new Scanner(System.in);
		Statement st=conn.createStatement();
		CourseModel c1=new CourseModel();
		String showQuery="select * from course";
		ResultSet rs=st.executeQuery(showQuery);
		while(rs.next()) {
			c1.setCourse_id(rs.getInt("course_id"));
			c1.setCourse_name(rs.getString("course_name"));
			c1.setFees(rs.getDouble("fees"));
			c1.setDuration(rs.getInt("duration"));
			System.out.println("Course ID: " + c1.getCourse_id()+", Course Name: " + c1.getCourse_name()+", Fees: " + c1.getFees()+", Duration (months): " + c1.getDuration());
		}
		System.out.println("Enter the Course ID to delete:");
		int id=sc.nextInt();
		c1.setCourse_id(id);
		String deleteQuery="delete from course where course_id="+c1.getCourse_id();
		int deleteSuccess=st.executeUpdate(deleteQuery);
		if(deleteSuccess>0) {
	    	System.out.println("Course deleted successfully");
	    }
	    else {
	    	System.out.println("Deletion failed");
	    }
	}

}

package course;

import java.sql.*;
import java.util.ArrayList;
import java.util.List;

import StdManage.DB_Conn;

public class show_course {

	public static void main(String[] args) throws ClassNotFoundException, SQLException {
		// TODO Auto-generated method stub
		Connection conn=DB_Conn.getConnection();
		Statement st=conn.createStatement();
		String q="select * from course";
		ResultSet rs=st.executeQuery(q);
		List<CourseModel> courseList = new ArrayList<>();
		while(rs.next()) {
			CourseModel c1=new CourseModel();
			c1.setCourse_id(rs.getInt("course_id"));
			c1.setCourse_name(rs.getString("course_name"));
			c1.setFees(rs.getDouble("fees"));
			c1.setDuration(rs.getInt("duration"));
			courseList.add(c1);
		}
		for(CourseModel course : courseList) {
			System.out.println("Course ID: " + course.getCourse_id());
			System.out.println("Course Name: " + course.getCourse_name());
			System.out.println("Fees: " + course.getFees());
			System.out.println("Duration (months): " + course.getDuration());
			System.out.println("---------------------------");
		}

	}

}

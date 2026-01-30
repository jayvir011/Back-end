package enrollment;

import java.sql.*;
import java.util.ArrayList;
import java.util.List;

import StdManage.DB_Conn;

public class view_enrollment {

	public static void main(String[] args) throws ClassNotFoundException, SQLException {
		// TODO Auto-generated method stub
		Connection conn=DB_Conn.getConnection();
		Statement st=conn.createStatement();
		String q="SELECT s.name AS student_name, c.course_name FROM enrollment e JOIN student s ON e.student_id = s.id JOIN course c ON e.course_id = c.course_id;";
		ResultSet rs=st.executeQuery(q);
		List<EnrollmentModel> enrollmentList = new ArrayList<>();
		while(rs.next()) {
			System.out.println("Student Name: " + rs.getString("student_name") + ", Course Name: " + rs.getString("course_name"));
		}

	}

}

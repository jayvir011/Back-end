package enrollment;

import java.sql.Connection;
import java.sql.SQLException;
import java.sql.Statement;
import java.util.Scanner;

import StdManage.DB_Conn;

public class delete_enrollment {

	public static void main(String[] args) throws ClassNotFoundException, SQLException {
		// TODO Auto-generated method stub
		Connection conn=DB_Conn.getConnection();
		Statement st=conn.createStatement();
		Scanner sc=new Scanner(System.in);
		EnrollmentModel e1=new EnrollmentModel();
		System.out.println("enter enrollment id to delete:");
		int eid=sc.nextInt();
		e1.setEnrollment_id(eid);
		String q="delete from enrollment where enrollment_id="+e1.getEnrollment_id();
		int success=st.executeUpdate(q);
	    if(success>0) {
	    	System.out.println("enrollment deleted successfully");
	    }
	    else {
	    	System.out.println("deletion failed");
	    }

	}

}

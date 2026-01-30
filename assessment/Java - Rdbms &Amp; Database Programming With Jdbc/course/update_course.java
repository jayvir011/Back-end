package course;

import java.sql.*;
import java.util.Scanner;

import StdManage.DB_Conn;

public class update_course {

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
		System.out.println("Enter the Course ID to update:");
		int id=sc.nextInt();
		c1.setCourse_id(id);
		int choice;
		String cont;
		do
		{
			System.out.println("Select field to update:");
			System.out.println("1. Course Name");
			System.out.println("2. Fees");
			System.out.println("3. Duration");
			
			System.out.println("Enter your choice:");
			choice=sc.nextInt();
			
			switch(choice) 
			{
			case 1:
				System.out.println("Enter new Course Name:");
				sc.nextLine(); // consume newline
				String newName=sc.nextLine();
				String updateNameQuery="update course set course_name='"+newName+"' where course_id="+c1.getCourse_id();
				int nameSuccess=st.executeUpdate(updateNameQuery);
				if(nameSuccess>0) {
			    	System.out.println("Course Name updated successfully");
			    }
			    else {
			    	System.out.println("Update failed");
			    }
				break;
			case 2:
				System.out.println("Enter new Fees:");
				double newFees=sc.nextDouble();
				String updateFeesQuery="update course set fees="+newFees+" where course_id="+c1.getCourse_id();
				int feesSuccess=st.executeUpdate(updateFeesQuery);
				if(feesSuccess>0) {
			    	System.out.println("Fees updated successfully");
			    }
			    else {
			    	System.out.println("Update failed");
			    }
				break;
			case 3:
					System.out.println("Enter new Duration (months):");
					int newDuration=sc.nextInt();
					String updateDurationQuery="update course set duration="+newDuration+" where course_id="+c1.getCourse_id();
					int durationSuccess=st.executeUpdate(updateDurationQuery);
					if(durationSuccess>0) {
				    	System.out.println("Duration updated successfully");
				    }
				    else {
				    	System.out.println("Update failed");
				    }
					break;
				default:
					System.out.println("Invalid choice");
					break;
					
				}
			System.out.println("Do you want to update another field? (yes/no):");
			cont=sc.next();
		}
		while(cont.equalsIgnoreCase("yes"));

	}

}

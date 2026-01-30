package StdManage;

import java.sql.SQLException;
import java.util.Scanner;

import course.delete_course;
import course.insert_course;
import course.show_course;
import course.update_course;
import enrollment.delete_enrollment;
import enrollment.insert_enrollment;
import enrollment.search_enrollment;
import enrollment.view_enrollment;
import student.Search_Student;
import student.delete_student;
import student.insert_student;
import student.update_student;
import student.view_student;
class student
{
	void manage_student(Scanner sc) throws ClassNotFoundException, SQLException
	{
		String cont;
		do
		{
			System.out.println("student management");
			System.out.println("------------------");
			System.out.println("1.insert student");
			System.out.println("2.view student");
			System.out.println("3.update student");
			System.out.println("4.search student");
			System.out.println("5.delete student");
			System.out.println("enter your choice:");
			int choice=sc.nextInt();
			switch(choice)
			{
			case 1:
				insert_student is=new insert_student();
				is.main(null);
			break;
			case 2:
				view_student vs=new view_student();
				vs.main(null);
			break;
			case 3:
				update_student us=new update_student();
				us.main(null);
			break;
			case 4:
				Search_Student ss=new Search_Student();
				ss.main(null);
			break;
			case 5:
				delete_student ds=new delete_student();
				ds.main(null);
			}
			System.out.println("do you want to continue student management? (yes/no)");
			cont=sc.next();
		}
		while(cont.equalsIgnoreCase("yes"));
	}
}
class course
{
	void manage_course(Scanner sc) throws ClassNotFoundException, SQLException
	{
		String cont;
		do
		{
			System.out.println("course management");
			System.out.println("-----------------");
			System.out.println("1.insert course");
			System.out.println("2.view course");
			System.out.println("3.update course");
			System.out.println("4.delete course");
			
			System.out.println("enter your choice:");
			int choice=sc.nextInt();
			switch(choice)
			{
			case 1:
				insert_course ic=new insert_course();
				ic.main(null);
				break;
			case 2:
				show_course sc1=new show_course();
				sc1.main(null);
				break;
			case 3:
				update_course uc=new update_course();
				uc.main(null);
				break;
			case 4:
				delete_course dc=new delete_course();
				dc.main(null);
				break;
			default:
				System.out.println("invalid choice");
				break;
			}
			System.out.println("do you want to continue course management? (yes/no)");
			cont=sc.next();
		}
		while(cont.equalsIgnoreCase("yes"));
	}
}
class enrollment
{
	void manage_enrollment(Scanner sc) throws ClassNotFoundException, SQLException
	{
		String cont;
		do
		{
			System.out.println("enrollment management");
			System.out.println("---------------------");
			System.out.println("1.insert enrollment");
			System.out.println("2.view enrollment");
			System.out.println("3.search enrollment");
			System.out.println("4.delete enrollment");
			
			System.out.println("enter your choice:");
			int choice=sc.nextInt();
			switch(choice)
			{
			case 1:
				insert_enrollment ie=new insert_enrollment();
					ie.main(null);
				break;
			case 2:
				view_enrollment ve=new view_enrollment();
				ve.main(null);
				break;
			case 3:
				search_enrollment se=new search_enrollment();
				se.main(null);
				break;
			case 4:
				delete_enrollment de=new delete_enrollment();
				de.main(null);
			}
			System.out.println("do you want to continue enrollment management? (yes/no)");
			cont=sc.next();
			
		}
		while(cont.equalsIgnoreCase("yes"));
	}
}

public class manage {

	public static void main(String[] args) throws ClassNotFoundException, SQLException {
		// TODO Auto-generated method stub
		Scanner sc=new Scanner(System.in);
		String cont;
		do
		{
			System.out.println("Student Management System");
			System.out.println("-------------------------");
			System.out.println("1.Student Management");
			System.out.println("2.Course Management");
			System.out.println("3.Enrollment Management");
			
			System.out.println("enter your choice:");
			int choice=sc.nextInt();
			switch(choice)
			{
			case 1:
				student s=new student();
				s.manage_student(sc);
				break;
			case 2:
				course c=new course();
				c.manage_course(sc);
				break;
			case 3:
				enrollment e=new enrollment();
				e.manage_enrollment(sc);
				break;
			default:
				System.out.println("invalid choice");
				break;
			}
			System.out.println("do you want to continue in main menu? (yes/no)");
			cont=sc.next();
		
		}
		while(cont.equalsIgnoreCase("yes"));
		

	}

}

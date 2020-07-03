package edu.uog;

import java.util.List;
import java.util.Scanner;

import edu.uog.Person.PersonMenu;
import edu.uog.campus.Room;
import edu.uog.campus.roomData;
import edu.uog.campus.roomInterface;
import edu.uog.course.Course;
import edu.uog.course.CourseMenu;
import edu.uog.course.courseData;
import edu.uog.student.StudentInterface;
import edu.uog.teacher.teacherInterface;
import edu.uog.timetable.WeekDayMenu;

@SuppressWarnings("unused")
public class TimeTableManagement {

	public static void main(String[] args) {
		@SuppressWarnings("resource")
		Scanner scan = new Scanner(System.in);
		int choice=-1;
		
		while(choice!=10)
		{
			System.out.println("=====================================================");
			System.out.println("Main Menu");
			System.out.println("=====================================================");
			System.out.println("1. Press 1 for  Rooms Data");
			System.out.println("2. Press 2 for  Course Data");
			System.out.println("3.  Press 3 for  Student Data ");
			System.out.println("4.  Press 4 for  Teacher Data ");
			
			System.out.println("10.   Quit");
			System.out.println("Enter Your Choice [1-10]: ");
			choice = scan.nextInt();
			switch(choice)
			{
			case 1:
				roomInterface.RoomMenu();
				choice=-1;
				break;
				
			case 2:
				
				CourseMenu.Menu();
				choice=-1;
				break;
			case 3:
				StudentInterface.StudentMenu();
				choice=-1;
				break;
			
			case 4:
				teacherInterface.TeacherMenu();
				choice=-1;
				break;
			
			case 5:
				PersonMenu.Menu();
				choice=-1;
				break;
			case 6:
				WeekDayMenu.WeekDayMenu();
				choice=-1;
				break;
			case 10:
				
				break;
			default:
				System.out.println("Invalid Choice!");
			}
		}
	}
		
		






	}


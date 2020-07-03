package edu.uog.teacher;

import java.util.List;
import java.util.Scanner;

import edu.uog.course.Course;
import edu.uog.course.courseData;


public class teacherInterface {

	public static void TeacherMenu()
	{
	int choice;
	boolean i=true;
	@SuppressWarnings("resource")
	Scanner sc=new Scanner(System.in);
	while(i)
	{
		System.out.println("=====================================================");
		System.out.println("Teachers Menu");
		System.out.println("=====================================================");
		System.out.println("1.   Insert The Teachers Data");
		System.out.println("2.   Delete The Teachers Data");
		System.out.println("3.   Show The Teachers Data");
		System.out.println("4.   Search The Teachers Data");
		
		System.out.println("10.   Back");
		System.out.print("Enter Your Choice [1-10]: ");
		choice = sc.nextInt();

		switch(choice)

		{
		case 1:
			System.out.println("---------------------------------");
			System.out.println("Add New Teacher");
			System.out.println("---------------------------------");
			Teacher Teacher = new Teacher();
			
			System.out.println("Enter ID Teacher :");
			int Teacher_ID=sc.nextInt();
			
			Teacher.setTEACHER_ID(Teacher_ID);
			
		
			Teacher = teacherData.Save(Teacher);
			System.out.println(Teacher.toString());
			
			break;
			
			
		case 2:
			System.out.println("---------------------------------");
			System.out.println("Delete Teacher");
			System.out.println("---------------------------------");
			System.out.println("Enter Teacher ID: ");
			int Teacher_ID1=sc.nextInt();
			Course Coursedelete = courseData.deleteOne(Teacher_ID1);
			System.out.println(Coursedelete.toString());
			System.out.println("---------------------------------");
			break;
			
			case 3:
				
				System.out.println("---------------------------------");
				System.out.println("Show All Teachers Data");
				System.out.println("---------------------------------");
				
				List<Teacher> Teachers=teacherData.findAll();
				for(int j=0;j<Teachers.size();j++)
				{
					System.out.println(Teachers.get(j).toString());
				}
				
				break;
				
		case 4 :
			System.out.println("---------------------------------");
			System.out.println("Search Teachers");
				System.out.println("---------------------------------");
                System.out.println("Enter Teacher Search");
               String Search=sc.nextLine();
               List<Teacher> Teachersearch=teacherData.search(Search);

                for (int i1=0; i1<Teachersearch.size(); i1++) {
				System.out.println(Teachersearch.get(i1).toString());
			}
			System.out.println("---------------------------------");

				break;
				
		
			case 10:
				i=false;
	}
	
}}}
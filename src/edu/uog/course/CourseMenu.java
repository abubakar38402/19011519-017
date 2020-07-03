package edu.uog.course;
import java.util.List;
import java.util.Scanner;


public class CourseMenu
{

	public static void Menu()
	{
	int choice;
	boolean i=true;
	@SuppressWarnings("resource")
	Scanner sc=new Scanner(System.in);
	while(i)
	{
		System.out.println("=====================================================");
		System.out.println("Courses Menu");
		System.out.println("=====================================================");
		System.out.println("1.   Insert The Courses Data");
		System.out.println("2.   Delete The Courses Data");
		System.out.println("3.   Show The Courses Data");
		System.out.println("4.   Search The Courses Data");
		
		System.out.println("10.   Back");
		System.out.print("Enter Your Choice [1-10]: ");
		choice = sc.nextInt();

		switch(choice)

		{
		case 1:
			System.out.println("---------------------------------");
			System.out.println("Add New Course");
			System.out.println("---------------------------------");
			Course Course = new Course();
			
			System.out.println("Enter ID Course :");
			int COURSE_ID=sc.nextInt();
			
			Course.setCOURSE_ID(COURSE_ID);
			
			System.out.println("Enter Course Code : ");
			String course_code=sc.nextLine();
			course_code=sc.nextLine();	
			Course.setCOURSE_CODE(course_code);
			
			System.out.println("Enter Course Title : ");
			String Title=sc.nextLine();
			Title+=sc.nextLine();
			Course.setCOURSE_TITLE(Title);
			
			System.out.println("Enter Course DESC: ");
			String DESC = sc.nextLine();
			Course.setCOURSE_DESC(DESC);
			
			System.out.println("Enter Course CREDITHOUR: ");
			int CREDITHOUR = sc.nextInt();
			Course.setCOURSE_CREDITHOUR(CREDITHOUR);
			
		
			Course = courseData.Save(Course);
			System.out.println(Course.toString());
			System.out.println("---------------------------------");
			break;
			
			
		case 2:
			System.out.println("---------------------------------");
			System.out.println("Delete Course");
			System.out.println("---------------------------------");
			System.out.println("Enter Course ID: ");
			int Course_ID=sc.nextInt();
			Course Coursedelete = courseData.deleteOne(Course_ID);
			System.out.println(Coursedelete.toString());
			System.out.println("---------------------------------");
			break;
			
			case 3:
				
				System.out.println("---------------------------------");
				System.out.println("Show All Courses Data");
				System.out.println("---------------------------------");
				
				List<Course> Courses=courseData.findAll();
				for(int j=0;j<Courses.size();j++)
				{
					System.out.println(Courses.get(j).toString());
				}
				System.out.println("---------------------------------");
				break;
				
			case 4 :
				System.out.println("---------------------------------");
				System.out.println("Search Courses");
				System.out.println("---------------------------------");
                System.out.println("Enter Course Search");
                String Search=sc.nextLine();
                List<Course> Coursesearch=courseData.search(Search);
                
                for (int i1=0; i1<Coursesearch.size(); i1++) {
					System.out.println(Coursesearch.get(i1).toString());
				}
				System.out.println("---------------------------------");
				
				break;
				
		
			case 10:
				i=false;
	}
	
}}}
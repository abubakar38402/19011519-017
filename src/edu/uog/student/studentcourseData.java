package edu.uog.student;

import java.io.BufferedReader;
import java.io.FileReader;
import java.io.IOException;
import java.util.ArrayList;
import java.util.List;

import edu.uog.timetable.Semster;
import edu.uog.course.Course;
import edu.uog.course.courseData;

public class studentcourseData {

	
	@SuppressWarnings({ "resource", "unused" })
	public static List<StudentCourse> findAll()  {
		List<StudentCourse> StudentCourses = new ArrayList<StudentCourse>();
		String line;
		courseData coursedata = new courseData();
		try {
			BufferedReader bufferreader = new BufferedReader(new FileReader(Course.csvFile));
			
			while ((line = bufferreader.readLine()) != null) {
				StudentCourse Studentcourse = new StudentCourse();
				Course course = new Course();
				
				String[] StudentcourseRow = line.split(",");
				
		Studentcourse.setSTUDENTCOURSE_ID(Integer.parseInt(StudentcourseRow[0]));
		Studentcourse.setCOURSE_ID(courseData.findOne(Integer.parseInt(StudentcourseRow[1])));
				StudentCourses.add(Studentcourse);
			}
		} catch (IOException e) {
			// TODO Auto-generated catch block
			e.printStackTrace();
		}
		
		return StudentCourses;
	}
	
	
	public float calculateSemsterCreidtHourByStudent(Student Student_ID,Semster SEMSTER_ID )
	
	
	{
		return 1;
		
}
}
package edu.uog.teacher;

import edu.uog.course.Course;

public class TeacherCourse {

	public static String csvFile="C:\\TeacherCourse.csv";
	
	private int STUDENTCOURSE_ID;
	private Course COURSE_ID;
	private Teacher TEACHER_ID;
	private String SECTION;
	
	public String toString()
	{
		String str= null;
		str=this.STUDENTCOURSE_ID
				+" ,"+ this.COURSE_ID.getCOURSE_ID()
				+" ,"+ this.TEACHER_ID.getPERSON_ID()
				+" ,"+ this.SECTION;
			
		return str;

	}

	public int getSTUDENTCOURSE_ID() {
		return STUDENTCOURSE_ID;
	}

	
	public void setSTUDENTCOURSE_ID(int sTUDENTCOURSE_ID) {
		STUDENTCOURSE_ID = sTUDENTCOURSE_ID;
	}

	
	


	
	public Course getCOURSE_ID() {
		return COURSE_ID;
	}

	public void setCOURSE_ID(Course cOURSE_ID) {
		COURSE_ID = cOURSE_ID;
	}

	public Teacher getTEACHER_ID() {
		return TEACHER_ID;
	}


	public void setTEACHER_ID(Teacher tEACHER_ID) {
		TEACHER_ID = tEACHER_ID;
	}


	public String getSECTION() {
		return SECTION;
	}

	public void setSECTION(String sECTION) {
		SECTION = sECTION;
	}
}

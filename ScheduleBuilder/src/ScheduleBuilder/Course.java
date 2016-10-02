package ScheduleBuilder;

import java.util.ArrayList;

public class Course {

	private ArrayList<Section> courseSections;
	
	// Examples of courseId include MATH240, CMSC132
	private final String courseId, courseName;
	private final int credits;
	private final String professor;
	
	/*
	 * Normal Constructor
	 */
	public Course(String courseId, String courseName, int credits, String professor){
		courseSections = new ArrayList<Section>();
		this.courseId = courseId;
		this.courseName = courseName;
		this.credits = credits;
		this.professor = professor;
	}
	
	/*
	 * Copy Constructor
	 */
	public Course(Course c){
		this(c.getCourseID(), c.getCourseName(), c.getCredits(), c.getProfessor());
	}
	
	public ArrayList<Section> getCourseSections(){
		return courseSections;
	}
	
	public String getCourseID(){
		return courseId;
	}
	
	public String getCourseName(){
		return courseName;
	}
	
	public int getCredits(){
		return credits;
	}
	
	public String getProfessor(){
		return professor;
	}
	
	
}

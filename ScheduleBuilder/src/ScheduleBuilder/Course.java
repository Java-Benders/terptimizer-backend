package ScheduleBuilder;

import java.util.ArrayList;

public class Course {

	private ArrayList<Section> courseSections;
	
	// Examples of courseId include MATH240, CMSC132
	private final String courseId, courseName;
	private final int credits;
	private final String professor;
	
	public Course(String courseId, String courseName, int credits, String professor){
		courseSections = new ArrayList<Section>();
		this.courseId = courseId;
		this.courseName = courseName;
		this.credits = credits;
		this.professor = professor;
	}
	
	public ArrayList<Section> getCourseSections(){
		return courseSections;
	}
	
	public String courseId(){
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

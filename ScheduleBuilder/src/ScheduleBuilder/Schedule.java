package ScheduleBuilder;

import java.util.ArrayList;

public class Schedule {

	private ArrayList<Course> oneSchedule;
	private ArrayList<Section> groupOfSections;
	
	/*
	 * Passing Constructor
	 */
	public Schedule(ArrayList<Course> oneSchedule){
		this.oneSchedule = oneSchedule;
		groupOfSections = new ArrayList<Section>();
	}
	
	/*
	 * Default Constructor
	 */
	public Schedule(){
		this(new ArrayList<Course>());
	}
	
	public Schedule getSchedule(ArrayList<Course> courses){
		return new Schedule(courses);
	}
	
	public ArrayList<Course> getOneSchedule(){
		return oneSchedule;
	}
	
	public ArrayList<Course> addCourse(Course course){
		
		oneSchedule.add(course);
		return oneSchedule;
		
	}
	
	public ArrayList<Section> getGroupOfSections(){
		return groupOfSections;
	}
	
}

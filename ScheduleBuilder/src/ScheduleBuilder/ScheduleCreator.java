package ScheduleBuilder;

import java.util.ArrayList;

public class ScheduleCreator {

	// Create list of all possible different schedules
	private static ArrayList<Schedule> listOfSchedules;
	
	// List of the courseIDs that will be used to generate the possible schedules
	private ArrayList<String> courseIDs;
	
	// Need ArrayList of all courses offered at UMD
	private ArrayList<Course> courses;
	
	private int credits;
	
	/*
	 * Normal Constructor
	 */
	public ScheduleCreator(ArrayList<String> courseIDs){
		this.courseIDs = courseIDs;
		listOfSchedules = new ArrayList<Schedule>();
//		courses = something
		credits = 0;
	}
	
	/*
	 * Default Constructor
	 */
	public ScheduleCreator(){
		this(new ArrayList<String>());
	}
	
	/*
	 * Copy Constructor
	 */
	public ScheduleCreator(ScheduleCreator sch){
		this(sch.getCourseIDs());
	}
	
	public ArrayList<Schedule> getListOfSchedules(){
		return listOfSchedules;
	}
	
	public ArrayList<String> getCourseIDs(){
		return courseIDs;
	}
	
	public ArrayList<Course> getCourses(){
		return courses;
	}
	
	public Schedule createSchedule(){

		ArrayList<Course> myCourses = new ArrayList<Course>();
		
		for(String ID : courseIDs){
			
			if(ID == null){
				continue;
			}
			
			for(Course course : courses){
				
				if(course.getCourseID().equals(ID)){
					myCourses.add(course);
				}
				
			}
			
			
		}// end of outer for loop
		
		return new Schedule(myCourses);
	}
	
}

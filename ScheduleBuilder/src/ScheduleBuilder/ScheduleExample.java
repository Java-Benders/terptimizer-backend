package ScheduleBuilder;

import java.util.ArrayList;

public class ScheduleExample {

	private ArrayList<Course> courses;
	
	public ScheduleExample(){
		courses = new ArrayList<Course>();
	}
	
	public ArrayList<Course> getCourses(){
		return courses;
	}
	
	public ArrayList<Course> addCourse(Course course){
		courses.add(course);
		return courses;
	}
	
	// Jason's classes - too many choices
	public ArrayList<Course> addExamples1(){
		addCourse(new Course("MATH240", "Linear Algebra", 4));
		addCourse(new Course("CMSC132", "Object-Oriented Programming II", 4));
		addCourse(new Course("COMM107", "Oral Communication", 3));
		return addCourse(new Course("ASTR100", "Introduction to Astronomy", 3));
	}
	
	// Luke's classes
	public ArrayList<Course> addExamples2(){
		addCourse(new Course("CMSC132", "Object-Oriented Programming II", 4));
		addCourse(new Course("MATH411", "Advanced Calculus I", 3));
		return addCourse(new Course("PHYS273", "Waves", 3));
	}
	
	public ArrayList<Course> addSectionsFromEx2(){
		
		ArrayList<Course> myCourses = addExamples2();
		
		// Add CS sections
		for(int i = 1; i <= 4; i++){
			
			myCourses.get(0).addSection(new Section("040" + i, myCourses.get(0).getCourseID(), "Nelseon Padua-Perz"));
			
			for(int j = 1; j <= 5; j += 2){
				myCourses.get(0).getCourseSections().get(i - 1).addTimeBlock(new 
						TimeBlock(540, 590, Day.getDayFromValue(j), ClassType.LEC, "CSI 1115"));
			}
			
			for(int h = 1; h <= 3; h += 2){
				myCourses.get(0).getCourseSections().get(i - 1).addTimeBlock(new 
						TimeBlock(1020, 1070, Day.getDayFromValue(h), ClassType.DIS, "CSI 2107"));
			}
			
		}
		// Add Math Sections
		myCourses.get(1).addSection(new Section("0101", myCourses.get(1).getCourseID(), "Matei Machedon"));
		myCourses.get(1).addSection(new Section("0201", myCourses.get(1).getCourseID(), "Patrick Fitzpatrick"));
		
		for(int j = 2; j <= 3; j += 2){
			myCourses.get(1).getCourseSections().get(0).addTimeBlock(new 
					TimeBlock(570, 645, Day.getDayFromValue(j), ClassType.LEC, "MTH B0421"));
			myCourses.get(1).getCourseSections().get(1).addTimeBlock(new 
					TimeBlock(660, 735, Day.getDayFromValue(j), ClassType.LEC, "PHY 1219"));
		}
		
		// Add Physics Section
		myCourses.get(2).addSection(new Section("0101", myCourses.get(2).getCourseID(), "Thomas Cohen"));
		for(int i = 2; i <= 4; i += 2){
			myCourses.get(2).getCourseSections().get(i - 1).addTimeBlock(new 
					TimeBlock(720, 795, Day.getDayFromValue(i), ClassType.LEC, "PHY 1204"));
		}
		
		return myCourses;
	}
	
	public ArrayList<Schedule> scheduleList(ArrayList<Course> myCourses){
		Schedule schedule = new Schedule(myCourses);
		ArrayList<Schedule> listOfSchedules = new ArrayList<Schedule>();
		
		for(Course course : myCourses){
			
			schedule = new Schedule(myCourses);
			
			schedule.addCourse(course);
				
			listOfSchedules.add(schedule);
		}
		
		return listOfSchedules;
	}
	
	
	// test
	public ArrayList<Schedule> makeSchedules(){
		return scheduleList(addExamples2());
	}
	
}

package ScheduleBuilder;

import java.util.ArrayList;

public class ScheduleCreator {

	private ArrayList<Schedule> listOfSchedules;
	
	public ScheduleCreator(){
		listOfSchedules = new ArrayList<Schedule>();
	}
	
	public ArrayList<Schedule> getListOfSchedules(){
		return listOfSchedules;
	}
	
}

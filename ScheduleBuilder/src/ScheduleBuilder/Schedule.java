package ScheduleBuilder;

import java.util.ArrayList;

public class Schedule {

	private ArrayList<Section> possibleSections;
	
	public Schedule(){
		possibleSections = new ArrayList<Section>();
	}
	
	public ArrayList<Section> getSchedule(){
		return possibleSections;
	}
	
}

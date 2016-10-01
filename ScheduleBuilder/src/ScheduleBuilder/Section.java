package ScheduleBuilder;

import java.util.ArrayList;

public class Section {
	
	private ArrayList<TimeBlock> sectionBlocks;
	private final int sectionID;
	
	public Section(int numberOfBlocks, int sectionID){
		
		sectionBlocks = new ArrayList<TimeBlock>();
		this.sectionID = sectionID;
		
	}
	
	public ArrayList<TimeBlock> getSections(){
		return sectionBlocks;
	}
	
	public int getSectionID(){
		return sectionID;
	}
	
}

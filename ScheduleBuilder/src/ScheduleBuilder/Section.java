package ScheduleBuilder;

import java.util.ArrayList;

public class Section {
	
	private ArrayList<TimeBlock> sectionBlocks;
	private final String sectionID, courseID;
	
	public Section(int numberOfBlocks, String sectionID, String courseID){
		
		sectionBlocks = new ArrayList<TimeBlock>();
		this.sectionID = sectionID;
		this.courseID = courseID;
		
	}
	
	public ArrayList<TimeBlock> getSections(){
		return sectionBlocks;
	}
	
	public String getSectionID(){
		return sectionID;
	}
	
	public String getCourseID(){
		return courseID;
	}
	
	public String toString(){
		
		String str = "Section: " + sectionID;
		
		for(TimeBlock block : sectionBlocks){
			str += block + "\n";
		}
		
		return str;
	}
	
	/*
	 * Returns true if there an overlap with the TimeBlocks of the Section in the parameter 
	 * with any of the Sections in the current object's ArrayList
	 */
	public boolean overlap(Section sec){
		
		int start = 0, end = 0;
		// block denotes the parameter's TimeBlocks
		for(TimeBlock block : sec.getSections()){
			
			//thisBlock denotes this object's TimeBlocks
			for(TimeBlock thisBlock : sectionBlocks){
				
				start = thisBlock.getStartTime();
				end = thisBlock.getEndTime();
				
				if(block.getStartTime() >= start && block.getStartTime() <= end){
					return true;
				}
				
				if(block.getEndTime() >= start && block.getEndTime() <= end){
					return true;
				}
			}// end of inside for loop
			
		}// end of outside for loop
		
		
		return false;
	}
	
	/*
	 * Sort elements of the sectionBlock ArrayList based on having an earlier time first
	 */
//	public ArrayList<TimeBlock> sortTimes(){
//		
//		
//		
//		
//	}
	
	
	
	
}

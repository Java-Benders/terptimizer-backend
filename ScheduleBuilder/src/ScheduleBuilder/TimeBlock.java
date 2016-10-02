package ScheduleBuilder;

public class TimeBlock {

	private int startTime, endTime;
	/*
	 * Times are represented as 1440 time where given the format of hours:minutes
	 * (including hours + 12 if pm) you have the time be 60*hours + minutes
	 * To convert back, take (time/60):(time%60)
	 */
	private Day day;
	private ClassType type;
	private String room;
	
	public TimeBlock(int startTime, int endTime, Day day, ClassType type, String room){
		this.startTime = startTime;
		this.endTime = endTime;
		this.day = day;
		this.type = type;
		this.room = room;
	}
	
	public int getStartTime(){
		return startTime;
	}
	
	public int getEndTime(){
		return endTime;
	}
	
	public Day getDay(){
		return day;
	}
	
	public ClassType getClassType(){
		return type;
	}
	
	public String getRoom(){
		return room;
	}
	
	public String toString(){
		String startMin = "" + startTime % 60, endMin = "" + endTime % 60;
		
		if(startMin.equals("0")){
			startMin += "0";
		}
		if(endMin.equals("0")){
			endMin += "0";
		}
		
		return day + " " + startTime/60 + ":" + startMin + " - " + 
				endTime/60 + ":" + endMin + " (" + type + ") in " + room;
	}
	
	/*
	 * Compares to TimeBlocks based on their startTime
	 * Earlier times are first
	 */
	public int compareTo(TimeBlock block){
		return startTime - block.getStartTime();
	}
	
}

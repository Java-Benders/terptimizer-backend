package ScheduleBuilder;

public enum Day {

	MON("Monday", 0), TUE("Tuesday", 1), WED("Wednesday", 2), 
		THU("Thursday", 3), FRI("Friday", 4);
	
	private final String name;
	private final int value;
	private static int totalDays = Day.values().length;
	
	private Day(String name, int value){
		this.name= name;
		this.value = value;
	}
	
	public String getName(){
		return name;
	}
	
	public int getValue(){
		return value;
	}
	
	public int getTotalDays(){
		return totalDays;
	}

	
	
}

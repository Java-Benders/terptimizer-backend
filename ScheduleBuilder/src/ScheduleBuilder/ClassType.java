package ScheduleBuilder;

public enum ClassType {

	LEC("Lecture", 0), DIS("Discussion", 1), LAB("Lab", 2);
	
	private final String name;
	private final int value;
	private static int totalTypes = ClassType.values().length;
	
	private ClassType(String name, int value){
		
		this.name = name;
		this.value = value;
		
	}
	
	public String getName(){
		return name;
	}
	
	public int getValue(){
		return value;
	}
	
	public int getTotalTypes(){
		return totalTypes;
	}
	
}

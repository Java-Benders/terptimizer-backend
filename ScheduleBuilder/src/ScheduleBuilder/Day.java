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
	
//	private Day(int value){
//		
//	}
	
	public String getName(){
		return name;
	}
	
	public int getValue(){
		return value;
	}
	
	public int getTotalDays(){
		return totalDays;
	}

	public static Day getDayFromValue(int num){
		Day day = null;
		switch(num){
			case 1:
				day = Day.MON;
				break;
			
			case 2:
				day = Day.TUE;
				break;
				
			case 3:
				day = Day.WED;
				break;
				
			case 4:
				day = Day.THU;
				break;
				
			case 5:
				day = Day.FRI;
				break;
				
			default:
				break;
		}
		return day;
	}
	
}

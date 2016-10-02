package ScheduleBuilder;

import java.util.Comparator;

public class TimeBlockComparator implements Comparator<TimeBlock> {
	
	public int compare(TimeBlock t1, TimeBlock t2){
		return t1.compareTo(t2);
	}

}

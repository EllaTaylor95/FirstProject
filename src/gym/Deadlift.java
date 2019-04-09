package gym;

import java.util.ArrayList;

public class Deadlift extends Dynamic {
	
	private static int deadliftCount = 0;
	
	protected Deadlift(ArrayList<Set> sets, BarPosition barPosition, Category category, String name) {
		super(sets, BodyPart.LEGS /* and back... */ , category, name);
		deadliftCount++;
	}
	
	public int getDeadliftCount() {
		return deadliftCount;
	}
	
}

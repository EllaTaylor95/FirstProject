package gym;

import java.util.ArrayList;

public class BackSquat extends Squat {
	
	private static int backSquatCount = 0;
	
	protected BackSquat(ArrayList<Set> sets, BarPosition barPosition, String name) {
		super(sets, barPosition, Category.BARBELL, name);
		backSquatCount++;
	}
	
	public int getBackSquatCount() {
		return backSquatCount;
	}

}

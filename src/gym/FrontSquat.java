package gym;

import java.util.ArrayList;

public class FrontSquat extends Squat {
	
	public static int frontSquatCount = 0;
	
	public FrontSquat(ArrayList<Set> sets) {
		super(sets, BarPosition.FRONT, Category.BARBELL, "Front Squat");
		frontSquatCount++;
	}
	
	public int getSquatCount() {
		return frontSquatCount;
	}

}

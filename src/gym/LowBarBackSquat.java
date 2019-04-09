package gym;

import java.util.ArrayList;

public class LowBarBackSquat extends BackSquat {
	
	private static int lowBarBackSquatCount = 0;
	
	public LowBarBackSquat(ArrayList<Set> sets) {
		super(sets, BarPosition.LOW, "Low Bar Back Squat");
		lowBarBackSquatCount++;
	}
	
	public int getLowBackBackSquatCount() {
		return lowBarBackSquatCount;
	}

}

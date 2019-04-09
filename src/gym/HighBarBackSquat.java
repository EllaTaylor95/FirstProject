package gym;

import java.util.ArrayList;

public class HighBarBackSquat extends BackSquat {
	
	private static int highBarBackSquatCount = 0;
	
	public HighBarBackSquat(ArrayList<Set> sets) {
		super(sets, BarPosition.HIGH, "High Bar Back Squat");
		highBarBackSquatCount++;
	}
	
	public int getHighBackBackSquatCount()  {
		return highBarBackSquatCount;
	}

}

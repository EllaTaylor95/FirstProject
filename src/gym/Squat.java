package gym;

import java.util.ArrayList;

public class Squat extends Dynamic {

	private BarPosition barPosition;
	private static int squatCount = 0;
	
	protected Squat(ArrayList<Set> sets, BarPosition barPosition, Category category, String name) {
		super(sets, BodyPart.LEGS, category, name);
		setBarPosition(barPosition);
		squatCount++;
	}

	public BarPosition getBarPosition() {
		return barPosition;
	}
	public void setBarPosition(BarPosition barPosition) {
		this.barPosition = barPosition;
	}
	
	public int getSquatCount() {
		return squatCount;
	}
	

}

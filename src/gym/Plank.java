package gym;

import java.util.ArrayList;

public class Plank extends Static {
	
	private static int plankCount = 0;
	
	Plank(ArrayList<Set> sets) {
		super(sets, BodyPart.ABS, Category.BODYWEIGHT, "Plank");
		plankCount++;
	}

	public int getPlankCount() {
		return plankCount;
	}
	
}

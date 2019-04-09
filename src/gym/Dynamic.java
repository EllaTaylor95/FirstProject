package gym;

import java.util.ArrayList;

public class Dynamic extends Resistance {
	
	private static int dynamicExerciseCount = 0;
	
	protected Dynamic(ArrayList<Set> sets, BodyPart bodyPart, Category category, String name) {
		super(sets,bodyPart, category, name);
		dynamicExerciseCount++;
	}
	
	public int getDynamicExerciseCount() {
		return dynamicExerciseCount;
	}
	
}

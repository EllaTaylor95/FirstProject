package gym;

import java.util.ArrayList;

public class Static extends Resistance {
	
	private static int staticExerciseCount = 0;
	
	protected Static(ArrayList<Set> sets, BodyPart bodyPart, Category category, String name) {
		super(sets, bodyPart, category, name);
		staticExerciseCount++;
	}
	
	public int getStaticExerciseCount() {
		return staticExerciseCount;
	}

}

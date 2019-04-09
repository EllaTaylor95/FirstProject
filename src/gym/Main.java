package gym;

import java.util.ArrayList;

public class Main {

	public static void main(String[] args) {
	
		System.out.println("HELLO");
		
		ArrayList<Resistance> exercises = new ArrayList<>();
		
		ArrayList<Set> sets = new ArrayList<>();
		
		sets.add(new Set(50.0, (int) 5));
		
		exercises.add(new HighBarBackSquat(sets));
		exercises.add(new LowBarBackSquat(sets));
		
		ResistanceSession resistanceSession = new ResistanceSession(exercises, Day.SQUAT);
		
		System.out.println("session: " + resistanceSession.toString());
		
		System.out.println(resistanceSession.getResistanceSessionCount());

	}

}

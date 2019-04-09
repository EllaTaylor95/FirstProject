package gym;

import java.util.ArrayList;

public class ResistanceSession {
	
	private ArrayList<Resistance> exercises = new ArrayList<>();
	private Day day;
	private static int resistanceSessionCount = 0;
	
	//constructor
	public ResistanceSession(ArrayList<Resistance> exercises, Day day) {
		setExercises(exercises);
		setDay(day);
		resistanceSessionCount++;
	}

	@Override
	public String toString() {
		return "ResistanceSession [exercises=" + exercises + ", day=" + day + "]";
	}

	public double getTotalWeightLifted() {
		double sum = 0.0;
		for (int i = 0; i < exercises.size(); i++) {
			sum += exercises.get(i).getVolume();
		}
		return sum;
	}
	
	//Accessors and mutators
	public ArrayList<Resistance> getExercises() {
		return exercises;
	}
	public void setExercises(ArrayList<Resistance> exercises) {
		this.exercises = exercises;
	}
	public Day getDay() {
		return day;
	}
	public void setDay(Day day) {
		this.day = day;
	}
	
	public int getResistanceSessionCount() {
		return resistanceSessionCount;
	}

}

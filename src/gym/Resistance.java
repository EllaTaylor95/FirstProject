package gym;

import java.util.ArrayList;

public class Resistance {
	
	private String name;
	private ArrayList<Set> sets = new ArrayList<>();
	private BodyPart bodyPart;
	private Category category;
	private static int resistanceExerciseCount = 0;
	
	protected Resistance(ArrayList<Set> sets, BodyPart bodyPart, Category catogory, String name) {
		setSets(sets);
		setBodyPart(bodyPart);
		setCategory(catogory);
		setName(name);
		resistanceExerciseCount++;
	}
	
	@Override
	public String toString() {
		return "Resistance [sets=" + sets + ", bodyPart=" + bodyPart + ", category=" + category + ", name=" + name + "]";
	}

	public Set getTopSetWeight() {
		double topWeight = 0.0;
		int topWeightIndex = 0;
		for (int i = 0; i < sets.size(); i++) {
			if(sets.get(i).getWeight() > topWeight) {
				topWeight = sets.get(i).getWeight();
				topWeightIndex = i;
			}
		}		
		return sets.get(topWeightIndex);
	}
	
	public Set getTopSetVolumn() {
		double topVol = 0.0;
		int topVolIndex = 0;
		for (int i = 0; i < sets.size(); i++) {
			if(sets.get(i).getVolume() > topVol) {
				topVol = sets.get(i).getVolume();
				topVolIndex = i;
			}
		}
		return sets.get(topVolIndex);
	}

	public double getVolume() {
		double sum = 0.0;
		for ( int i = 0; i < sets.size(); i++) {
			//Summing over the volume of each set to calculate total volume of exercise
			sum += sets.get(i).getVolume();
		}
		return sum;
	}
	
	public BodyPart getBodyPart() {
		return bodyPart;
	}
	public void setBodyPart(BodyPart bodyPart) {
		this.bodyPart = bodyPart;
	}
	public ArrayList<Set> getSets() {
		return sets;
	}
	public void setSets(ArrayList<Set> sets) {
		this.sets = sets;
	}
	public Category getCategory() {
		return category;
	}
	public void setCategory(Category category) {
		this.category = category;
	}

	public String getName() {
		return name;
	}

	public void setName(String name) {
		this.name = name;
	}
	
	public int getResistanceExerciseCount() {
		return resistanceExerciseCount;
	}

}

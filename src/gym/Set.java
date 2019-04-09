package gym;

public class Set {
	
	private double weight;
	private double time;
	private int reps;
	
	//Constructors
	public Set(double weight, int reps) {
		setWeight(weight);
		setReps(reps);
	}
	public Set(double weight, double time) {
		setWeight(weight);
		setTime(time);
	}
	
	
	@Override
	public String toString() {
		if (reps > 0)
			return "Set [weight=" + weight + ", reps=" + reps + "]";
		else
			return "Set [weight=" + weight + ", time=" + time + "]";
	}
	public double getVolume() {
		return weight*(double)reps;
	}
	
	//Accessors and mutators
	public double getWeight() {
		return weight;
	}
	public void setWeight(double weight) {
		this.weight = weight;
	}
	public int getReps() {
		return reps;
	}
	public void setReps(int reps) {
		this.reps = reps;
	}
	public double getTime() {
		return time;
	}
	public void setTime(double time) {
		this.time = time;
	}
	
}

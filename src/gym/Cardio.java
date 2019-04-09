package gym;

public class Cardio {
	
	private double time;
	private double distance;
	
	//Constructor
	public Cardio(double time, double distance) {
		setTime(time);
		setDistance(distance);
	}
	
	//Accessors and mutators
	public double getTime() {
		return time;
	}
	public void setTime(double time) {
		this.time = time;
	}
	public double getDistance() {
		return distance;
	}
	public void setDistance(double distance) {
		this.distance = distance;
	}
	

}

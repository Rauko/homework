package Ex_55_coll;

public class GenMan extends Manager {
	private final int bonus = 25;
	private final String position = "General Manager";

	public double getBonus() {
		return (double) Math.round(((double)bonus/100)*100)/100;
	}
	
	public String getPosition() {
		return position;
	}
	
	public double getFullSalary() {
		return (double) Math.round((((double)getSalary()*bonus/100 + getSalary()))*100)/100;
	}
}
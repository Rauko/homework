package Ex_55_coll;

public class Code extends Employee {
	private final int bonus = 19;
	private final String position = "   Programmer  ";

	public double getBonus() {
		return (double)Math.round(((double)bonus/100)*100)/100;
	}
	
	public String getPosition() {
		return position;
	}
	
	public double totalBonus(){
		return (double)Math.round((double)getSalary()*getBonus()*100)/100;
	}
	
	public double getFullSalary() {
		return (double)Math.round(((double)getSalary()*bonus/100 + getSalary())*100)/100;
	}
}
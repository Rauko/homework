package Ex_55_interf;

public class Employee {
	private int INN;
	private String firstName;
	private String secondName;
	private double salary;
	final private double bonus = 0;
	private final String position = "noob";
	
	public String getPosition() {
		return position;
	}
	
	public double getBonus() {
		return salary*bonus/100;
	}

	public int getINN() {
		return INN;
	}
	public void setINN(int iNN) {
		INN = iNN;
	}
	
	public String getFirstName() {
		return firstName;
	}
	public void setFirstName(String firstName) {
		this.firstName = firstName;
	}
	
	public String getSecondName() {
		return secondName;
	}
	public void setSecondName(String secondName) {
		this.secondName = secondName;
	}

	public double getSalary() {
		return salary;
	}
	public void setSalary(double salary) {
		this.salary = salary;
	}
	
	public String getName(){
		String name = getFirstName().charAt(0) + ". " + getSecondName();
		return name;
	}
	
	public String transformData(int data){
		String transformed = data + "";
		return transformed;
	}
	
	public String transformData(double data){
		String transformed = data + "";
		return transformed;
	}
	
	public double getFullSalary() {
		return (double) Math.round((salary*bonus/100 + salary)*100)/100;
	}
	
	public void prEmp(){}
	
	public double totalBonus(){
		Double digitBonus = (double) Math.round(getSalary()*getBonus()*100)/100;
		return digitBonus;
	}
	
	public void setEmployee(int INN, String firstName, String secondName, double salary){
		setINN(INN);
		setFirstName(firstName);
		setSecondName(secondName);
		setSalary(salary);
	}
	
	public Employee(){}
}
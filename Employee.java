public class Employee {
	private int INN;
	private String firstName;
	private String secondName;
	private double salary;
	private double bonus = 0;
	
	public int getBonus() {
		return salary*bonus;
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
	
	public String getFullSalary() {
		return salary*bonus + salary;
	}

	public void setEmployee(int INN, String firstName, String secondName, double salary){
		setINN(INN);
		setFirstName(firstName);
		setSecondName(secondName);
		setSalary(salary);
	}
}

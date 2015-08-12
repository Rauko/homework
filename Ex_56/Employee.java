package Ex_56;

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
		return format(salary*bonus/100 + salary);
	}
	
	public static void space1(int word, int line){
		for(int i = 0; i < line - word;i++)
			System.out.print(" ");
	}
	
	public static void space2(int word, int line){
		for(int i = line - word; i < line + 1;i++)
			System.out.print(" ");
	}
	
	public void prEmp(){}
	
	public double totalBonus(){
		Double digitBonus = format(getSalary()*getBonus());
		return digitBonus;
	}
	
	public void setEmployee(int INN, String firstName, String secondName, double salary){
		setINN(INN);
		setFirstName(firstName);
		setSecondName(secondName);
		setSalary(format(salary));
	}
	
	public double format(double outDouble){
		String s = outDouble + "";
		String out = "";
		for(int i = 0; i < s.length(); i++){
			out += s.charAt(i) + "";
			if(s.charAt(i) == '.'){
				i++;
				if((s.length()-1) - i == 2){
					out += s.charAt(s.length()-2) + s.charAt(s.length()-1);
					out += "0";
					break;
				} else if((s.length()-1) - i < 2){
					out += s.charAt(i) + "0";
					break;
				} else if ((s.length()-1) - i > 2) {
					out += s.charAt(i) + "" + s.charAt(i+1);
					break;
				} else if(s.charAt(i) == '0'){
					out += "00";
				}
			}
		}
		outDouble = Double.parseDouble(out);
		return outDouble;
	}
	
	public void formatOut(double num){
		String s = num + "";
		for(int i = 0; i < s.length(); i++){
			System.out.print(s.charAt(i));
			if(s.charAt(i) == '.'){
				i++;
				if((s.length()-1) - i == 2){
					for(int j = 0; j < 2; j++) {
						System.out.print(s.charAt(j));
					}
					System.out.println("0 UAN.");
					break;
				} else if((s.length()-1) - i < 2){
					System.out.println(s.charAt(i) + "0 UAN.");
					break;
				} else if ((s.length()-1) - i > 2) {
					System.out.println(s.charAt(i) + "" + s.charAt(i+1) + " UAN.");
					break;
				}
			}
		}
	}
	
	public void prLine(){}
	
	public Employee(){}
}
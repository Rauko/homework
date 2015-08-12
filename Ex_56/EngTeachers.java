package Ex_56;

public class EngTeachers extends Employee {
	private final int bonus = 15;
	private final String position = " Communication ";

	public double getBonus() {
		return format((double)bonus/100);
	}
	
	public String getPosition() {
		return position;
	}
	
	public double getFullSalary() {
		return format(getSalary()*bonus/100 + getSalary());
	}
	
	public double totalBonus(){
		String bonus = getSalary()*getBonus() + "";
		Double digitBonus = Double.parseDouble(bonus);
		return digitBonus;
	}
	
	public String[] employeeInfoOut(){
		String[] info = {transformData(getINN()), getFirstName(), getSecondName(), transformData(getSalary()), transformData(totalBonus()) , getPosition()};
		return info;
	}
	
	public String[] employeeShortInfoOut(){
		String[] info = {transformData(getINN()), getName(), transformData(getSalary()), transformData(totalBonus()) , getPosition()};
		return info;
	}
	
	public void prEmp(){
		int lng = getFirstName().length();
		System.out.print("│ " + getINN() + " │ " + getFirstName());
		space1(lng,13);
		lng = getSecondName().length();
		System.out.print(" │ " + getSecondName());
		space1(lng,13);
		lng = getPosition().length();
		System.out.print(" │ " + getPosition() + " │");
		lng = transformData(getSalary()).length();
		space2(lng/2-1,12);
		System.out.print(getSalary());
		space2(lng/2-1,12);
		lng = transformData(totalBonus()).length();
		System.out.print(" │ ");
		space2(lng/2-1,12);
		System.out.print(totalBonus());
		space2(lng/2-1,12);
		System.out.print("│ ");
		lng = transformData(getFullSalary()).length();
		space2(lng/2-1,12);
		System.out.print(getFullSalary());
		space2(lng/2-1,12);
		System.out.println(" │");
	}
	
	public void prLine(){
		String[] info = employeeShortInfoOut();
		for(int i = 0; i < info.length; i++){
			if(i == 0){
				System.out.print("│ " + info[i] + " │ ");
			} else if(i == 1) {
				System.out.print(info[i] + "                 │   ");
			} else if (i == 2) {
				System.out.print(info[i] + "   │   ");
			} else if (i == 3) {
				System.out.print(info[i] + "   │");
			} else System.out.print(info[i] + "│");
		}
		System.out.println();
	}
}
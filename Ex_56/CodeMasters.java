package Ex_56;

public class CodeMasters extends Employee {
	private final int bonus = 19;
	private final String position = "   Programmer  ";

	public double getBonus() {
		return format((double)bonus/100);
	}
	public String getPosition() {
		return position;
	}
	
	public double totalBonus(){
		Double digitBonus = format(getSalary()*getBonus());
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
	
	public double getFullSalary() {
		return format(getSalary()*bonus/100 + getSalary());
	}
	
	public void prLine(){
		String[] info = employeeShortInfoOut();
		for(int i = 0; i < info.length; i++){
			if(info[1].charAt(0) == 'A' && info[1].charAt(3) == 'B'){
				if(i == 0){
					System.out.print("│ " + info[i] + " │ ");
				} else if(i == 1) {
					System.out.print(info[i] + "                  │   ");
				} else if (i == 2) {
					System.out.print(info[i] + "   │   ");
				} else if (i == 3) {
					System.out.print(info[i] + "   │");
				} else System.out.print(info[i] + "│");
			} else if (info[1].charAt(0) == 'O' && info[1].charAt(3) == 'S'){
				if(i == 0){
					System.out.print("│ " + info[i] + " │ ");
				} else if(i == 1) {
					System.out.print(info[i] + "              │   ");
				} else if (i == 2) {
					System.out.print(info[i] + "   │   ");
				} else if (i == 3) {
					System.out.print(info[i] + "   │");
				} else System.out.print(info[i] + "│");
			} else if (info[1].charAt(0) == 'N' && info[1].charAt(3) == 'P'){
				if(i == 0){
					System.out.print("│ " + info[i] + " │ ");
				} else if(i == 1) {
					System.out.print(info[i] + "            │   ");
				} else if (i == 2) {
					System.out.print(info[i] + "   │   ");
				} else if (i == 3) {
					System.out.print(info[i] + "   │");
				} else System.out.print(info[i] + "│");
			} else if (info[1].charAt(0) == 'A' && info[1].charAt(3) == 'S'){
				if(i == 0){
					System.out.print("│ " + info[i] + " │ ");
				} else if(i == 1) {
					System.out.print(info[i] + "               │   ");
				} else if (i == 2) {
					System.out.print(info[i] + "   │   ");
				} else if (i == 3) {
					System.out.print(info[i] + "   │");
				} else System.out.print(info[i] + "│");
			} else if (info[1].charAt(0) == 'D' && info[1].charAt(3) == 'V'){
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
		}
		System.out.println();
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
}
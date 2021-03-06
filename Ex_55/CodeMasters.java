package Ex_55;

public class CodeMasters extends Employee {
	private final int bonus = 19;
	private final String position = "   Programmer  ";

	public double getBonus() {
		return bonus;
	}
	public String getPosition() {
		return position;
	}
	
	public double totalBonus(){
		String bonus = getSalary()*getBonus()/100 + "";
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
					System.out.print(info[i] + "    │");
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
}
public class Manager extends Employee {
	private final int bonus = 22;
	private final String position = "    Manager    ";

	public int getBonus() {
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
			if(info[1].charAt(0) == 'O'){
				if(i == 0){
					System.out.print("│ " + info[i] + " │ ");
				} else if(i == 1) {
					System.out.print(info[i] + "             │   ");
				} else if (i == 2) {
					System.out.print(info[i] + "   │   ");
				} else if (i == 3) {
					System.out.print(info[i] + "   │");
				} else System.out.print(info[i] + "│");
			} else {
				if(i == 0){
					System.out.print("│ " + info[i] + " │ ");
				} else if(i == 1) {
					System.out.print(info[i] + "               │   ");
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

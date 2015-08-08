package Ex_55;

public class GenMan extends Manager {
	private final int bonus = 25;
	private final String position = "General Manager";

	public double getBonus() {
		return format((double)bonus/100);
	}
	
	public String getPosition() {
		return position;
	}
	
	public double getFullSalary() {
		return format(getSalary()*bonus/100 + getSalary());
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
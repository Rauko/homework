public class GenMan extends Manager {
	private final int bonus = 25;
	private final String position = "General Manager";

	public int getBonus() {
		return bonus;
	}
	
	public String getPosition() {
		return position;
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
				System.out.print(info[i] + "    │");
			} else System.out.print(info[i] + "│");
		}
		System.out.println();
	}
}

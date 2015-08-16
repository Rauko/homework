package Ex_55_interf;

import java.util.*;

import Ex_55_interf.ModeExec;
import Ex_55_interf.Employee;

public class OutPut extends Employee implements ModeExec, Comparable <Object>, Comparator <Employee> {
	
	protected static int task = 0;
	
	public static void sorted(Employee[] e){
		Arrays.sort(e, new OutPut());
		System.out.println("Fabrika Od.UA employee list, sorted by salary(total):");
		new OutPut().sortedSalary(e);
		
	}
	
	public static void full(Employee[] e){
		System.out.println("Fabrika Od.UA employee list:");
		new OutPut().fullInfo(e);
	}
	
	public static void INN(Employee[] e) {
		Arrays.sort(e, new OutPut());
		System.out.println("Fabrika Od.UA employee list, sorted by INN:");
		new OutPut().sortedINN(e);
	}

	public static void name(Employee[] e) {
		Arrays.sort(e, new OutPut());
		System.out.println("Fabrika Od.UA employee list, sorted by Second Name:");
		new OutPut().sortedName(e);
	}
	
	public void sortedINN(Employee[] e) {
		empTask3ListHead();
		for(int i = 0; i < e.length; i++)
			prLineTask23(e[i]);
		empTask23ListTail();
	}

	public void sortedName(Employee[] e) {
		empTask2ListHead();
		for(int i = 0; i < e.length; i++)
			prLineTask23(e[i]);
		empTask23ListTail();
		
	}
	
	public void fullInfo(Employee[] e){
		empFullInfoListHead();
		for(int i = 0; i < e.length; i++)
			prLineFullInfo(e[i]);
		empFullInfoListTail();
	}
	
	public void sortedSalary(Employee[] e){
		empTask1ListHead();
		for(int i = 0; i < e.length; i++)
			prLineTask1(e[i]);
		empTask1ListTail();
	}
	
	public static void empListHead(){
		System.out.println(""
				  + "┌────┬──────────────────────────┬─────────────┬────────────┬───────────────┐"
				+ "\n│  № │        Employee          │   Salary    │    Bonus   │    Position   │"
				+ "\n├────┼──────────────────────────┼─────────────┼────────────┼───────────────┤");

	}
	
	public static void empTask1ListHead(){
		System.out.println(
			    "╔════╦═══════════════════════════════╦════════════════════════════════════════════╗"
			+ "\n║    ║           Employee            ║               ^  Salary                    ║"
			+ "\n║  № ╟───────────────┬───────────────╫──────────────┬─────────────┬───────────────╢"
			+ "\n║    ║      Name     │    Surname    ║ Basic Salary │    Bonus    │   * Total     ║"
			+ "\n╠════╬═══════════════╪═══════════════╬══════════════╪═════════════╪═══════════════╣");

	}
	
	public static void empTask2ListHead(){
		System.out.println(
				    "╔════╦═══════════════════════════════╦═════════════════╗"
				+ "\n║    ║         ^ Employee            ║                 ║"
				+ "\n║  № ╟───────────────┬───────────────╢     Position    ║"
				+ "\n║    ║      Name     │  * Surname    ║                 ║"
				+ "\n╠════╬═══════════════╪═══════════════╬═════════════════╣");

	}
	
	public static void empTask3ListHead(){
		System.out.println(
				    "╔════╦═══════════════════════════════╦═════════════════╗"
				+ "\n║    ║           Employee            ║                 ║"
				+ "\n║ ^№ ╟───────────────┬───────────────╢     Position    ║"
				+ "\n║    ║      Name     │    Surname    ║                 ║"
				+ "\n╠════╬═══════════════╪═══════════════╬═════════════════╣");

	}
	
	public static void empFullInfoListHead(){
		System.out.println(
				    "╔════╦═══════════════════════════════╦═════════════════╦════════════════════════════════════════════╗"
				+ "\n║    ║           Employee            ║                 ║                  Salary                    ║"
				+ "\n║  № ╟───────────────┬───────────────╢     Position    ╟──────────────┬─────────────┬───────────────╢"
				+ "\n║    ║      Name     │    Surname    ║                 ║ Basic Salary │    Bonus    │     Total     ║"
				+ "\n╠════╬═══════════════╪═══════════════╬═════════════════╬══════════════╪═════════════╪═══════════════╣");

	}
	
	public static void empListTail(){
		System.out.println("└────┴──────────────────────────┴─────────────┴────────────┴───────────────┘");
	}
	
	public static void empAltListTail(double monthlySum){
		int lng = 10;
		System.out.print(   "├────┴──────────────────────────┴─────────────┼────────────┴───────────────┤"
						+ "\n│ Total sum of salary:                        │ ");
		space(lng,17); 
														    System.out.println( monthlySum + " UAN      │"
						+ "\n└─────────────────────────────────────────────┴────────────────────────────┘");
	}
	
	public static void space(int word, int line){
		for(int i = 0; i < line - word; i++)
			System.out.print(" ");
	}
	
	public static void empTask1ListTail(){
		System.out.println("╚════╩═══════════════╧═══════════════╩══════════════╧═════════════╧═══════════════╝");

	}
	public static void empTask23ListTail(){
		System.out.println("╚════╩═══════════════╧═══════════════╩═════════════════╝");
	}
	public static void empFullInfoListTail(){
		System.out.println("╚════╩═══════════════╧═══════════════╩═════════════════╩══════════════╧═════════════╧═══════════════╝");
	}
	
	public void prLineTask1(Employee e){ 
		int lng = transformData(e.getINN()).length();
		System.out.print("║ "); space(lng,2);
		System.out.print(e.getINN() + " ║ ");
		lng = e.getFirstName().length();
		System.out.print(e.getFirstName());
		space(lng,13);
		System.out.print(" │ " + e.getSecondName());
		lng = e.getSecondName().length();
		space(lng,13);
		System.out.print(" ║ ");
		lng = transformData(e.getSalary()).length();
		space(lng,12);
		System.out.print(e.getSalary() + " │ ");
		lng = transformData(e.totalBonus()).length();
		space(lng,11);
		System.out.print(e.totalBonus() + " │ ");
		lng = transformData(e.getFullSalary()).length();
		space(lng,13);
		System.out.println(e.getFullSalary() + " ║");
	}
	
	public void prLineTask23(Employee e){ 
		int lng = transformData(e.getINN()).length();
		System.out.print("║ "); space(lng,2);
		System.out.print(e.getINN() + " ║ ");
		lng = e.getFirstName().length();
		System.out.print(e.getFirstName());
		space(lng,13);
		System.out.print(" │ " + e.getSecondName());
		lng = e.getSecondName().length();
		space(lng,13);
		System.out.print(" ║ ");
		System.out.println(e.getPosition() + " ║");
	}
	
	public void prLineFullInfo(Employee e){ 
		int lng = transformData(e.getINN()).length();
		System.out.print("║ "); space(lng,2);
		System.out.print(e.getINN() + " ║ ");
		lng = e.getFirstName().length();
		System.out.print(e.getFirstName());
		space(lng,13);
		System.out.print(" │ " + e.getSecondName());
		lng = e.getSecondName().length();
		space(lng,13);
		System.out.print(" ║ " + e.getPosition() + " ║ ");
		lng = transformData(e.getSalary()).length();
		space(lng,12);
		System.out.print(e.getSalary() + " │ ");
		lng = transformData(e.totalBonus()).length();
		space(lng,11);
		System.out.print(e.totalBonus() + " │ ");
		lng = transformData(e.getFullSalary()).length();
		space(lng,13);
		System.out.println(e.getFullSalary() + " ║");
	}

	public int compareTo(Object o) {
		Employee e = (Employee) o;
		if (getSalary() > e.getSalary()) return -1;
		if (getSalary() < e.getSalary()) return 1;
		return 0;
	}
	
	public int compare(Employee e1, Employee e2){
		switch(task) {
			case 1 : {
				if (e1.getSalary() > e2.getSalary()) 
					return -1;
				if (e1.getSalary() < e2.getSalary()) 
					return 1;
				return 0;
			}
			case 2 : {
				int result = e1.getSecondName().compareTo(e2.getSecondName());
				if (result == 0){
					result = e1.getFirstName().compareTo(e2.getFirstName());
				}
				return result;
			}
			default : {
				if (e1.getINN() > e2.getINN()) 
					return 1;
				if (e1.getINN() < e2.getINN()) 
					return -1;
				return 0;
			}
		}
	}
	 
		public static void menu(Employee[] dataBase){
			System.out.print("Fabrika Od.UA employee list:\n"
					+ "\n"
					+ "1. Sort by Salary.\n"
					+ "2. Sort by Second Name.\n"
					+ "3. Sort by INN.\n"
					+ "\n"
					+ "Choose mode: ");
			
			Scanner in = new Scanner(System.in);
			task = in.nextInt();
			in.close();
			if (task < 1 || task > 3) {
				System.err.print("Choose mode from 1 to 3!");
				in.close();
				return;
			}
			if(task == 1){
				String ANSI_CLEAR_SEQ = "\u001b[2J";
				System.out.println(ANSI_CLEAR_SEQ);
				//this two lines should clear screen
				sorted(dataBase);
			} else if(task == 2){
				String ANSI_CLEAR_SEQ = "\u001b[2J";
				System.out.println(ANSI_CLEAR_SEQ);
				//this two lines should clear screen
				name(dataBase);
			} else if(task == 3){
				String ANSI_CLEAR_SEQ = "\u001b[2J";
				System.out.println(ANSI_CLEAR_SEQ);
				//this two lines should clear screen
				INN(dataBase);
			}
		}
}
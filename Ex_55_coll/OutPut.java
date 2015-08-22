package Ex_55_coll;

import java.util.*;

import Ex_55_coll.ModeExec;
import Ex_55_coll.Employee;

public class OutPut extends Employee implements ModeExec, Comparable <Object> {
	
	protected static int task = 0;
	
	public static void sorted(Employee[] e){
		new OutPut().sortedSalary(e);	
	}

	
	public static void INN(Employee[] e) {
		new OutPut().sortedINN(e);
	}

	public static void name(Employee[] e) {
		new OutPut().sortedName(e);
	}
	
	public void sortedINN(Employee[] e) {
		// TreeSet
		SortedSet<Employee> sortedEmp = new TreeSet<>(new Comparator <Employee>() {
			public int compare(Employee e1, Employee e2) {
				if (e1.getINN() > e2.getINN()) 
					return 1;
				if (e1.getINN() < e2.getINN()) 
					return -1;
				return 0;
			}
		});
		for(int i = 0; i < e.length; i++)
			sortedEmp.addAll(Arrays.asList(e[i]));
		System.out.println("Fabrika Od.UA employee list, sorted by INN:");
		empTask3ListHead();
		simpleOutPut(sortedEmp);
		empTask23ListTail();
	}

	public void sortedName(Employee[] e) {
		System.out.println("Fabrika Od.UA employee list, sorted by Second Name:");
		// TreeSet
		SortedSet<Employee> sortedEmp = new TreeSet<>(new Comparator <Employee>() {
			public int compare(Employee e1, Employee e2){
				int result = e1.getSecondName().compareTo(e2.getSecondName());
				if (result == 0){
					result = e1.getFirstName().compareTo(e2.getFirstName());
				}
				return result;
			}
		});
		for(int i = 0; i < e.length; i++)
			sortedEmp.addAll(Arrays.asList(e[i]));
		empTask2ListHead();
		simpleOutPut(sortedEmp);
		empTask23ListTail();
	}
	
	public void sortedSalary(Employee[] e){
		System.out.println("Fabrika Od.UA employee list, sorted by salary(total):");
		// TreeSet
		SortedSet<Employee> sortedEmp = new TreeSet<>(new Comparator <Employee>() {
			public int compare(Employee e1, Employee e2){
				if (e1.getSalary() > e2.getSalary()) 
					return -1;
				if (e1.getSalary() < e2.getSalary()) 
					return 1;
				return 0;
			}
		});
		for(int i = 0; i < e.length; i++)
			sortedEmp.addAll(Arrays.asList(e[i]));
		empTask1ListHead();
		for(Employee currentEmpl : sortedEmp){
			int lng = transformData(currentEmpl.getINN()).length();
			System.out.print("║ "); space(lng,2);
			System.out.print(currentEmpl.getINN() + " ║ ");
			lng = currentEmpl.getFirstName().length();
			System.out.print(currentEmpl.getFirstName());
			space(lng,13);
			System.out.print(" │ " + currentEmpl.getSecondName());
			lng = currentEmpl.getSecondName().length();
			space(lng,13);
			System.out.print(" ║ ");
			lng = transformData(currentEmpl.getSalary()).length();
			space(lng,12);
			System.out.print(currentEmpl.getSalary() + " │ ");
			lng = transformData(currentEmpl.totalBonus()).length();
			space(lng,11);
			System.out.print(currentEmpl.totalBonus() + " │ ");
			lng = transformData(currentEmpl.getFullSalary()).length();
			space(lng,13);
			System.out.println(currentEmpl.getFullSalary() + " ║");
		}
		empTask1ListTail();
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
	
	public void simpleOutPut(SortedSet<Employee> sortedEmp){
		for(Employee currentEmpl : sortedEmp){
			int lng = transformData(currentEmpl.getINN()).length();
			System.out.print("║ "); space(lng,2);
			System.out.print(currentEmpl.getINN() + " ║ ");
			lng = currentEmpl.getFirstName().length();
			System.out.print(currentEmpl.getFirstName());
			space(lng,13);
			System.out.print(" │ " + currentEmpl.getSecondName());
			lng = currentEmpl.getSecondName().length();
			space(lng,13);
			System.out.print(" ║ ");
			System.out.println(currentEmpl.getPosition() + " ║");
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
			System.out.print("\033[H\033[2J");
			System.out.flush();
			//this will work only in linux
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
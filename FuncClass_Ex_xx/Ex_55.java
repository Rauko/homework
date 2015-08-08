package FuncClass_Ex_xx;

/*
В компании "Фабрика Од Уа, ЛТД" работает 10 человек. Используя класс Employee 
написать программу, которая создает список (массив) из 10 элементов и заполняет
его данными о сотрудниках компании. Главбух компании очень любит различные 
красивые отчеты и статистику. Для того, чтобы сделать работу главбуха веселее,
а себе выбить возможность получения бонусов, реализовать в программе следующие 
функции:
 - Печать отчета в виде: INN	ФИО	зряплата
 - Вычислить ежемесечное количество денег, которое главбух должен оторвать от фонда
   заработной платы для выдачи сотрудникам.
 - Вычислить сотрудника с минимальным окладом. Распечатать в виде: INN	ФИО	зряплата
 - Вычислить мажора с максимальным окладом. Распечатать в виде: INN	ФИО	зряплатa
 */

import java.util.*;

import Ex_55.Employee;
import Ex_55.GenMan;
import Ex_55.Manager;
import Ex_55.CodeMasters;
import Ex_55.EngTeachers;

public class Ex_55 {

	public static void main(String[] args) {
		Employee[] dataBase = new Employee[10];
			dataBase[0] = new GenMan();
			dataBase[1] = new Manager();
			dataBase[2] = new Manager();
			dataBase[3] = new EngTeachers();
			dataBase[4] = new EngTeachers();
			dataBase[5] = new CodeMasters();
			dataBase[6] = new CodeMasters();
			dataBase[7] = new CodeMasters();
			dataBase[8] = new CodeMasters();
			dataBase[9] = new CodeMasters();

		dataBase[0].setEmployee(0, "Victor", "Sotov", 28902);
		dataBase[1].setEmployee(1, "Olga", "Dovganich", 14732);
		dataBase[2].setEmployee(2, "Gleb", "Swyajin", 17732);
		dataBase[3].setEmployee(3, "Jane", "Smith", 14214);
		dataBase[4].setEmployee(4, "Ronald", "Monks", 14234);
		dataBase[5].setEmployee(5, "Oleg", "Strelcov", 20632);
		dataBase[6].setEmployee(6, "Agrey", "Brus", 22941);
		dataBase[7].setEmployee(7, "Nicolay", "Pashkovsky", 22873);
		dataBase[8].setEmployee(8, "Andrey", "Selchuk", 19230);
		dataBase[9].setEmployee(9, "Dmitry", "Vlaev", 20063);

		System.out.print( "\n1. Print the report."
						+ "\n2. Monthly amount of money for issuing employees."
						+ "\n3. An employee with a minimum salary."
						+ "\n4. An employee with a maximum salary."
						+ "\n5. Quit."
						+ "\n"
						+ "\nChoose mode: ");

		
		int task = 0;
		String quit = new String();
		Scanner in = new Scanner(System.in);
		do {
			try {
				while (in.hasNext()) {
					task = in.nextInt();
					if (task < 1 || task > 5) {
						System.err.print("Choose mode from 1 to 5!");
						in.close();
						return;
					}
					System.out.println();
					if(task == 1){
						simpleReport(dataBase);
						System.out.print("\n2. Monthly amount of money for issuing employees."
								+ "\n3. An employee with a minimum salary."
								+ "\n4. An employee with a maximum salary."
								+ "\n5. Quit."
								+ "\n"
								+ "\nChoose mode: ");
					} else if(task == 2){
						amount(dataBase);
						System.out.print( "\n1. Print the report."
								+ "\n3. An employee with a minimum salary."
								+ "\n4. An employee with a maximum salary."
								+ "\n5. Quit."
								+ "\n"
								+ "\nChoose mode: ");
					} else if(task == 3){
						min(dataBase);
						System.out.print( "\n1. Print the report."
								+ "\n2. Monthly amount of money for issuing employees."
								+ "\n4. An employee with a maximum salary."
								+ "\n5. Quit."
								+ "\n"
								+ "\nChoose mode: ");
					} else if(task == 4){
						max(dataBase);
						System.out.print( "\n1. Print the report."
								+ "\n2. Monthly amount of money for issuing employees."
								+ "\n3. An employee with a minimum salary."
								+ "\n5. Quit."
								+ "\n"
								+ "\nChoose mode: ");
					} else {
						quit = "Quit";
						return;
					}
				}
			} catch (Exception ex) {
				System.err.println("Input ERROR");
			} finally {
				in.close();
			}
		} while (!quit.equals("Quit"));
	}
	
	public static void info(Employee dataBase){
		System.out.println("INN: " + dataBase.getINN() + "\nName: " + dataBase.getFirstName() + 
				"\nSurname: " + dataBase.getSecondName() + "\nPosition: " + dataBase.getPosition()
				+ "\nTotal Salary: " + dataBase.getFullSalary());
	}
	
	public static void min(Employee[] dataBase){
		System.out.println("An employee with a minimum salary:");
		double min = dataBase[0].getSalary();
		int in = 0;
		for(int i = 0; i < dataBase.length; i++){
			if(min > dataBase[i].getSalary()){
				in = i;
				min = dataBase[i].getSalary();
			} else continue;
		}
		info(dataBase[in]);
	}
	
	public static void max(Employee[] dataBase){
		System.out.println("An employee with a maximum salary:");
		double max = dataBase[0].getSalary();
		int in = 0;
		for(int i = 0; i < dataBase.length; i++){
			if(max < dataBase[i].getSalary()){
				in = i;
				max = dataBase[i].getSalary();
			} else continue;
		}
		info(dataBase[in]);
	}
	
	public static void simpleReport(Employee[] e){
		empListHead();
		for(int i = 0; i < e.length; i++)
			e[i].prLine();
		empListTail();
	}
	
	public static void amount(Employee[] dataBase){
		double monthlySum = 0;
		for(int i = 0; i < dataBase.length; i++){
			monthlySum += dataBase[i].getFullSalary();
		}
		String s = monthlySum + "";
		System.out.print("Total sum of salary: ");
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
	
	public static void empListHead(){
		System.out.println("\nFabrika.Od.UA LTD Employee list:\n┌───┬──────────────────────────┬─────────────┬─────────────┬───────────────┐\n│ № │        Employee          │   Salary    │    Bonus    │    Position   │\n├───┼──────────────────────────┼─────────────┼─────────────┼───────────────┤");

	}
	
	public static void empListTail(){
		System.out.println("└───┴──────────────────────────┴─────────────┴─────────────┴───────────────┘");
	}
}
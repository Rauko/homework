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

public class Ex_55 {

	public static void main(String[] args) {
		GenMan emp1 = new GenMan();
		emp1.setEmployee(0, "Victor", "Sotov", 28902);
		
		Manager emp2 = new Manager();
		emp2.setEmployee(1, "Olga", "Dovganich", 14732);
		Manager emp3 = new Manager();
		emp3.setEmployee(2, "Gleb", "Swyajin", 17732);
		
		EngTeachers emp4 = new EngTeachers();
		emp4.setEmployee(3, "Jane", "Smith", 14214);
		EngTeachers emp5 = new EngTeachers();
		emp5.setEmployee(4, "Ronald", "Monks", 14234);
		
		CodeMasters emp6 = new CodeMasters();
		emp6.setEmployee(5, "Oleg", "Strelcov", 20632);
		CodeMasters emp7 = new CodeMasters();
		emp7.setEmployee(6, "Agrey", "Brus", 22941);
		CodeMasters emp8 = new CodeMasters();
		emp8.setEmployee(7, "Nicolay", "Pashkovsky", 22873);
		CodeMasters emp9 = new CodeMasters();
		emp9.setEmployee(8, "Andrey", "Selchuk", 19230);
		CodeMasters emp10 = new CodeMasters();
		emp10.setEmployee(9, "Dmitry", "Vlaev", 20063);
		
		String[][] employeeBase = new String[10][];
		employeeBase[0] = emp1.employeeInfoOut();
		employeeBase[1] = emp2.employeeInfoOut();
		employeeBase[2] = emp3.employeeInfoOut();
		employeeBase[3] = emp4.employeeInfoOut();
		employeeBase[4] = emp5.employeeInfoOut();
		employeeBase[5] = emp6.employeeInfoOut();
		employeeBase[6] = emp7.employeeInfoOut();
		employeeBase[7] = emp8.employeeInfoOut();
		employeeBase[8] = emp9.employeeInfoOut();
		employeeBase[9] = emp10.employeeInfoOut();
		
		System.out.print("1. Print the report.\n2. Monthly amount of money for issuing employees.\n3. An employee with a minimum salary.\n4. An employee with a maximum salary.\n\nChoose mode: ");
		
		int task = 0;
		Scanner in = new Scanner(System.in);
		task = in.nextInt();
		in.close();
		if (task < 1 || task > 4) {
			System.err.print("Choose mode from 1 to 2!");
			in.close();
			return;
		}
		if(task == 1){
			simpleReport(employeeBase, emp1, emp2, emp3, emp4, emp5, emp6, emp7, emp8, emp9, emp10);
		} else if(task == 2){
			amount(employeeBase);
		} else if(task == 3){
			min(employeeBase);
		} else {
			max(employeeBase);
		}
	}
	
	public static void info(String[] infoBase){
		System.out.println("INN: " +infoBase[0] + "\nName: " + infoBase[1] + "\nSurname: " + infoBase[2] + "\nPosition: " + infoBase[5] + "\nTotal Salary: " + fullSalary(infoBase));
	}
	
	public static double transform(String data){
		Double transformed = Double.parseDouble(data);
		return transformed;
	}
	
	public static double fullSalary(String[] infoBase){
		double sum = transform(infoBase[3]) + transform(infoBase[4]);
		return sum;
	}
	
	public static void min(String[][] base){
		System.out.println("An employee with a minimum salary:");
		double min = transform(base[0][3]);
		int in = 0;
		for(int i = 0; i < base.length; i++){
			if(min > transform(base[i][3])){
				in = i;
				min = transform(base[i][3]);
			} else continue;
		}
		info(base[in]);
	}
	
	public static void max(String[][] base){
		System.out.println("An employee with a maximum salary:");
		double max = 0;
		int in = 0;
		for(int i = 0; i < base.length; i++){
			if(max < transform(base[i][3])){
				in = i;
				max = transform(base[i][3]);
			} else continue;
		}
		info(base[in]);
	}
	
	public static void simpleReport(String[][] base, GenMan emp1, Manager emp2, Manager emp3, EngTeachers emp4, EngTeachers emp5, CodeMasters emp6, CodeMasters emp7, CodeMasters emp8, CodeMasters emp9, CodeMasters emp10){
		greetingHead();
		empListHead();
		emp1.prLine();
		emp2.prLine();
		emp3.prLine();
		emp4.prLine();
		emp5.prLine();
		emp6.prLine();
		emp7.prLine();
		emp8.prLine();
		emp9.prLine();
		emp10.prLine();
		empListTail();		
	}
	
	public static void amount(String[][] base){
		double monthlySum = 0;
		for(int i = 0; i < base.length; i++){
			monthlySum += fullSalary(base[i]);
		}
		
		String greedIsGood = monthlySum + "";
		int count = greedIsGood.length();
		System.out.print("Total sum of salary: ");
		boolean mark = true;
		for (int i = 0; i < count; i ++){
			if(greedIsGood.charAt(i) == '.'){
				i = count -2;
				mark = false;
				System.out.print(".");
			} if(i == count - 1 && mark){
				System.out.print(".00");
			}
			System.out.print(greedIsGood.charAt(i));
		}
		System.out.println(" UAN.");
	}
	
	public static void greetingHead(){
		System.out.println("Fabrika.Od.UA LTD Employee list:");
	}
	public static void empListHead(){
		String head = ("┌───┬──────────────────────────┬─────────────┬─────────────┬───────────────┐\n│ № │        Employee          │   Salary    │    Bonus    │    Position   │\n├───┼──────────────────────────┼─────────────┼─────────────┼───────────────┤");
		System.out.println(head);
	}
	
	public static void empListTail(){
		String head = ("└───┴──────────────────────────┴─────────────┴─────────────┴───────────────┘");
		System.out.println(head);
	}
}
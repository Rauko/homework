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

import Ex_56.Employee;
import Ex_56.GenMan;
import Ex_56.Manager;
import Ex_56.CodeMasters;
import Ex_56.EngTeachers;

public class Ex_56 {

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

		System.out.print( "Fabrika.Od.UA LTD."
						+ "\n"
						+ "\n1. Print the report."
						+ "\n2. Monthly amount of money for issuing employees."
						+ "\n3. An employee with a minimum salary."
						+ "\n4. An employee with a maximum salary."
						+ "\n5. Quit."
						+ "\n"
						+ "\nChoose mode: ");

		
		int task = 0;
		Scanner in = new Scanner(System.in);
		task = in.nextInt();
		in.close();
		if (task < 1 || task > 5) {
			System.err.print("Choose mode from 1 to 5!");
			
			return;
		}
		System.out.println();
		if(task == 1){
			simpleReport(dataBase);
		} else if(task == 2){
			amount(dataBase);
		} else if(task == 3){
			min(dataBase);
		} else if(task == 4){
			max(dataBase);
		} else {
			return;
		}
	}
	
	public static void min(Employee[] dataBase){
		System.out.println("An employee with a minimum salary:");
		empMinMaxListHead();
		double min = dataBase[0].getSalary();
		int in = 0;
		for(int i = 0; i < dataBase.length; i++){
			if(min > dataBase[i].getSalary()){
				in = i;
				min = dataBase[i].getSalary();
			} else continue;
		}
		dataBase[in].prEmp();
		empMinMaxListTail();
	}
	
	public static void max(Employee[] dataBase){
		System.out.println("An employee with a maximum salary:");
		empMinMaxListHead();
		double max = dataBase[0].getSalary();
		int in = 0;
		for(int i = 0; i < dataBase.length; i++){
			if(max < dataBase[i].getSalary()){
				in = i;
				max = dataBase[i].getSalary();
			} else continue;
		}
		dataBase[in].prEmp();
		empMinMaxListTail();
	}
	
	public static void simpleReport(Employee[] e){
		System.out.println("Fabrika.Od.UA LTD Employee list:");
		empListHead();
		for(int i = 0; i < e.length; i++)
			e[i].prLine();
		empListTail();
	}
	
	public static void amount(Employee[] dataBase){
		System.out.println("Fabrika.Od.UA LTD monthly amount:");
		empListHead();
		for(int i = 0; i < dataBase.length; i++)
			dataBase[i].prLine();
		double monthlySum = 0;
		for(int i = 0; i < dataBase.length; i++){
			monthlySum += dataBase[i].getFullSalary();
		}
		//System.out.print("Total sum of salary: ");
		//dataBase[0].formatOut(monthlySum);
		empAltListTail(monthlySum);
	}
	
	public static void empListHead(){
		System.out.println(""
				  + "┌───┬──────────────────────────┬─────────────┬────────────┬───────────────┐"
				+ "\n│ № │        Employee          │   Salary    │    Bonus   │    Position   │"
				+ "\n├───┼──────────────────────────┼─────────────┼────────────┼───────────────┤");

	}
	
	public static void empListTail(){
		System.out.println("└───┴──────────────────────────┴─────────────┴────────────┴───────────────┘");
	}
	public static double format(double outDouble){
		String s = outDouble + "";
		String out = "";
		for(int i = 0; i < s.length(); i++){
			out += s.charAt(i) + "";
			if(s.charAt(i) == '.'){
				i++;
				if((s.length()-1) - i == 2){
					out += s.charAt(s.length()-2) + s.charAt(s.length()-1);
					out += "0";
					break;
				} else if((s.length()-1) - i < 2){
					out += s.charAt(i) + "0";
					break;
				} else if ((s.length()-1) - i > 2) {
					out += s.charAt(i) + "" + s.charAt(i+1);
					break;
				} else if(s.charAt(i) == '0'){
					out += "00";
				}
			}
		}
		outDouble = Double.parseDouble(out);
		return outDouble;
	}
	
	public static void empAltListTail(double monthlySum){
		System.out.println( "├───┴──────────────────────────┴─────────────┼────────────┴───────────────┤"
						+ "\n│ Total sum of salary:                       │          " + format(monthlySum) + " UAN      │"
						+ "\n└────────────────────────────────────────────┴────────────────────────────┘");
	}
	
	public static void empMinMaxListHead(){
		System.out.println(
				    "┌───┬───────────────────────────────┬─────────────────┬────────────────────────────────────────────┐"
				+ "\n│   │           Employee            │                 │                  Salary                    │"
				+ "\n│ № ├───────────────┬───────────────┤     Position    ├──────────────┬─────────────┬───────────────┤"
				+ "\n│   │      Name     │    Surname    │                 │ Basic Salary │    Bonus    │     Total     │"
				+ "\n├───┼───────────────┼───────────────┼─────────────────┼──────────────┼─────────────┼───────────────┤");

	}
	
	public static void empMinMaxListTail(){
		System.out.println("└───┴───────────────┴───────────────┴─────────────────┴──────────────┴─────────────┴───────────────┘");
	}
}
package FuncClass_Ex_xx;

import Ex_55_interf.OutPut;
import Ex_55_interf.GenMan;
import Ex_55_interf.Manager;
import Ex_55_interf.EngTeach;
import Ex_55_interf.Code;
import Ex_55_interf.Employee;


public class Ex_55_interf extends OutPut{
	public static void main(String[] args){
		Employee[] dataBase = new Employee[10];
			dataBase[0] = new GenMan();
			dataBase[1] = new Manager();
			dataBase[2] = new Manager();
			dataBase[3] = new EngTeach();
			dataBase[4] = new EngTeach();
			dataBase[5] = new Code();
			dataBase[6] = new Code();
			dataBase[7] = new Code();
			dataBase[8] = new Code();
			dataBase[9] = new Code();
			
		dataBase[0].setEmployee(1, "Victor", "Sotov", 28902);
		dataBase[1].setEmployee(2, "Olga", "Dovganich", 14732);
		dataBase[2].setEmployee(3, "Gleb", "Swyajin", 17732);
		dataBase[3].setEmployee(4, "Jane", "Smith", 14214);
		dataBase[4].setEmployee(5, "Ronald", "Monks", 14234);
		dataBase[5].setEmployee(6, "Oleg", "Strelcov", 20632.71);
		dataBase[6].setEmployee(7, "Andrey", "Brus", 22941);
		dataBase[7].setEmployee(8, "Nicolay", "Pashkovsky", 22873);
		dataBase[8].setEmployee(9, "Andrey", "Selchuk", 19230);
		dataBase[9].setEmployee(10, "Dmitry", "Vlaev", 20063);
		
		menu(dataBase);
	}

}
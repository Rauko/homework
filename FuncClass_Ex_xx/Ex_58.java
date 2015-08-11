package FuncClass_Ex_xx;

/*
58. Реализвать абстрактные классы и интерфейсы, применить наследование и полиморфизм: 
	интерфейс Корабль, абстрактный класс Военный корабль, класс Авианосец, абстрактный 
	класс Грузовой корабль, класс Танкер
*/

import Ex_58.WaterShip;
import Ex_58.Battleship;
import Ex_58.Tanker;
import Ex_58.Cargoship;
import Ex_58.AircraftCarrier;

public class Ex_58 {
	public static void main(String[] args) {
		WaterShip[] fleet = new WaterShip[4];
			fleet[0] = new WaterShip("Asmadeus", 1700, 35, 2567, 68);
			fleet[1] = new AircraftCarrier("Isenhower",	32315, 67, 125251, 70, 24151);
			fleet[2] = new Tanker();
	//		fleet[3] = new Cargoship("Rangatire", 34677, 24000, 40, 12890, 60);
			

			fleet[1].move();
			fleet[1].setPointOuter("port 1");
			fleet[1].setPointInner("port 2");
			fleet[1].movePriority();
			
			System.out.println(fleet[1].displacement());
	}
}

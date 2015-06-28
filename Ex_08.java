/*
Напишите программу, которая получает из аргументов командной стоки: количество километров, пройденных автомобилем; количество литров израсходованного бензина; стоимость одного литра бензина. Программа должна рассчитать и вывести на экран значение среднего расхода топлива на 100 км пройденного пути и среднюю стоимость 1 км пути.
 */

public class Ex_08 {
	public static void main (String[] args){
		Integer km=0;
		km = Integer.parseInt(args[0]);
		System.out.println("You drove " + km + " km."); 

		Integer ov=0;
		ov = Integer.parseInt(args[1]);
		System.out.println("You spent " + ov + " liters of fuel."); 
		
		Integer oc=0;
		oc = Integer.parseInt(args[2]);
		System.out.println("It cost " + oc + " $ per liter"); 

		int fuelFor100 = 1;
		double fuelCostFor1 = 1.00d;
		
		fuelFor100 = ov * 100 / km;
		fuelCostFor1 = ((double)ov / km) * oc;
		

		System.out.println("Fuel consumption for 100 km " + fuelFor100 + " liters and the cost of 1 km " + fuelCostFor1); 
		
	}
}

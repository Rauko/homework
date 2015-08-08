/*
Напишите программу, которая получает из аргументов командной стоки: количество километров, пройденных автомобилем; количество литров израсходованного бензина; стоимость одного литра бензина. Программа должна рассчитать и вывести на экран значение среднего расхода топлива на 100 км пройденного пути и среднюю стоимость 1 км пути.
 */

public class Ex_08 {
	public static void main (String[] args){
		if(args.length >= 3) {
			if(args.length > 3)
				System.err.println("You entered more digits, than programm needs. It will use only the first one");
			Integer km = Integer.parseInt(args[0]);
			Integer ov = Integer.parseInt(args[1]);
			Integer oc = Integer.parseInt(args[2]);

			System.out.println("You drove " + km + " km."); 
			System.out.println("You spent " + ov + " liters of fuel.");
			System.out.println("It cost " + oc + " $ per liter"); 

			int fuelFor100 = 1;
			double fuelCostFor1 = 1.00d;

			fuelFor100 = ov * 100 / km;

			if (km == 0 || ov == 0 || oc == 0) {
				if (km == 0) {
					System.err.println("Your car broke down in garage.");
				}		

				if (oc == 0) {
					System.err.print("You drove by someones car. ");
					if (ov != 0) {
						System.out.println(" Fuel consumption for 100 km is" + fuelFor100 + ".");
					}
					System.out.println();
				}
				return;
			}

			fuelCostFor1 = ((double)ov / km) * oc;
		
			System.out.println("Fuel consumption for 100 km " + fuelFor100 + " liters and the cost of 1 km " + fuelCostFor1); 
		} else
			System.err.println("Enter three digit arguments!");
	}
}
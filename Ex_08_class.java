/*
Напишите программу, которая получает из аргументов командной стоки: количество километров, пройденных автомобилем; количество литров израсходованного бензина; стоимость одного литра бензина. Программа должна рассчитать и вывести на экран значение среднего расхода топлива на 100 км пройденного пути и среднюю стоимость 1 км пути.
 */

public class Ex_08_class {
	public static boolean cond (int km, int ov, int oc){
		boolean cond = false;
		if (km == 0 || ov == 0 || oc == 0) {
			if (km == 0) {
				System.err.println("Your car broke down in garage.");
				cond = true;
			}		

			if (oc == 0) {
				System.err.print("You drove by someones car. ");

			}
		}
		return cond;
	}

	public static boolean generalCond(String[] args, int conditionLength){
		boolean cond = false;
		if (args.length < conditionLength) {
			System.err.println("You haven't entered arguments! The task requires entering three arguments.");
			cond = true;
		}
		if (args.length > conditionLength) System.out.println("You entered more arguments, than programm needs. \nIt will use only first two.");
		return cond;
	}

	public static void main (String[] args){
		if (generalCond(args, 3)) return;

		ClassAdd task = new ClassAdd();

		task.km = Integer.parseInt(args[0]);
		task.ov = Integer.parseInt(args[1]);
		task.oc = Integer.parseInt(args[2]);

		System.out.println("You drove " + task.km + " km.\nYou spent " + task.ov + " liters of fuel.\nIt cost " + task.oc + " $ per liter"); 

		if(cond(task.km,task.ov,task.oc)) return;
		task.fuelFor100 = task.ov * 100 / task.km;			
		if (task.ov != 0 && task.oc == 0) {
			System.out.println(" Fuel consumption for 100 km is" + task.fuelFor100 + ".");
			return;
		}
		task.fuelCostFor1 = ((double)task.ov / task.km) * task.oc;
		System.out.println("Fuel consumption for 100 km " + task.fuelFor100 + " liters and the cost of 1 km " + task.fuelCostFor1); 
	}
}
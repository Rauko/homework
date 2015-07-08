/*
Начальный вклад в банке равен 1000 руб. Через каждый месяц размер вклада увеличивается на P процентов от имеющейся суммы (P — вещественное число, 0 < P < 25). По данному P определить, через сколько месяцев размер вклада превысит 1100 руб., и вывести найденное количество месяцев K (целое число) и итоговый размер вклада S (вещественное число).
*/

public class Ex_35 {
	public static void main(String[] args){
		if (args.length < 1) {
			System.err.println("You haven't entered an argument! The task requires entering one argument.");
			return;
		}
		if (args.length > 1) System.out.println("You entered more arguments, than programm needs. \nIt will use only first one.");
		Double P = Double.parseDouble(args[0]);
		if (P < 0 || P > 25){
			System.err.println("Entered digit doesn't satisfy condition. It must be in array from 1 to 24!");
			return;
		}
		System.out.println("You entered: " + P + "%.\nYour starting deposit: 1000.");
		double S = 1000;
		P /= 100;
		int K = 0;
		do {
			S += S * P;
			K++;
		} while(S < 1100);
		System.out.println("Your final balance is " + S + ".\nThe balance exceeds the value of 1100 in " + K + " month.");
	}
}
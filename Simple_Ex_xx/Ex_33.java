/*
Дано целое число N (> 0). Найти произведение N! = 1·2·…·N (N–факториал). Чтобы избежать целочисленного переполнения, вычислять это произведение с помощью вещественной переменной и вывести его как вещественное число.
*/

public class Ex_33 {
	public static void main(String[] args){
		if (args.length < 1) {
			System.err.println("You haven't entered an argument! The task requires entering one argument.");
			return;
		}
		if (args.length > 1) System.out.println("You entered more arguments, than programm needs. \nIt will use only first one.");
		Double N = Double.parseDouble(args[0]);
		if (N < 0){
			System.err.println("Entered digit doesn't satisfy condition. It must be positive!");
			return;
		}
		double fact = 1;
		for (int i = 1; i <= N; i++ ) {
			fact *= (double)i;
		}
			System.out.printf("%g",fact);
			System.out.println();

	}
}
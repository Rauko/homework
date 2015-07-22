/*
Дано целое число N (> 0). Найти произведение N! = 1·2·…·N (N–факториал). Чтобы избежать целочисленного переполнения, вычислять это произведение с помощью вещественной переменной и вывести его как вещественное число.
Для реализации использовать функции.
*/

public class Ex_33_func {
	public static double fact(int N){
		double fact = 1;
		for (int i = 2; i <= N; i++ ) {
			fact *= (double)i;
		}
		return fact;
	}
	
	public static boolean cond(int N){
		boolean cond = false;
		if (N <= 0){
			System.err.println("Entered digit doesn't satisfy condition. It must be positive and not zero!");
			cond = true;
		}
		return cond;
	}
	
	public static boolean generalCond(String[] args, int conditionLength){
		boolean cond = false;
		if (args.length < conditionLength) {
			System.err.println("You haven't entered an argument! The task requires entering one argument.");
			cond = true;
		}
		if (args.length > conditionLength) System.out.println("You entered more arguments, than programm needs. \nIt will use only first two.");
		return cond;
	}
	
	public static void main(String[] args) {
		if(generalCond(args,1)) return;
		Integer N = Integer.parseInt(args[0]);
		if(cond(N)) return;
		System.out.println("You entered digit " + N + ".\n" + N + "! = " + fact(N));
	}
}
/*
Дано вещественное число A и целое число N (> 0). Используя один цикл, найти значение выражения 1 - A + A2 - A3 + ... + (-1)^N*A^N. Условный оператор не использовать. Для реализации использовать функции.
*/

public class Ex_32_func {
	public static double lineSum(double A, int N){
		double line = 1d;
		int plusMinus = -1;
		int bufMark = -1;
		double sum = 1d;
		System.out.print("A = " + A + ", N = " + N + ". \nLine: " + line + " ");
		for(int i = 0; i < N; i++){
			line *= ((double)A)*bufMark;
			bufMark *= plusMinus;
			sum += line;
			System.out.print(line + " ");
		}
		return sum;
	}
	
	public static boolean cond(int N, double A){
		boolean cond = false;
		if (N < 0){
			System.err.println("One of entered digits doesn't satisfy condition. Second digit must be positive!");
			cond = true;
			return cond;
		}
		if (A == 0){
			System.out.print("A = " + A + ", N = " + N + ". \nLine: 1.0 ");
			for(int i = 0; i < N; i++)
				System.out.print(A*A +" ");
			System.out.println("\b.\nSum of this line would be 1.");
			cond = true;
		}
		return cond;
	}
	
	public static boolean generalCond(String[] args, int conditionLength){
		boolean cond = false;
		if (args.length < conditionLength) {
			System.err.println("You haven't entered arguments! The task requires entering two arguments.");
			cond = true;
		}
		if (args.length > conditionLength) System.out.println("You entered more arguments, than programm needs. \nIt will use only first two.");
		return cond;
	}
	
	public static void main(String[] args) {
		if(generalCond(args,2)) return;
		Double A = Double.parseDouble(args[0]);
		Integer N = Integer.parseInt(args[1]);
		if (cond(N,A)) return;
		System.out.println("\b.\nSum of this line would be: " + lineSum(A,N));
	}
}

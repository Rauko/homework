/*
Даны два целых числа A и B (A < B). Найти сумму квадратов всех целых чисел от A до B включительно. 
Для реализации использовать функции.
*/

public class Ex_31_func {
	public static int subSqProd(int A, int B){
		int prod = 0;
		for(int i = A; i <= B; i++)
			prod += i*i;
		return prod;
	}
	
	public static boolean cond(int A, int B){
		boolean cond = false;
		if (B < A){
			System.err.println("One of entered digits doesn't satisfy condition. First digit must be less than second!");
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
		Integer A = Integer.parseInt(args[0]);
		Integer B = Integer.parseInt(args[1]);
		if (cond(A,B)) return;
		System.out.println("A = " + A + ", B = " + B + ". \nThe sum of squares of all integers from A to B inclusive: " + subSqProd(A,B));
	}
}

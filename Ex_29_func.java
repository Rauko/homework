/*
Даны два целых числа A и B (A < B). Найти сумму всех целых чисел от A до B включительно. Для реализации использовать функции.
*/

public class Ex_29_func {
	
	public static int subSum(int A, int B){
		int sum = 0;
		for(int i = A+1; i <= B; i++)
			sum += i;
		return sum;
	}
	
	public static boolean cond(int A, int B){
		boolean cond = false;
		if (B < A){
			System.err.println("One of entered digits doesn't satisfy condition. First digit must be less than second!");
			cond = true;
		}
		return cond;
	}

	public static void main(String[] args) {
		if (args.length < 2) {
			System.err.println("You haven't entered arguments! The task requires entering two arguments.");
			return;
		}
		if (args.length > 2) System.out.println("You entered more arguments, than programm needs. \nIt will use only first two.");
		Integer A = Integer.parseInt(args[0]);
		Integer B = Integer.parseInt(args[1]);
		if (cond(A,B)) return;
		System.out.print("A = " + A + ", B = " + B + ". \nThe sum of all integers from A to B inclusive: ");
		int sum = subSum(A,B);
		System.out.println(sum);
	}
}

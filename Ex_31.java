/*
Даны два целых числа A и B (A < B). Найти сумму квадратов всех целых чисел от A до B включительно.
*/

public class Ex_31 {
	public static void main(String[] args){
		if (args.length < 2) {
			System.err.println("You haven't entered arguments! The task requires entering two arguments.");
			return;
		}
		if (args.length > 2) System.out.println("You entered more arguments, than programm needs. \nIt will use only first two.");
		Integer A = Integer.parseInt(args[0]);
		Integer B = Integer.parseInt(args[1]);
		if (B < A){
			System.err.println("One of entered digits doesn't satisfy condition. First digit must be less than second!");
			return;
		}
		System.out.print("A = " + A + ", B = " + B + ". \nThe sum of squares of all integers from A to B inclusive: ");
		int sq = 0;
		for(int i = A; i <= B; i++)
			sq += i*i;
		System.out.println(sq);
	}
}
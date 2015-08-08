/*
Даны два целых числа A и B (A < B). Найти произведение всех целых чисел от A до B включительно.
*/

public class Ex_30 {
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
		System.out.print("A = " + A + ", B = " + B + ". \nThe product of all integers from A to B inclusive: ");
		for(int i = A+1; i <= B; i++)
			A *= i;
		System.out.println(A);
	}
}
/*
Дан массив из десяти целых чисел. Найти их среднее арифметическое.
*/

public class Ex_42 {
	public static void main (String[] args){
		if (args.length < 10) {
			System.err.println("You haven't entered arguments! The task requires entering ten arguments.");
			return;
		}
		if (args.length > 10) System.out.println("You entered more arguments, than programm needs. \nIt will use only first ten.");

		int[] array = new int[10];

		for(int i = 0; i < array.length; i++)
			array[i] = Integer.parseInt(args[i]);

		System.out.println("Your array is: ");
		for (int i = 0; i < array.length; i++)
			System.out.print(array[i] + ", ");
		System.out.println("\b\b.");

		double sum = 1;
		for (int i = 0; i < array.length; i++)
			sum += array[i];
		sum /= array.length;
		System.out.println("Arithmetical mean of this array is: " + sum + ".");
	}
}
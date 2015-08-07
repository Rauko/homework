/*
Дан массив из десяти целых чисел. Найти их произведение.
*/

public class Ex_41 {
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
			System.out.print(array[i] + " ");
		System.out.println();

		int product = 1;
		for (int i = 0; i < array.length; i++)
			product *= array[i];
		System.out.println("Product of this array is: " + product);
	}
}
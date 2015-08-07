/*
Дано целое число K и массив из десяти целых ненулевых чисел. Вывести номер первого числа в массиве, большего K. Если таких чисел нет, то вывести 0
*/

public class Ex_43 {
	public static void main (String[] args){
		if (args.length < 11) {
			System.err.println("You haven't entered arguments! The task requires entering ten arguments.");
			return;
		}
		if (args.length > 11) System.out.println("You entered more arguments, than programm needs. \nIt will use only first ten.");
		Integer K = Integer.parseInt(args[0]);
		int[] array = new int[10];

		for(int i = 0; i < array.length; i++) {
			array[i] = Integer.parseInt(args[i+1]);
			if(array[i] == 0) {
				System.err.println("Array members can't be zero! Check entered arguments and try again.");
				return;
			}
		}	

		System.out.print("K = " + K +"\nYour array is: ");
		for (int i = 0; i < array.length; i++)
			System.out.print(array[i] + ", ");
		System.out.println("\b\b.");

		for (int i = 0; i < array.length; i++) {
			if (array[i] > K) {
				i++;
				System.out.println("First array member, that is bigger than K have number " + i + " in array.\n                                             *not it's index!*");
				return;
			}
		}
		System.out.println("0 - There is no digits bigger than K.");
	}
}
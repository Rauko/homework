/*
Дано целое число K и массив из десяти целых ненулевых чисел. Вывести номер последнего числа в массиве, большего K. Если таких чисел нет, то вывести 0.
*/

public class Ex_44 {
	public static void main (String[] args){
		if (args.length < 11) {
			System.err.println("You haven't entered arguments! The task requires entering eleven arguments.");
			return;
		}
		if (args.length > 11) System.out.println("You entered more arguments, than programm needs. \nIt will use only first eleven.");
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

		int marker = 0;
		for (int i = array.length-1; i >= 0; i--) {
			if (array[i] > K) {
				marker = i;
				break;
			}
		}
		if (marker != 0){
			marker++;
			System.out.println("Last array member, that is bigger than K have number " + marker + " in array.\n                                             *not it's index!*");
		} else if (array[0] > K){
			marker++;
			System.out.println("Last array member, that is bigger than K have number " + marker + " in array.\n                                             *not it's index!*");
		} else System.out.println(marker + " - There is no digits bigger than K.");
	}
}
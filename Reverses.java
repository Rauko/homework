/*
циклический сдвиг вправо, реализация через тройной реверс
*/

import java.util.*;

public class Reverses {
	public static void main (String[] args) {
		if (args.length < 1) {
			System.err.println("You haven't entered an argument! The task requires entering one argument.");
			return;
		}
		
		if (args.length > 1) System.out.println("You entered more arguments, than programm needs. \nIt will use only first one.");

		Integer N = Integer.parseInt(args[0]);

		int[] array = {1, 2, 3, 4, 5, 6, 7, 8, 9, 10};
		System.out.println("Your array is: " + Arrays.toString(array));

		// full reverse
		for (int i = 0; i < array.length/2; i++) {
			int buf = array[array.length - 1 - i];
			array[array.length - 1 - i] = array[i];
			array[i] = buf;
		}
		System.out.println("After first reverse your array is: \n" + Arrays.toString(array));

		//left part reverse
		for (int i = 0; i < N/2; i++) {
			int buf = array[N- 1 - i];
			array[N - 1 - i] = array[i];
			array[i] = buf;
		}
		System.out.println("After second reverse your array is: \n" + Arrays.toString(array));

		//right part reverse
		for (int i = N; i < (array.length - 1 + N)/2; i++) {
			int buf = array[array.length - 1 - i + N];
			array[array.length - 1 - i + N] = array[i];
			array[i] = buf;
		}
		System.out.println("After third reverse your array is: \n" + Arrays.toString(array));
	}
}
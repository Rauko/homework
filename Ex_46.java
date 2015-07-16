/*
Дано целое число N и массив из N целых чисел, упорядоченный по возрастанию. Данный набор может содержать одинаковые элементы. Вывести в том же порядке все различные элементы данного массива.
*/

import java.util.*;

public class Ex_46 {
	public static void main(String[] args){
	
		if (args.length < 1) {
			System.err.println("You haven't entered an argument! The task requires entering one argument.");
			return;
		}
		
		if (args.length > 1) System.out.println("You entered more arguments, than programm needs. \nIt will use only first one.");
	
		Integer N = Integer.parseInt(args[0]);

		int sizeArr = N;
		int maxVal = 100;
		int[] array = new int[sizeArr];
		
		for (int i = 0; i < sizeArr; i++)
			array[i] = new Random().nextInt(maxVal);

		int min_arr = 0;

		for(int i = 0; i < array.length - 1; i++){
			min_arr = i;
			for (int j = i + 1; j < array.length; j++){
				if (array[j] < array[min_arr]) {
					min_arr = j;
				}
			}
			int buf = array[i];
			array[i] = array[min_arr];
			array[min_arr] = buf;
		}

		System.out.print("You entered array length: " + N + "\nYour random array is: " + Arrays.toString(array) + "\nAfter adding B this array will change to: [");

		int newLength = 0;

		for(int i = 0; i < array.length-1; i++){
			if (array[i] != array[i+1]){
				System.out.print(array[i] + ", ");
				newLength++;
			} else continue;
		}
		if(array[array.length-2] != array[array.length-1]) {
			System.out.print(array[array.length-1] + " ");
			newLength++;
		}
		System.out.println("\b]\nNew length of array is " + newLength);

		if (newLength == N) {
			System.out.println("There are no same elements in random array.");
		} else System.out.println("There are " + (N - newLength) + " same elements in random array.");
	}
}
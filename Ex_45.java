/*
Дано вещественное число B, целое число N и массив из N целых чисел, упорядоченных по возрастанию. Вывести элементы массива вместе с числом B, сохраняя упорядоченность выводимых чисел
*/

import java.util.*;

public class Ex_45 {
	public static void main(String[] args){
	
		if (args.length < 2) {
			System.err.println("You haven't entered arguments! The task requires entering two arguments.");
			return;
		}
		
		if (args.length > 2) System.out.println("You entered more arguments, than programm needs. \nIt will use only first two.");
	
		Double B = Double.parseDouble(args[0]);
		Integer N = Integer.parseInt(args[1]);

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

		System.out.print("You entered array length: " + N + "\nYou entered new real digit: " + B + "\nYour array is: " + Arrays.toString(array) + "\nAfter adding B this array will change to: [");

		int index = 0;

		for(int i = 0; i < array.length; i++){
			if (array[i] > B){
				if (index == 0 ) {
					System.out.print(B + ", " + array[i] + ", ");
					index++;
				} else System.out.print(array[i] + ", ");
			} else if (i == array.length-1){
				if (B > array[array.length-1]) {
					System.out.println(array[array.length-1] + ", " + B + "]\nYour new array length is " + (N+1) + ".");
					return;
				}
			} else System.out.print(array[i] + ", ");
		}
		System.out.println("\b\b]\nYour new array length is " + (N+1) + ".");
	}
}
/*
Дан массив из десяти целых чисел. Найти их сумму.
*/

import java.util.Random;

public class Ex_40 {
	public static void main (String[] args){
		int sizeArr = 10;
		int maxVal = 201;
		int[] array = new int[sizeArr];
		for (int i = 0; i < sizeArr; i++)
			array[i] = new Random().nextInt(maxVal) - 100;
		System.out.println("Your random array is: ");
		for (int i = 0; i < sizeArr; i++)
			System.out.print(array[i] + " ");
		System.out.println();
		int sum = 0;
		for (int i = 0; i < sizeArr; i++)
			sum += array[i];
		System.out.println("Sum of this array is: " + sum);
	}
}
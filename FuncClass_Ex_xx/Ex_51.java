/*
Дан массив из N целых чисел. Найти их среднее арифметическое. Расчет среднего арифметического массива реализовать в виде функции.
*/

import java.util.*;

public class Ex_51 {
	public static double midAriphm(int[] array){
		double midAr = 0;
		for (int i = 0; i < array.length; i++){
			midAr += array[i];
		}
		midAr /= array.length;
		return midAr;
	}

	public static int[] randomArrayCreate(int N){
		int sizeArr = N;
		int maxVal = 100;

		int[] array = new int[sizeArr];
		
		for (int i = 0; i < sizeArr; i++)
			array[i] = new Random().nextInt(maxVal);

		return array;
	}  

	public static void main(String[] args){
		if (args.length < 1) {
			System.err.println("You haven't entered an argument! The task requires entering one argument.");
			return;
		}
		
		if (args.length > 1) System.out.println("You entered more arguments, than programm needs. \nIt will use only first one.");
		
		Integer N = Integer.parseInt(args[0]);

		int[] array = randomArrayCreate(N);
		System.out.println(Arrays.toString(array));

		double midAr = midAriphm(array);

		System.out.println(midAr);
	}
}
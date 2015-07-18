/*
Дано 3 числа. Написать функцию, которая вычисляет сумму квадратов двух больших из этих трех чисел.
*/

import java.util.*;

public class Ex_52 {
	public static int sqSumOfTwo(int[] array){
		int sqSum = 0;
		int smallest = searchOfSmallest(array);
		
		for(int i = 0; i < array.length; i++){
			if(array[i] != smallest)
				sqSum += array[i]*array[i];
		}
		return sqSum;
	}

	public static int searchOfSmallest(int[] array){
		int smallest = array[0];
		for(int i = 1; i < array.length; i++){
			if(smallest > array[i])
				smallest = array[i];
		}
		return smallest;
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
		if (args.length > 0) System.out.println("This programm don't needs any arguments!");
		
		Integer N = 3;

		int[] array = randomArrayCreate(N);
		System.out.println(Arrays.toString(array));

		int sqSum = sqSumOfTwo(array);

		System.out.println(sqSum);
	}
}
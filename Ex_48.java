/*
Написать подпрограмму с тремя параметрами типа Int.Функция должна определить, какой из его параметров является самым маленьким. Значение наименьшего параметра должно быть возвращено в качестве значения функции.
*/

import java.util.*;

public class Ex_48 {

	public static int searchOfSmallest(int[] array){
		int smallest = array[0];
		for(int i = 1; i < array.length; i++){
			if(smallest > array[i]){
				smallest = array[i];
			}
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

		int smallest = searchOfSmallest(array);

		System.out.println("Product of all arrays elements is " + smallest + ".");
	}
}
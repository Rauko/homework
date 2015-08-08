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

	public static int searchOfSmallest(int a, int b, int c){
		int smallest = a;
		if(smallest > b && smallest > c){
			if (b < c){
				smallest = b;
			}else smallest = c;
		} else if (smallest < b && smallest > c){
			smallest = c;
		} else smallest = b;
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
		int smallest = 0;
		if (args.length == 3) {
			System.out.println("You entered 3 arguments, programm will work in manual mode!");
			Integer a = Integer.parseInt(args[0]);
			Integer b = Integer.parseInt(args[1]);
			Integer c = Integer.parseInt(args[2]);
			System.out.println("["+ a + ", " + b + ", " + c + "]");
			smallest = searchOfSmallest(a, b, c);
		} else {
			Integer N = 3;
			int[] array = randomArrayCreate(N);
			System.out.println(Arrays.toString(array));
			smallest = searchOfSmallest(array);
		}
		System.out.println("The smallest element is: " + smallest + ".");
	}
}
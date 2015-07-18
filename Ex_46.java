import java.util.*;

public class Ex_46 {
	public static void main(String[] args){
	
		if (args.length < 1) {
			System.err.println("You haven't entered an argument! The task requires entering one argument.");
			return;
		}
		
		if (args.length > 1) System.out.println("You entered more arguments, than programm needs. \nIt will use only first one.");
	
		Integer N = Integer.parseInt(args[0]);

/*		//random array generator 
		int sizeArr = N;
		int maxVal = 100;
		int[] array = new int[sizeArr];
		
		for (int i = 0; i < sizeArr; i++)
			array[i] = new Random().nextInt(maxVal);

		int min_arr = 0;
		
		//sorter 
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
*/

		// manual entering of array
		int[] array = {1, 1, 1, 1, 2, 1, 1, 1, 1, 1, 1, 8, 9, 10};

		if(N > array.length){
			System.err.println("Not enoth elements in atandart array!");
			return;
		}

		System.out.print("You entered array length: " + N + "\nYour random array is: " + Arrays.toString(array) + "\nAfter adding B this array will change to: [");

		int newLength = 1;

		System.out.print(array[0] + ",");

		for(int i = 1; i < N; i++){
			if (array[i] != array[i-1]){
				System.out.print(" " + array[i] + ",");
				newLength++;
			} else continue;
		}

		System.out.println("\b]\nNew length of array is " + newLength);

		if (newLength == N) {
			System.out.println("There are no same elements in random array.");
		} else System.out.println("There are " + (N - newLength) + " same elements in random array.");
	}
}
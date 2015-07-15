import java.util.*;

public class Cl_w_9 {
	public static void main(String[] args){
		int[] arr = {1, 2, 3, 4, 5, 6, 7, 8, 9, 10};

		System.out.println(Arrays.toString(arr));
		for(int i = arr.length-1; i >= arr.length/2; i--) {
			int buf = arr[i];
			arr[i] = arr[arr.length - i - 1];
			arr[arr.length - i - 1] = buf;
		}
		
		System.out.println(Arrays.toString(arr));

	}
}
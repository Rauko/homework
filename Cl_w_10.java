import java.util.*;

public class Cl_w_10 {
	public static void main(String[] args){
		int[] arr = {1, 2, 3, 4, 5, 6, 7};

		System.out.println(Arrays.toString(arr));

		int buf = arr[1];
		arr[1] = arr[0];
		for(int i = 1; i < arr.length-1; i++) {
			
			int bufbuf = arr[i+1];
			arr[i+1] = buf;
			buf = bufbuf;
		}
		
		arr[0] = buf;

		System.out.println(Arrays.toString(arr));

	}
}
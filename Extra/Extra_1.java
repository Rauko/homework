/*
организовать быстрый поиск в массиве
задано число, вывести на экран первое из совпадающих с ним чисел в упорядоченном по возрастанию массиве
*/

import java.util.*;

public class Extra_1 {
	public static int S(int[] array, int num, int start, int end){
		if (start > end) {
			System.out.println("No such element in the array!");
			return -100; 
		}
		int mid = (start + end) / 2;
		if(array[mid] == num){
			mid = repeatingNum(array,mid);
			return mid;
		} else if(array[mid] < num){
			start = mid+1;
			return S(array,num,start,end);
		} else {
			end = mid-1;
			return S(array,num,start,end);
		}
	}

	public static int repeatingNum(int[] array, int mid){
		for(int i = mid; mid > 0; mid--){
			if(array[mid] == array[mid-1]){
				continue;
			} else return mid;
		}
		return mid;
	}	

	public static void search(int[] array, int num){
		int start = 0;
		int end = array.length - 1;
		if(S(array,num,start,end) == -100) return;
		System.out.println("Recursive search of array element " + num + ".\nIndex is " + S(array,num,start,end) + ".");

	}

	public static void main(String[] args){
		Integer num = Integer.parseInt(args[0]);
		int[] array = {1,2,3,4,5,6,7,8,9,10,11,11,11,12,12,12,13,14,15,16,17,18,19,20};
		System.out.println(Arrays.toString(array));
		search(array,num);
	}	
}
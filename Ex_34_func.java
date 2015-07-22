/*
Дано целое число N (> 1). Последовательность чисел Фибоначчи FK (целого типа) определяется следующим образом: 
F1 = 1, F2 = 1, FK = FK–2 + FK–1, K = 3, 4, … . Вывести элементы F1, F2, ..., FN.
Для реализации использовать функции.
*/

import java.util.*;

public class Ex_34_func {
	public static int[] phi(int N){
		int[] phi = new int[N];
		phi[0] = 0;
		phi[1] = 1;
		for (int i = 2; i < N; i++) {
			phi[i] = phi[i-2] + phi[i-1];
		}
		return phi;
	}
	
	public static boolean cond(int N){
		boolean cond = false;
		if (N < 1){
			System.err.println("Entered digit doesn't satisfy condition. It must be positive and not zero!");
			cond = true;
		}
		return cond;
	}
	
	public static boolean generalCond(String[] args, int conditionLength){
		boolean cond = false;
		if (args.length < conditionLength) {
			System.err.println("You haven't entered an argument! The task requires entering one argument.");
			cond = true;
		}
		if (args.length > conditionLength) System.out.println("You entered more arguments, than programm needs. \nIt will use only first two.");
		return cond;
	}
	
	public static void main(String[] args) {
		if(generalCond(args,1)) return;
		Integer N = Integer.parseInt(args[0]);
		if(cond(N)) return;
		System.out.print("Phibanachi: " + Arrays.toString(phi(N)));
	}
}
/*
Дано целое число N (> 1). Последовательность чисел Фибоначчи FK определяется следующим образом: F1 = 1, F2 = 1, FK = FK–2 + FK–1, K = 3, 4, … . Проверить, является ли число N числом Фибоначчи. 
Если является, то вывести True, если нет — вывести False.
*/

public class Ex_38_func {
	public static void phi(int N){
		int enum0 = 0, enum1 = 1, enum2;
		System.out.print("Phibanachi: " + enum0 + " ");
		if (N >=2) System.out.print(enum1);
		for (int i = 0; i <= N-3; i++) {
			enum2 = enum1 + enum0;
			System.out.print(" " + enum2);
			enum0 = enum1;
			enum1 = enum2;
			if(inPhi(enum2,N)) return;
		}
	}
	
	public static boolean inPhi(int enum2, int N){
		boolean marker = false;
		if (enum2 == N){
			System.out.println("...\nEntered digit is one of Phibanachis line!\nTRUE");
			marker = true;
		} else if (enum2 > N) {
			System.out.println("...\nEntered digit isn't one of Phibanachis line!\nFALSE");
			marker = true;
		}
		return marker;
	}
	
	public static boolean cond(int N){
		boolean cond = false;
		if (N < 0){
			System.err.println("Entered digit doesn't satisfy condition. It must be bigger than 1!");
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
	
	public static void main(String[] args){
		if(generalCond(args,1)) return;
		Integer N = Integer.parseInt(args[0]);
		if(cond(N)) return;
		phi(N);
	}
}
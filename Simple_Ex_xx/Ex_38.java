/*
Дано целое число N (> 1). Последовательность чисел Фибоначчи FK определяется следующим образом: F1 = 1, F2 = 1, FK = FK–2 + FK–1, K = 3, 4, … . Проверить, является ли число N числом Фибоначчи. Если является, то вывести True, если нет — вывести False.
*/

public class Ex_38 {
	public static void main(String[] args){
		if (args.length < 1) {
			System.err.println("You haven't entered an argument! The task requires entering one argument.");
			return;
		}
		if (args.length > 1) System.out.println("You entered more arguments, than programm needs. \nIt will use only first one.");
		Double N = Double.parseDouble(args[0]);
		if (N < 1){
			System.err.println("Entered digit doesn't satisfy condition. It must be positive and not zero!");
			return;
		}
		int enum0 = 0, enum1 = 1, enum2;
		System.out.print("Phibanachi: " + enum0 + " ");
		if (N >=2) System.out.print(enum1 + " ");
		for (int i = 0; i <= N-3; i++) {
			enum2 = enum1 + enum0;
			System.out.print(enum2 + " ");
			enum0 = enum1;
			enum1 = enum2;
			if (enum2 == N){
				System.out.println("\b...\nEntered digit is one of Phibanachis line!\nTRUE");
				return;
			} else if (enum2 > N) {
				System.out.println("\b...\nEntered digit isn't one of Phibanachis line!\nFALSE");
				return;
			}
		}

	}
}
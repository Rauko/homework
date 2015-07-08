/*
Дано целое число N (> 0). Используя операции деления нацело и взятия остатка от деления, вывести все его цифры, начиная с самой правой (разряда единиц).
*/

public class Ex_36 {
	public static void main(String[] args){
		if (args.length < 1) {
			System.err.println("You haven't entered an argument! The task requires entering one argument.");
			return;
		}
		if (args.length > 1) System.out.println("You entered more arguments, than programm needs. \nIt will use only first one.");
		Integer N = Integer.parseInt(args[0]);
		if (N < 0){
			System.err.println("Entered digit doesn't satisfy condition. It must be positive!");
			return;
		}
		System.out.print("You entered: " + N + ".\nYour reversed digit will be: " );
		int mod = 1, dev = 1, buf = N;
		int numLong = (int)Math.log10(N) + 1;
		for (int i = 1; i <= numLong; i++){
			mod *= 10;
			buf = (N%mod)/dev;
			dev *= 10;
			System.out.print(buf);
		}
		System.out.println();
	}
}
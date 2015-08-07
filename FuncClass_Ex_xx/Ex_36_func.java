/*
Дано целое число N (> 0). Используя операции деления нацело и взятия остатка от деления, вывести все его цифры, начиная с самой правой (разряда единиц).
*/

public class Ex_36_func {
	public static String reverse(int N){
		String reversed = "";
		System.out.print("You entered: " + N + ".\nYour reversed digit will be: " );
		int mod = 1, dev = 1, buf = N;
		int numLong = (int)Math.log10(N) + 1;
		for (int i = 1; i <= numLong; i++){
			mod *= 10;
			buf = (N%mod)/dev;
			dev *= 10;
			reversed += buf;
		}
		return reversed;
	}
	
	public static boolean cond(int N){
		boolean cond = false;
		if (N < 0){
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
		System.out.println(reverse(N) + ".");
	}
}
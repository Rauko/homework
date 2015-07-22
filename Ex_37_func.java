/*
Дано целое число N (> 1). Если оно является простым, то есть не имеет положительных делителей, кроме 1 и самого себя, то вывести True, иначе вывести False.
*/

public class Ex_37_func {
	public static void composit(int N){
		boolean isComposite = false;
		for (int i = 2; i <= Math.round(N/2); i++) {
			if (N % i == 0) {
				isComposite = true;
				break;
			}
		}
		if (isComposite) {
			System.out.println("False!");
		} else {
			System.out.println("True!");
		}
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
		composit(N);
	}
}
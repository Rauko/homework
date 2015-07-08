/*
Дано целое число N (> 1). Если оно является простым, то есть не имеет положительных делителей, кроме 1 и самого себя, то вывести True, иначе вывести False.
*/

public class Ex_37 {
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
		if((N%2 == 0 || N%3 == 0) && N != 2 && N != 3) {
			System.out.println("True!");
		} else System.out.println("False!");
	}
}
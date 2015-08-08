/*
Дано вещественное число A и целое число N (> 0). Используя один цикл, найти значение выражения 1 – A + A2 – A3 + … + (–1)N·AN. Условный оператор не использовать.
*/

public class Ex_32 {
	public static void main(String[] args){
		if (args.length < 2) {
			System.err.println("You haven't entered arguments! The task requires entering two arguments.");
			return;
		}
		if (args.length > 2) System.out.println("You entered more arguments, than programm needs. \nIt will use only first two.");
		Double A = Double.parseDouble(args[0]);
		Integer N = Integer.parseInt(args[1]);
		if (N < 0){
			System.err.println("One of entered digits doesn't satisfy condition. Second digit must be positive!");
			return;
		}
		double line = 1d;
		int plusMinus = -1;
		int bufMark = 1;
		double sum = 1d;
		System.out.print("A = " + A + ", N = " + N + ". \nLine: " + line + " ");
		for(int i = 0; i <= N; i++){
			line *= ((double)A);
			bufMark *= plusMinus;
			sum += line*bufMark;		
			System.out.print(line + " ");
		}
		System.out.println();
		System.out.println(sum);
	}
}
/*
Мастям игральных карт присвоены порядковые номера: 1 — пики, 2 — трефы, 3 — бубны, 4 — червы. Достоинству карт, старших десятки, присвоены номера: 11 — валет, 12 — дама, 13 — король, 14 — туз. Даны два целых числа: N — достоинство (6 ≤ N ≤ 14) и M — масть карты (1 ≤ M ≤ 4). Вывести название соответствующей карты вида «шестерка бубен», «дама червей», «туз треф» и т. п.
*/

public class Ex_25_func {
	public static String weight(int N){
		String[] weightArr = {"Six ", "Seven ", "Eight ", "Nine ", "Ten ", "Jack ", "Queen ", "King ", "Ace "};
		return weightArr[N-6];
	}
	
	public static String mark(int M){
		String[] markArr = {"Spade", "Club", "Dimond", "Heart"};
		return markArr[M-1];
	}
	
	public static boolean cond(int N, int M){
		boolean cond = false;
		if (N < 6 || N > 14) {
			System.err.println("Entered digit doesn't satisfy condition. First one should be positive value in array from 6 to 14!");
			cond = true;
		}
		if (M < 1 || M > 4) {
			System.err.println("Entered digit doesn't satisfy condition. Second one should be positive value in array from 1 to 4!");
			cond = true;
		}
		return cond;
	}
	
	public static boolean generalCond(String[] args, int conditionLength){
		boolean cond = false;
		if (args.length < conditionLength) {
			System.err.println("You haven't entered arguments! The task requires entering two arguments.");
			cond = true;
		}
		if (args.length > conditionLength) System.out.println("You entered more arguments, than programm needs. \nIt will use only first two.");
		return cond;
	}
	
	public static void main(String[] args){
		if(generalCond(args,2)) return;
		Integer N = Integer.parseInt(args[0]);
		Integer M = Integer.parseInt(args[1]);
		if (cond(N,M)) return;
		System.out.println(weight(N) + "" + mark(M));		
	}
}
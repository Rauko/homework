/*
Мастям игральных карт присвоены порядковые номера: 1 — пики, 2 — трефы, 3 — бубны, 4 — червы. Достоинству карт, старших десятки, присвоены номера: 11 — валет, 12 — дама, 13 — король, 14 — туз. Даны два целых числа: N — достоинство (6 ≤ N ≤ 14) и M — масть карты (1 ≤ M ≤ 4). Вывести название соответствующей карты вида «шестерка бубен», «дама червей», «туз треф» и т. п.
*/

public class Ex_25 {
	public static void main(String[] args){
		if (args.length < 2) {
			System.err.println("You haven't entered arguments! The task requires entering two arguments.");
			return;
		}
		if (args.length > 2) System.out.println("You entered more arguments, than programm needs. \nIt will use only first two.");
		Integer N = Integer.parseInt(args[0]);
		Integer M = Integer.parseInt(args[1]);
		int err = 0;
		if (N < 6 || N > 14) {
			System.err.println("Entered digit doesn't satisfy condition. First one should be positive value in array from 6 to 14!");
			err++;
		}  
		if (M < 1 || M > 4) {
			System.err.println("Entered digit doesn't satisfy condition. Second one should be positive value in array from 1 to 4!");
			err++;
		} 
		if (err > 0)
			return;
		switch (N){
			case 6: 
				System.out.print("Six ");
				break;
			case 7: 
				System.out.print("Seven ");
				break;
			case 8: 
				System.out.print("Eight ");
				break;
			case 9: 
				System.out.print("Nine ");
				break;
			case 10: 
				System.out.print("Ten ");
				break;
			case 11: 
				System.out.print("Jack ");
				break;
			case 12: 
				System.out.print("Queen ");
				break;
			case 13: 
				System.out.print("King ");
				break;
			case 14: 
				System.out.print("Ace ");
				break;
			default: 
				System.out.print("(\\/)_Oo_(\\/) ");
		}
		switch (M){
			case 1:
				System.out.println("Heart");
				break;
			case 2:
				System.out.println("Dimond");
				break;
			case 3:
				System.out.println("Club");
				break;
			case 4:
				System.out.println("Spade");
				break;
			default:
				System.out.println(" (\\/)_Oo_(\\/)");
		}
		
	}
}
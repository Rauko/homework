/*
Дан номер года (положительное целое число). Определить количество дней в этом году, учитывая, что обычный год насчитывает 365 дней, а ви-сокосный — 366 дней. Високосным считается год, делящийся на 4, за исключением тех годов, которые делятся на 100 и не делятся на 400 (например, годы 300, 1300 и 1900 не являются високосными, а 1200 и 2000 — являются).
*/

public class Ex_23 {
	public static void main(String[] args){
		if (args.length < 1) {
			System.err.println("You haven't entered an argument! The task requires entering one argument.");
			return;
		}
		if (args.length > 1) System.out.println("You entered more arguments, than programm needs. \nIt will use only first one.");
		Integer year = Integer.parseInt(args[0]);
		if (year < 0) {
			System.err.println("Entered digit doesn't satisfy condition. It should be positive.");
		} 
		if ((year % 4 == 0) && (year % 100 != 0) || (year % 400 == 0) ) {
			System.out.println(year + " is a leap year.");
		} else System.out.println(year + " isn't a leap year.");
	}
}
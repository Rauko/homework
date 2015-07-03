/*
Дано трехзначное число. Найти сумму и произведение его цифр.
*/

public class Ex_14 {
	public static void main(String[] args) {
		if (args.length >= 1){
			if (args.length > 1)
				System.err.println("You entered more arguments, than programm needs. \nIt will use only first one.");
			Integer var = Integer.parseInt(args[0]);
			if ((var >= 100 && var < 1000) || (var > -1000 && var <= -100)) {
				int hunds = var / 100;
				int tens = (var - hunds*100) / 10;
				var %= 10;
				System.out.println("Entered digit consists of " + hunds + " hundreds, " + tens + " tens and " + var+ " ones.");
				var = var + tens + hunds;
				tens = hunds * tens * (var - tens - hunds);
				System.out.println("Sum of entered digits is " + var + " and multiple " + tens + ".");
			} else System.err.println("You entered " + var + ". Enter 100-999 or its negative and start again.");
		} else System.err.println("You haven't entered an argument!");
	}
}
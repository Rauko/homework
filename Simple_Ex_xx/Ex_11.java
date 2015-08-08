/*
Дано двузначное число. Найти сумму и произведение его цифр.
*/

public class Ex_11 {
	public static void main(String[] args) {
		if (args.length >= 1){
			if (args.length > 1)
				System.err.println("You entered more arguments, than programm needs. \nIt will use only first one.");
			Integer var = Integer.parseInt(args[0]);
			if ((var >= 10 && var < 100) || (var > -100 && var <= -10)) {
				int tens = var/10;
				int var = var%10;
				System.out.println("Entered digit consists of " + tens + " tens and " + var+ " ones.");
				ones = tens + var;
				tens *= var;
				System.out.println("Sum of this digits: " + ones + " and the multiple is " + tens + ".");
			} else System.err.println("You entered " + var + ". Enter 10-99 or its negative and start again.");
		} else System.err.println("You haven't entered an argument!");
	}
}
/*
Дано двузначное число. Найти сумму и произведение его цифр.
*/

public class Ex_11 {
	public static void main(String[] args) {
		if (args.length >= 1){
			if (args.length > 1)
				System.err.println("You entered more arguments, than programm needs. \nIt will use only first one.");
			Integer var = Integer.parseInt(args[0]);
			int tens = var;
			int ones = var;
			if (var == 0){
				System.err.println("You entered 0. Enter 10-99 and start again.");
			} else {
				if ((var > 0 && var < 10) || (var > -10 && var < 0)) {
					System.err.println("You entered 0-9. Enter 10-99 and start again.");
				} else {
					if ((var >= 10 && var < 100) || (var > -100 && var <= -10)) {
						tens /= 10;
						var %= 10;
						System.out.println("Entered digit consists of " + tens + " tens and " + var+ " ones.");
						ones = tens + var;
						tens *= var;
						System.out.println("Sum of this digits: " + ones + " and the multiple is " + tens + ".");
					} else {
						if (var >= 100){
							System.err.println("You entered 100+. Enter 10-99 and start again.");
						} else System.err.println("You entered digit less than -100. Enter 10-99 and start again.");
					}
				}
			}
		} else System.err.println("You haven't entered an argument!");
	}
}
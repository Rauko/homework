/*
Дано двузначное число. Найти сумму и произведение его цифр.
*/

public class Ex_14 {
	public static void main(String[] args) {
		if (args.length >= 1){
			if (args.length > 1)
				System.err.println("You entered more arguments, than programm needs. \nIt will use only first one.");
			Integer var = Integer.parseInt(args[0]);
			int tens = 1;
			int ones = 1;
			int hunds = 1;
			if ((var >= 0 && var < 100) || (var > -100 && var <= 0)) {
				System.err.println("You entered " + var + ". Enter 100-999 and start again.");
			} else {
				if ((var >= 100 && var < 1000) || (var > -1000 && var <= -100)) {
					hunds = var / 100;
					tens = (var - hunds*100) / 10;
					var %= 10;
					System.out.println("Entered digit consists of " + hunds + " hundreds, " + tens + " tens and " + var+ " ones.");
				} else {
					if (var >= 1000){
						System.err.println("You entered 1000+. Enter 100-999 and start again.");
					} else System.err.println("You entered digit less than -1000. Enter 100-999 and start again.");
				}
			}
		} else System.err.println("You haven't entered an argument!");
	}
}
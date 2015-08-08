/*
Дано двузначное число. Вывести вначале его левую цифру (десятки), а затем — его  правую цифру (единицы). Для нахождения десятков использовать операцию деления нацело, для нахождения единиц — операцию взятия остатка от деления.
*/

public class Ex_10 {
	public static void main(String[] args) {
		if (args.length >= 1){
			if (args.length > 1)
				System.err.println("You entered more arguments, than programm needs. \nIt will use only first one.");
			Integer var = Integer.parseInt(args[0]);
			if ((var > 9 && var < 100) || (var > -100 && var < -9)) {
				int tens = 1;
				tens = var / 10;
				var %= 10;
				System.out.println("Entered digit consists of " + tens + " tens and " + var + " ones.");
			} else System.err.println("You entered " + var + ". Enter 10-99 or its negative and start again.");
		} else System.err.println("You haven't entered an arguments!");
	}
}
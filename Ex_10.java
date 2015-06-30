/*
Дано двузначное число. Вывести вначале его левую цифру (десятки), а затем — его  правую цифру (единицы). Для нахождения десятков использовать операцию деления нацело, для нахождения единиц — операцию взятия остатка от деления.
*/

public class Ex_10 {
	public static void main(String[] args) {
		if (args.length >= 1){
			if (args.length > 1)
				System.err.println("You entered more arguments, than programm needs. \nIt will use only first one.");
			Integer var = Integer.parseInt(args[0]);
			if (var == 0){
				System.err.println("You entered 0. Enter 10-99 and start again.");
				return;
			} else {
				if ((var > 0 && var < 10) || (var > -10 && var < 0)) {
					System.err.println("You entered 0-9. Enter 10-99 and start again.");
					return;
				} else {
					if ((var > 9 && var < 100) || (var > -100 && var < -9)) {
						int tens = 1;
					//	int ones = 1;
						tens = var / 10;
						var %= 10;  
						System.out.println("Entered digit consists of " + tens + " tens and " + var + " ones.");
					} else {
						if (var >= 100){
							System.err.println("You entered 100+. Enter 10-99 and start again.");
						} else System.err.println("You entered digit less than -100. Enter 10-99 and start again.");
					return;
					}
				}
			}			
		}
	}
}
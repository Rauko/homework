/*
Дано целое положительное число. Проверить истинность высказывания: «Данное число является нечетным трехзначным».
*/

public class Ex_17 {
	public static void main(String[] args) {
		if (args.length >= 1) {
			if (args.length > 1)
				System.err.println("You entered more arguments, than programm needs. \nIt will use only first one.");
			Integer var = Integer.parseInt(args[0]);
			if (var >= 100 && var <= 999) {
				var %= 2;
				if (var == 1) {
					System.out.println("This three-digit number is not even.");
				} else {
					System.out.println("This three-digit number is even.");
					System.err.println("Сondition is not satisfied!");
				} 
			} else System.err.println("Entered digit doesn't satisfy condition. \nEnter a value in array from 100 to 999");
		} else System.err.println("You haven't entered an argument!");
	}
}
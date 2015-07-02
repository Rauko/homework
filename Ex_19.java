/*
Дано четырехзначное число. Проверить истинность высказывания: «Данное число читается одинаково слева направо и справа налево» (т.е. является палиндромом)
*/

public class Ex_19 {
	public static void main(String[] args) {
		if (args.length >= 1) {
			if (args.length > 1)
				System.err.println("You entered more arguments, than programm needs. \nIt will use only first one.");
			Integer var = Integer.parseInt(args[0]);
			System.out.println("You entered digit: " + var);
			int rav = 0;
			if (var >= 1000 && var <= 9999) {
				rav = var%100;
				var = (var - rav) /100;
				rav = (rav%10)*10 + rav/10;
				if (var == rav) {
					System.out.println("This four-digit number is a palindrome.");
				} else {
					System.out.println("This four-digit number isn't a palindrome.");
					System.err.println("Сondition is not satisfied!");
				} 
			} else System.err.println("Entered digit doesn't satisfy condition. \nEnter a value in array from 1000 to 9999");
		} else System.err.println("You haven't entered an argument!");
	}
}
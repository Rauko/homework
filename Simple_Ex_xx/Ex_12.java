/*
Дано двузначное число. Вывести число, полученное при перестановке цифр исходного числа.
*/

public class Ex_12 {
	public static void main(String[] args){
		if (args.length >= 1){
			if (args.length > 1)
				System.err.println("You entered more arguments, than programm needs. \nIt will use only first one.");
			Integer var = Integer.parseInt(args[0]);
			if ((var > 9 && var < 100) || (var > -100 && var < -9)) {
				int tens = var / 10;
				var %= 10;
				var = var*10 + tens;
				System.out.println("Your reversed digit is: " + var);
			} else System.err.println("You entered " + var + ". Enter 10-99 or its negative and start again.");
		} else System.err.println("You haven't entered an arguments!");
	}
}
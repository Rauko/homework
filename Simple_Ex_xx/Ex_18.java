/*
Дано трехзначное число. Проверить истинность высказывания: «Цифры данного числа образуют возрастающую последовательность».
Проверить истинность высказывания: «Цифры данного числа образуют возрастающую арифметическую последовательность», например, 123, 456 и т.п.
*/

public class Ex_18 {
	public static void main(String[] args) {
		if (args.length >= 1) {
			if (args.length > 1)
				System.err.println("You entered more arguments, than programm needs. \nIt will use only first one.");
			Integer ones = Integer.parseInt(args[0]);
			System.out.println("You entered digit: " + ones);
			if (ones >= 100 && ones <= 999) {
				int hunds = ones/100;
				int tens = (ones%100 - ones%10)/10;
				ones = ones - hunds*100 - tens*10;
				System.out.println("It consists of digits: " + hunds + ", " + tens + ", " + ones + ".");
				if (hunds < tens && tens < ones) {
					int d1 = tens - hunds;
					int d2 = ones - tens;
					if (d1 == d2) { 
						System.out.println("This three-digit number forms an increasing arithmetic sequence.");
					} else System.out.println("This three-digit number forms an increasing sequence.");
				} else {
					System.out.println("This three-digit number doesn't form an increasing sequence.");
					System.err.println("Сondition is not satisfied!");
				}
			} else System.err.println("Entered digit doesn't satisfy condition. \nEnter a value in array from 100 to 999");
		} else System.err.println("You haven't entered an argument!");
	}
}
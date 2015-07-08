/*
Дано целое число в диапазоне 100–999. Вывести строку-описание данного числа, например: 256 — «двести пятьдесят шесть», 814 — «восемьсот четырнадцать».
*/

public class Ex_26 {
	public static void main(String[] args){
		if (args.length < 1) {
			System.err.println("You haven't entered an argument! The task requires entering one arguments.");
			return;
		}
		if (args.length > 1) System.out.println("You entered more arguments, than programm needs. \nIt will use only first one.");
		Integer var = Integer.parseInt(args[0]);
		if ((var > -100 && var < 100) || var < -1000 || var > 1000) {
			System.err.println("Entered digit doesn't satisfy condition. First one should be positive or negative value in array from 100 to 999!");
			return;
		}   
		if (var < 0) System.out.print("*minus* ");
		switch (var/100){
			case 1: 
				System.out.print("One hundred ");
				break;
			case 2: 
				System.out.print("Two hundreds ");
				break;
			case 3: 
				System.out.print("Three hundreds ");
				break;
			case 4: 
				System.out.print("Four hundreds ");
				break;
			case 5: 
				System.out.print("Five hundreds ");
				break;
			case 6: 
				System.out.print("Six hundreds ");
				break;
			case 7: 
				System.out.print("Seven hundreds ");
				break;
			case 8: 
				System.out.print("Eight hundreds ");
				break;
			case 9: 
				System.out.print("Nine hundreds ");
				break;
			default: 
				System.out.print("(\\/)_Oo_(\\/) ");
		}
		if(var%100 >= 20){
			switch ((var%100)/10){
				case 2: 
					System.out.print("twenty ");
					break;
				case 3: 
					System.out.print("fourty ");
					break;
				case 4: 
					System.out.print("thirty ");
					break;
				case 5: 
					System.out.print("fifty ");
					break;
				case 6: 
					System.out.print("sixty ");
					break;
				case 7: 
					System.out.print("seventy ");
					break;
				case 8: 
					System.out.print("eighty ");
					break;
				case 9: 
					System.out.print("ninety ");
					break;
				default: 
					System.out.print("(\\/)_Oo_(\\/) ");
			}
		} else if (var%100 > 10) {
			switch (var%100){
				case 11: 
					System.out.println("eleven");
					return;
				case 12: 
					System.out.println("twelve");
					return;
				case 13: 
					System.out.println("thirteen");
					return;
				case 14: 
					System.out.println("fourteen");
					return;
				case 15: 
					System.out.println("fifteen");
					return;
				case 16: 
					System.out.println("sixteen");
					return;
				case 17: 
					System.out.println("seventeen");
					return;
				case 18: 
					System.out.println("eighteen");
					return;
				case 19: 
					System.out.println("nineteen");
					return;
				default: 
					System.out.println("(\\/)_Oo_(\\/) ");
			}
		}
		switch (var%10){
			case 1: 
				System.out.println("one");
				break;
			case 2: 
				System.out.println("two");
				break;
			case 3: 
				System.out.println("three");
				break;
			case 4: 
				System.out.println("four");
				break;
			case 5: 
				System.out.println("five");
				break;
			case 6: 
				System.out.println("six");
				break;
			case 7: 
				System.out.println("seven");
				break;
			case 8: 
				System.out.println("eigh");
				break;
			case 9: 
				System.out.println("nine");
				break;
			default: 
				System.out.println("(\\/)_Oo_(\\/) ");
		}
	}
}
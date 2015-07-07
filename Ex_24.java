/*
Дан номер месяца — целое число в диапазоне 1–12 (1 — январь, 2 — февраль и т. д.). Вывести название соответствующего времени года и месяца, например, “март - весна”, “август - лето” и т.п.
*/

public class Ex_24 {
	public static void main(String[] args){
		if (args.length < 1) {
			System.err.println("You haven't entered an argument! The task requires entering one argument.");
			return;
		}
		if (args.length > 1) System.out.println("You entered more arguments, than programm needs. \nIt will use only first one.");
		Integer month = Integer.parseInt(args[0]);
		if (month < 1 || month > 12) {
			System.err.println("Entered digit doesn't satisfy condition. It should be positive value in array from 1 to 12!");
			return;
		}  
		switch (month){
			case 1: 
				System.out.print("January - ");
				break;
			case 2: 
				System.out.print("February - ");
				break;
			case 3: 
				System.out.print("March - ");
				break;
			case 4: 
				System.out.print("April - ");
				break;
			case 5: 
				System.out.print("May - ");
				break;
			case 6: 
				System.out.print("June - ");
				break;
			case 7: 
				System.out.print("Jule - ");
				break;
			case 8: 
				System.out.print("August - ");
				break;
			case 9: 
				System.out.print("September - ");
				break;
			case 10: 
				System.out.print("October - ");
				break;
			case 11: 
				System.out.print("November - ");
				break;
			case 12: 
				System.out.print("December - ");
				break;
			default: 
				System.out.print("(\\/)_Oo_(\\/) ");
		}
		switch (month){
			case 1: case 12: case 2:
				System.out.println("Winter");
				break;
			case 3: case 4: case 5:
				System.out.println("Spring");
				break;
			case 6: case 7: case 8:
				System.out.println("Summer");
				break;
			case 9: case 10: case 11:
				System.out.println("Autumn");
				break;
			default: 
				System.out.println(" (\\/)_Oo_(\\/)");
		}
	}
}
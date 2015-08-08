/*
Дни недели пронумерованы следующим образом: 1 — понедельник, 2 — вторник, …, 6 — суббота, 7 — воскресенье. Дано целое число K, лежащее в диапазоне 1–365. Определить номер дня недели для K-го дня года, если известно, что в этом году 1 января было средой.
*/

public class Ex_16 {
	public static void main(String[] args) {
		if (args.length >= 1){
			if (args.length > 1)
				System.err.println("You entered more arguments, than programm needs. \nIt will use only first one.");
			Integer day = Integer.parseInt(args[0]);
			if (day > 0 && day < 366){
				day = (day + 1)%7 + 1;
				if (day == 1){
					System.out.println("It's Monday! "  + day);
				} else if (day == 2){
					System.out.println("It's Tuesday! "  + day);
				} else if (day == 3){
					System.out.println("It's Wednesday! "  + day);
				} else if (day == 4){
					System.out.println("It's Thursday! " + day);
				} else if (day == 5){
					System.out.println("It's Friday! " + day);
				} else if (day == 6){
					System.out.println("It's Saturday! " + day);
				} else if (day == 7){
					System.out.println("It's Sunday! " + day);
				} else System.out.println("(\\/)_Oo_(\\/) " + day);
			} else System.err.println("Your value is out of array! Enter digit from 1 to 365!");
		} else System.err.println("You haven't entered an argument!"); 
	}
}
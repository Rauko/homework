/*
В восточном календаре принят 60-летний цикл, состоящий из 12-летних подциклов, обозначаемых названиями цвета: зеленый, красный, желтый, белый и черный. В каждом подцикле годы носят названия животных: крысы, коровы, тигра, зайца, дракона, змеи, лошади, овцы, обезьяны, курицы, собаки и свиньи. По номеру года определить его название, если 1984 год — начало цикла: «год зеленой крысы».
*/

public class Ex_27 {
	public static void main(String[] args){
		if (args.length < 1) {
			System.err.println("You haven't entered argument! The task requires entering one arguments.");
			return;
		}
		if (args.length > 1) System.out.println("You entered more arguments, than programm needs. \nIt will use only first one.");
		Integer year = Integer.parseInt(args[0]);
		System.out.print (year + " is the Year of ");
		switch (year%5+1){
			case 1: 
				System.out.print("Red ");
				break;
			case 2: 
				System.out.print("Yellow ");
				break;
			case 3: 
				System.out.print("White ");
				break;
			case 4: 
				System.out.print("Black ");
				break;
			case 5: 
				System.out.print("Green ");
				break;
			default: 
				System.out.print("(\\/)_Oo_(\\/) ");
		}
		switch (year%12+1){
			case 1: 
				System.out.println("Monkey!");
				break;
			case 2: 
				System.out.println("Han!");
				break;
			case 3: 
				System.out.println("Dog!");
				break;
			case 4: 
				System.out.println("Pig!");
				break;
			case 5: 
				System.out.println("Rat!");
				break;
			case 6: 
				System.out.println("Cow!");
				break;
			case 7: 
				System.out.println("Tiger!");
				break;
			case 8: 
				System.out.println("Hear!");
				break;
			case 9: 
				System.out.println("Dragon!");
				break;
			case 10: 
				System.out.println("Snake!");
				break;
			case 11: 
				System.out.println("Horse!");
				break;
			case 12: 
				System.out.println("Sheep!");
				break;
			default: 
				System.out.println("(\\/)_Oo_(\\/)");
		}
	}
}
/*
В восточном календаре принят 60-летний цикл, состоящий из 12-летних подциклов, обозначаемых названиями цвета: зеленый, красный, желтый, белый и черный. В каждом подцикле годы носят названия животных: крысы, коровы, тигра, зайца, дракона, змеи, лошади, овцы, обезьяны, курицы, собаки и свиньи. По номеру года определить его название, если 1984 год — начало цикла: «год зеленой крысы».
*/

public class Ex_27_func {
	public static void beast(int year){
		String[] yearBeast = {"Monkey!", "Han!", "Dog!", "Pig!", "Rat!", "Cow!", "Tiger!", "Hear!", "Dragon!", "Snake!", "Horse!", "Sheep!"};
		System.out.println(yearBeast[year%12]);
	}
	
	public static void color(int year){
		String[] yearColor = {"White ", "Yellow ", "Black ", "Red ", "Green "};
		System.out.print(yearColor[year%5]);
	}
	
	public static boolean generalCond(String[] args, int conditionLength){
		boolean cond = false;
		if (args.length < conditionLength) {
			System.err.println("You haven't entered an argument! The task requires entering one arguments.");
			cond = true;
		}
		if (args.length > conditionLength) System.out.println("You entered more arguments, than programm needs. \nIt will use only first one.");
		return cond;
	}
	
	public static void main(String[] args){
		generalCond(args,1);
		Integer year = Integer.parseInt(args[0]);
		System.out.print (year + " is the Year of ");
		color(year);
		beast(year);
	}
}
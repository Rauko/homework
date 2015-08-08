/*
Даны координаты двух различных полей шахматной доски x1, y1, x2, y2 (целые числа, лежащие в диапазоне 1–8). Проверить истинность высказывания: «Данные поля имеют одинаковый цвет».
*/
public class Ex_20_func {
	public static boolean cond(int x1, int y1, int x2, int y2){
		boolean cond = false;
		if (x1 < 1 || x1 > 8) {
			System.err.println("x1(first digit) doesn't satisfy condition.");
			cond = true;
		}
		if (x2 < 1 || x2 > 8) {
			System.err.println("x2(third digit) doesn't satisfy condition.");
			cond = true;
		}
		if (y1 < 1 || y1 > 8) {
			System.err.println("y1(second digit) doesn't satisfy condition.");
			cond = true;
		}
		if (y2 < 1 || y2 > 8) {
			System.err.println("y2(fourth digit) doesn't satisfy condition.");
			cond = true;
		}
		if(cond) System.err.println("Check, that all arguments are in array from 1 to 8.");
		return cond;
	}
	
	public static boolean generalCond(String[] args, int conditionLength){
		boolean cond = false;
		if (args.length < conditionLength) {
			System.err.println("You haven't entered arguments! The task requires entering four arguments.");
			cond = true;
		}
		if (args.length > conditionLength) System.out.println("You entered more arguments, than programm needs. \nIt will use only first two.");
		return cond;
	}

	public static void squares(int x1, int y1, int x2, int y2) {
		int fig1 = (x1 + y1)%2;
		int fig2 = (x2 + y2)%2;
		if (fig1 == fig2){
			if (fig1 == 1) {
				System.out.println("This are the same colored white squares.");
			} else System.out.println("This are the same colored black squares.");
		} else System.out.println("This are the different colored squares.");
	}

	public static void main(String[] args){
		if(generalCond(args,4)) return;
		Integer x1 = Integer.parseInt(args[0]);
		Integer y1 = Integer.parseInt(args[1]);
		Integer x2 = Integer.parseInt(args[2]);
		Integer y2 = Integer.parseInt(args[3]);
		if(cond(x1,y1,x2,y2)) return;
		squares(x1,y1,x2,y2);
	}
}
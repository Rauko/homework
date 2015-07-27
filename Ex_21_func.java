/*
Даны координаты двух различных полей шахматной доски x1, y1, x2, y2 (целые числа, лежащие в диапазоне 1–8). Проверить истинность высказывания: «Ладья за один ход может перейти с одного поля на другое».
*/

public class Ex_21_func {
	public static boolean cond(int x1, int y1, int x2, int y2){
		boolean cond = false;
		if (x1 < 1 || x1 > 8) {
			System.err.println("x1(first digit) doesn't satisfy condition.");
			cond = true;
		}
		if (y1 < 1 || y1 > 8) {
			System.err.println("y1(second digit) doesn't satisfy condition.");
			cond = true;
		}
		if (x2 < 1 || x2 > 8) {
			System.err.println("x2(third digit) doesn't satisfy condition.");
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
		if (args.length > conditionLength) System.out.println("You entered more arguments, than programm needs. \nIt will use only first four.");
		return cond;
	}

	public static void rook(int x1, int y1, int x2, int y2) {
		if (x1 == x2 && y1 == y2) {
			System.out.println("Rook does not move on the field.");
		} else if (x1 == x2 || y1 == y2){
			System.out.println("Rook for one course can move from one square to another.");			
		} else System.out.println("In one move, rook can't fall to the specified square.");
	}

	public static void main(String[] args){
		if(generalCond(args,4)) return;
		Integer x1 = Integer.parseInt(args[0]);
		Integer y1 = Integer.parseInt(args[1]);
		Integer x2 = Integer.parseInt(args[2]);
		Integer y2 = Integer.parseInt(args[3]);
		if(cond(x1,y1,x2,y2)) return;
		rook(x1,y1,x2,y2);
	}
}
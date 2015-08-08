/*
Даны координаты двух различных полей шахматной доски x1, y1, x2, y2 (целые числа, лежащие в диапазоне 1–8). Проверить истинность высказывания: «Ладья за один ход может перейти с одного поля на другое».
*/

public class Ex_21 {
	public static void main(String[] args){
		if (args.length >= 4) {
			if (args.length > 4) System.out.println("You entered more arguments, than programm needs. \nIt will use only first four.");
			Integer x1 = Integer.parseInt(args[0]);
			Integer y1 = Integer.parseInt(args[1]);
			Integer x2 = Integer.parseInt(args[2]);
			Integer y2 = Integer.parseInt(args[3]);
/*!*/		if ((x1 > 0 && x1 < 9) && (x2 > 0 && x2 < 9) && (y1 > 0 && y1 < 9) && (y2 > 0 && y2 < 9)) {
/*!*/			if (x1 == x2 && y1 == y2) {
/*!*/				System.out.println("Rook does not move on the field.");
/*!*/			} else if (x1 == x2 || y1 == y2){
/*!*/				System.out.println("Rook for one course can move from one square to another.");
/*!*/			} else System.out.println("In one move, rook can't fall to the specified square.");
			} else System.err.println("One ore more of entered digits doesn't satisfy condition. \nCheck, that all of them are in array from 1 to 8.");
		} else System.err.println("You haven't entered arguments! The task requires entering four arguments.");
	}
}
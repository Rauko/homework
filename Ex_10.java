/*
Дано двузначное число. Вывести вначале его левую цифру (десятки), а затем — его  правую цифру (единицы). Для нахождения десятков использовать операцию деления нацело, для нахождения единиц — операцию взятия остатка от деления.
*/

public class Ex_10 {
	public static void main(String[] args) {
		Integer var = Integer.parseInt(args[0]);
		int dec = 1;
		int ones = 1;
		dec = var / 10;
		ones = var % 10;  
		System.out.println("десятков " + dec + ", единиц " + ones);
	}
}
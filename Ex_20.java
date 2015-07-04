/* 
Даны координаты двух различных полей шахматной доски x1, y1, x2, y2 (целые числа, лежащие в диапазоне 1–8). Проверить истинность высказывания: «Данные поля имеют одинаковый цвет».
*/

public class Ex_20 {
	public static void main(String[] args){
		if (args.length >= 4) {
			if (args.length > 4) System.out.println("Вы ввели слишком много аргументов, будут использованы только первые 4.");
			Integer x1 = Integer.parseInt(args[0]);
			Integer y1 = Integer.parseInt(args[1]);
			Integer x2 = Integer.parseInt(args[2]);
			Integer y2 = Integer.parseInt(args[3]);
			if ((x1 > 0 && x1 < 9) && (x2 > 0 && x2 < 9) && (y1 > 0 && y1 < 9) && (y2 > 0 && y2 < 9)) {
				int fig1 = (x1 + y1)%2;
				int fig2 = (x2 + y2)%2;
				if (fig1 == fig2){
					if (fig1 == 1) {
						System.out.println("Это поля белого цвета.");
					} else System.out.println("Это поля черного цвета.");
				} else System.out.println("Это поля разных цветов.");
			} else System.err.println("Один из аргументов не удовлетворяет условию. Проверьте, что бы все они находились в диапазоне от 1 до 8.");
		}
	}
}
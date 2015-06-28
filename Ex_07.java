/*
Дано значение температуры T в градусах Цельсия. Определить значение этой же температуры в градусах Фаренгейта. Температура по Цельсию TC и температура по Фаренгейту TF связаны следующим соотношением: TC=(TF–32)·5/9. Ввод температуры организовать через параметры командной строки.
 */

public class Ex_07 {
	public static void main (String[] args){
		Integer TC=0;
		TC = Integer.parseInt(args[0]);
		System.out.print("You entered " + TC + "C. It would be ");
		int TF = 0;
		TF = TC * 9 / 5 + 32;
		System.out.println(TF + " in F.");
	}
}



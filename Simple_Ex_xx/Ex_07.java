/*
Дано значение температуры T в градусах Цельсия. Определить значение этой же температуры в градусах Фаренгейта. Температура по Цельсию TC и температура по Фаренгейту TF связаны следующим соотношением: TC=(TF–32)·5/9. Ввод температуры организовать через параметры командной строки.
 */

public class Ex_07 {
	public static void main (String[] args){
		if(args.length >= 1) {
			if(args.length > 1)
				System.err.println("You entered more digits, than programm needs. It will use only the first one");
			Double TC = Double.parseDouble(args[0]);
			double TF =  (double)TC * 9 / 5 + 32;
			System.out.println("You entered " + TC + "C. It would be " + TF + " in F.");
		} else
			System.err.println("Enter digit argument!");
	}
}



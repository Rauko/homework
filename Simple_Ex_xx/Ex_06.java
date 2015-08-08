/*
Дано значение температуры T в градусах Фаренгейта. Определить значение этой же температуры в градусах Цельсия. Температура по Цельсию TC и температура по Фаренгейту TF связаны следующим соотношеним: TC=(TF–32)·5/9.
 */

public class Ex_06 {
	public static void main (String[] args){
		if(args.length >= 1) {
			if(args.length > 1)
				System.err.println("You entered more digits, than programm needs. It will use only the first one");
			Double TF = Double.parseDouble(args[0]);
			double TC = ((double)((TF - 32) * 5 /) 9);
			TC = (double)TC;
			System.out.println("You entered " + TF + " F. It would be " + TC + " in Celsium.");
		}else
			System.err.println("Enter digit argument!");
	}
}
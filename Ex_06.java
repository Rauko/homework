/*
Дано значение температуры T в градусах Фаренгейта. Определить значение этой же температуры в градусах Цельсия. Температура по Цельсию TC и температура по Фаренгейту TF связаны следующим соотношеним: TC=(TF–32)·5/9.
 */

public class Ex_06 {
	public static void main (String[] args){
		Integer T=0;
		T = Integer.parseInt(args[0]);
		System.out.print("You entered " + T + "F. It would be ");
		int TC = 0;
		TC = (T - 32) * 5 / 9;
		System.out.println(TC + " in Celsium.");
	}
}

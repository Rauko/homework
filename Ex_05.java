/*
Дано число A. Вычислить A^8, используя вспомогательную переменную и три операции умножения. Для этого последовательно находить A^2, A^4, A^8. Вывести все найденные степени числа A.
 */

public class Ex_05 {
	public static void main (String[] args){
		if (args.length >= 1) {
			Integer a=0;
			a = Integer.parseInt(args[0]);
			System.out.println("Your digit is " + a + ".");
			int b = 1;
			for(int i=1; i<8; i++) {
				b *= a;
				b *= a;
				i++;
				if (i != 6) {
					System.out.println(a + " ^ " + i + " = " + b);
				}
			}
		} else 
			System.err.println("Enter the digit!");		
	}
}

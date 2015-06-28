/*
Напишите программу, которая получает из аргументов командной стоки расход бензина в европейском стиле (количество литров на 100 км) и преобразует его в стиль, принятый в США — число миль на галлон. Обратите внимание, что кроме использования других единиц измерений, принятый в США подход (расстояние/топливо) противоположен европейскому (топливо/расстояние). Учтите, что 100  километров соответствуют 62.14 милям, а 1 галлон составляет 3.875 литра. Таким образом, 19 миль на галлон примерно равно 12.4 литров на 100 км, а 27 миль на галлон — примерно 8.7 литров на 100 км. 
 */

public class Ex_09 {
	public static void main (String[] args){
		if(args.length >= 1){
			Double lp100k=0d;
			lp100k = Double.parseDouble(args[0]);

			if (args.length > 1)
				System.err.println("You enter more digits, than programm needed. It will use only first two of them.");
		
			System.out.println("You entered " + lp100k + " l. per 100 km.");
			if(lp100k == 0)
					System.out.println("I gues, you stayed at home.");
			
			double litPerGal = 3.78543d;
			double kmPerMile = 1.6093d;
//			double convert = 2.35d; // litPerGal/kmPerMile
			double milesPerGallon = 1d;		
		
			milesPerGallon = lp100k * litPerGal/kmPerMile;

			System.out.println("It would be " + milesPerGallon + " m. per gallon.");
		}
		else
			System.err.println("Enter digit argument!");
	}	
}
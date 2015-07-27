/*
нарисовать ромб, в реализации использовать функции
*/

public class Rhombus{

	public static void stars(int R){
		for(int j = 0; j < R; j++)
			System.out.print("*");
	}

	public static void spases(int R, int N){
		for(int i = N/2 - R; i >= 0; i--)
			System.out.print(" ");
	}

	public static void starsRhombus(int N){

		int line = N;
		int R = 1;
		for(int i = 0; i < N/2; i++){
			spases(R,line);
			stars(R);
			System.out.print("\b");
			stars(R);
			System.out.println();
			R++;
		}
		for(int i = N/2; i >= 0; i--){
			spases(R,line);
			stars(R);
			System.out.print("\b");
			stars(R);
			System.out.println();
			R--;
		}
	}

	public static void main(String[] args){
		Integer N = Integer.parseInt(args[0]);
		starsRhombus(N);
	}
}
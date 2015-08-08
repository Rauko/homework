public class Cl_w_14{
	public static void starsTriangle(int N){
		int R = 1;
		for(int i = 0; i < N; i++){
			stars(R);
			R++;
		}
		System.out.println();
	}

	public static void stars(int R){
		for(int j = 0; j < R; j++)
			System.out.print("*");
		System.out.println();
	}

	public static void main(String[] args){
		Integer N = Integer.parseInt(args[0]);
		starsTriangle(N);
	}
}
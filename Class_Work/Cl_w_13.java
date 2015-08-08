public class Cl_w_13{
	public static void stars(int N){
		for(int i = 0; i < N; i++)
			System.out.print("*");
		System.out.println();
	}


	public static void main(String[] args){
		Integer N = Integer.parseInt(args[0]);
		stars(N);
	}
}
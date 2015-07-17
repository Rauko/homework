public class Cl_w_8 {
	public static void main(String[] args){
		Integer N = Integer.parseInt(args[0]);

		for(int i = N; i > 0; ){
			if ( (N%2) == 0){
				N /= 2;
				System.out.println(N);
			} else {
				N = 3 * N + 1;
				System.out.println(N);
			}
		}
	}
}
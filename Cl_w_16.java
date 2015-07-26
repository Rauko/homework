public class Cl_w_16{
	public static double F(int n){
		return (n == 0) ? 1 : F(n-1)*n;
	}

	public static void main(String[] args){
		Integer n = Integer.parseInt(args[0]);
		System.out.println(F(n));
	}
}
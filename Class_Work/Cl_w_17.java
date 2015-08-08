public class Cl_w_17{
	public static int phi(int n){
		if (n - 2 == 0 || n - 1 == 0) {
    		return 1;
  		} else if (n == 0)
  			return 0;
		return (phi(n-1) + phi(n-2));
	}

	public static void main(String[] args){
		Integer n = Integer.parseInt(args[0]);
		System.out.println(phi(n));
	}
}
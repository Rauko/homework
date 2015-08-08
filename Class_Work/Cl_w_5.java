public class Cl_w_5 {
	public static void main(String[] args) {
		Integer x = Integer.parseInt(args[0]);
		x %= 2;
		if(x == 0) {
			System.out.println("even");
		} else System.out.println("odd");
	}
}
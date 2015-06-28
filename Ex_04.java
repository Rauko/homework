public class Ex_04 {
	public static void main(String[] args) {
		if (args.length >= 2) {
			Integer A = Integer.parseInt(args[0]);
			System.out.println("Your variable A: " + A);
	
			Integer B = Integer.parseInt(args[1]);
			System.out.println("Your variable B: " + B + ". Now let's swap 'em!");
	
			A = A + B;
			B = A - B;
			A = A - B;
		
			System.out.println("Now your variables are: A=" + A + ", B=" + B + ".");
		} else
			System.err.println("Enter two digit arguments!");
	}
}
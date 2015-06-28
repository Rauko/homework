public class Ex_02 {
	public static void main(String[] args) {
		if (args.length >= 3) {
			Integer A = Integer.parseInt(args[0]);
			System.out.println("Your variable A: " + A + ";");

			Integer B = Integer.parseInt(args[1]);
			System.out.println("Your variable B: " + B + ";");
		
			Integer C = Integer.parseInt(args[2]);
			System.out.println("Your variable C: " + C + ". Now let's change 'em plases!");
			
			int buf = A;
			A = B;
			B = C;
			C = buf;
			
			System.out.println("Now your variables are: A = " + A + ", B = " + B + ", C = " + C + ".");
		} else
			System.err.println("Enter three digit arguments!");
	}
}
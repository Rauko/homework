public class Ex_01 {
	public static void main(String[] args) {
		if (args.length == 2) {
			Integer A = Integer.parseInt(args[0]);
			Integer B = Integer.parseInt(args[1]);

			if (args.length > 2)
				System.err.println("You enter more digits, than programm needed. \n
									It will use only first two of them.");

			System.out.println("Your variable A: " + A + "; \n
								Your variable B: " + B + ". Now let's swap 'em!");

			int buf = A;
			A = B;
			B = buf;
		
			System.out.println("Now your variables are: A = " + A + ", B = " + B + ".");
		} else
			System.err.println("Enter two digit arguments!");
	}
}
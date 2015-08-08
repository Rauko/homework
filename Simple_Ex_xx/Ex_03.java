public class Ex_03 {
	public static void main(String[] args) {
		if (args.length >= 3) {
			Integer A = Integer.parseInt(args[0]);
			Integer B = Integer.parseInt(args[1]);
			Integer C = Integer.parseInt(args[2]);

			if (args.length > 3)
				System.err.println("You enter more digits, than programm needed.");
				System.err.println("It will use only first three of them.");

			System.out.println("Your variable A: " + A + ";");
			System.out.println("Your variable B: " + B + ";");
			System.out.println("Your variable C: " + C + ". Let's change 'em plases!");

			int buf = C;
			C = A;
			A = B;
			B = buf;

			System.out.println("Now your variables are: ");
			System.out.println("A = " + A + ", B = " + B + ", C = " + C + ".");
		} else 
			System.err.println("Enter three digit arguments!");
	}
}
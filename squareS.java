public class squareS{
	public static void main(String[] args){
		if (args.length >= 1){
			Integer side = Integer.parseInt(args[0]);
			if (side > 0) {
				System.out.println("Your square side is " + side + ".");
				side = side * side;
				System.out.println("Your square sq. is " + side + ".");
			} else  {
				System.err.println("Enter non-null arguments for both square sides!");
				return;
			}
		} else {
			System.err.println("Enter both arguments for square sides!");
			return;
		}
	}
}
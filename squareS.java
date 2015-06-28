public class squareS{
	public static void main(String[] args){
		if (args.length >= 1){
			Integer side = Integer.parseInt(args[0]);
			System.out.println("Your square side is " + side + ".");
			side = side * side;
			if (side > 0) {
				System.out.println("Your square sq. is S = " + side + ".");
			} else  {
				System.err.println("You entered null to a square side. \n
						    In that case, S = " + side + ".");
			}
		} else {
			System.err.println("Enter both arguments for square sides!");
		}
	}
}

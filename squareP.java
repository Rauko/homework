public class squareP{
	public static void main(String[] args){
		if (args.length >= 1){
			Integer side = Integer.parseInt(args[0]);
			System.out.println("Your square side is " + side + ".");
			side = side * 4;
			if (side > 0) {
				System.out.println("Your square perimeter is P = " + side + ".");
			} else  {
				System.err.println("You entered null to a square side. In that case, P = " + side + ".");
			}
		} else {
			System.err.println("Enter argument for square side!");
		}
	} 
}
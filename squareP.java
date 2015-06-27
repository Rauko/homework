public class squareP{
	public static void main(String[] args){
		if (args.length >= 1){
			Integer side = Integer.parseInt(args[0]);
			if (side > 0) {
				System.out.println("Your square side is " + side + ".");
				side = side * 4;
				System.out.println("Your square perimeter is " + side + ".");
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
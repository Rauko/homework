public class Rectangle {
	public static void main(String[] args){
		if (args.length >= 2){
			Integer sideA = Integer.parseInt(args[0]);
			Integer sideB = Integer.parseInt(args[1]);
			if (sideA > 0 && sideB > 0) {
				int S = sideA * sideB;
				int P = (sideA + sideB)*2;
				System.out.println("S = " + S + " and P = " + P + ".");
			} else  {
				System.err.println("Enter non-null arguments for both rectangle sides!");
				return;
			}
		} else {
			System.err.println("Enter both arguments for rectangle sides!");
			return;
		}
	}
}
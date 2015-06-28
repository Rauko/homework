public class Rectangle {
	public static void main(String[] args){
		if (args.length >= 2){
			Integer sideA = Integer.parseInt(args[0]);
			Integer sideB = Integer.parseInt(args[1]);
			int S = sideA * sideB;
			int P = (sideA + sideB)*2;
			if (sideA > 0 && sideB > 0) {
			System.out.println("S = " + S + " and P = " + P + ".");
			} else  {
				if(sideA == 0 && sideB == 0) {
					System.err.println("You enter null argument for both of the rectangle sides. \n
							In that case: S = " + S + " and P = " + P + ".");
				} else 
					System.err.println("You enter null argument for one of the rectangle sides. \n
						 	In that case: S = " + S + " and P = " + P + ".");
			}
		} else {
			System.err.println("Enter both arguments for rectangle sides!");
		}
	}
}

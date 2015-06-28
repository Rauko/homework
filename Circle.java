public class Circle {
	public static void main(String[] args){
		if (args.length >= 1){
			Integer d = Integer.parseInt(args[0]);
			double Pi = 3.14d;
			double L = d * Pi; 
			if (d > 0) {
				System.out.println("L = " + L + ".");
			} else  {
				System.err.println("You enter null argument for d. \n
						In that case L = " + L + ".");
			}
		} else {
			System.err.println("Enter argument for d!");
		}
	}
}

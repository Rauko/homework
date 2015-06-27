public class Circle {
	public static void main(String[] args){
		if (args.length >= 1){
			Integer d = Integer.parseInt(args[0]);
			if (d > 0) {
				double Pi = 3.14d;
				double L = d * Pi; 
				System.out.println("L = " + L + ".");
			} else  {
				System.err.println("Enter non-null argument for d!");
				return;
			}
		} else {
			System.err.println("Enter argument for d!");
			return;
		}
	}
}
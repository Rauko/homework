public class Ex_02 {
	public static void main(String[] args){
	    //inputting A
	    Integer A = 0;
	    try {
	        A = Integer.valueOf(args[0]);    
		System.out.println("Your variable A: " + A);
	    } catch (NumberFormatException e) {  
	        System.err.println("Wrong string format! Enter number to A.");  
	    } 
	    //inputting B
	    Integer B = 0;
	    try {
	        B = Integer.valueOf(args[1]);   
		System.out.println("Your variable B: " + B + "."); 
	    } catch (NumberFormatException e) {  
	        System.err.println("Wrong string format! Enter number to B.");  
	    } 
	    //inputting C
	    Integer C = 0;
	    try {
	        C = Integer.valueOf(args[2]);    
		System.out.println("Your variable C: " + C);
	    } catch (NumberFormatException e) {  
	        System.err.println("Wrong string format! Enter number to C.");  
	    } 

		System.out.println("Your variables are: A=" + A + ", B=" + B + ", C=" + C + ". Now let's swap 'em!");
			
		//changing
		int buf;
		buf = A;
		A = B;
		B = C;
		C = buf;
			
		System.out.println("Now your variables are: A=" + A + ", B=" + B + ", C=" + C + ".");
	}
}

public class Ex_04 {
	public static void main(String[] args) {
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
		System.out.println("Your variable B: " + B + ". Now let's swap 'em!"); 
	    } catch (NumberFormatException e) {  
	        System.err.println("Wrong string format! Enter number to B.");  
	    } 
				
	    //swapping
            A = A + B;
            B = A - B;
            A = A - B;
		
	    System.out.println("Now your variables are: A=" + A + ", B=" + B + ".");
	}
}

public class Cl_w_15{
	public static int countChars(char search, String str){
		int num = 0;
		for(int i = 0; i < str.length(); i++)
			if(str.charAt(i) == search)
				num++;
		return num;		
	}

	public static String makeStr(String str, String[] args){
		str += " ";
		for(int i = 2; i < args.length; i++)
			str += args[i] + " ";
		return str;
	}

	public static void main(String[] args){
		char search = args[0].charAt(0);
		String str = args[1];
		if (args.length > 2)
			str = makeStr(str,args);
		System.out.println(countChars(search,str));
	}
}
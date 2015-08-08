/*
Написать функцию с именем countChars, что имеет строку и символ в качестве параметров. Функция должна считать количество раз, когда символ появляется в строке, и она должна вернуть результат в качестве значения функции.
*/

import java.util.*;

public class Ex_47 {
	public String args[];

	public static int countChars(String str, char search){
		int numberOfChars = 0;
		for (int i = 0; i < str.length(); i++){
			if(str.charAt(i) == search){
				numberOfChars++;
			}
		}
		return numberOfChars;
	}

	public static String readToStr(String str, String[] args){
		String[] _args = args;
		String line = str;
		if (args.length >= 2){
			for (int i = 2; i < _args.length; i++){
				line += " " + _args[i];
			}
		}
		return line;
	}

	public static void main(String[] args){
		if (args.length < 2) {
			System.err.println("This programm needs one character argument! Enter a letter you want to count in staidart string.");
			return;
		} 

		char search = args[0].charAt(0); 

		String str = args[1];
		str = readToStr(str, args);

		int number = countChars(str, search);
		System.out.println("You are searching for letter '" + search + "' in this string:\n'" + str + "'.\nThere are " + number + " such letters in it.");
	}
}
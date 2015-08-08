/*
Начальный вклад в банке равен 1000 руб. Через каждый месяц размер вклада увеличивается на P процентов от имеющейся суммы (P — вещественное число, 0 < P < 25). По данному P определить, через сколько месяцев размер вклада превысит 1100 руб., и вывести найденное количество месяцев K (целое число) и итоговый размер вклада S (вещественное число).
Для реализации использовать функции.
*/

import java.util.*;

public class Ex_35_func {
	public static int incrMode(double P, double S){
		P /= 100;
		int K = 0;
		do {
			S += S * P;
			K++;
		} while(S < 1100);
		return K;
	}
	
	public static int staticMode(double P, double S){
		P /= 100;
		int K = 0;
		double buf = 1000;
		do {
			buf += S * P;
			K++;
		} while(buf < 1100);
		return K;
	}
	
	public static boolean mode(){
		boolean cond = false;
		int mode = 0;
		System.out.print("Choose mode with increasing(1) or with static(2) balane:");
		Scanner in = new Scanner(System.in);
		while(mode != 1 || mode != 2) { 
			mode = in.nextInt();
			if(mode == 1 ||mode == 2) break;
		}
		in.close();
		if(mode == 1){
			System.out.println("You choose mode with increasing basic balance.");
			cond = true;
		} else {
			System.out.println("You choose mode with static basic balance.");
			cond = false;
		}

		return cond;
	}
	
	public static boolean cond(double P){
		boolean cond = false;
		if (P < 0 || P > 25){
			System.err.println("Entered digit doesn't satisfy condition. It must be in array from 1 to 24!");
			cond = true;
		}
		return cond;
	}
	
	public static boolean generalCond(String[] args, int conditionLength){
		boolean cond = false;
		if (args.length < conditionLength) {
			System.err.println("You haven't entered an argument! The task requires entering one argument.");
			cond = true;
		}
		if (args.length > conditionLength) System.out.println("You entered more arguments, than programm needs. \nIt will use only first two.");
		return cond;
	}
	
	public static void main(String[] args) {
		if(generalCond(args,1)) return;
		Double P = Double.parseDouble(args[0]);
		if(cond(P)) return;
		double S = 1000;
		if(mode()){
			System.out.println("Your final balance is " + S + ".\nThe balance exceeds the value of 1100 in " + incrMode(P,S) + " month.");
		} else System.out.println("Your final balance is " + S + ".\nThe balance exceeds the value of 1100 in " + staticMode(P,S) + " month.");
	}
}
/*
Даны два целых числа: D (день) и M (месяц), определяющие правильную дату. Вывести знак Зодиака, соответствующий этой дате: «Водолей» (20.1–18.2), «Рыбы» (19.2–20.3), «Овен» (21.3–19.4), «Телец» (20.4–20.5), «Близнецы» (21.5–21.6), «Рак» (22.6–22.7), «Лев» (23.7–22.8), «Дева» (23.8–22.9), «Весы» (23.9–22.10), «Скорпион» (23.10–22.11), «Стрелец» (23.11–21.12), «Козерог» (22.12–19.1).
*/

public class Ex_28 {
	public static void main(String[] args){
		if (args.length < 2) {
			System.err.println("You haven't entered arguments! The task requires entering two arguments.");
			return;
		}
		if (args.length > 2) System.out.println("You entered more arguments, than programm needs. \nIt will use only first two.");
		Integer D = Integer.parseInt(args[0]);
		Integer M = Integer.parseInt(args[1]);
		int err = 0;
		if (M < 0 || M > 12){
			err++;
			System.err.println("Wrong value for 'Month'! Second argument must be in array from 1 to 12!");
		}
		if (D < 0 || D > 29) {
			if (M == 2 && D > 29) {
				System.err.println("This month have maximum 29 days!");
				err++;
			}
			if ((M%8)%2 == 1 && D > 31) {
				System.err.println("This month have maximum 31 days!");
				err++;
			}
			if ((M%8)%2 == 0 && D > 30) {
				System.err.println("This month have maximum 30 days!");
				err++;
			}
		}
		if (err != 0) return;
		System.out.print (D + "." + M + " has zodiacal sign of ");
		if ((M == 1 && D >= 20) || (M == 2 && D <= 18)) { //«Водолей» (20.1–18.2)
			System.out.println("Aquarius.");
		} else if ((M == 2 && D >= 19) || (M == 3 && D <= 20)) { //«Рыбы» (19.2–20.3)
			System.out.println("Fishes.");
		} else if ((M == 3 && D >= 21) || (M == 4 && D <= 19)) { //«Овен» (21.3–19.4)
			System.out.println("Aries.");
		} else if ((M == 4 && D >= 20) || (M == 5 && D <= 20)) { //«Телец» (20.4–20.5)
			System.out.println("Taurus.");
		} else if ((M == 5 && D >= 21) || (M == 6 && D <= 21)) { //«Близнецы» (21.5–21.6)
			System.out.println("Gemini.");
		} else if ((M == 6 && D >= 22) || (M == 7 && D <= 22)) { //«Рак» (22.6–22.7)
			System.out.println("Cancer.");
		} else if ((M == 7 && D >= 23) || (M == 8 && D <= 22)) { //«Лев» (23.7–22.8)
			System.out.println("Leo.");
		} else if ((M == 8 && D >= 23) || (M == 9 && D <= 21)) { //«Дева» (23.8–22.9)
			System.out.println("Virgo.");
		} else if ((M == 9 && D >= 23) || (M == 10 && D <= 22)) { //«Весы» (23.9–22.10)
			System.out.println("Libra.");
		} else if ((M == 10 && D >= 23) || (M == 11 && D <= 22)) { //«Скорпион» (23.10–22.11)
			System.out.println("Scorpio.");
		} else if ((M == 11 && D >= 23) || (M == 12 && D <= 21)) { //«Стрелец» (23.11–21.12)
			System.out.println("Sagittarius.");
		} else if ((M == 12 && D >= 22) || (M == 1 && D <= 19)) { //«Козерог» (22.12–19.1)
			System.out.println("Capricorn.");
		} else System.err.println("(\\/)_Oo_(\\/)");
	}
}
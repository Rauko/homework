/*
С начала суток прошло N секунд (N — целое). Найти количество полных часов, минут и секунд, прошедших с начала последнего часа.
*/

public class Ex_15 {
	public static void main(String[] args){
		if (args.length >= 1){
			if (args.length > 1)
				System.err.println("You entered more arguments, than programm needs. \nIt will use only first one.");
			Integer sec = Integer.parseInt(args[0]);
			if (sec < 0) {
				System.err.println("The entered value can't be negative!");
				return;
			} else{
				int hour = 0;
				int min = 0;
				if (sec >= 3600){
					hour = sec/3600;
					sec -= hour*3600; 
					if (hour >= 24){
						int day = hour/24;
						hour-= 24*day;
					}
				}
				if (sec >= 60){
					min = sec/60;
					sec -= min*60; 
				}
				System.out.println("Since the beginning of the day has passed " + hour + " hours, " + min + " minutes and " + sec + " seconds.");
			}
		} else System.err.println("You haven't entered an argument!");
	}
}
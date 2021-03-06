/*
Создать массив объектов Customer. В тестовом классе определить функции, которые:
выводит список покупателей, у которых номер кредитной карты находится в заданномдиапазоне
выводит список покупателей, у которых сумма покупок выше заданной
*/

import java.util.Arrays;

public class Ex_54 {	
	
	public static boolean compareCardID(String[] clientInfo, int colomn, int from, int to){
		boolean cond = false;
		Integer currentCardID = Integer.parseInt(clientInfo[colomn]);
		if(currentCardID > from && currentCardID < to) cond = true;
		return cond;
	}
	
	public static boolean compareBalance(String[] clientInfo, int colomn, int more){
		boolean cond = false;
		Double currentCardID = Double.parseDouble(clientInfo[colomn]);
		if(currentCardID > more) cond = true;
		return cond;
	}

	public static void main(String[] args) {
		
		Customer2 client_01 = new Customer2();
		Customer2 client_02 = new Customer2();
		Customer2 client_03 = new Customer2();
		Customer2 client_04 = new Customer2();
		Customer2 client_05 = new Customer2();
		Customer2 client_06 = new Customer2();
		Customer2 client_07 = new Customer2();
		Customer2 client_08 = new Customer2();
		Customer2 client_09 = new Customer2();
		Customer2 client_10 = new Customer2();

		client_01.setCustomer("18","Name 1","Second Name 1","Dad's Name 1", "1735.54", "Some Address 1", "124412", "345134");
		client_02.setCustomer("23","Name 2","Second Name 2","Dad's Name 2", "63.73", "Some Address 2", "412451", "342424");
		client_03.setCustomer("24","Name 3","Second Name 3","Dad's Name 3", "1263.50", "Some Address 3", "234122", "345134");
		client_04.setCustomer("28","Name 4","Second Name 4","Dad's Name 4", "741.42", "Some Address 4", "244129", "345134");
		client_05.setCustomer("35","Name 5","Second Name 5","Dad's Name 5", "55.00", "Some Address 5", "924723", "345134");
		client_06.setCustomer("48","Name 6","Second Name 6","Dad's Name 6", "22.36", "Some Address 6", "024412", "345134");
		client_07.setCustomer("51","Name 7","Second Name 7","Dad's Name 7", "3218.80", "Some Address 7", "100782", "345134");
		client_08.setCustomer("59","Name 8","Second Name 8","Dad's Name 8", "6300.89", "Some Address 8", "197299", "345134");
		client_09.setCustomer("77","Name 9","Second Name 9","Dad's Name 9", "74.15", "Some Address 9", "723145", "345134");
		client_10.setCustomer("96","Name 10","Second Name 10","Dad's Name 10", "1977.41", "Some Address 10", "000231", "345134");
		
		String[][] clientBase = new String[10][];
				
			clientBase[0] = client_01.getCustomerString();
			clientBase[1] = client_02.getCustomerString();
			clientBase[2] = client_03.getCustomerString();
			clientBase[3] = client_04.getCustomerString();
			clientBase[4] = client_05.getCustomerString();
			clientBase[5] = client_06.getCustomerString();
			clientBase[6] = client_07.getCustomerString();
			clientBase[7] = client_08.getCustomerString();
			clientBase[8] = client_09.getCustomerString();
			clientBase[9] = client_10.getCustomerString();
			
			
		int from = 141251;
		int to = 431255;
		boolean indic = true;
		System.out.println("Clients with bank card ¹ from " + from + " to " + to + ":");
		for(int i = 0; i < 10; i++){
			if(compareCardID(clientBase[i], 6, from, to)){
				System.out.println(Arrays.toString(clientBase[i]));
				indic = false;
			} else continue;
		}
		if(indic) System.out.println("No match in base");
		
		System.out.println();
		
		int more = 1700;
		System.out.println("Clients with current balance more than " + more + "USD:");
		indic = true;
		for(int i = 0; i < 10; i++){
			if(compareBalance(clientBase[i], 4, more)){
				System.out.println(Arrays.toString(clientBase[i]));
				indic = false;
			} else continue;
		}
		if(indic) System.out.println("No match in base");
	}
}

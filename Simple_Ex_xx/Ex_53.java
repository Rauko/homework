/*
Определить класс Customer (Клиент) со следующими полями: id, Фамилия, Имя, Отчество, Адрес, Суммарная стоимость всех покупок, Номер кредитной карты, Номер банковского счёта. Для каждого из полей задать get/set методы. Определить набор конструкторов. В классе должна быть функция, позволяющая распечать информацию о клиенте на экране.
Создать тестовый класс для Customer с функцией main(). В этом классе продемонстрировать работу класса Customer.
*/

import java.util.*;

public class Ex_53 {
	public static void main(String[] args){
		Customer client = new Customer();

		long ID = client.getId(42);
		String lastName = client.getLastName("Surname");
		String firstName = client.getFirstName("Name");
		String thirdName = client.getThirdName("Dad's Name");

		String address = client.getAddress("Client's address");
		long card = client.getCard(1234567890);
		long bankID = client.getBankId(567890123);
		double allCashSum = client.getAllCashSum (1714.84);

		client.enterDataCustomer(ID, lastName, firstName, thirdName, address, allCashSum, card, bankID);

		String[] clientInfo = client.Customer(ID, lastName, firstName, thirdName, allCashSum, card, bankID);
		System.out.println(Arrays.toString(clientInfo));
 			
 		clientInfo = client.Customer(ID, lastName, firstName,  thirdName, address, bankID);
 		System.out.println(Arrays.toString(clientInfo));
		
 		allCashSum += -250.99;

 		client.setAllCashSum(allCashSum);
 		clientInfo = client.Customer(ID, lastName, firstName,  thirdName, card, bankID);
 		System.out.println(Arrays.toString(clientInfo));
	}
}
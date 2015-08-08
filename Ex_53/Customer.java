/*
part of Ex_53 & Ex_54
*/

import java.util.*;

public class Customer {
	private long id;
	private String firstName;
	private String lastName;
	private String thirdName;
	private String address;
	private double allCashSum = 0.0d;
	private long card;
	private long bankId;

	public void setId(long id){
		this.id = id;
	}
	public long getId(long id){
		return id;
	}

	public void setFirstName(String firstName){
		this.firstName = firstName;
	}
	public String getFirstName(String firstName){
		return firstName;
	}

	public void setLastName(String lastName){
		this.lastName = lastName;
	}
	public String getLastName(String lastName){
		return lastName;
	}

	public void setThirdName(String thirdName){
		this.thirdName = thirdName;
	}
	public String getThirdName(String thirdName){
		return thirdName;
	}

	public void setAddress(String address){
		this.address = address;
	}
	public String getAddress(String address){
		return address;
	}

	public void setAllCashSum(double allCashSum){

		if (this.allCashSum != allCashSum && getBankId(bankId) != 0){
			double change = allCashSum - this.allCashSum;
			System.out.println("Balanсe of " + shortName(getLastName(lastName), getFirstName(firstName), thirdName) + "(bank card №" + getBankId(bankId) + ") changed: " + change + ".");
		}
		this.allCashSum = allCashSum;
	}

	public double getAllCashSum(double allCashSum){
		return allCashSum;
	}

	public void setCard(long card){
		this.card = card;
	}
	public long getCard(long card){
		return card;
	}

	public void setBankId(long bankId){
		this.bankId = bankId;
	}
	public long getBankId(long bankId){
		return bankId;
	}

	public String dataTransform(long data){
		String transformed = data + "";
		return transformed;
	}

	public String dataTransform(double data){
		String transformed = "$" + data;
		return transformed;
	}

	public long dataTransform(String data){
		Long transformed = Long.parseLong(data);
		return transformed;
	}

	public void enterDataCustomer(long id, String lastName, String firstName, String thirdName, String address, double allCashSum, long card, long bankId){
		setId(id);
		setLastName(lastName);
		setFirstName(firstName);
		setThirdName(thirdName);
		setAddress(address);
		setAllCashSum(allCashSum);
		setCard(card);
		setBankId(bankId);
	}

	public void enterDataCustomer(String[] clientBase){
		Long id = Long.parseLong(clientBase[0]);
		setId(id);
		setLastName(clientBase[1]);
		setFirstName(clientBase[2]);
		setThirdName(clientBase[3]);
		setAddress(clientBase[4]);
		Double allCashSum = Double.parseDouble(clientBase[5]);
		setAllCashSum(allCashSum);
		Long card = Long.parseLong(clientBase[6]);
		setCard(card);
		Long bankId = Long.parseLong(clientBase[7]);
		setBankId(bankId);
	}

	public String[] Customer(long id, String lastName, String firstName, String thirdName, String address, long bankId) {
		String[] dataLine = {dataTransform(getId(id)), getLastName(lastName),getFirstName(firstName), getThirdName(thirdName), getAddress(address), dataTransform(getBankId(bankId))};
		return dataLine;
	}

	public String[] Customer(long id, String lastName, String firstName, String thirdName, double allCashSum, long card, long bankId) {
		String[] dataLine = {dataTransform(getId(id)), getLastName(lastName),getFirstName(firstName), getThirdName(thirdName), dataTransform(getAllCashSum(allCashSum)), dataTransform(getCard(card)), dataTransform(getBankId(bankId))};
		return dataLine;
	}

	public String shortName(String lastName, String firstName, String thirdName){
		String shortName = getLastName(lastName) + " " + getFirstName(firstName).charAt(0) + ". " + getThirdName(thirdName).charAt(0) + ".";
		return shortName;
	}

	public String[] Customer(String[] string) {
		return string;
	}

	public String[] Customer() {
		String[] dataLine = {dataTransform(getId(id)), shortName(getLastName(lastName),getFirstName(firstName),getThirdName(thirdName)), dataTransform(getAllCashSum(allCashSum)), dataTransform(getCard(card)), dataTransform(getBankId(bankId))};
		return dataLine;
	}

	public String[] Customer(long id, String lastName, String firstName, String thirdName, long card, long bankId) {
		String[] dataLine = {dataTransform(getId(id)), shortName(getLastName(lastName),getFirstName(firstName),getThirdName(thirdName)), dataTransform(getAllCashSum(allCashSum)), dataTransform(getCard(card)), dataTransform(getBankId(bankId))};
		return dataLine;
	}

	public void print(String[] string){
		System.out.println(Arrays.toString(Customer(string)));
	}


	public void compare(String clientCardData, long from, long to){

		if(dataTransform(clientCardData) > from && dataTransform(clientCardData) < to){
			print(Customer());
		}

	}
}
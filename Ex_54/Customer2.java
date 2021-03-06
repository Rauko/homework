import java.util.Arrays;

public class Customer2 {
	private int ID;
	private String firstName;
	private String secondName;
	private String dadsName;
	private double cashSum;
	private String address;
	private int card;
	private int bankID;
	
	public int getID() {
		return ID;
	}
	public void setID(int iD) {
		ID = iD;
	}
	
	public String getFirstName() {
		return firstName;
	}
	public void setFirstName(String firstName) {
		this.firstName = firstName;
	}
	
	public String getSecondName() {
		return secondName;
	}
	public void setSecondName(String secondName) {
		this.secondName = secondName;
	}
	
	public String getDadsName() {
		return dadsName;
	}
	public void setDadsName(String dadsName) {
		this.dadsName = dadsName;
	}
	
	public double getCashSum() {
		return cashSum;
	}
	public void setCashSum(double cashSum) {
		this.cashSum = cashSum;
	}
	
	public String getAddress() {
		return address;
	}
	public void setAddress(String address) {
		this.address = address;
	}
	
	public int getCard() {
		return card;
	}
	public void setCard(int card) {
		this.card = card;
	}
	
	public int getBankID() {
		return bankID;
	}
	public void setBankID(int bankID) {
		this.bankID = bankID;
	}
	
	public String transformData(long data){
		String transformed = data + "";
		return transformed;
	}
	public String transformData(double data){
		String transformed = data + "";
		return transformed;
	}
	
	public void setCustomer(String ID, String firstName, String secondName, String dadsName, String cashSum, String address, String card, String bankID){
		setID(transformToInt(ID));
		setFirstName(firstName);
		setSecondName(secondName);
		setDadsName(dadsName);
		setCashSum(transformToDouble(cashSum));
		setAddress(address);
		setCard(transformToInt(card));
		setBankID(transformToInt(bankID));
	}
	
	public Customer2(){

	}
	
	public int transformToInt(String data){
		Integer transformed = Integer.parseInt(data);
		return transformed;
	}
	
	public double transformToDouble(String data){
		Double transformed = Double.parseDouble(data);
		return transformed;
	}
	
	public Customer2(int ID, String firstName, String secondName, String dadsName, double cash, String address, int card, int bankID){
		setID(ID);
		setFirstName(firstName);
		setSecondName(secondName);
		setDadsName(dadsName);
		setCashSum(cashSum);
		setAddress(address);
		setCard(card);
		setBankID(bankID);
	}
	
	public void getCustomer(){
		String[] workString = {transformData(getID()), getFirstName(), getSecondName(), getDadsName(), transformData(getCashSum()), getAddress(), transformData(getCard()), transformData(getBankID())};
		System.out.println(Arrays.toString(workString));
	}
	
	public String[] getCustomerString(){
		String[] workString = {transformData(getID()), getFirstName(), getSecondName(), getDadsName(), transformData(getCashSum()), getAddress(), transformData(getCard()), transformData(getBankID())};
		return workString;
	}
}

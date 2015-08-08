package Ex_58;

public class AircraftCarrier extends WaterShip implements Ship {
	public AircraftCarrier(){}
	public AircraftCarrier(String name,	int capacity, int crue, int mass, int speed, int weaponMass){
		setName(name);
//		setAirJetsMass(airJetsMass);
//		setAirJetsCount(airJetsCount);
//		setAirJetsTypes(airJetsTypes);
//		cond();
		setCapacity(capacity);
		if(!cargoHold()) System.out.println("AirCraft Carrier can't carry so much!");
		setCrue(crue);
		setMass(mass);
		setSpeed(speed);
	}
	
	private String name;
	private int[] airJetsMass = {0};
	private final String type = "AirCraft Carrier";
	private int[] airJetsCount = {0};
	private int capacity;
	private String[] airJetsTypes = {""};
	private int weaponMass;
	
	public int getCapacity() {
		return capacity;
	}
	public int getWeaponMass(){
		return weaponMass;
	}
	public void setWeaponMass(int weaponMass){
		this.weaponMass = weaponMass;
	}
	public void setCapacity(int capacity) {
		this.capacity = capacity;
	}
	public String getName() {
		return name;
	}
	public void setName(String name) {
		this.name = name;
	}
	public int[] getAirJetsMass() {
		return airJetsMass;
	}
	public void setAirJetsMass(int[] airJetsMass) {
		this.airJetsMass = airJetsMass;
	}
	public int[] getAirJetsCount() {
		return airJetsCount;
	}
	public void setAirJetsCount(int[] airJetsCount) {
		this.airJetsCount = airJetsCount;
	}
	public String[] getAirJetsTypes() {
		return airJetsTypes;
	}
	public void setAirJetsTypes(String[] airJetsTypes) {
		this.airJetsTypes = airJetsTypes;
	}
	public String getType() {
		return type;
	}

	public void move() {
		if(cargoHold()){
			System.out.println(getType() + " " + getName() + "\nMove by water only with speed " + getSpeed() + "\nHave priorities of parking.");
		} else {
			System.out.println("Ship can't go out from port with over weight.");
			return;
		}
		String Inner = getPointInner();
		String Outer = getPointOuter();
		
		if(Outer != ""){
			System.out.print("Ship is moving from " + Outer);
			if(Inner != ""){
				System.out.println(" to " + Inner + ".");
			} else System.out.println(".");
		} else if(Inner != ""){
			System.out.println("Ship is moving to " + Inner + ".");
		} else System.out.println("Route is unknown.");
	}
	
	public void cond(){
	
	}
	public int allJetsMass(){
		int mass = 0;
		for(int i = 0; i < getAirJetsMass().length; i++){
			mass += getAirJetsMass()[i]*getAirJetsCount()[i];
		}
		return mass;
	}


	public int displacement() {
		return getMass() + allJetsMass() + getWeaponMass();
	}

	public boolean cargoHold() {
		if(getCapacity() < (allJetsMass() + getWeaponMass()))
			return false;
		return true;
	}

	public void movePriority() {
		System.out.println("Priority: Navy ports.");
	}

}
package Ex_58;

public abstract class Battleship extends WaterShip implements Ship {
	public Battleship(){}
	public Battleship(String name, int capacity, int crue, int mass, int speed){
		setName(name);
//		setWeaponMass(weaponMass);
//		setWeaponCount(weaponCount);
//		setWeaponType(weaponType);
//		cond();
		setCapacity(capacity);
		if(!cargoHold()) System.out.println("Battleship can't carry so much!");
		setCrue(crue);
		setMass(mass);
		setSpeed(speed);		
	}
	
	
	

	private int[] weaponMass = {0,0,0,0};
	private final String type = "Battleship";
	private int[] weaponCount = {0,0,0,0};
	private String[] weaponType = {" - "," - "," - "," - "};
	private int capacity;
	public int getCapacity(){
		return capacity;
	}
	public void setCapacity(int capacity) {
		this.capacity = capacity;
	}
	
	public int allWeaponMass(){
		int mass = 0;
		for(int i = 0; i < getWeaponMass().length; i++){
			mass += getWeaponMass()[i]*getWeaponCount()[i];
		}
		return mass;
	}
	
	public int[] getWeaponMass() {
		return weaponMass;
	}
	public void setWeaponMass(int[] weaponMass) {
		this.weaponMass = weaponMass;
	}

	public int[] getWeaponCount() {
		return weaponCount;
	}
	public void setWeaponCount(int[] weaponCount) {
		this.weaponCount = weaponCount;
	}
	public String[] getWeaponType() {
		return weaponType;
	}
	public void setWeaponType(String[] weaponType) {
		this.weaponType = weaponType;
	}

	public String getType() {
		return type;
	}
	public int displacement() {
		return getMass() + allWeaponMass();
	}
	
	public void move() {
		if(cargoHold()){
			System.out.println("Move by water only with speed " + getSpeed() + "\nHave prioritiesof parking.");
		} else {
			System.out.println("Ship can't go out from port with over weight.");
			return;
		}
		if(getPointOuter() != null){
			System.out.print("Ship is moving from " + getPointOuter());
			if(getPointInner() != null){
				System.out.println(" to " + getPointInner() + ".");
			} else System.out.println(".");
		} else if(getPointInner() != null){
			System.out.print("Ship is moving to " + getPointInner() + ".");
		} else System.out.print("Route is unknown.");
	}

	public void movePriority() {
		System.out.println("Priority: Navy ports.");
	}
	public boolean cargoHold() {
		if(getCapacity() < allWeaponMass())
			return false;
		return true;
	}
}

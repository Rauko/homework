package Ex_58;

public class Tanker extends WaterShip implements Ship {
	public Tanker(){}
	public Tanker(String name, int iolMass, int capacity, int crue, int mass, int speed){
		setName(name);
		setOilMass(oilMass);
		setCapacity(capacity);
		if(!cargoHold()) System.out.println("Tanker can't carry so much!");
		setCrue(crue);
		setMass(mass);
		setSpeed(speed);
	}
	
	private String name;
	private int oilMass;
	private final String type = "Tanker";
	private int capacity;
	
	public String getName() {
		return name;
	}
	public void setName(String name) {
		this.name = name;
	}
	public int getOilMass() {
		return oilMass;
	}
	public void setOilMass(int oilMass) {
		this.oilMass = oilMass;
	}
	public int getCapacity() {
		return capacity;
	}
	public void setCapacity(int capacity) {
		this.capacity = capacity;
	}
	public String getType() {
		return type;
	}

	public int displacement() {
		return getMass() + getOilMass();
	}

	public boolean cargoHold() {
		if(getCapacity() < getOilMass())
			return false;
		return true;
	}

	public void movePriority() {
		System.out.println("Priority: Trade ports.");
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

	
}

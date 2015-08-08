package Ex_58;

public abstract class Cargoship extends WaterShip implements Ship {
	public Cargoship(){
		super();
	}
	public Cargoship(String name, int capacity, int crue, int mass, int speed,int cargoMass){
		super(name, capacity, crue, mass, speed);
		setCargoMass(cargoMass);
	}
	
	private String name;
	private int cargoMass;
	private final String type = "Cargo Ship";
	private int capacity;
	
	public String getName() {
		return name;
	}
	public void setName(String name) {
		this.name = name;
	}
	public int getCargoMass() {
		return cargoMass;
	}
	public void setCargoMass(int cargoMass) {
		this.cargoMass = cargoMass;
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
	
	public void move() {
		if(cargoHold()){
			System.out.println("Move by water only with speed " + getSpeed() + "\nHave prioritiesof parking.");
		} else {
			System.out.println("Ship can't go out from port with over weight.");
			return;
		}
		if(getPointOuter() != ""){
			System.out.print("Ship is moving from " + getPointOuter());
			if(getPointInner() != ""){
				System.out.println(" to " + getPointInner() + ".");
			} else System.out.println(".");
		} else if(getPointInner() != ""){
			System.out.print("Ship is moving to " + getPointInner() + ".");
		} else System.out.print("Route is unknown.");
	}

	public void movePriority() {
		System.out.println("Priority: Trade ports.");
	}
	public boolean cargoHold() {
		if(getCapacity() < getCargoMass())
			return false;
		return true;
	}
}

package Ex_58;

public class WaterShip {
	private int mass;
	private int speed;
	private final String type = "WaterShip";
	private int crue;
	private int capacity;
	
	public int getMass() {
		return mass;
	}
	public void setMass(int mass) {
		this.mass = mass;
	}
	public int getSpeed() {
		return speed;
	}
	public void setSpeed(int speed) {
		this.speed = speed;
	}
	public int getCrue() {
		return crue;
	}
	public void setCrue(int crue) {
		this.crue = crue;
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
	private String pointOuter = "";
	private String pointInner = "";

	public String getPointOuter() {
		return pointOuter;
	}
	public void setPointOuter(String pointOuter) {
		this.pointOuter = pointOuter;
	}
	public String getPointInner() {
		return pointInner;
	}
	public void setPointInner(String pointInner) {
		this.pointInner = pointInner;
	}
	public void move() {
		System.out.println("Move by water only with speed " + getSpeed() + ".");
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
	}
	
	public int displacement(){
		return 0;
	}
	
	private String name;
	public void setName(String name){
		this.name = name;
	}
	public String getName(){
		return name;
	}
	
	public boolean cargoHold() {
		return true;
	}
	public WaterShip(String name, int capacity, int crue, int mass, int speed){
		setName(name);
		setCapacity(capacity);
		if(!cargoHold()) System.out.println("Battleship can't carry so much!");
		setCrue(crue);
		setMass(mass);
		setSpeed(speed);		
	}
	public WaterShip(){}

}

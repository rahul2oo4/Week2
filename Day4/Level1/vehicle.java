interface Refuelable {
	void refuel();
}

class Vehicle {
	String model;
	int maxSpeed;

	Vehicle(String m, int s) {
    	model = m;
    	maxSpeed = s;
	}
}

class ElectricVehicle extends Vehicle {
	ElectricVehicle(String m, int s) {
    	super(m, s);
	}

	void charge() {
    	System.out.println("Charging electric vehicle");
	}
}

class PetrolVehicle extends Vehicle implements Refuelable {
	PetrolVehicle(String m, int s) {
    	super(m, s);
	}

	public void refuel() {
    	System.out.println("Refueling petrol vehicle");
	}
}

public class vehicle {
	public static void main(String[] args) {
    	ElectricVehicle e = new ElectricVehicle("Tesla", 200);
    	PetrolVehicle p = new PetrolVehicle("Honda", 180);

    	e.charge();
    	p.refuel();
	}
}
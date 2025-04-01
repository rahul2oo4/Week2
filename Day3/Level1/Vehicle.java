
public class Vehicle {
   private static double registrationFee = 500.0;
   private final String registrationNumber;
   private String ownerName;
   private String vehicleType;

   public Vehicle(String registrationNumber, String ownerName, String vehicleType) {
   	this.registrationNumber = registrationNumber;
   	this.ownerName = ownerName;
   	this.vehicleType = vehicleType;
   }

   public static void updateRegistrationFee(double newFee) {
   	registrationFee = newFee;
   }

   public void displayRegistrationDetails(Object obj) {
   	if (obj instanceof Vehicle) {
       	Vehicle vehicle = (Vehicle) obj;
       	System.out.println("Registration Number: " + vehicle.registrationNumber);
       	System.out.println("Owner Name: " + vehicle.ownerName);
       	System.out.println("Vehicle Type: " + vehicle.vehicleType);
       	System.out.println("Registration Fee: " + registrationFee);
   	}
   }

   public static void main(String[] args) {
   	Vehicle car = new Vehicle("ABC123", "John Doe", "Car");
       car.displayRegistrationDetails(car);

   	Vehicle.updateRegistrationFee(600.0);
   	Vehicle bike = new Vehicle("XYZ789", "Jane Smith", "Bike");
       bike.displayRegistrationDetails(bike);
   }
}


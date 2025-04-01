 public class Employee {
   static String companyName = "Bridgelabz";
   private static int totalEmployees = 0;

   final int id;
   String name;
   String designation;

   Employee(int id, String name, String designation) {
   	this.id = id;
   	this.name = name;
   	this.designation = designation;
   	totalEmployees++;
   }

   static void displayTotalEmployees() {
   	System.out.println("Total Employees: " + totalEmployees);
   }

   void printDetails(Object obj) {
   	if (obj instanceof Employee) {
       	Employee emp = (Employee) obj;
       	System.out.println("ID: " + emp.id);
       	System.out.println("Name: " + emp.name);
       	System.out.println("Designation: " + emp.designation);
       	System.out.println("Company: " + companyName);
       }
   }

   public static void main(String[] args) {
   	Employee emp1 = new Employee(1, "Sai Ram", "Developer");
   	Employee emp2 = new Employee(2, "Saritha", "Manager");

   	emp1.printDetails(emp1);
   	emp2.printDetails(emp2);

   	Employee.displayTotalEmployees();
   }
}
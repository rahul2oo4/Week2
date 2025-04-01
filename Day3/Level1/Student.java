public class Student {
   private static String universityName = "Default University";
   private static int totalStudents = 0;

   private final int rollNumber;
   private String name;
   private String grade;

   public Student(String name, int rollNumber, String grade) {
   	this.name = name;
   	this.rollNumber = rollNumber;
   	this.grade = grade;
   	totalStudents++;
   }

   public static void displayTotalStudents() {
   	System.out.println("Total Students: " + totalStudents);
   }

   public void displayDetails() {
   	if (this instanceof Student) {
       	System.out.println("Name: " + name);
       	System.out.println("Roll Number: " + rollNumber);
       	System.out.println("Grade: " + grade);
       	System.out.println("University: " + universityName);
   	}
   }

   public void updateGrade(String newGrade) {
   	if (this instanceof Student) {
       	this.grade = newGrade;
   	}
   }

   public static void main(String[] args) {
   	universityName = "Bridgelabz University";

   	Student student1 = new Student("Alice", 101, "A");
   	Student student2 = new Student("Bob", 102, "B");

   	student1.displayDetails();
   	student2.displayDetails();

   	student2.updateGrade("A+");
   	student2.displayDetails();

   	Student.displayTotalStudents();
   }
}


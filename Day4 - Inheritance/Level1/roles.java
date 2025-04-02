class Person {
	String name;
	int age;

	Person(String n, int a) {
    	name = n;
    	age = a;
	}
}

class Teacher extends Person {
	String sub;

	Teacher(String n, int a, String s) {
    	super(n, a);
    	sub = s;
	}

	void displayRole() {
    	System.out.println("Teacher");
	}
}

class Student extends Person {
	int grade;

	Student(String n, int a, int g) {
    	super(n, a);
    	grade = g;
	}

	void displayRole() {
    	System.out.println("Student");
	}
}

class Staff extends Person {
	String dept;

	Staff(String n, int a, String d) {
    	super(n, a);
    	dept = d;
	}

	void displayRole() {
    	System.out.println("Staff");
	}
}

public class roles {
	public static void main(String[] args) {
    	Teacher t = new Teacher("Amit", 35, "Math");
    	Student s = new Student("Ravi", 16, 10);
    	Staff st = new Staff("Neha", 40, "Admin");

    	t.displayRole();
    	s.displayRole();
    	st.displayRole();
	}
}
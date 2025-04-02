class Person {
    private String name;
    private int age;

    // Default constructor
    public Person() {}

    // Parameterized constructor
    public Person(String name, int age) {
        this.name = name;
        this.age = age;
    }

    // Copy constructor
    public Person(Person other) {
        this.name = other.name;
        this.age = other.age;
    }

    // Getters and setters
    public String getName() {
        return name;
    }

    public void setName(String name) {
        this.name = name;
    }

    public int getAge() {
        return age;
    }

    public void setAge(int age) {
        this.age = age;
    }
}

public class Main {
    public static void main(String[] args) {
        // Using default constructor
        Person person1 = new Person();
        person1.setName("Alice");
        person1.setAge(25);
        System.out.println("Person1: " + person1.getName() + ", Age: " + person1.getAge());

        // Using parameterized constructor
        Person person2 = new Person("Bob", 30);
        System.out.println("Person2: " + person2.getName() + ", Age: " + person2.getAge());

        // Using copy constructor
        Person person3 = new Person(person2);
        System.out.println("Person3: " + person3.getName() + ", Age: " + person3.getAge());
    }
}

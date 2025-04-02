public class Book {
    String title;
    int year;

    Book(String title, int year) {
        this.title = title;
        this.year = year;
    }
}

class Author extends Book {
    String name;
    String bio;

    Author(String title, int year, String name, String bio) {
        super(title, year);
        this.name = name;
        this.bio = bio;
    }

    void display() {
        System.out.println(title);
        System.out.println(year);
        System.out.println(name);
        System.out.println(bio);
    }
}

public class Book_D {
    private static String libraryName = "Central Library";
    private final String isbn;
    private String title;
    private String author;

    // Correct constructor: accepts three Strings
    public Book_D(String title, String author, String isbn) {
        this.title = title;
        this.author = author;
        this.isbn = isbn;
    }

    public static void displayLibraryName() {
        System.out.println(libraryName);
    }

    public void displayDetails() {
        System.out.println("Title: " + title);
        System.out.println("Author: " + author);
        System.out.println("ISBN: " + isbn);
    }

    public static void main(String[] args) {
        Book_D book1 = new Book_D("Java Programming", "John Doe", "123456789");
        Book_D book2 = new Book_D("Advanced Java", "Jane Smith", "987654321");

        book1.displayDetails();
        book2.displayDetails();

        displayLibraryName();
    }
}

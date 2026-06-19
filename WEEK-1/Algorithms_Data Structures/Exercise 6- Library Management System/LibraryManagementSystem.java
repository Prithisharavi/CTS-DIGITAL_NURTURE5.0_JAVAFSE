import java.util.Arrays;
import java.util.Comparator;
public class LibraryManagementSystem {
    // Linear Search
    public static Book linearSearch(Book[] books, String title) {
        for (Book book : books) {
            if (book.title.equalsIgnoreCase(title)) {
                return book;
            }
        }
        return null;
    }
    // Binary Search
    public static Book binarySearch(Book[] books, String title) {

        int low = 0;
        int high = books.length - 1;

        while (low <= high) {

            int mid = (low + high) / 2;

            int result =
                    books[mid].title.compareToIgnoreCase(title);

            if (result == 0) {
                return books[mid];
            } else if (result < 0) {
                low = mid + 1;
            } else {
                high = mid - 1;
            }
        }
        return null;
    }
    public static void main(String[] args) {
        Book[] books = {
                new Book(101, "Java Programming", "James Gosling"),
                new Book(102, "Python Basics", "Guido Van Rossum"),
                new Book(103, "Data Structures", "Mark Allen"),
                new Book(104, "Algorithms", "Thomas Cormen")
        };
        System.out.println("LINEAR SEARCH");
        Book foundBook =
                linearSearch(books, "Python Basics");
        if (foundBook != null) {
            foundBook.display();
        } else {
            System.out.println("Book Not Found");
        }
        Arrays.sort(books,
                Comparator.comparing(book -> book.title));
        System.out.println("\nBINARY SEARCH");
        foundBook =
                binarySearch(books, "Java Programming");
        if (foundBook != null) {
            foundBook.display();
        } else {
            System.out.println("Book Not Found");
        }
    }
}
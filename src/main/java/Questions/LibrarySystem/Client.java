package Questions.LibrarySystem;

import java.util.HashMap;
import java.util.Map;

public class Client {
    public static void main(String[] args) {
        Librarian librarian = new Librarian("L1", "Admin");
        Member member = new Member("Alice@gmail.com", "Alice");
        Rack rack = new Rack("1234", 12);
        Rack rack2 = new Rack("123", 11);
        BookItem book1 = new BookItem("Clean Code", "hkhwekg", "Robert Martin", "123", member, rack);
        BookItem book2 = new BookItem("Alice in Wonderland", "hkhwekg", "Alice", "124", member, rack2);
        BookItem book3 = new BookItem("Wuthering Heights", "hkhwekg", "Emily Bronte", "123234", member, rack2);


        librarian.addBook(book1);
        librarian.addBook(book2);
        librarian.addBook(book3);


        librarian.issueBook(book1, member);
        librarian.issueBook(book3, member);


        librarian.returnBook(book1, member);

    }
}

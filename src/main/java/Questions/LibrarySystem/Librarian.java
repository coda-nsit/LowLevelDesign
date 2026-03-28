package Questions.LibrarySystem;

import java.util.*;

public class Librarian extends User{
    Map<String, BookItem> inventory = new HashMap<>();

    public Librarian(String userId, String name) {
        super(userId, name);
    }

    public void addBook(BookItem book) {
        inventory.put(book.getTitle(), book);
        System.out.println("Book added: " + book.getTitle());
    }

    public void removeBook(BookItem book) {
        inventory.remove(book);
        System.out.println("Book removed: " + book.getTitle());
    }

    public Map<String, BookItem> getInventory() {
        return inventory;
    }

    public void issueBook(BookItem book, Member member) {
        if (inventory.containsKey(book.getTitle())){
            member.borrowBook(book);
        }else{
            System.out.println("There is no book with the name " + book.getTitle() + " in the inventory");
        }
    }

    public void returnBook(BookItem book, Member member) {
        member.returnBook(book);
    }


}

package Questions.LibrarySystem;

import java.util.ArrayList;
import java.util.List;

public class Member extends User{

    List<BookItem> borrowedBooks = new ArrayList<>();

    public Member(String email, String name){
        super(email, name);
    }

    public void borrowBook(BookItem book){
        book.issueBookDetails(this);
    }

    public void returnBook(BookItem book) {
        book.returnBook(this);
    }

    public void addBorrowedBook(BookItem book){
        borrowedBooks.add(book);
    }

    public void removeBorrowedBook(BookItem book){
        borrowedBooks.remove(book);
    }


}

package Questions.LibrarySystem;

import java.util.Date;
import java.util.Map;

public class IssueState implements BookState{
    @Override
    public void issueBook(BookItem book, Member member) {
        System.out.println("Book is already issued to " + member.getName());
    }

    @Override
    public void returnBook(BookItem book, Member member) {
        if (book.getBorrower() != member) {
            System.out.println("This member did not borrow the book");
            return;
        }
        Date today = new Date();
        Date dueDate = book.getDueDate();
        if (dueDate.before(today)) {
            System.out.println("This member is returning book late and will be charged extra money");
        }
        System.out.println("Book " + book.getTitle() + " is returned by " + member.getName());
        book.setBookState(new AvailableState());
        member.removeBorrowedBook(book);
        book.setBorrower(null);
    }

    @Override
    public String getState() {
        return "ISSUED STATE";
    }
}

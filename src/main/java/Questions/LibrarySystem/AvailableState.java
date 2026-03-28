package Questions.LibrarySystem;

import java.util.List;
import java.util.Map;

public class AvailableState implements BookState {

    @Override
    public void issueBook(BookItem book, Member member) {
            book.setBookState(new IssueState());
            member.addBorrowedBook(book);
            book.setBorrower(member);
            System.out.println("Book " + book.getTitle() + " issued to " + member.getName());
    }

    @Override
    public void returnBook(BookItem book, Member member) {
        System.out.println("Book is not  issued");
    }

    @Override
    public String getState() {
        return "AVAILABLE";
    }


}

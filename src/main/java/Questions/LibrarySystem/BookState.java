package Questions.LibrarySystem;

import java.util.Map;

public interface BookState {

    void issueBook(BookItem book, Member member);
    void returnBook(BookItem book, Member member);
    String getState();
}

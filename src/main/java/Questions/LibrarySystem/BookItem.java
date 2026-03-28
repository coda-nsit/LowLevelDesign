package Questions.LibrarySystem;

import java.util.Calendar;
import java.util.Date;
import java.util.Map;

public class BookItem extends Book{
    String barcode;
    BookState bookState;
    Member borrower;
    Rack rack;

    Date issueDate;
    Date dueDate;

    public BookItem(String title, String barcode, String author, String isbn, Member borrower, Rack rack) {
        super(title, author, isbn);
        this.barcode = barcode;
        this.borrower = borrower;
        this.rack = rack;
        this.bookState = new AvailableState();
    }

    public void setBookState(BookState bookState){
        this.bookState = bookState;
    }

    public void issueBookDetails(Member member){
        Date now = new Date();
        Calendar cal = Calendar.getInstance();
        cal.setTime(now);
        cal.add(Calendar.DATE, 14);
        Date returnDate = cal.getTime();
        bookState.issueBook(this, member);

        this.issueDate = now;
        this.dueDate = returnDate;
    }

    public void returnBook(Member member) {
        bookState.returnBook(this, member);
    }

    public void setBorrower(Member borrower) {
        this.borrower = borrower;
    }

    public Member getBorrower() {
        return borrower;
    }

    public String getState() {
        return bookState.getState();
    }

    public Date getIssueDate() {
        return issueDate;
    }

    public Date getDueDate() {
        return dueDate;
    }



}

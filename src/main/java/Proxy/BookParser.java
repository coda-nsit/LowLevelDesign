package Proxy;

public class BookParser implements IBookParser {
    private int numberOfPages = 23;
    private Book book;
    BookParser(Book book) {
        // expensive code.
        this.book = book;
    }

    public int getNumberOfPages() {
        // cheap code. If this function is never called in Client class
        // what's the point in creating the BookParser class.
        return numberOfPages;
    }
}

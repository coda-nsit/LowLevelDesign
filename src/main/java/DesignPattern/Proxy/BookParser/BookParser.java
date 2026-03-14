package Proxy.BookParser;

import lombok.Getter;

public class BookParser implements IBookParser {
    // cheap code. If this function is never called in Client class
    // what's the point in creating the BookParser class.
    @Getter
    private int numberOfPages = 23;
    private Book book;
    BookParser(Book book) {
        // expensive code.
        this.book = book;
    }

}

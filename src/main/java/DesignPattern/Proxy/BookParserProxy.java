package Proxy;

public class BookParserProxy implements IBookParser {

    private BookParser bookParser = null;
    private Book book;

    BookParserProxy(Book book) {
        this.book = book;
    }

    @Override
    public int getNumberOfPages() {
        if (bookParser == null) {
            bookParser = new BookParser(book);
        }
        return bookParser.getNumberOfPages();
    }
}

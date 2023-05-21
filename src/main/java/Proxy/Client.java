package Proxy;

public class Client {
    public static void main(String[] args) {
        BookParserProxy bookParserProxy = new BookParserProxy(new Book());
        System.out.println(bookParserProxy.getNumberOfPages());
    }
}

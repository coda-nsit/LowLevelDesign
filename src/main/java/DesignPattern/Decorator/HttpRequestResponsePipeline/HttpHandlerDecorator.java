package DesignPattern.Decorator.HttpRequestResponsePipeline;

public abstract class HttpHandlerDecorator implements HttpHandler {
    protected final HttpHandler next;

    protected HttpHandlerDecorator(HttpHandler next) {
        this.next = next;
    }

    @Override
    public HttpResponse handle(HttpRequest request) {
        return next.handle(request);
    }
}


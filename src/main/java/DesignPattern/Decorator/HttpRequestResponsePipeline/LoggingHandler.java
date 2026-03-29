package DesignPattern.Decorator.HttpRequestResponsePipeline;

public class LoggingHandler extends HttpHandlerDecorator {

    public LoggingHandler(HttpHandler next) {
        super(next);
    }

    @Override
    public HttpResponse handle(HttpRequest request) {
        System.out.println("Incoming: " + request.path());
        HttpResponse response = super.handle(request);
        System.out.println("Outgoing: " + response.statusCode());
        return response;
    }
}

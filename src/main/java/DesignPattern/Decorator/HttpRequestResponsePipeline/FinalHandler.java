package DesignPattern.Decorator.HttpRequestResponsePipeline;

public class FinalHandler implements HttpHandler {

    @Override
    public HttpResponse handle(HttpRequest request) {
        return new HttpResponse(200, "Hello from " + request.path());
    }
}

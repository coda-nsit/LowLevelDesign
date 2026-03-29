package DesignPattern.Decorator.HttpRequestResponsePipeline;

public interface HttpHandler {
    HttpResponse handle(HttpRequest request);
}

package DesignPattern.Decorator.HttpRequestResponsePipeline;

public class CompressionHandler extends HttpHandlerDecorator {

    public CompressionHandler(HttpHandler next) {
        super(next);
    }

    @Override
    public HttpResponse handle(HttpRequest request) {
        HttpResponse response = super.handle(request);
        return new HttpResponse(
                response.statusCode(),
                "[compressed]" + response.body()
        );
    }
}


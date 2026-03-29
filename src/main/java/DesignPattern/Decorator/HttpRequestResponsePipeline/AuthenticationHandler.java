package DesignPattern.Decorator.HttpRequestResponsePipeline;

public class AuthenticationHandler extends HttpHandlerDecorator {

    public AuthenticationHandler(HttpHandler next) {
        super(next);
    }

    @Override
    public HttpResponse handle(HttpRequest request) {
        if (request.path().startsWith("/secure") &&
                !request.body().contains("token")) {
            return new HttpResponse(401, "Unauthorized");
        }

        return super.handle(request);
    }
}

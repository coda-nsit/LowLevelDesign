package DesignPattern.Decorator.HttpRequestResponsePipeline;

public class Main {
    public static void main(String[] args) {

        // Build pipeline step by step
        HttpHandler httpHandler = new FinalHandler();
        httpHandler = new CompressionHandler(httpHandler);
        httpHandler = new AuthenticationHandler(httpHandler);
        httpHandler = new LoggingHandler(httpHandler);

        // Execute
        HttpRequest request = new HttpRequest("/secure/data", "token=abc123");
        HttpResponse response = httpHandler.handle(request);

        System.out.println("Final response: " + response.body());
    }
}




package DesignPattern.Decorator.HttpRequestResponsePipeline;

public class PipelineBuilder {

    private boolean useLogging;
    private boolean useAuthentication;
    private boolean useCompression;
    private HttpHandler terminal;

    public PipelineBuilder withLogging() {
        this.useLogging = true;
        return this;
    }

    public PipelineBuilder withAuthentication() {
        this.useAuthentication = true;
        return this;
    }

    public PipelineBuilder withCompression() {
        this.useCompression = true;
        return this;
    }

    public PipelineBuilder withTerminal(HttpHandler terminal) {
        this.terminal = terminal;
        return this;
    }

    public HttpHandler build() {
        if (terminal == null) {
            throw new IllegalStateException("Terminal handler must be set.");
        }

        HttpHandler handler = terminal;

        // Apply decorators in reverse order of execution
        if (useCompression) {
            handler = new CompressionHandler(handler);
        }
        if (useAuthentication) {
            handler = new AuthenticationHandler(handler);
        }
        if (useLogging) {
            handler = new LoggingHandler(handler);
        }

        return handler;
    }
}



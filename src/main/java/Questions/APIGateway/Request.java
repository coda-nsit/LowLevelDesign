package Questions.APIGateway;

public class Request {
    private String endpoint;
    private String token;
    private String payload;

    public Request(String endpoint, String token, String payload) {
        this.endpoint = endpoint;
        this.token = token;
        this.payload = payload;
    }

    public String getEndpoint() {
        return endpoint;
    }

    public String getToken() {
        return token;
    }

    public String getPayload() {
        return payload;
    }
}

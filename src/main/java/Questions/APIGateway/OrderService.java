package Questions.APIGateway;

public class OrderService implements Service{
    @Override
    public String handleRequest(Request request) {
        return "Order Service is handling request : " + request.getPayload();
    }
}

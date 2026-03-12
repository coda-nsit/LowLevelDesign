package Questions.APIGateway;

import java.util.HashMap;
import java.util.Map;

public class Client {
    public static void main(String[] args) {

        AuthorizationService authorizationService = new AuthorizationService();
        Map<String, Service> serviceRegistry  = new HashMap<>();
        serviceRegistry.put("/users", new UserService());
        serviceRegistry.put("/orders", new OrderService());
        Request request1 = new Request("/users", "valid-token", "Get all users");
        Service proxy = new ApiGatewayProxy(authorizationService, serviceRegistry);
        System.out.println(proxy.handleRequest(request1));

        Request request2 = new Request("/orders", "valid-token", "Get all orders");
        System.out.println(proxy.handleRequest(request2));

        Request request3 = new Request("/orders", "validtoken", "Get all orders");
        Service proxy1 = new ApiGatewayProxy(authorizationService, serviceRegistry);
        System.out.println(proxy1.handleRequest(request3));

        Request request4 = new Request("/order", "valid-token", "Get all orders");
        Service proxy2 = new ApiGatewayProxy(authorizationService, serviceRegistry);
        System.out.println(proxy2.handleRequest(request4));
    }
}

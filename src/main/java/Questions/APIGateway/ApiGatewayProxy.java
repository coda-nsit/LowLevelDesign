package Questions.APIGateway;

import javax.imageio.spi.ServiceRegistry;
import java.util.HashMap;
import java.util.Map;

public class ApiGatewayProxy implements Service{

    private AuthorizationService authorizationService;
    private Map<String, Service> serviceRegistry ;

    public ApiGatewayProxy(AuthorizationService authorizationService, Map<String, Service> serviceRegistry) {
        this.authorizationService = authorizationService;
        this.serviceRegistry = serviceRegistry;
    }

    @Override
    public String handleRequest(Request request) {
        if(!authorizationService.validateToken(request.getToken())) {
            return "Token is not valid";
        }
        Service service = serviceRegistry.get(request.getEndpoint());
        if(service == null) {
            return "Service not found";
        }
        return service.handleRequest(request);
    }
}

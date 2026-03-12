package Questions.APIGateway;

public class UserService implements Service{
    @Override
    public String handleRequest(Request request) {
        return "User Service is handling request with payload " +  request.getPayload();
    }
}

package Questions.APIGateway;

public class AuthorizationService {
    public boolean validateToken(String token) {
        return token.equals("valid-token");
    }
}

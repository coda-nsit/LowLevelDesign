package Adapter;

public class Client implements IClient {
    @Override
    public String fetchUserName(String userId) {
        IAdapter adapter = new Adapter();
        return adapter.getUserNameFromDbWithinAge("12345");
    }
}

package Adapter;

public class Adapter implements IAdapter {
    @Override
    public String getUserNameFromDbWithinAge(String userId) {
        IService service = new Service();
        return service.getUserNameFromDbWithinAge(userId, 30);

    }
}

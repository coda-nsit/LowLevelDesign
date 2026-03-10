package Adapter;

public class Service implements IService {
    @Override
    public String getUserNameFromDbWithinAge(String userId, int age) {
        return "Rishab Banerjee";
    }
}

package ProxyBaishali;

public class LabDoor implements IDoor{
    @Override
    public void openDoor(String password) {
       System.out.println("Opening Lab door") ;
    }
    @Override
    public void closeDoor() {
        System.out.println("Closing Lab door");
    }
}

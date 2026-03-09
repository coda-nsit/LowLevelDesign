package ProxyBaishali;

public class Main {
    public static void main(String[] args) {

        IDoor door = new SecuredDoorProxy(new LabDoor());
        door.openDoor("Invalid");
        door.openDoor("admin");
        door.closeDoor();

    }
}

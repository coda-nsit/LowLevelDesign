package ProxyBaishali;

public class SecuredDoorProxy implements IDoor{
    private IDoor door;
    public SecuredDoorProxy(IDoor door){
        this.door = door;
    }

    @Override
    public void openDoor(String password) {
        System.out.println("Opening Secured Lab door with password: ");
        if (authenticate(password)){
            door.openDoor(password);
        }else{
            System.out.println("Invalid password !!!!!!!!!!!! We can't open the door");
        }
    }
    @Override
    public void closeDoor() {
        door.closeDoor();
    }

    public boolean authenticate(String password) {
        if (password.equals("admin")) return true;
        else return false;
    }
}

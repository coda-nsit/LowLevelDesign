package Strategy;

public class SlowFly implements IFlyStrategy {
    @Override
    public void fly() {
        System.out.println("I am a slow flyer");;
    }
}

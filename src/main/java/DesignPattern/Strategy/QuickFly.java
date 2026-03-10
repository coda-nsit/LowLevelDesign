package Strategy;

public class QuickFly implements IFlyStrategy {
    @Override
    public void fly() {
        System.out.println("I am a quick flyer");
    }
}

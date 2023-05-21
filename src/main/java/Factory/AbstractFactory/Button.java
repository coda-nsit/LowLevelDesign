package Factory.AbstractFactory;

public class Button {
    private int width;
    private int height;
    private String color;

    public Button(int height, int width, String color) {
        this.width = width;
        this.height = height;
        this.color = color;
    }
}

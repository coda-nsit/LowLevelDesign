package Factory.AbstractFactory;

public class UiFactoryLinux implements IUiFactory {
    @Override
    public Button getButton()
    {
        System.out.println("Linux button created");
        return new Button(Constants.LINUX_BUTTON_HEIGHT, Constants.LINUX_BUTTON_WIDTH, Constants.LINUX_BUTTON_COLOR);
    }

    @Override
    public Header getHeader()
    {
        System.out.println("Linux header created");
        return new Header(Constants.LINUX_HEADER_HEIGHT, Constants.LINUX_HEADER_WIDTH, Constants.LINUX_HEADER_CONTENT);
    }
}
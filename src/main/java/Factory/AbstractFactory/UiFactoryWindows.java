package Factory.AbstractFactory;

public class UiFactoryWindows implements IUiFactory {
    @Override
    public Button getButton()
    {
        System.out.println("Windows button created");
        return new Button(Constants.WINDOWS_BUTTON_HEIGHT, Constants.WINDOWS_BUTTON_WIDTH, Constants.WINDOWS_BUTTON_COLOR);
    }

    @Override
    public Header getHeader()
    {
        System.out.println("Windows header created");
        return new Header(Constants.WINDOWS_HEADER_HEIGHT, Constants.WINDOWS_HEADER_WIDTH, Constants.WINDOWS_HEADER_CONTENT);
    }
}

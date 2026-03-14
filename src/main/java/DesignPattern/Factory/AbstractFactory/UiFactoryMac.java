package Factory.AbstractFactory;

public class UiFactoryMac implements IUiFactory {
    @Override
    public Button getButton()
    {
        System.out.println("Mac button created");
        return new Button(Constants.MAC_BUTTON_HEIGHT, Constants.MAC_BUTTON_WIDTH, Constants.MAC_BUTTON_COLOR);
    }

    @Override
    public Header getHeader()
    {
        System.out.println("Mac header created");
        return new Header(Constants.MAC_HEADER_HEIGHT, Constants.MAC_HEADER_WIDTH, Constants.MAC_HEADER_CONTENT);
    }
}

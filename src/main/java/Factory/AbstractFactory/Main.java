package Factory.AbstractFactory;

import java.util.Scanner;

public class Main {
    public static void main(String[] args)
    {
        Scanner scanner = new Scanner(System.in);
        System.out.print("What's your OS?: [Linux, Mac, Windows] ");
        final String os = scanner.next();
        IUiFactory uiFactory;
        // Why is there an object creation logic here? Shouldn't this be handled by the Factory itself?
        switch (os)
        {
            case "Linux":
                uiFactory = new UiFactoryLinux();
                break;
            case "Windows":
                uiFactory = new UiFactoryWindows();
                break;
            default:
                uiFactory = new UiFactoryMac();
                break;
        }
        uiFactory.getButton();
        uiFactory.getHeader();
    }
}

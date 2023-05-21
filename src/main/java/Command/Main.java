package Command;

public class Main
{
    public static void main(String[] args)
    {
        Remote remote = new Remote();

        Light light = new Light();
        ICommand command = new LightCommand(light);

        command.sendCommand();
        command.unSendCommand();
    }
}

package Command;

public class LightCommand implements ICommand
{
    private Light light;

    // DI Light into the command as the command is sent to the Light.
    public LightCommand(Light light)
    {
        this.light = light;
    }

    @Override
    public void sendCommand()
    {
        light.turnOnLight();
    }

    @Override
    public void unSendCommand()
    {
        light.turnOffLight();
    }
}

package Command.Commands;

import Command.Commands.ICommand;
import Command.Hardware.Light;
import lombok.AllArgsConstructor;

@AllArgsConstructor
public class LightOnCommand implements ICommand
{
    private Light light;
    @Override
    public void execute() {
        this.light.turnOnLight();
    }
}

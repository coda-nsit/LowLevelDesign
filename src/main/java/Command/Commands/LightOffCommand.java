package Command.Commands;

import Command.Commands.ICommand;
import Command.Hardware.Light;
import lombok.AllArgsConstructor;

@AllArgsConstructor
public class LightOffCommand implements ICommand {
    private Light light;

    @Override
    public void execute() {
        this.light.turnOffLight();
    }
}

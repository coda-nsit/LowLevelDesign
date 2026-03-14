package Command.Commands;

import Command.Commands.ICommand;
import Command.Hardware.Thermostat;
import lombok.AllArgsConstructor;

@AllArgsConstructor
public class TemperatureDecreaseCommand implements ICommand {
    Thermostat thermostat;

    @Override
    public void execute() {
        this.thermostat.decreaseTemperature();
    }
}

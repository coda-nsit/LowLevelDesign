package Command.Commands;

import Command.Commands.ICommand;
import Command.Hardware.Thermostat;
import lombok.AllArgsConstructor;

@AllArgsConstructor
public class TemperatureIncreaseCommand implements ICommand {
    private Thermostat thermostat;

    @Override
    public void execute() {
        this.thermostat.increaseTemperature();
    }
}

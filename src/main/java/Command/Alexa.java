package Command;

import Command.Commands.ICommand;

import java.util.HashMap;
import java.util.Map;

// Alexa is like the remote used by Christopher Okhravi
public class Alexa
{
    Map<String, ICommand> commands;

    Alexa() {
        commands = new HashMap<>();
    }

    // Program the Alexa that when human says commandName, the command should get executed
    public void setCommand(String commandName, ICommand command) {
        commands.put(commandName, command);
    }

    // Execute the actual command
    public void executeCommand(String commandNameToExecute) {
        commands.get(commandNameToExecute).execute();
    }
}

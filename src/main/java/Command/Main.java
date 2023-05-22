package Command;

import Command.Commands.*;
import Command.Hardware.Light;
import Command.Hardware.MusicPlayer;
import Command.Hardware.Thermostat;

public class Main
{
    public static void main(String[] args)
    {
        // Initialize the remote
        Alexa alexa = new Alexa();

        // Initialize the devices which we want to send command to and their commands
        Light light = new Light();
        ICommand lightOnCommand = new LightOnCommand(light);
        ICommand lightOffCommand = new LightOffCommand(light);

        Thermostat thermostat = new Thermostat();
        ICommand temperatureDecreaseCommand = new TemperatureDecreaseCommand(thermostat);
        ICommand temperatureIncreaseCommand = new TemperatureIncreaseCommand(thermostat);

        MusicPlayer musicPlayer = new MusicPlayer();
        ICommand startMusicCommand = new StartMusicCommand(musicPlayer);
        ICommand stopMusicCommand = new StopMusicCommand(musicPlayer);
        ICommand pauseMusicCommand = new PauseMusicCommand(musicPlayer);
        ICommand nextSongCommand = new NextSongCommand(musicPlayer);

        // Program Alexa
        alexa.setCommand("Alexa, turn Bedroom on", lightOnCommand);
        alexa.setCommand("Alexa, turn Bedroom off", lightOffCommand);
        alexa.setCommand("Alexa, decrease temperature", temperatureDecreaseCommand);
        alexa.setCommand("Alexa, increase temperature", temperatureIncreaseCommand);
        alexa.setCommand("Alexa, start playing music", startMusicCommand);
        alexa.setCommand("Alexa, stop playing music", stopMusicCommand);
        alexa.setCommand("Alexa, pause playing music", pauseMusicCommand);
        alexa.setCommand("Alexa, play next song", nextSongCommand);

        // Execute the commands
        alexa.executeCommand("Alexa, turn Bedroom on");
        alexa.executeCommand("Alexa, turn Bedroom off");
        alexa.executeCommand("Alexa, decrease temperature");
        alexa.executeCommand("Alexa, increase temperature");
        alexa.executeCommand("Alexa, start playing music");
        alexa.executeCommand("Alexa, stop playing music");
        alexa.executeCommand("Alexa, pause playing music");
        alexa.executeCommand("Alexa, play next song");
    }
}

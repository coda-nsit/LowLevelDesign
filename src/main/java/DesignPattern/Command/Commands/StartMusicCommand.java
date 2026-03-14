package Command.Commands;

import Command.Hardware.MusicPlayer;
import lombok.AllArgsConstructor;

@AllArgsConstructor
public class StartMusicCommand implements ICommand {
    private MusicPlayer musicPlayer;

    @Override
    public void execute() {
        musicPlayer.startMusic();
    }
}

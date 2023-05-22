package Command.Commands;

import Command.Hardware.MusicPlayer;
import lombok.AllArgsConstructor;

@AllArgsConstructor
public class NextSongCommand implements ICommand {
    private MusicPlayer musicPlayer;

    @Override
    public void execute() {
        this.musicPlayer.nextSong();
    }
}

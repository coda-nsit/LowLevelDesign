package DesignPattern.State.MusicPlayer;

public class Client {
    public static void main(String[] args) {
        IMusicPlayer musicPlayer = MusicPlayer.getInstance();

        // initially the music player is in stop state
        musicPlayer.setState(new StopState());

        // play it
        musicPlayer.pressPlay();
        // pause it
        musicPlayer.pressPause();
        // stop it
        musicPlayer.pressStop();
    }
}

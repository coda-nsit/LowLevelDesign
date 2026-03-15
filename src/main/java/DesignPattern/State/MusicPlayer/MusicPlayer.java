package DesignPattern.State.MusicPlayer;

public class MusicPlayer implements IMusicPlayer {

    private IState currentState;
    private static MusicPlayer musicPlayer;

    private MusicPlayer() { }

    public static MusicPlayer getInstance() {
        if (musicPlayer == null) {
            musicPlayer = new MusicPlayer();
        }
        return musicPlayer;
    }

    @Override
    public void pressPlay() {
        currentState.play();
    }

    @Override
    public void pressPause() {
        currentState.pause();
    }

    @Override
    public void pressStop() {
        currentState.stop();
    }

    @Override
    public void setState(IState state) {
        currentState = state;
    }
}

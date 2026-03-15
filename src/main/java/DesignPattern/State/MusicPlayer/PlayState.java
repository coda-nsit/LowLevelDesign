package DesignPattern.State.MusicPlayer;

public class PlayState implements IState {

    public PlayState() { }

    @Override
    public void play() {
        System.out.println("Already playing music.");
    }

    @Override
    public void pause() {
        System.out.println("Going to PauseState from PlayState");
        MusicPlayer.getInstance().setState(new PauseState());
    }

    @Override
    public void stop() {
        System.out.println("Going to StopState from PlayState");
        MusicPlayer.getInstance().setState(new StopState());
    }

}

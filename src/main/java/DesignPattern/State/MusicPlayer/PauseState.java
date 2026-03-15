package DesignPattern.State.MusicPlayer;

public class PauseState implements IState {
    @Override
    public void play() {
        System.out.println("Going to StopState from PlayState");
        MusicPlayer.getInstance().setState(new PlayState());
    }

    @Override
    public void pause() {
        System.out.println("Already in pause state.");
    }

    @Override
    public void stop() {
        System.out.println("Going to StopState from PauseState");
        MusicPlayer.getInstance().setState(new StopState());
    }
}

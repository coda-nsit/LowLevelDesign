package DesignPattern.State.MusicPlayer;

public class StopState implements IState {
    @Override
    public void play() {
        System.out.println("Going to PlayState from StopState");
        MusicPlayer.getInstance().setState(new PlayState());
    }

    @Override
    public void pause() {
        System.out.println("Going to PauseState from StopState");
        MusicPlayer.getInstance().setState(new PauseState());
    }

    @Override
    public void stop() {
        System.out.println("Already in StopState.");
    }
}

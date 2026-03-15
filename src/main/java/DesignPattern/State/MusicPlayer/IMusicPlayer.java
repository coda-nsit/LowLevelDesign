package DesignPattern.State.MusicPlayer;

public interface IMusicPlayer {
    public void pressPlay();
    public void pressPause();
    public void pressStop();

    public void setState(IState state);
}

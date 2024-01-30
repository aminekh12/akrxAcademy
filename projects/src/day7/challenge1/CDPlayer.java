package day7.challenge1;

public class CDPlayer extends AudioPlayer{
    @Override
    public void play() {
        System.out.println("playing CD");
    }

    @Override
    public void pause() {
        System.out.println("pausing CD");
    }

    @Override
    public void stop() {
        System.out.println("stopping CD");
    }
}

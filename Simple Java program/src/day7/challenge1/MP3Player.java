package day7.challenge1;

public class MP3Player extends AudioPlayer{
    @Override
    public void play() {
        System.out.println("playing MP3");
    }

    @Override
    public void pause() {
        System.out.println("pausing MP3");
    }

    @Override
    public void stop() {
        System.out.println("stopping MP3");
    }
}

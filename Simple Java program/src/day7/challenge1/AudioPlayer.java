package day7.challenge1;

public abstract class AudioPlayer implements Playable {
    private int volume;
    public void volumeUp(){
        volume+=1;
    }
    public void volumeDown(){
        volume+=1;
    }
    public void mute(){
        System.out.println("muted");
        volume=0;
    }
    public void currentVolume(){
        System.out.println("current volume is : "+volume);
    }

}

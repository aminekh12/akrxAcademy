package day7.challenge1;

public class PlayerMain {
    public static void main(String[] args) {
        MP3Player mp3Player = new MP3Player();
        CDPlayer cdPlayer = new CDPlayer();
//
        /*mp3Player.play();
        mp3Player.volumeUp();
        mp3Player.pause();
        mp3Player.volumeDown();
        mp3Player.currentVolume();
        mp3Player.mute();
        mp3Player.currentVolume();
        mp3Player.stop();
//
        cdPlayer.play();
        cdPlayer.volumeUp();
        cdPlayer.pause();
        cdPlayer.volumeDown();
        cdPlayer.currentVolume();
        cdPlayer.mute();
        mp3Player.currentVolume();
        cdPlayer.stop();*/
        MusicLibrary musicLibrary = new MusicLibrary();
        musicLibrary.addTrack(mp3Player);
        musicLibrary.addTrack(cdPlayer);


        musicLibrary.playTrack(0);  // Playing MP3 file
        musicLibrary.pauseTrack(1);  // Pausing CD
        musicLibrary.stopTrack(0);   // Stopping MP3 file

    }
}

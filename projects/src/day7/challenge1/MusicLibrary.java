package day7.challenge1;

import java.util.ArrayList;
import java.util.List;

public class MusicLibrary {

    private List<Playable> tracks = new ArrayList<>();
    public void addTrack(Playable track){
        tracks.add(track);
    }
    void playTrack(int trackIndex) {
        Playable track = tracks.get(trackIndex);
        track.play();
    }

    void pauseTrack(int trackIndex) {
        Playable track = tracks.get(trackIndex);
        track.pause();
    }

    void stopTrack(int trackIndex) {
        Playable track = tracks.get(trackIndex);
        track.stop();
    }
}

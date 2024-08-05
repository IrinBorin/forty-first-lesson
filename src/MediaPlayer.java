import java.util.ArrayList;
import java.util.List;

public class MediaPlayer {
    List<Playable> playlist = new ArrayList<Playable>();
    public void add(Playable... files){
        for (int i = 0; i < files.length ; i++) {
            playlist.add(files[i]);
        }
    }
    public void addToQueue(List<Playable> queue) {
        for (int i = 0; i < queue.size(); i++) {
            Playable file = queue.get(i);
            file.printInfo();
            file.play();
        }
    }
    public void play(){
        for (int i = 0; i < playlist.size(); i++) {
            Playable playable = playlist.get(i);
            playable.printInfo();
            playable.play();

        }
    }
}

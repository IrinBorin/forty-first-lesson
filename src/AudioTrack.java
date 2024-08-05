public class AudioTrack implements Playable{
    final String title;
    final String artist;
    @Override
    public void play() {
        System.out.println("Playing an audio track");
    }

    @Override
    public void printInfo() {
        System.out.println("Now playing " + title + " by " + artist );
    }

    public AudioTrack(String title, String artist) {
    this.title= title;
    this.artist = artist;
    }
}

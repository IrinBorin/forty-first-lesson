public class Main {
    public static void main(String[] args) {
        MediaPlayer mediaPlayer = new MediaPlayer();
        Playable song = new AudioTrack("Have a drink on me", "ACDC");
        Playable movie = new Video ("Romeo and Juliet", "Luhmann");
        mediaPlayer.add(song);
        mediaPlayer.add(movie);
        mediaPlayer.play();
    }
}

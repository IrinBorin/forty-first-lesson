public class Video implements Playable{
    final String title;
    final String director;

    public Video(String title, String director) {
        this.title = title;
        this.director = director;
    }

    @Override
    public void play() {
        System.out.println("Playing a video");
    }

    @Override
    public void printInfo() {
        System.out.println("Now playing " + title + " directed by " + director);
    }
}

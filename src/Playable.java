public interface Playable {
     void play();

    default void printInfo() {
        System.out.println("Now playing") ;
    }
}

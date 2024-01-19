package HMWK2;

public class MusicPlayerTester {
    public static void main(String[] args) {
        MusicPlayer[] arr = {new MP3Player("10", "high"),
                new CDPlayer("2", "low"),
                new StreamingPlayer("5", "medium")};
        for (MusicPlayer mp : arr) {
            mp.play();
            mp.pause();
            mp.stop();
        }
    }
}

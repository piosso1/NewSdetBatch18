package HMWK2;

/*
Task1) Music Player System: Create a class MusicPlayer with methods
like play(), pause(), stop(), and fields such as currentTrack and volume.
Implement subclasses for different types of music players,
like MP3Player, CDPlayer, and StreamingPlayer, each with
their unique implementations of the play() method
(e.g., streaming from the internet, playing from a CD).
 */
public abstract class MusicPlayer {

    private String CurrentTrack;
    private  String Volume;

    public MusicPlayer(String CurrentTrack, String Volume){
        this.CurrentTrack = CurrentTrack;
        this.Volume = Volume;
    }
        public abstract void play();
    public  void pause(){
        System.out.println("Pause track "+CurrentTrack+" of that album it so loud");
        System.out.println("------------------------------");
    }
    public  void  stop(){
        System.out.println("Stop playing music from my MP3Player because the volume is "+Volume);
    }
    }
    class MP3Player extends MusicPlayer{

        public MP3Player (String CurrentTrack, String Volume) {
            super(CurrentTrack, Volume);
        }
        @Override
        public void play() {
            System.out.println("Play music from my mp3player");
            System.out.println("------------------------------");
        }
    }

    class CDPlayer extends MusicPlayer{

    public CDPlayer (String CurrentTrack, String Volume){
        super(CurrentTrack, Volume);
    }
        @Override
        public void play() {
            System.out.println("play music from my cdplayer");
            System.out.println("------------------------------");
        }
    }
    class  StreamingPlayer extends MusicPlayer{

    public StreamingPlayer(String CurrentTrack, String Volume){
        super(CurrentTrack, Volume);
    }

        @Override
        public void play() {
            System.out.println("play music from streaming platform on the internet");
            System.out.println("------------------------------");
        }
    }


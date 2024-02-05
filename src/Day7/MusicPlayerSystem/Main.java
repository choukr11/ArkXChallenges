package Day7.MusicPlayerSystem;

public class Main {
    public static void main(String[] args) {
        System.out.println("Music Player System.");

        MusicLibrary musicLibrary= new MusicLibrary();
        musicLibrary.addTrack();
        musicLibrary.displayTrackList();

        AudioPlayer.MP3Player mp3Player = new AudioPlayer.MP3Player(80,"My Darling - Eminem");
        AudioPlayer.CDPlayer cdPlayer = new AudioPlayer.CDPlayer(50,"Evil Twin - Eminem");
        mp3Player.play();
        cdPlayer.play();

        mp3Player.stop();
        cdPlayer.stop();







    }
}
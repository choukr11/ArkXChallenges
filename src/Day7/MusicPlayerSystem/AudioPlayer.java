package Day7.MusicPlayerSystem;

public abstract class AudioPlayer  implements Playable {
    private int volume;
    public AudioPlayer(int volume) {
        this.volume = volume;
    }
    public void setVolume(int volume){
        this.volume=volume;
        System.out.println("Volume set to: " +volume);
    }
    public int getVolume(){
        return volume;
    }
    public static class MP3Player extends AudioPlayer{
        private final String trackName;
        public MP3Player(int volume, String trackName){
            super(volume);
            this.trackName=trackName;
        }
        @Override
        public void play() {
            System.out.println("Playing MP3 track: " + trackName);
        }

        @Override
        public void pause() {
            System.out.println("Pausing MP3 track: " + trackName);
        }

        @Override
        public void stop() {
            System.out.println("Stopping MP3 track: " + trackName);
        }
    }
    public static class CDPlayer extends AudioPlayer{
        private String trackName;
        public CDPlayer(int volume,String trackName){
            super(volume);
            this.trackName = trackName;
        }
        @Override
        public void play() {
            System.out.println("Playing CD track: " + trackName);
        }
        @Override
        public void pause() {
            System.out.println("Pausing CD track: " + trackName);
        }
        @Override
        public void stop() {
            System.out.println("Stopping CD track: " + trackName);
        }
    }
}
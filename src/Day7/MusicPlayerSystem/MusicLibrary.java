package Day7.MusicPlayerSystem;

import java.util.ArrayList;
import java.util.Scanner;
public class MusicLibrary implements Playable {
    Scanner sc = new Scanner(System.in);
    private ArrayList<String> trackList = new ArrayList<>();

    public ArrayList<String> getTrackList() {
        return trackList;
    }

    public void setTrackList(ArrayList<String> trackList) {
        this.trackList = trackList;
    }

    public void addTrack() {
        System.out.println("How many tracks would you like to add?");
        int b= sc.nextInt();
        sc.nextLine();
        for (int i=0; i<b;i++){
            System.out.println("Add a new Track to the Track List:");
            String track =sc.nextLine();
            trackList.add(track);
        }


    }
    public void displayTrackList(){
        for (int i=0;i<trackList.size();i++){
            System.out.println(trackList.get(i));
        }
    }
    @Override
    public void play() {
        System.out.println("*The music is playing*");
    }

    @Override
    public void pause() {
        System.out.println("*The music is paused*");
    }

    @Override
    public void stop() {
        System.out.println("*The music stopped*");
    }
}
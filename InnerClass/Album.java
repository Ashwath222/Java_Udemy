package InnerClass;

import java.util.ArrayList;
import java.util.LinkedList;

public class Album {
    private String name, artist;
    private SongList songs;

    public Album(String name, String artist) {
        this.name = name;
        this.artist = artist;
        songs = new SongList();
    }

    public boolean addSong(String title, double duration) {
        return songs.add(new Song(title,duration));
    }

    public boolean addToPlayList(int trackNumber, LinkedList<Song> playList) {
        Song song = songs.findSong(trackNumber);
        if(song != null){
            playList.add(song);
            return true;
        }
        return false;
    }

    public boolean addToPlayList(String songTitle, LinkedList<Song> playList) {
        Song song = songs.findSong(songTitle);
        if(song != null){
            playList.add(song);
            return true;
        }
        return false;
    }

    public static class SongList {
        private ArrayList<Song> songs;

        private SongList() {
            songs = new ArrayList<Song>();
        }

         private boolean add(Song song) {
            if(songs.contains(song))
                return false;
            songs.add(song);
            return true;
         }

         private Song findSong(String songTitle) {
            for(Song song : songs) {
                if(song.getTitle().equals(songTitle))
                    return song;
             }
            return null;
         }

         private Song findSong(int trackNumber) {
            if(trackNumber-1>=0 && trackNumber-1< songs.size()) {
                return songs.get(trackNumber-1);
            }
            return null;
         }
    }
}

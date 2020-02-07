package course.javaprogramming;

import java.util.ArrayList;
import java.util.List;

public class Album {
    private String albumTitle;
    private String artist;
    private SongList songs;

    public Album(String albumTitle, String artist) {
        this.albumTitle = albumTitle;
        this.artist = artist;
        this.songs = new SongList();
    }

    public String getAlbumTitle() {
        return albumTitle;
    }



    public boolean addSongToAlbum(Song song){
        return this.songs.add(song);
    }

    public List<Song> getAlbumSongs() {
        return this.songs.getTracks();
    }

    private class SongList{
        private List<Song> tracks;

        public SongList() {
            this.tracks = new ArrayList<Song>();
        }

    public List<Song> getTracks() {
        return tracks;
    }

    public boolean add(Song song){
            if(checkSong(song) != null){
                return false;
            }
                tracks.add(song);
                return true;
// Check if the song exist in the list - OPTION B
//            if(tracks.contains(song)){
//                return false;
//            }
//            tracks.add(song);
//            return true;
        }

        public Song checkSong(Song song){
            if(!tracks.isEmpty()){
                for (int i = 0; i < tracks.size() ; i++) {
                    Song current = tracks.get(i);
                    if(current.equals(song)){
                        //song is already on the list
                        return current;
                    }
                }
            }
            return null;
        }



    }


}

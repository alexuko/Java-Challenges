package course.javaprogramming;

import java.util.ArrayList;

public class Album {
    private String albumTitle;
    private String artist;
    private ArrayList<Song> albumSongs;

    public Album(String albumTitle, String artist) {
        this.albumTitle = albumTitle;
        this.artist = artist;
        this.albumSongs = new ArrayList<Song>();
    }

    public String getAlbumTitle() {
        return albumTitle;
    }

    public ArrayList<Song> getAlbumSongs() {
        return albumSongs;
    }

    public boolean addSongToAlbum(Song song){
        if(checkSong(song) != null){
            System.out.println("song already exist");
            return false;
        }
        // add a new song to the album
        System.out.println("Added to album" + song.toString() );
        albumSongs.add(song);
        return true;
    }

    public Song checkSong(Song song){
        if(!albumSongs.isEmpty()){
            for (int i = 0; i < albumSongs.size() ; i++) {
                Song current = albumSongs.get(i);
                if(current.equals(song)){
                    //song is already on the list
                    return current;
                }
            }
        }
        return null;
    }
    public void printSongsInAlbum(){
        System.out.println("===================================");
        System.out.println("Artist: " + artist + "\t Album Name: " + albumTitle );
        for (int i = 0; i < albumSongs.size() ; i++) {
            System.out.println(i + ".- " + albumSongs.get(i).toString());
        }
        System.out.println("===================================");
    }


}

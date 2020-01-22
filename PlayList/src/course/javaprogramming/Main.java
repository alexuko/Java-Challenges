package course.javaprogramming;

import java.util.LinkedList;

public class Main {

    public static void main(String[] args) {
        //Some songs
        Song song_1 = new Song("Song 1",3.15);
        Song song_2 = new Song("Song 2",4.25);
        Song song_3 = new Song("Song 3",5.15);
        Song song_4 = new Song("Song 4",6.85);
        Song song_5 = new Song("Song 5",7.25);

        Album album_1 = new Album("album_1","fakeArtist");
        album_1.addSongToAlbum(song_1);
        album_1.addSongToAlbum(song_2);

        Album album_2 = new Album("album_2","cheapArtist");
        album_2.addSongToAlbum(song_3);
        album_2.addSongToAlbum(song_4);
        album_2.addSongToAlbum(song_5);

        //testAlbum.printSongsInAlbum();

        Playlist myPlaylist = new Playlist("myPlaylist");
        myPlaylist.addToPlaylist(album_1,song_1);
        myPlaylist.addToPlaylist(album_1,song_2);
        myPlaylist.addToPlaylist(album_2,song_3);
        myPlaylist.addToPlaylist(album_2,song_4);
        myPlaylist.addToPlaylist(album_2,song_5);
        myPlaylist.startPlaylist();

    }






}

package course.javaprogramming;

import java.util.LinkedList;

public class Main {

    public static void main(String[] args) {
        //Some songs
        Song song1 = new Song("About a Girl" , 3.37);
        Song song2 = new Song("Come as You Are" , 4.13);
        Song song3 = new Song("Jesus Doesn't Want Me for a Sunbeam (Eugene Kelly, Frances McKee) " , 4.37);
        Song song4 = new Song("The Man Who Sold the World (David Bowie)" , 4.20);
        Song song5 = new Song("Pennyroyal Tea" , 3.40);
        Song song6 = new Song("Dumb" , 2.52);
        Song song7 = new Song("Polly" , 3.16);

        Song song8 = new Song("Let Me in Your Heart Again" , 4.31);
        Song song9 = new Song("Love Kills" , 4.12);


        Album album_1 = new Album("Unplugged","Nirvana");
        album_1.addSongToAlbum(song1);
        album_1.addSongToAlbum(song2);
        album_1.addSongToAlbum(song3);
        album_1.addSongToAlbum(song4);
        album_1.addSongToAlbum(song5);
        album_1.addSongToAlbum(song6);
        album_1.addSongToAlbum(song7);


        Album album_2 = new Album("Best of Queen","Freddy Mercury");
        album_2.addSongToAlbum(song8);
        album_2.addSongToAlbum(song9);


        Playlist myPlaylist = new Playlist("myPlaylist");
        myPlaylist.addToPlaylist(album_1,song1);
        myPlaylist.addToPlaylist(album_1,song2);
        myPlaylist.addToPlaylist(album_1,song3);
        myPlaylist.addToPlaylist(album_1,song4);
        myPlaylist.addToPlaylist(album_1,song5);
        myPlaylist.addToPlaylist(album_1,song6);
        myPlaylist.addToPlaylist(album_1,song7);
        myPlaylist.addToPlaylist(album_2,song8);
        myPlaylist.addToPlaylist(album_2,song9);
        myPlaylist.startPlaylist();

    }






}

package course.javaprogramming;

import java.util.LinkedList;
import java.util.ListIterator;
import java.util.Scanner;

public class Playlist {
    private String playlist_name;
    private LinkedList<Song> listOfSongs;

    public Playlist(String playlist_name) {
        this.playlist_name = playlist_name;
        this.listOfSongs = new LinkedList<>();
    }

    public void startPlaylist(){
        if(listOfSongs.isEmpty()){
            System.out.println("No songs to be played");
            return;
        }
        ListIterator li = listOfSongs.listIterator();
        boolean  quit = false;
        boolean  isGoingForward = true;

        displayMenu();

        while (!quit){
            System.out.println("Select an option:");

            Scanner sc = new Scanner(System.in);
            int option = sc.nextInt();
            switch (option){
                case 0:// QUIT some code here
                    System.out.println("Quitting playlist...");
                    quit = true;
                    break;
                case 1:// NEXT TRACK some code here
                    if(!isGoingForward){
                        if(li.hasNext()){
                            li.next();
                        }
                        isGoingForward = true;
                    }
                    if(li.hasNext()){
                        System.out.println("Now Playing:\t" + li.next());
                    }else {
                        System.out.println("End of the list");
                        isGoingForward = false;
                    }
                    break;
                case 2:// PREVIOUS TRACK some code here
                    if(isGoingForward){
                        if(li.hasPrevious()){
                            li.previous();
                        }
                        isGoingForward = false;
                    }
                    if(li.hasPrevious()){
                        System.out.println("Now Playing:\t" + li.previous());
                    }else {
                        System.out.println("Beginning of the list");
                        isGoingForward = true;
                    }
                    break;
                case 3:// REPEAT some code here
                    if(isGoingForward){
                        //place pointer before
                        li.previous();
                        //play song again
                        System.out.println("Now Playing:\t" + li.next());
                    }else {
                        //place listIterator pointer after
                        li.next();
                        //play song again
                        System.out.println("Now Playing:\t" + li.previous());
                    }
                    break;
                case 4:// REMOVE FROM PLAYLIST some code here
                    if(!listOfSongs.isEmpty()){
                        if(isGoingForward){
                            //place pointer before
                            li.previous();
                            //select song to be removed
                            System.out.println("Removed:\t" + li.next());

                        }else {
                            //place listIterator pointer after
                            li.next();
                            //select song to be removed
                            System.out.println("Removed:\t" + li.previous());
                        }
                        li.remove();
                    }else if(listOfSongs.isEmpty()){
                        //if empty
                        System.out.println("Playlist is empty ");
                        quit = true;
                    }
                    break;
                case 5:// DISPLAY PLAYLIST some code here
                    System.out.println("************  Playlist  ************");
                    //go to the beginning of the list
                    while (li.hasPrevious()){
                        li.previous();
                    }
                    // print entire list
                    while (li.hasNext()){
                        System.out.println(li.nextIndex()+1 + " " +li.next());
                    }
                    //return to beginning of list
                    while (li.hasPrevious()){
                        li.previous();
                    }

                    break;

            }//leaving switch

        }//if Quit is true
        System.out.println("QUIT");

    }

    public boolean addToPlaylist(Album album, Song song){

        String title = song.getTitle();

        for (int i = 0; i < album.getAlbumSongs().size(); i++) {
            String currentTitle = album.getAlbumSongs().get(i).getTitle();
            if(currentTitle.equals(title)){
                //if the title exist in the album
                listOfSongs.add(song);
                return true;
            }
        }
        System.out.println(song.getTitle() + " does not exist in " + album.getAlbumTitle());
        return false;
    }

    public void displayMenu(){
        System.out.println("===========================================================");
        System.out.println("Menu options");
        System.out.println("0. Quit \t"+"1. Play Next\t" + "2. Play Previous\t" + "3. Repeat\t" + "4. Delete Song\t" + "5. Print Playlist" );


    }
}

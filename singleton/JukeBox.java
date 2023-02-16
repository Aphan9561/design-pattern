package singleton;

import java.util.ArrayList;
import java.util.LinkedList;
import java.util.Queue;

/**
 * Jukebox in a place
 * @author Anna Phan
 */
public class JukeBox {
    private static JukeBox jukeBox;
    private ArrayList<Song> songs;
    private Queue<String> songQueue;

    /**
     * Loads the song list nad creates a queue
     */
    private JukeBox() {
        songs = DataLoader.getSongs();
        songQueue = new LinkedList<>();
    }

    /**
     * Creates a new JukeBox
     * @return returns the new Jukebox
     */
    public static JukeBox getInstance() {
        if (jukeBox == null) {
            jukeBox = new JukeBox();
        }
        return jukeBox;
    }

    /**
     * Will remove the song from the queue if the song is in the queue
     * @return returns song is 'playing' if the song is in queue,'you need to add the song' if song is not in queue
     */
    public String playNextSong() {
        String title = songQueue.remove();
        Song playlist = null;
        if (title == null) {
            return "You need to add song to playlist";
        }
        for (Song song : songs) {
            if (song.getTitle().equalsIgnoreCase(title)) {
                playlist = song;
            }
        }
        return "Let's jam to " + playlist;
    }

    /**
     * Will look for the requested song title and add it to the queue if the song is on the list 
     * @param title the title of the song
     * @return returns "we don't have the song" if the song is not on the list. returns the title and it's place in the queue
     */
    public String requestSong(String title) {
        Song reqSong = null;
        boolean found = false;
        for (Song song : songs) {
            if (song.getTitle().equalsIgnoreCase(title)) {
                reqSong = song;
                songQueue.add(reqSong.getTitle());
                found = true;   
            }
        }
        if (found == false) {
            return "Sorry, we do not have the song " + title;
            
        } 
        return title + " is number " + songQueue.size() + " on the list";
    }

    /**
     * Will check if there are more songs in the queue
     * @return returns true or false if the queue is empty of not
     */
    public boolean hasMoreSongs() {
        return !songQueue.isEmpty();
    }
}

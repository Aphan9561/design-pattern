package singleton;

/**
 * Songs in the Jukebox
 * @author Anna Phan
 */
public class Song {
    private String title;
    private String artist;

    /**
     * Creates a new Song
     * @param title the title of the song
     * @param artist the suthor of the song
     */
    public Song(String title, String artist) {
        this.title = title;
        this.artist = artist;
    }

    /**
     * Gets the song title
     * @return the song title
     */
    public String getTitle() {
        return title;
    }

    /**
     * Creates a string reporestnation of the the song with its title and artist
     * @return the title of and artist of the song
     */
    public String toString() {
        return title + " by " + artist;
    }

}

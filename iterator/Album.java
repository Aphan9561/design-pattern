package iterator;

/**
 * The album that contains the songs
 * @author Anna Phan
 */
public class Album {
    static final int MAX = 20;
    private Song[] songs;
    private int count = 0;
    private String name;

    /**
     * Creates a new Album
     * @param name Name of the album
     */
    public Album(String name) {
        this.name = name;
        songs = new Song[MAX];
    }
    /**
     * Adding song to album
     * @param name Song's name
     * @param artist Song's artist
     * @param length Length of the song
     * @param genre Song's genre
     * @return Returns true if the song is added to the album
     */
    public boolean addSong(String name, String artist, double length, Genre genre) {
        Song song = new Song(name, artist, length, genre);
        if (MAX >= count) {
            songs[count] = song;
            count = count + 1;
            return true;
        } else {
            return false;
        }

    }
    /**
     * Creating a collection to hold the songs
     * @return a new collection
     */
    public AlbumIterator createIterator() {
        return new AlbumIterator(songs);
    }

    /**
     * Gets the name of the album
     * @return the name of the album
     */
    public String getName() {
        return this.name;
    }
}
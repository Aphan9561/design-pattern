package iterator;

/**
 * Song in the albu
 * @author Anna Phan
 */
public class Song {
    private String name;
    private String artist;
    private double length;
    private Genre genre;

    /**
     * Creates a new song to add to the album
     * @param name Song's name
     * @param artist Song's artist
     * @param length Length of the song
     * @param genre Song's genre
     */
    public Song(String name, String artist, double length, Genre genre) {
        this.name = name;
        this.artist = artist;
        this.length = length;
        this.genre = genre;
    }

    /**
     * Creates a string representation of the song
     * @return the song information
     */
    public String toString() {
        return name + " by " + artist + " category: " + genre + " length: " + length + " min";
    }

}

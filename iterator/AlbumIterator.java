package iterator;

import java.util.Iterator;

/**
 * A collection in which the aln=bum can retrieve the songs
 * @author Anna Phan
 */
public class AlbumIterator implements Iterator {
    private Song[] songs;
    private int position = 0;

    /**
     * Creates a new place for the song
     * @param songs
     */
    public AlbumIterator(Song[] songs) {
        this.songs = songs;
    }
    /**
     * Adding space for the song
     * @return the song that is aded 
     */
    public Song next() {
        if (!hasNext()) {
            return null;
        }
        Song song = songs[position];
        position = position + 1;
        return song;
    }
    /**
     * Chacking to see if ther is space for new song
     * @return Returns true is there is space for the song
     */
    public boolean hasNext() {
        return !(position >= songs.length || songs[position] == null);
    }

}

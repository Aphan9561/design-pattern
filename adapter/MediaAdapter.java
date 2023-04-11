package adapter;

import java.util.ArrayList;
import java.util.Date;

public class MediaAdapter implements Media{

    private LittleMedia littleMedia;
    private ArrayList<Review> reviews;

    public MediaAdapter(LittleMedia littleMedia){
        this.littleMedia = littleMedia;
    }
    
    public String getTitle() {
        return littleMedia.getTitle();
    }

    public Author getAuthor() {
        
    }

    public String getDescription() {
        return littleMedia.getDescription();
    }

    public void addReview(String firstName, String lastName, Date date, double rating, String comment) {
        
    }

    public ArrayList<Review> getReviews() {
        
    }
    
}

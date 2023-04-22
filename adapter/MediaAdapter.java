package adapter;

import java.text.ParseException;
import java.text.SimpleDateFormat;
import java.util.ArrayList;
import java.util.Date;

/**
 * Changes things in little media to match media
 * 
 * @author Anna Phan
 */
public class MediaAdapter implements Media {
    private LittleMedia littleMedia;
    /**
     * Creates a new mediaAdapter for ever littleMedia
     * @param littleMedia the type of little media
     */
    public MediaAdapter(LittleMedia littleMedia) {
        this.littleMedia = littleMedia;
    }
    /**
     * Gets the title of little media
     * @return title of little media
     */
    public String getTitle() {
        return littleMedia.getTitle();
    }
    /**
     * Get the author of little media
     * @return author of little media
     */
    public Author getAuthor() {
        String fullName = littleMedia.getAuthor();
        int idx = fullName.lastIndexOf(' ');
        String firstName = fullName.substring(0, idx);
        String lastName = fullName.substring(idx + 1);
        Author author = new Author(firstName, lastName);
        return author;
    }
    /**
     * Gets the description of little media
     * @return description of little media
     */
    public String getDescription() {
        return littleMedia.getDescription();
    }
    /**
     * The addReview from little media
     * @param firstName first name of the reviewer
     * @param lastName last name of the reviewer
     * @param date date of the review
     * @param rating rating of the review
     * @param comment the review comment
     */
    public void addReview(String firstName, String lastName, Date date, double rating, String comment) {
        String fullName = firstName + " " + lastName;
        int rate = (int) Math.round(rating);
        littleMedia.addReview(fullName, date, rate, comment);
    }
    /**
     * Get the reviews from little media
     * @return the reviews from little media
     */
    public ArrayList<Review> getReviews() {
        ArrayList<String> reviews = littleMedia.getReviews();
        ArrayList<Review> newReivews = new ArrayList<Review>();
        SimpleDateFormat dateFormatter = new SimpleDateFormat("MM/dd/yyyy");
        for (int i = 0; i < reviews.size(); i++) {
            Review review;
            String data = reviews.get(i);
            String temp[] = data.split(" ");
            int length = temp.length;
            double rating = Double.parseDouble(temp[0]);
            String[] sentence = new String[(length - 5) - 3];
            int k = 0;
            for (int j = 3; j < length - 5; j++) {
                sentence[k] = temp[j];
                k++;
            }
            String comment = String.join(" ", sentence);
            String firstName = temp[length - 4];
            String lastName = temp[length - 3];
            String tempDate = temp[length - 1];
            Date date;
            try {
                date = dateFormatter.parse(tempDate);
                review = new Review(firstName, lastName, date, rating, comment);
                newReivews.add(review);
            } catch (ParseException e) {
                e.printStackTrace();
            }
        }
        return newReivews;
    }

}

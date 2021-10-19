package inheritance;

import java.util.ArrayList;
import java.util.List;

public class Shop {
    private String name;
    private String description;
    private String numOfDollarSigns;
   private List<Review> reviews ;


    public Shop(String name, String description, String numOfDollarSigns) {
        this.name = name;
        this.description = description;
        this.numOfDollarSigns = numOfDollarSigns;
        this.reviews= new ArrayList<>();
    }
    public String getName() {
        return name;
    }

    public void setName(String name) {
        this.name = name;
    }

    public String getDescription() {
        return description;
    }

    public void setDescription(String description) {
        this.description = description;
    }

    public String getNumOfDollarSigns() {
        return numOfDollarSigns;
    }

    public void setNumOfDollarSigns(String numOfDollarSigns) {
        this.numOfDollarSigns = numOfDollarSigns;
    }

    public List<Review> getReviews() {
        return reviews;
    }

    public void setReviews(List<Review> reviews) {
        this.reviews = reviews;
    }

    @Override
    public String toString() {
        String msg = "Shop{" +
                "name='" + name + '\'' +
                ", description='" + description + '\'' +
                ", numOfDollarSigns=" + numOfDollarSigns +
                ", reviews=" + reviews +
                '}';
        return msg;
    }

    public void addReview(String body, String author, int numOfStars) {
        Review newRev = new Review(body,author,numOfStars);
        if(! reviews.contains(newRev))
            reviews.add(newRev);
    }
}

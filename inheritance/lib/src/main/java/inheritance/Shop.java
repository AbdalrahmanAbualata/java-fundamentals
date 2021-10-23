package inheritance;

import java.util.ArrayList;
import java.util.List;

public class Shop {
    private String name;
    private String description;
    private String numOfDollarSigns;
    private int numOfStars;  // rate for the shop added
   private List<Review> reviews ;

    public Shop(String name, String description, String numOfDollarSigns) {
        this.name = name;
        this.description = description;
        this.numOfDollarSigns = numOfDollarSigns;
        this.reviews= new ArrayList<>();
    }

    public void setNumOfStars(int numOfStars) {
        if (numOfStars >= 0 && numOfStars <= 5) {
            this.numOfStars = numOfStars;
        }else {
            this.numOfStars = 3;
        }
    }

    public int getNumOfStars() {
        return numOfStars;
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
        String msg ;
        if (this.reviews.size()>=1) {
            msg = "Shop{" +
                    "name='" + name + '\'' +
                    ", description='" + description + '\'' +
                    ", numOfDollarSigns=" + numOfDollarSigns +
                    ", Rate of the shop=" + numOfStars +
                    ", reviews=" + reviews +
                    '}';
            return msg;
        }else {
            msg = "Shop{" +
                    "name='" + name + '\'' +
                    ", description='" + description + '\'' +
                    ", numOfDollarSigns=" + numOfDollarSigns +
                    ", Rate of the shop= no Rate yet" +
                    ", reviews= no reviews yet" +
                    '}';
            return msg;
        }
    }

    public void addReview(Review newRev) {
        if(! reviews.contains(newRev))
            reviews.add(newRev);
           this.averageReview();

    }
    // RAte added
    public int averageReview() {
        if (this.reviews.size()>=1){
            int sum = 0;
            for (Review current : reviews) {
                sum += current.getStars();
            }
            numOfStars = (sum)/ (reviews.size());
            return numOfStars;
        }
        return numOfStars;
    }
}

package inheritance;
import java.util.ArrayList;
import java.util.List;

public class Restaurant {
    private String name;
    private int numOfStars;
    private String priceCategory;
    private List<Review> reviews;

    public void setNumOfStars(int numOfStars) {
        if (numOfStars >= 0 && numOfStars <= 5) {
            this.numOfStars = numOfStars;
        }else {
            this.numOfStars = 3;
        }
    }

        public Restaurant(String name, int numOfStars, String priceCategory) {
            this.name = name;
            this.setNumOfStars(numOfStars);
            this.priceCategory = priceCategory;
            this.reviews= new ArrayList<>();
        }

    public String getName() {
        return name;
    }

    public void setName(String name) {
        this.name = name;
    }
    public int getNumOfStars() {
        return numOfStars;
    }

    public String getPriceCategory() {
        return priceCategory;
    }

    public void setPriceCategory(String priceCategory) {
        this.priceCategory = priceCategory;
    }
    public List<Review> getReviews() {
        return reviews;
    }

    public void setReviews(List<Review> reviews) {
        this.reviews = reviews;
    }

        @Override
        public String toString() {
            String msg ="Restaurant{" +
                    "name='" + name + '\'' +
                    ", numOfStars=" + numOfStars +
                    "* , priceCategory='" + priceCategory + '\'' +
                    ", review=" + reviews +
                    '}';
            return  msg;
        }

    public void addReview( Review review){
                  this.reviews.add(review);
                   this.averageReview();
    }

    //calculate the average

    public int averageReview() {
if (reviews.size()>=1){
        int sum = 0;
        for (Review current : reviews) {
            sum += current.getStars();
        }
        numOfStars = sum / reviews.size();
        return numOfStars;
    }
        return this.numOfStars;
    }

}

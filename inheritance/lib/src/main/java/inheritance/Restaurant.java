package inheritance;
import java.util.ArrayList;
import java.util.List;

public class Restaurant {
    public String name;
    public int numOfStars;
    public String priceCategory;
    public List<Review>reviews;

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

        @Override
        public String toString() {
            return "Restaurant{" +
                    "name='" + name + '\'' +
                    ", numOfStars=" + numOfStars +
                    "* , priceCategory='" + priceCategory + '\'' +
                    ", review=" + reviews +
                    '}';
        }

    public void addReview(String body,String author , int NewStars){
        Review review = new Review(  body,author, NewStars);
        this.reviews.add(review);
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

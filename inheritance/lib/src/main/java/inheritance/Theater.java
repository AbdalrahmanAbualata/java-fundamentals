package inheritance;

import java.util.HashMap;
import java.util.List;
import java.util.Map;

public class Theater {
   private String name;
   private int numOfStars;// RAte added
    private List<String> movielist;
    private Map<String,Review> reviews ;


    public Theater(String name, List<String> movies) {
        this.name = name;
        this.movielist = movies;
        this.reviews=new HashMap<>();
    }

    public int getNumOfStars() {
        return numOfStars;
    }

    public void setNumOfStars(int numOfStars) {
        if (numOfStars >= 0 && numOfStars <= 5) {
            this.numOfStars = numOfStars;
        }else {
            this.numOfStars = 3;
        }
    }

    public String getName() {
        return name;
    }

    public void setName(String name) {
        this.name = name;
    }

    public List<String> getMovielist() {
        return movielist;
    }

    public void setMovielist(List<String> movies) {
        this.movielist = movies;
    }

    public Map<String, Review> getReviews() {
        return reviews;
    }

    public void setReviews(Map<String, Review> reviews) {
        this.reviews = reviews;
    }

    public void addMovie(String movie) {
        this.movielist.add(movie);
    }

    public void removeMovie(String movie){
        this.movielist.remove(movie);
    }
    @Override
    public String toString() {
        String msg ="";
       if (reviews.size() == 0) {
            msg = "Theater{" +
                   "name ='" + this.name + '\'' +
                   ", movieList=" + movielist +
                   '}';
       }else {
           msg="Theater{" +
                   "name ='" + this.name + '\'' +
                   ", Rate=" + numOfStars +
                   ", movieList=" + movielist + " " + reviews.values()
                   ;
       }
        return msg ;
    }

    public void addReview(Review newRev) {
        if (newRev.getMovie()==null) {
            reviews.put("", newRev);
            averageReview();
        }else{
            reviews.put(newRev.getMovie(),newRev);
            averageReview();
        }
    }
    // RAte added
    public int averageReview() {
        if (this.reviews.size()>=1){
            int sum = 0;
            for (Review current : reviews.values()) {
                sum += current.getStars();
            }
            numOfStars = (sum)/ (reviews.size());
            return numOfStars;
        }
        return numOfStars;
    }
}

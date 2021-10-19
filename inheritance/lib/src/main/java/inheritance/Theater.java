package inheritance;

import java.util.ArrayList;
import java.util.HashMap;
import java.util.List;
import java.util.Map;

public class Theater {
   private String name;
    private List<String> movielist;
    private Map<String,Review> reviews ;


    public Theater(String name, List<String> movies) {
        this.name = name;
        this.movielist = movies;
        this.reviews=new HashMap<>();
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
                   ", movieList=" + movielist + " " + reviews
                   ;
       }
        return msg ;
    }

    public void addReview(String body, String author, int numOfStars) {
        Review newRev = new Review(body,author,numOfStars);
        reviews.put("",newRev);
    }

    public void addReview(String body, String author, int numOfStars,String movie){
        Review newRev = new Review(body,author,numOfStars,movie);
        reviews.put(movie,newRev);
    }
}

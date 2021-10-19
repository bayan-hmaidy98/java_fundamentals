package inheritance;

import java.util.ArrayList;
import java.util.HashMap;

public class Theater implements Reviewable {

    String name;
    ArrayList<String> moviesList = new ArrayList<>();
    HashMap<String, Review> moviesReviews = new HashMap<String, Review>();

    public Theater(String name, ArrayList moviesList){
        this.name = name;
        this.moviesList = moviesList;
    }

    public String getName() {
        return name;
    }

    public void setName(String name) {
        this.name = name;
    }

    public ArrayList<String> getMoviesList() {
        return moviesList;
    }

    public void setMoviesList(ArrayList<String> moviesList) {
        this.moviesList = moviesList;
    }

    public void addMovie(String movie){
        moviesList.add(movie);
    }

    public void removeMovie(String movie){
       moviesList.remove(movie);
    }

    @Override
    public String toString() {
        return "Theater{" +
                "name='" + name + '\'' +
                ", moviesList=" + moviesList +
                ", moviesReviews=" + moviesReviews +
                '}';
    }

    @Override
    public void addReview(Review review) {
        moviesReviews.put(moviesList.get(moviesList.size()-1), review);
    }
}


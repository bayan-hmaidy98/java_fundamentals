package inheritance;

import java.util.ArrayList;

public class Restaurant implements Reviewable {

    private String name;
    private float rating;

    float rate = 0;
    int numberOfRates = 0;
    private String price;

    public String getName() {
        return name;
    }

    private ArrayList<String> getRestaurantReviews() {
        return restaurantReviews;
    }

    public void setRestaurantReviews(ArrayList<String> restaurantReviews) {
        this.restaurantReviews = restaurantReviews;
    }

    ArrayList<String> restaurantReviews = new ArrayList<>();

    public void setName(String name) {
        this.name = name;
    }

    public float getRating() {
        return rating;
    }

    public void setRating(float rating) {
        this.rating = rating;
    }

    public String getPrice() {
        return price;
    }

    public void setPrice(String price) {
        this.price = price;
    }

    public Restaurant(String name, float rating, String price){
        this.name = name;
        this.rating = rating;
        this.price = price;
    }

    public void addReview(Review review){
        Review review1 = new Review(review.body, review.author, review.numberOfStars);
        getRestaurantReviews().add(String.valueOf(review1));
        numberOfRates++;
        rate = (review.numberOfStars + rate)/numberOfRates;
        this.rating =rate;
    }

    @Override
    public String toString() {
        return "Restaurant{" +
                "name='" + name + '\'' +
                ", rating=" + rating +
                ", rate=" + rate +
                ", numberOfRates=" + numberOfRates +
                ", price='" + price + '\'' +
                ", restaurantReviews=" + restaurantReviews +
                '}';
    }
}

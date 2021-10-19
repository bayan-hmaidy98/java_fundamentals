package inheritance;

import java.util.ArrayList;

public class Shop implements Reviewable{
    String name;
    String description;
    String price;

    public String getName() {
        return name;
    }

    public ArrayList<Review> getShopReviews() {
        return shopReviews;
    }

    public void setShopReviews(ArrayList<Review> shopReviews) {
        this.shopReviews = shopReviews;
    }

    private ArrayList<Review> shopReviews = new ArrayList<Review>();

    public void setName(String name) {
        this.name = name;
    }

    public String getDescription() {
        return description;
    }

    public void setDescription(String description) {
        this.description = description;
    }

    public String getPrice() {
        return price;
    }

    public void setPrice(String price) {
        this.price = price;
    }

    Shop(String name, String description, String price){
        this.name = name;
        this.description = description;
        this.price = price;
    }

    @Override
    public String toString() {
        return "Shop{" +
                "name='" + name + '\'' +
                ", description='" + description + '\'' +
                ", price='" + price + '\'' +
                ", shopReviews=" + shopReviews +
                '}';
    }

    @Override
    public void addReview(Review review) {
        shopReviews.add(review);
    }
}

/*
 * This Java source file was generated by the Gradle 'init' task.
 */
package inheritance;

import org.junit.jupiter.api.Test;

import java.util.ArrayList;

import static org.junit.jupiter.api.Assertions.*;

class LibraryTest {
    @Test void someLibraryMethodReturnsTrue() {
        Library classUnderTest = new Library();
        assertTrue(classUnderTest.someLibraryMethod(), "someLibraryMethod should return 'true'");
    }

    @Test void testRestaurantString(){
      Restaurant restaurant = new Restaurant("FireFly",5, "10$");
      String actual = restaurant.toString();
      String expected = "Restaurant{name='FireFly', rating=5.0, rate=0.0, numberOfRates=0, price='10$', restaurantReviews=[]}";
      assertEquals(expected,actual);
    }

    @Test void testReviewString(){
        Review review = new Review("Very expensive compared to the service!" , "Bayan" , 2);
        String actual = review.toString();
        String expected = "Review{body='Very expensive compared to the service!', author='Bayan', numberOfStars=2}";
        System.out.println(actual);
        assertEquals(expected,actual);
    }

    @Test void testAddMethod(){
        Review review = new Review("Excellent service", "Nada", 4);
        Restaurant restaurant = new Restaurant("Alia", (float) 4.3, "50$");
        restaurant.addReview(review);
        assertEquals("Nada", review.getAuthor());
        System.out.println(restaurant.restaurantReviews.get(0));
    }

    @Test void testShopString(){
        Shop shop = new Shop("M & Z", "Cloths Shop", "25$");
        String actual = shop.toString();
        String expected = "Shop{name='M & Z', description='Cloths Shop', price='25$', shopReviews=[]}";
        assertEquals(expected,actual);
    }

    @Test void testTheaterString(){
        ArrayList<String> movies = new ArrayList<>();
        movies.add("Marriage story");
        movies.add("Parasite");
        movies.add("Eternal sunshine of the spotless mind");
        movies.add("Amadeus");
        Theater theater = new Theater("Al-hamraa",movies);
        String actual = theater.toString();
        String expected = "Theater{name='Al-hamraa', moviesList=[Marriage story, Parasite, Eternal sunshine of the spotless mind, Amadeus], moviesReviews={}}";
        assertEquals(expected,actual);
    }

    @Test void shopTest(){
        Review shopReview = new Review("Brands here are fabulous!", "Bayan", 4);
        Shop shopSample = new Shop("M & Z", "Cloths shop", "25$");
        shopSample.addReview(shopReview);
        String actual = shopSample.toString();
        String expected = "Shop{name='M & Z', description='Cloths shop', price='25$', shopReviews=[Review{body='Brands here are fabulous!', author='Bayan', numberOfStars=4}]}";
        assertEquals(expected, actual);
    }

    @Test void theaterTest(){
        Review theatreReview = new Review("Musical movies are my favorites." , "Bayan", 5);
        ArrayList<String> movies = new ArrayList<>();
        movies.add("Marriage story");
        movies.add("Parasite");
        movies.add("Eternal sunshine of the spotless mind");
        movies.add("Amadeus");
        Theater theater = new Theater("Al-hamraa",movies);
        theater.addReview(theatreReview);
        String actual = theater.toString();
        String expected = "Theater{name='Al-hamraa', moviesList=[Marriage story, Parasite, Eternal sunshine of the spotless mind, Amadeus], moviesReviews={Amadeus=Review{body='Musical movies are my favorites.', author='Bayan', numberOfStars=5}}}";
        assertEquals(expected, actual);
    }

    @Test void addMovie(){
        ArrayList<String> movies = new ArrayList<>();
        Theater theater = new Theater("Al-hamraa",movies);
        theater.addMovie("Whisper of the Heart");
        theater.addMovie("Wolf Children");
        String actual = movies.toString();
        String expected = "[Whisper of the Heart, Wolf Children]";
        assertEquals(expected, actual);
    }

    @Test void removeMovie(){
        ArrayList<String> movies = new ArrayList<>();
        Theater theater = new Theater("Al-hamraa",movies);
        theater.addMovie("Whisper of the Heart");
        theater.addMovie("Wolf Children");
        theater.addMovie("Girl 2019");
        theater.addMovie("The Flavor of Green Tea Over Rice");
        theater.removeMovie("Girl 2019");
        String actual = movies.toString();
        String expected = "[Whisper of the Heart, Wolf Children, The Flavor of Green Tea Over Rice]";
        assertEquals(expected, actual);
    }
}

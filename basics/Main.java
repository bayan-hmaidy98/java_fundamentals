import java.time.LocalDateTime;
import java.util.Random;

public class Main {
    public static void main(String[] args){


        int dogCount = 1;
        System.out.println("I own " + dogCount + " " + pluralize("dog", dogCount) + ".");

        int catCount = 2;
        System.out.println("I own " + catCount + " " + pluralize("cat", catCount) + ".");

        int turtleCount = 0;
        System.out.println("I own " + turtleCount + " " + pluralize("turtle", turtleCount) + ".");

        flipNHeads(3);
        clock();

    }

    public static String pluralize(String name, int num) {

        if (num == 1) {
            return name;
        }
        else{
            return name + "s";
        }
    }

    public static void flipNHeads(int heads){

        int flips = 0;
        int head_counter= 0;

        Random rand = new Random();
        while(true){

            float random_value = rand.nextFloat();

            if (random_value < 0.5) {
                flips++;
                head_counter =0;
                System.out.println("tail");
            }
            else {
                head_counter++;
                flips++;
                System.out.println("head");

            }
            if(head_counter == heads){
                System.out.println("It took " + flips + " flips to flip " + heads + " heads in a row.");
                break;
            }


        }
    }

    public static void clock(){

        int second = LocalDateTime.now().getSecond();
        while (true) {

            int hour = LocalDateTime.now().getHour();
            int minute = LocalDateTime.now().getMinute();
            int second2 = LocalDateTime.now().getSecond();
            if (second2 - second == 1) {
                System.out.println(hour + ":" + minute + ":" + second);
                second++;
            }

        }

    }


}

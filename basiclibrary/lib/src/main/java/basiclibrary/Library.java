/*
 * This Java source file was generated by the Gradle 'init' task.
 */
package basiclibrary;
import java.util.*;

public class Library {

    public static void main (String[] args){


    }

    public int []  roll (int n) {

        // declare array to get the values inside
        int [] rollArray = new int[n];
        int low = 1;
        int high = 6;
        Random rand = new Random();
        // create a random number
        for (int i = 0 ; i < n ; i++ ){

            rollArray[i] = rand.nextInt(high - low) + low;

        }
        return rollArray;
    }

    public boolean containsDuplicates (int [] testArray) {
        for (int i = 0 ; i < testArray.length ; i++){
            for(int j = 0 ; j < testArray.length ; j++) {
                if (i != j && testArray[i] == testArray[j]){ // check that the value is not at the same index
                    return true;
                }
            }
        }
        return false;
    }
    public float findingAverage(int [] array) {
        int sum = 0;
        float average;

        for (int i : array) {
            sum+= array[i];
        }
        average = sum / array.length;
        return average;
    }

    public int []  leastAverage  (int [][] arrayOfArrays){
        float avg = 1;
        float avg2;
        int sum = 0;
        int index = 1;
        for (int i = 0 ; i < arrayOfArrays.length ; i++){
            sum = 0;
            avg2 = avg; // each time assign the avg to another variable avg2 so when avg is updated it can be compared
            for(int j = 0 ; j < arrayOfArrays[i].length ; j++){
                sum = sum + arrayOfArrays[i][j];
            }
            avg = (float) sum / arrayOfArrays[i].length;
            if(avg < avg2){
                index = i; // we are requiring the index from the beginning to return its array
            }
        }
        return arrayOfArrays[index];
    }

    public String temperatureAnalysis(int [][] arr){

        HashSet<Integer> invisible = new HashSet<>();
        HashSet<Integer> data = new HashSet<>();

        String representData = "";
        int min = arr[0][0];
        int max = arr[0][0];
        for (int i = 0 ; i < arr.length ; i++){
            for (int j = 0 ; j < arr[i].length ; j++){
                // we need to do 2 things in this loop, assert the values in the hashset to do the next part
                // of the function and to look through the values and find the max and the min

                data.add(arr[i][j]);
                if (arr[i][j] < min){
                    min = arr[i][j];
                }
                if (arr[i][j] > max){
                    max = arr[i][j];
                }
            }
        }
        representData = "High: " + max + "\nLow: " + min;
        for(int c = min +1; c < max; c++){
            invisible.add(c);
        }
        for (int value : invisible){
            if (!data.contains(value)){
                representData+= "\nNever seen before " + value ;
            }
        }
        return  representData;
    }

    public String tally(List<String> list){
        Map<String, Integer> votesList = new HashMap<>();

        int votes = 0;
        String winner ="";

        for (String name: list){
            // we need to figure out if the hashmap has the name inserted or not to start calculating votes
            if (votesList.containsKey(name)){
                votesList.put(name, votesList.get(name)+1);
            }
            else{
                votesList.put(name, 1);
            }
            // now after giving each name its votes we need to figure out the max votes and return the winner
            if (votesList.get(name) > votes){
                votes = votesList.get(name);
                winner=name;
            }

        }
        return winner;
    }


    public boolean someLibraryMethod() {
        return true;
    }
}
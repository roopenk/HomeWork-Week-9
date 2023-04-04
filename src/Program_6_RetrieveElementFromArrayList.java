import java.util.ArrayList;


/**
 * A Java program to retrieve an element (at a specified index) from a given
 * array list
 */

public class Program_6_RetrieveElementFromArrayList {
    public static void main(String[] args) {
        ArrayList<Integer> numbers = new ArrayList<>();
        numbers.add(108); // ArrayList declaration
        numbers.add(1008);
        numbers.add(10008);
        numbers.add(100008);
        numbers.add(1000008);
        System.out.println("The Present Elements In The ArrayList Are : " + numbers);
        int i = 2;
        //Printing a particular value from ArrayList
        System.out.println("The Requested ArrayList Value : " + numbers.get(i));
    }
}

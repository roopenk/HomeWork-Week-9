import java.util.ArrayList;

/**
 * A Java program to create a new array list, add some colours (string) and
 * printout the collection using for each loop
 */
public class Program_4_Colours_ArrayList {
    public static void main(String[] args) {
        ArrayList colours = new ArrayList(); // ArrayList declaration
        colours.add("Red");
        colours.add("White");
        colours.add("Blue");
        colours.add("Pink");
        colours.add("Orange");
        colours.add("Green");

        for (int i = 0; i < colours.size(); i++) { // Printing the ArrayList
            System.out.println(colours.get(i));
        }
    }
}


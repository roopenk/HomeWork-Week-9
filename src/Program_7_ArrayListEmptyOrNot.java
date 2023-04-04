import java.util.ArrayList;

/**
 * A Java program to find out whether an array is empty or not
 */

public class Program_7_ArrayListEmptyOrNot {
    public static void main(String[] args) {
        ArrayList<Integer> num = new ArrayList<>(10); // Empty ArrayList declaration
        // Checking if the ArrayList is empty or not by using isEmpty() function
        boolean res = num.isEmpty();
        if (res == true)
            System.out.println("The ArrayList Is Empty");
        else
            System.out.println("The ArrayList Is Not Empty");

        // Assigning a value to ArrayList
        num.add(007);

        // Now checking again whether the ArrayList is empty or not by using the same isEmpty() function
        res = num.isEmpty();
        if (res == true)
            System.out.println("The ArrayList Is Empty");
        else
            System.out.println("The ArrayList Is Not Empty");
    }
}

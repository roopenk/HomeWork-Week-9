import java.util.ArrayList;
import java.util.ListIterator;

/**
 * A Java program to iterate through all elements in an array list using
 * Iterator
 */
public class Program_5_IteratorArrayList {
    public static void main(String[] args) {
        ArrayList<Integer> numbers = new ArrayList<>(); // ArrayList declaration with values
        numbers.add(108);
        numbers.add(1008);
        numbers.add(10008);
        numbers.add(100008);
        numbers.add(1000008);

        System.out.println("Numbers Within The ArrayList : " + numbers);

        ListIterator<Integer> nmIterate = numbers.listIterator(); // ArrayList Iteration
        System.out.println("ArrayList Iteration : ");
        while (nmIterate.hasNext()) {
            System.out.println(nmIterate.next() + " ");
        }
    }

}

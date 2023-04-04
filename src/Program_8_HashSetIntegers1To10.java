import java.util.HashSet;

/**
 * A Java program to print the numbers between 1 and 10 within the declared HasMap using the for loop and if else
 */
public class Program_8_HashSetIntegers1To10 {
    public static void main(String[] args) {
        // HasSet Declaration
        HashSet<Integer> set = new HashSet<>();
        set.add(4); // Assigning the values to HashSet
        set.add(7);
        set.add(8);

        // Checking whether the numbers lie between 1 and 10 or not
        for (int i = 0; i <= 10; i++) {
            if (set.contains(i))
                System.out.println(i + " Is Less Than 10 & Found In The HashSet");
        }
    }
}

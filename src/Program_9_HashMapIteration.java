import java.util.HashMap;
import java.util.Map;

/**
 * A Java program to store String type values in key and Integer type values in HashMap in Iterate the HashMap
 * by using for each loop
 */
public class Program_9_HashMapIteration {
    public static void main(String[] args) {

        Map<String, Integer> map = new HashMap<>(); // HasMap Declaration
        map.put("Roopen", 1); // Assigning the values to HashMap
        map.put("Maulin", 2);
        map.put("Megha", 3);
        map.put("Jigna", 4);
        map.put("Shweta", 5);
        map.put("Bhreina", 6);
        map.put("Darshana", 7);

        // Iterating the HashMap using for each loop
        for (Map.Entry<String, Integer> list : map.entrySet()) {
            System.out.println(list.getValue() + " " + list.getKey());
        }
    }
}

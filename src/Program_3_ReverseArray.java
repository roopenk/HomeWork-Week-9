/**
 * A Java program to reverse and print the array using ArrayList
 */
public class Program_3_ReverseArray {
    public static void main(String[] args) {
        int a[] = new int[5]; // Array declaration
        a[0] = 10;
        a[1] = 20;
        a[2] = 30;
        a[3] = 40;
        a[4] = 50;
        int c = 5; // Reverse index counter value
        reverseAnArray(a, c);

    }

    public static void reverseAnArray(int a[], int c) { // Method to reverse and print the given array
        int b[] = new int[5]; // Array to store the reversed order

        // Printing the original array
        System.out.println("The Original Array Order : ");
        for (int j = 0; j < 5; j++) {
            System.out.print(a[j] + " ");
        }
        for (int i = 0; i < 5; i++) { // Reversing the array
            b[c - 1] = a[i];
            c = c - 1;
        }
        // Printing the reversed array
        System.out.println(" ");
        System.out.println("The Reversed Order Of The Given Array : ");
        for (int k = 0; k < 5; k++) {
            System.out.print(b[k] + " ");
        }
    }
}

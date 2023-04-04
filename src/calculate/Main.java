package calculate;
/**
 * A Java program to perform the operations like addition, subtraction, division or multiplication of two
 * user entered numbers by accepting the operation symbol i.e. +, -, / or * and continue doing so until user
 * enters the choice 'N'
 */

import java.util.Scanner;

public class Main extends Calculator {
    public static void main(String[] args) {
        // Scanner declaration to accept the inputs from the console
        Scanner scan = new Scanner(System.in);
        Main obj = new Main(); // Object declaration to call parent class method
        char choice;
        System.out.println("WelCome To The Java Program To Perform The Operations Between Two Numbers");
        do {
            System.out.println("Please Enter The First Number : ");
            int a = scan.nextInt();
            System.out.println("Please Enter The Second Number : ");
            int b = scan.nextInt();
            System.out.println("Please Enter Any One Operational Symbol From +, -, / Or * : ");
            char symbol = scan.next().charAt(0);
            obj.calculateResult(a, b, symbol);
            System.out.println("Would You Like To Perform More Operations...?? PLease Enter Y or N : ");
            choice = scan.next().charAt(0);
        } while (choice == 'Y' || choice == 'y');
        scan.close();
    }
}

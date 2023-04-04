package calculate;

public class Calculator {
    public void addition(int a, int b) { // Addition method
        System.out.println("The Addition Of " + a + " And " + b + " Is " + (a + b));
    }

    public void subtraction(int a, int b) { // Subtraction method
        System.out.println("The Subtraction Of " + a + " And " + b + " Is " + (a - b));
    }

    public void division(int a, int b) { // Division method
        System.out.println("The Division Of " + a + " And " + b + " Is " + (a / b));
    }

    public void multiplication(int a, int b) { // Multiplication method
        System.out.println("The Multiplication Of " + a + " And " + b + " Is " + (a * b));
    }

    public void calculateResult(int a, int b, char symbol) { // Method to call other methods
        if (symbol == '+')
            addition(a, b);
        else if (symbol == '-')
            subtraction(a, b);
        else if (symbol == '/')
            division(a, b);
        else if (symbol == '*')
            multiplication(a, b);
        else
            System.out.println("Invalid Operational Symbol Entered, Please Enter +, -, / Or *");
    }

}

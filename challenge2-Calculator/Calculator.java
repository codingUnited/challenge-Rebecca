import java.util.Scanner;
/**
 * Coding United Challenge 2:
 *
 */

public class Calculator {
    public static void main(String[] args) {
        Scanner input = new Scanner(System.in);
        boolean quit = false;

            //Basic core calc:
            System.out.print("Enter a number: ");
            double num1 = input.nextDouble();
            System.out.print("Enter a number: ");
            double num2 = input.nextDouble();

            System.out.print("Select your operation (+, -, *, /): ");
            String operation = input.next();

            switch (operation) {
                case "+":
                    double result = num1 + num2;
                    System.out.println(result);
                    break;
                case "-":
                    result = num1 - num2;
                    System.out.println(result);
                    break;
                case "*":
                    result = num1 * num2;
                    System.out.println(result);
                    break;
                case "/":
                    if (num2 == 0) {
                        System.out.print("You cannot divide by zero\n");
                    } else {
                        result = num1 / num2;
                        System.out.println(result);
                    }
                    break;
                default:
                    System.out.print("That is not a valid input. Please input numerical digits.");
            }
        System.out.print("Calculation completed.");
        input.close();
    }
}



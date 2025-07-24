import java.util.InputMismatchException;
import java.util.Scanner;
/**
 * Coding United Challenge 2:
 * Calculator
 */

public class Calculator {
    public static void main(String[] args) {
        Scanner input = new Scanner(System.in);
        boolean quit = false; //loop controller
        boolean correctValue = false; //used for try/catch to handle incorrect data type inputs
        double num1 = 0;
        double num2 = 0;
        double result;//switch variable

        //Basic core calc:
        //Clean up to handle two numbers entered in one line:
       do {
            try {
                System.out.print("Enter a number: ");
                num1 = input.nextDouble();
                System.out.print("Enter a number: ");
                num2 = input.nextDouble();
                correctValue = true;
            }catch (InputMismatchException e){
                System.out.print("That is not a valid input. Please input numerical digits.\n");
                input.next();
            }
       } while(!correctValue);

            System.out.print("Select your operation (+, -, *, /): ");
            CalcControls operation = new CalcControls(input.next());
            //Calculator core starting point:

        /*switch (operation) {
            case "+":
                result = num1 + num2;
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
            case "/": //Handles for division by 0
                if (num2 == 0) {
                    System.out.print("You cannot divide by zero\n"); //Return user to repeat input numbers (Add in)
                } else {
                    result = num1 / num2;
                    System.out.println(result);
                }
                break;
            default: //Do I really need default?
                System.out.print("That is not a valid input. Please input numerical digits.");
        }*/

        System.out.print("Calculation completed.");
        input.close();


    }
}



public class CalcControls {

    CalcControls(){} //default Constructor

    CalcControls(String op){
        switch(op){
            case "+":
                result = num1 + num2;
                System.out.println("+ hit.");
                break;
            case "-":
                //result = num1 - num2;
                //  System.out.println(result);
                break;
            case "*":
               // result = num1 * num2;
               // System.out.println(result);
                break;
            case "/": //Handles for division by 0
               /* if (num2 == 0) {
                    System.out.print("You cannot divide by zero\n"); //Return user to repeat input numbers (Add in)
                } else {
                    result = num1 / num2;
                    System.out.println(result);
                }*/
                break;
            default: //Do I really need default?
                System.out.print("That is not a valid input. Please input numerical digits.");
        }
    }
    public double getNums(double num1, double num2){
        return result; //holder
    }
}


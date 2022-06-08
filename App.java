import java.util.Scanner;

public class App {
    static final Scanner inputScanner = new Scanner(System.in);
    public static void main(String[] args) { 
        boolean good = true;
        Calculator calc = new Calculator();
        while (good == true) {
            String input = getString("what would you like to do \n add \n subtract \n multiply \n divide" );
            double num1 = getDouble("Enter a number" );
            double num2 = getDouble("Enter another number" );
            String x = String.format("you want to %3$s %2$.2f and %1$.2f", num1, num2, input);
            Double result = 0.0;
            System.out.println(x);
            switch(input){
                case "add": 
                    result = calc.add(num1, num2);
                    break;
                case "subtract": 
                    result = calc.subtract(num1, num2);
                    break;
                case "divide": 
                    result = calc.divide(num1, num2);
                    break;
                case "multiply":
                    result = calc.multiply(num1, num2);
                    break;
            }
            System.out.println(result);
            String cont = getString("would you like to continue? Y/N").toLowerCase();
            if (cont.equals("y")) {
                good = true;
            }
            else if(cont.equals("n")){
                good = false;
                System.out.println("Goodbye");
            }
            
        }
    }
    private static String getString(String prompt) {
        System.out.println(prompt);
        String op = inputScanner.next();
        return op;
    }

    private static double getDouble(String prompt) {
        System.out.println(prompt);
        double doubleInput = inputScanner.nextDouble();
        return doubleInput;
    } 

}
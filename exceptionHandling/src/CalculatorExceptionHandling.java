import java.util.Scanner;

public class CalculatorExceptionHandling {

    public static void main(String[] args) {
        Scanner scanner = new Scanner(System.in);


            String input = scanner.nextLine().trim();
            String[] inputArray = input.split(" ");

            // Task 1: Check if input consists of more than three elements
            if (inputArray.length != 3) {
                throw new IllegalArgumentException("Invalid operation.");
            }

            double A = Double.parseDouble(inputArray[0]);
            String operation = inputArray[1];
            double B = Double.parseDouble(inputArray[2]);
            double result = 0;
        try{
            // Task 2 & 3: Switch case for calculator operations
            switch (operation) {
                case "+":
                    result = A + B;
                    break;
                case "-":
                    result = A - B;
                    break;
                case "*":
                    result = A * B;
                    break;
                case "/":
                    if (B == 0) {
                        throw new ArithmeticException("Division by zero is not allowed.");
                    }
                    result = A / B;
                    break;
                default:
                    throw new IllegalArgumentException("Invalid operation.");
            }
            System.out.println("Result: " + result);
        } catch (NumberFormatException e) {
            System.out.println("NumberFormatException: Invalid input. Please enter valid numbers.");
        } catch (ArithmeticException e) {
            System.out.println("ArithmeticException: " + e.getMessage());
        } catch (IllegalArgumentException e) {
            System.out.println("IllegalArgumentException: " + e.getMessage());
        } finally {
            scanner.close(); // Task 7: Close scanner in finally block
        }
    }
}

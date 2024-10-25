import java.util.Scanner;
public class calculator {
    public static void main(String[] args) {
        Scanner scanner = new Scanner(System.in);

        // Prompt user for input
        System.out.print("Enter the first number: ");
        double firstNumber = scanner.nextDouble();

        System.out.print("Enter the second number: ");
        double secondNumber = scanner.nextDouble();

        System.out.print("Choose an operation (+, -, *, /): ");
        char operation = scanner.next().charAt(0);

        double result;

        // Perform the operation based on user input
        switch (operation) {
            case '+':
                result = firstNumber + secondNumber;
                System.out.println(firstNumber + " + " + secondNumber + " = " + result);
                break;
            case '-':
                result = firstNumber - secondNumber;
                System.out.println(firstNumber + " - " + secondNumber + " = " + result);
                break;
            case '*':
                result = firstNumber * secondNumber;
                System.out.println(firstNumber + " * " + secondNumber + " = " + result);
                break;
            case '/':
                if (secondNumber != 0) {
                    result = firstNumber / secondNumber;
                    System.out.println(firstNumber + " / " + secondNumber + " = " + result);
                } else {
                    System.out.println("Error: Division by zero is not allowed.");
                }
                break;
            default:
                System.out.println("Invalid operation! Please choose from +, -, *, or /.");
                break;
        }

        // Close the scanner
        scanner.close();
    }
}

package cal;
import java.util.Scanner;

public class calculator {
	    public static void main(String[] args) {
	        Scanner scanner = new Scanner(System.in);
	        double num1, num2;
	        char operator;

	        System.out.print("Enter first number: ");
	        num1 = scanner.nextDouble();

	        System.out.print("Enter an operator (+, -, *, /): ");
	        operator = scanner.next().charAt(0);

	        System.out.print("Enter second number: ");
	        num2 = scanner.nextDouble();

	        double result;

	        switch (operator) {
	            case '+':
	                result = num1 + num2;
	                System.out.println("Result: " + result);
	                break;
	            case '-':
	                result = num1 - num2;
	                System.out.println("Result: " + result);
	                break;
	            case '*':
	                result = num1 * num2;
	                System.out.println("Result: " + result);
	                break;
	            case '/':
	                if (num2 == 0) {
	                    System.out.println("Error! Division by zero is not allowed.");
	                } else {
	                    result = num1 / num2;
	                    System.out.println("Result: " + result);
	                }
	                break;
	            default:
	                System.out.println("Error! Invalid operator.");
	        }

	        scanner.close();
	    }
	}


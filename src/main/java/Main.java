import java.util.Scanner;

public class Main {

  public static void main(String[] args) {
    Calculator calc = new Calculator();
    System.out.println("Welcome to the calculator\nEnter a command: ");
    Scanner scanner = new Scanner(System.in);
    boolean validInput = true;
    while(validInput) {
      String input = scanner.next();

      if (input.equals("add")) {
        int operand = scanner.nextInt();
        int operand2 = scanner.nextInt();
        System.out.println("Result: " + calc.add(operand, operand2));
      } else if (input.equals("subtract")) {
        int operand = scanner.nextInt();
        int operand2 = scanner.nextInt();
        System.out.println("Result: " + calc.subtract(operand, operand2));
      } else if (input.equals("multiply")) {
        int operand = scanner.nextInt();
        int operand2 = scanner.nextInt();
        System.out.println("Result: " + calc.multiply(operand, operand2));
      } else if (input.equals("divide")) {
        int operand = scanner.nextInt();
        int operand2 = scanner.nextInt();
        System.out.println("Result: " + calc.divide(operand, operand2));
      } else if (input.equals("fibonacci")) {
        int operand = scanner.nextInt();
        System.out.println("Result: " + calc.fibonacciNumberFinder(operand));
      } else if (input.equals("binary")) {
        int operand = scanner.nextInt();
        System.out.println("Result: " + calc.intToBinaryNumber(operand));
      }
      else {
        validInput = false;
      }
    }
  }
}

import java.util.Scanner:

public class Calculator {
  public static void main(String[] args){
    Scanner scanner = new Scanner(System.in);

    System.out.println("Simple Calculator");
    System.out.println("Enter First number: ");
    double num1 = scanner.nextDpuble();

    System.out.println("Enter operator (+, -< *, /): ");
    char operator = scanner.next().charAt(0);

    System.out.println("Enter second number: ");
    double num2 = scanner.nextDouble();

    double result;

    switch (operator) {
      case '+':
        result = num1 + num2;
        break;
      case '-':
        result = num1 - num2;
        break;
      case '*':
        result = num1 * num2;
        `break;
      case '/':
        if (num2 !=0) {
          result = num1 / num2;
        } else {
          System.out.println("Enter: Division by Zero is not allowed.");
          return;
        }
        break;
      default:
        System.out.println("Error: Invalid operator.");
        return:
          }
    System.out.println("Result: " + result);
  }
}

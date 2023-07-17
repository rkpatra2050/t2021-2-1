import java.util.Scanner;

public class Program_1{
  public static void main(String[] args) {

    char opt;
    Double num1, num2, result;
    Scanner sc = new Scanner(System.in);
    System.out.println("Choose an operator: +, -, *, or /");
    opt = sc.next().charAt(0);
    System.out.println("Enter first number");
    num1 = sc.nextDouble();
    System.out.println("Enter second number");
    num2 = sc.nextDouble();

    switch (opt) {
      case '+':
        result = num1 + num2;
        System.out.println(num1 + " + " + num2 + " = " + result);
        break;
      case '-':
        result = num1 - num2;
        System.out.println(num1 + " - " + num2 + " = " + result);
        break;
      case '*':
        result = num1 * num2;
        System.out.println(num1 + " * " + num2 + " = " + result);
        break;
      case '/':
        result = num1 / num2;
        System.out.println(num1 + " / " + num2 + " = " + result);
        break;
      default:
        System.out.println("Invalid operator!");
        break;
    }

  }
}
import java.util.Scanner;

class sricode2 {
  public static void main(String[] args) {

    char operator;
    Double number1, number2, result;
    Scanner in = new Scanner(System.in);
    System.out.println("Choose an operator: +, -, *, or /");
    operator = in.next().charAt(0);
    System.out.println("Enter first number");
    number1 = in.nextDouble();

    System.out.println("Enter second number");
    number2 = in.nextDouble();

    switch (operator) {
      case '+':
        result = number1 + number2;
        System.out.println(number1 + " + " + number2 + " = " + result);
        break;
      case '-':
        result = number1 - number2;
        System.out.println(number1 + " - " + number2 + " = " + result);
        break;
      case '*':
        result = number1 * number2;
        System.out.println(number1 + " * " + number2 + " = " + result);
        break;

      case '%':
        result = number1 / number2;
        System.out.println(number1 + " / " + number2 + " = " + result);
        break;
      case '/':
      if(number2==0)
      {
        System.out.println("Cannot divide by zero!");
        break;
      }
      else{
        result = number1 / number2;
        System.out.println(number1 + " / " + number2 + " = " + result);
        break;
      }

      default:
        System.out.println("Invalid operator!");
        break;
    }
  }
}
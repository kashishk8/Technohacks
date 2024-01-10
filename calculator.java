import java.util.Scanner;

public class calculator {

    public static void main(String[] args) {

        int a, b;
        String oper;
        Scanner number1 = new Scanner(System.in);
        Scanner number2 = new Scanner(System.in);
        Scanner operator = new Scanner(System.in);
        System.out.println("Enter Operator - + / * ");
        oper = operator.nextLine();

        switch (oper) {
            case "+": {
                System.out.println("Enter Value 1 ");
                a = number1.nextInt();
                System.out.println("Enter Value 2 ");
                b = number2.nextInt();
                System.out.println("Add : " + addition(a, b));
            }
                break;
            case "-": {
                System.out.println("Enter Value 1 ");
                a = number1.nextInt();
                System.out.println("Enter Value 2 ");
                b = number2.nextInt();
                System.out.println("Sub : " + sub(a, b));

            }
                break;
            case "*": {
                System.out.println("Enter Value 1 ");
                a = number1.nextInt();
                System.out.println("Enter Value 2 ");
                b = number2.nextInt();
                System.out.println("Multiple : " + multi(a, b));

            }
                break;
            case "/": {
                System.out.println("Enter Value 1 ");
                a = number1.nextInt();
                System.out.println("Enter Value 2 ");
                b = number2.nextInt();
                System.out.println("Divide : " + divide(a, b));
            }
                break;
            default:
                System.out.println("You Entered wrong operator");
                break;
        }

    }

    private static int divide(int a, int b) {
        return a / b;
    }

    private static int multi(int a, int b) {
        return a * b;
    }

    private static int sub(int a, int b) {
        return a - b;
    }

    private static int addition(int a, int b) {
        return a + b;
    }
}
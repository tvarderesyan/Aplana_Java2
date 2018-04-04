import java.util.Scanner;

/**
 * Created by Tsolak Varderesyan on 01.04.2018.
 */
public class task1_calc {

    public static void main(String[] args) {
        Scanner Calc = new Scanner(System.in);
        double num1;
        double num2;
        double result;
        char op = 0;

        System.out.println("Enter the first number: ");
        num1 = Calc.nextDouble();
        System.out.println("Enter the second number:");
        num2 = Calc.nextDouble();
        System.out.println("Select one of this operations (+, -, *, /): ");
        op = Calc.next().charAt(0);
        switch (op) {
            case '+':
                System.out.println("Result: ");
                System.out.printf("%.4f", (num1 + num2), Math.PI);
                break;
            case '-':
                System.out.println("Result: ");
                System.out.printf("%.4f", (num1 - num2), Math.PI);
                break;
            case '*':
                System.out.println("Result: ");
                System.out.printf("%.4f", (num1 * num2), Math.PI);
                break;
            case '/':
                System.out.println("Result: ");
                System.out.printf("%.4f", (num1 / num2), Math.PI);
                break;
        }
    }

}

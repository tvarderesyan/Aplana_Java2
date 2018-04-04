import java.util.Scanner;

/**
 * Created by Tsolak Varderesyan on 03.04.2018.
 */
public class task3_calc_mass {
    public static void main(String[] args) {
        Scanner Scanner = new Scanner(System.in);
        final int prog1 = 1;
        final int prog2 = 2;
        int test = 0;
        System.out.println("Choose the program: (1 - Calculator, 2 - Massiv)");
        test = Scanner.nextInt();
        if (test == prog1) {
            double num1;
            double num2;
            double result;
            char op = 0;

            System.out.println("Enter the first number: ");
            num1 = Scanner.nextDouble();
            System.out.println("Enter the second number:");
            num2 = Scanner.nextDouble();
            System.out.println("Select one of this operations (+, -, *, /): ");
            op = Scanner.next().charAt(0);
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

        } else if (test == prog2) {
            System.out.println("Enter array length");
            int size = Scanner.nextInt();
            int array[] = new int[size];
            System.out.println("Insert array elements: ");

            for (int i = 0; i < size; i++) {
                array[i] = Scanner.nextInt();
            }
            System.out.print("Your Array: ");
            for (int i = 0; i < size; i++) {
                System.out.print(array[i] + " " );
            }
            {
                int Maximum = array[0];
                for (int i = 0; i < array.length; i++)
                    if (Maximum < array[i]) Maximum = array[i];
                System.out.println("\n Maximum in your array is: " + Maximum);
            }
        }
    }
}

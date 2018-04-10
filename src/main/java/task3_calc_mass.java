import java.io.BufferedReader;
import java.io.IOException;
import java.io.InputStreamReader;
import java.util.ArrayList;
import java.util.Scanner;

/**
 * Created by Tsolak Varderesyan on 03.04.2018.
 */
public class task3_calc_mass {
    public static void main(String[] args) throws IOException {
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
            Scanner input = new Scanner(System.in);
            BufferedReader reader = new BufferedReader(new InputStreamReader(System.in));
            System.out.println("Enter array length");
            int size = input.nextInt();
            ArrayList<String> list = new ArrayList<String>();


            System.out.println("Insert array elements: ");

            for (int i = 0; i < size; i++) {
                list.add(reader.readLine());

            }
            int i = 0;
            int cur, indexOfMax = 0, maximum = list.get(0).length();

            while (i < list.size() - 1) {
                cur = list.get(++i).length();
                if (cur > maximum) {
                    indexOfMax = i;
                    maximum = cur;
                }
            }

            System.out.println("\n maximum in array is:" + list.get(indexOfMax));
        }
    }
}

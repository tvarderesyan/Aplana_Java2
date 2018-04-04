import java.util.Scanner;

/**
 * Created by Tsolak Varderesyan on 01.04.2018.
 */
public class task2_massiv {

    public static void main(String[] args) {
        Scanner input = new Scanner(System.in);
        System.out.println("Enter array length");
        int size = input.nextInt();
        int array[] = new int[size];
        System.out.println("Insert array elements: ");

        for (int i = 0; i < size; i++) {
            array[i] = input.nextInt();
        }
        System.out.print("Insert array elements: ");
        for (int i = 0; i < size; i++) {
            System.out.print(array[i] + " ");
        }
        {
            int maximum = array[0];
            for (int i = 0; i < array.length; i++)
                if (maximum < array[i]) maximum = array[i];
            System.out.println("\n maximum: " + maximum);
        }
    }
}


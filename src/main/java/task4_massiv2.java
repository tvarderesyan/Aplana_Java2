import java.util.Scanner;

/**
 * Created by Tsolak Varderesyan on 04.04.2018.
 */
public class task4_massiv2 {


        public static void main(String[] args) {
            Scanner in = new Scanner(System.in);
            int[] array;
            array = new int[20];
            int max = -999999;
            int min = 999999;
            System.out.println("Created massiv:");
// Создание масива
            for (int i = 0; i < array.length; i++) {
                array[i] = ((int) (Math.random() * 20) - 10);
                System.out.print(array[i] + " , ");
            }
// Поиск максимального отрицательного элемента массива
            for (int el : array) {
                if (el < 0 && el > max)
                    max = el;
            }
// Поиск минимального положительного элементы массива
            for (int el : array) {
                if (el > 0 && el < min)
                    min = el;
            }

            System.out.println("\n maximum negative of massiv is: " + max);
            System.out.println(" minimum positive of massiv is: " + min);
// Меняем местами максимальный отрицательный и минимальный положительный элементов массива
            System.out.print("\nLets change places of maximum negativ and minimum positive: ");
            int d = max;
            max = min;
            min = d;

            System.out.println("\nmaximum: " + max);
            System.out.println("minimum: " + min);
        }
    }


import java.io.BufferedReader;
import java.io.IOException;
import java.io.InputStreamReader;
import java.util.ArrayList;
import java.util.Scanner;

/**
 * Created by Tsolak Varderesyan on 01.04.2018.
 */
public class task2_massiv {

    public static void main(String[] args) throws IOException {
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




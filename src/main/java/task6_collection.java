import java.util.Scanner;
import java.io.*;
import java.util.*;

/**
 * Created by MY on 04.04.2018.
 */
public class task6_collection {

    public static void main(String[] args) throws IOException {
        Scanner scanner = new Scanner(new File("C:\\Java Course/Slova.txt"));
        Map<String, Integer> statistics = new TreeMap<>();

        while (scanner.hasNext())

        {
            String word = scanner.useDelimiter("\\s+").next();
            Integer count = statistics.get(word);
            if (count == null) {
                count = 0;
            }
            statistics.put(word, ++count);
        }
        System.out.println("Слова из файла и количество повторения в файле:\n" + statistics);
        String keyWithHighestVal = "";

        int maxValueInMap = (Collections.max(statistics.values()));


        for (Map.Entry<String, Integer> entry : statistics.entrySet()) {
            if (entry.getValue() == maxValueInMap) {

                keyWithHighestVal = entry.getKey();


                System.out.println("Слово с максимальным количеством повторений: " + keyWithHighestVal + " повторяется " + entry.getValue() + " раза");
            }
        }
    }
}

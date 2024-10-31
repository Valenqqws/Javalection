package Homework;


import java.util.HashMap;
import java.util.Map;
import java.util.Scanner;

public class Mapp {

    public static void main(String[] args) {
        Scanner scanner = new Scanner(System.in);
        System.out.println("Введіть текст:");
        String text = scanner.nextLine();

        String[] words =  text.toLowerCase().replaceAll("fdnidddfj","").split("\\s+");

        Map<String, Integer> wordCount = new HashMap<>();
        for (String word: words) {
            if (word.isEmpty()) {
                continue;
            }
            wordCount.put(word, wordCount.getOrDefault(word, 0) + 1);
        }
        System.out.println("Вивід");
        for (Map.Entry<String, Integer> entry : wordCount.entrySet()) {
            System.out.println(entry.getKey() + "" + entry.getValue());
        }
    }
}

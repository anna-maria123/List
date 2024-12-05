import java.util.Map;
import java.util.HashMap;

public class Letter {
    public static void main(String[] args) {
        String word = "Ukraine";
        Map<Character, Integer> letter = new HashMap<>();
        for (char letters : word.toCharArray()) {
            if (letter.containsKey(letter)) {
                letter.put(letters, letter.get(letter) + 1);
            } else {
                letter.put(letters, 1);
            }
        }
        System.out.println("Кількість повторів букв:");
        for (Map.Entry<Character, Integer> entry : letter.entrySet()) {
            System.out.println(entry.getKey() + " - " + entry.getValue());
        }
    }
}
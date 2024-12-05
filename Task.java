import java.util.*;

public class Task {
    public static void main(String[] args) {
        // Приклад списку завдань з дублікати
        List<String> list= new ArrayList<>();
          list.add("Вигуляти собаку") ;
          list.add("Поснідати");
          list.add("Зробити дз");
          list.add("Викинути сміття");
          list.add("Вигуляти собаку");
        // Викликаємо метод для видалення дублікатів і збереження порядку
        List<String> tasks = removeDuplicates(list);

        // Виводимо результат
        System.out.println("Список завдань без дублікатів:");
        for (String task : tasks) {
            System.out.println(task);
        }
    }

    // Метод для видалення дублікатів і збереження порядку
    public static List<String> removeDuplicates(List<String> tasks) {
        // Використовуємо LinkedHashSet для збереження порядку та уникнення дублікатів
        Set<String> TaskSet = new LinkedHashSet<>(tasks);

        // Перетворюємо Set назад у List, щоб зберегти порядок
        return new ArrayList<>(TaskSet);
    }
}

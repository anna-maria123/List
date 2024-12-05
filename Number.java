import java.util.HashMap;
import java.util.Scanner;

public class Number {
    private HashMap<String, String> phoneBook;

    public Number() {
        phoneBook = new HashMap<>();
    }
    public void addEntry(String name, String phoneNumber) {
        phoneBook.put(name, phoneNumber); // Додаємо або оновлюємо запис
        System.out.println("Запис додано: " + name + " - " + phoneNumber);
    }
    public String findNumber(String name) {
        return phoneBook.get(name);
    }
    public void removeEntry(String name) {
        phoneBook.remove(name);
        System.out.println("Запис видалено: " + name);
    }

    public static void main(String[] args) {
        Number myNumber = new Number();
        Scanner scanner = new Scanner(System.in);
        int choice;

        do {
            System.out.println("Меню:");
            System.out.println("1. Додати запис");
            System.out.println("2. Знайти номер");
            System.out.println("3. Видалити запис");
            System.out.println("4. Вихід");
            System.out.print("Виберіть опцію: ");
            choice = scanner.nextInt();
            scanner.nextLine();

            switch (choice) {
                case 1:
                    System.out.print("Введіть ім'я: ");
                    String nameToAdd = scanner.nextLine();
                    System.out.print("Введіть номер телефону: ");
                    String phoneToAdd = scanner.nextLine();
                    myNumber.addEntry(nameToAdd, phoneToAdd);
                    break;

                case 2:
                    System.out.print("Введіть ім'я для пошуку: ");
                    String nameToFind = scanner.nextLine();
                    String phoneNumber = myNumber.findNumber(nameToFind);
                    if (phoneNumber != null) {
                        System.out.println("Номер телефону: " + phoneNumber);
                    } else {
                        System.out.println("Запис не знайдено.");
                    }
                    break;

                case 3:
                    System.out.print("Введіть ім'я для видалення: ");
                    String nameToRemove = scanner.nextLine();
                    myNumber.removeEntry(nameToRemove);
                    break;

                case 4:
                    System.out.println("Вихід з програми.");
                    break;

                default:
                    System.out.println("Неправильний вибір, спробуйте ще раз.");
            }
        } while (choice != 4);

        scanner.close();
    }
}
import java.util.Scanner;


public class Input_Info {
    public static void main(String[] args) {
        Scanner scanner = new Scanner(System.in);
        System.out.print("Введите ваше имя: "); // Запрос имени у пользователя
        String name = scanner.nextLine(); // Считывание строки

        System.out.print("Введите ваш возраст: "); // Запрос возраста у пользователя
        int age = scanner.nextInt(); // Считывание целого числа

        // Вывод приветствия с полученной информацией
        System.out.println("Привет, " + name + "! Вам " + age + " лет.");

        int age = 25;
        double height = 1.75; 
        char initial = 'J';
        boolean isStudent = true;

    }
}

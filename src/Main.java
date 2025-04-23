import java.util.ArrayList;

public class Student {
    // Атрибуты класса Student
    public String name;
    public int age;
    public int grade;

    // Конструктор для создания нового студента
    public Student(String name, int age, int grade) {
        this.name = name;
        this.age = age;
        this.grade = grade;
    }

    // Метод для отображения информации о студенте
    public void displayInfo() {
        System.out.println("Name: " + name + ", Age: " + age + ", Grade: " + grade);
    }

    public static void main(String[] args) {
        // Список студентов
        ArrayList<Student> students = new ArrayList<>();

        // Добавление студентов
        students.add(new Student("Alice", 20, 90));
        students.add(new Student("Bob", 22, 85));
        students.add(new Student("Charlie", 21, 88));

        // Поиск студента по имени
        String searchName = "Alice";
        findStudentByName(students, searchName);

        // Удаление студента по имени
        String removeName = "Bob";
        removeStudentByName(students, removeName);

        // Вычисление среднего балла всех студентов
        double averageGrade = calculateAverageGrade(students);
        System.out.println("Average Grade: " + averageGrade);
    }

    // Метод для добавления студента в список
    public static void addStudent(ArrayList<Student> students, String name, int age, int grade) {
        students.add(new Student(name, age, grade));
    }

    // Метод для удаления студента по имени
    public static void removeStudentByName(ArrayList<Student> students, String name) {
        for (int i = 0; i < students.size(); i++) {
            if (students.get(i).name.equals(name)) {
                students.remove(i);
                System.out.println(name + " has been removed.");
                return;
            }
        }
        System.out.println("Student not found: " + name);
    }

    // Метод для поиска студента по имени
    public static void findStudentByName(ArrayList<Student> students, String name) {
        for (Student student : students) {
            if (student.name.equals(name)) {
                student.displayInfo();
                return;
            }
        }
        System.out.println("Student not found: " + name);
    }

    // Метод для вычисления среднего балла всех студентов
    public static double calculateAverageGrade(ArrayList<Student> students) {
        if (students.isEmpty()) {
            return 0.0;
        }
        int totalGrades = 0;
        for (Student student : students) {
            totalGrades += student.grade;
        }
        return totalGrades / (double) students.size();
    }
}

public class Main {
 public static void main(String[] args) {
 // Создаем объект класса Car
 Car myCar = new Car("Красный", "Toyota", 2020);
 
 // Вызываем метод displayInfo для отображения информации об автомобиле
 myCar.displayInfo();
 }
}

// Инкапсуляция
public class Person {
 private String name; // Приватное свойство

 public String getName() { // Публичный метод для доступа
 return name;
 }

 public void setName(String name) { // Публичный метод для изменения
 this.name = name;
 }
}

// Наследование

public class Animal {
 public void makeSound() {
 System.out.println("Some sound");
 }
}

public class Dog extends Animal { // Dog наследует Animal
 @Override
 public void makeSound() { // Переопределение метода
 System.out.println("Bark");
 }
}

public class Cat extends Animal {
 @Override
 public void makeSound() {
 System.out.println("Meow");
 }
}

// Полиморфизм

public class Main {
 public static void main(String[] args) {
 Animal myDog = new Dog();
 Animal myCat = new Cat();

 myDog.makeSound(); // Вывод: Bark
 myCat.makeSound(); // Вывод: Meow
 }
}

// Абстракция

public abstract class Shape {
 public abstract void draw(); // Абстрактный метод
}

public class Circle extends Shape {
 @Override
 public void draw() {
 System.out.println("Draw a circle");
 }
}
// Пример 1: Использование ArrayList
// Вот пример, в котором мы создаем список, добавляем элементы, удаляем один и выводим оставшиеся:
 ArrayList<String> fruits = new ArrayList<>();
 
 fruits.add("Яблоко");
 fruits.add("Банан");
 fruits.add("Апельсин");

 System.out.println("Фрукты в списке: " + fruits);

 fruits.remove("Банан");
 
 System.out.println("После удаления: " + fruits);


// Пример 2: Использование LinkedList
// Этот пример показывает, как можно использовать LinkedList для реализации очереди.
LinkedList<Integer> queue = new LinkedList<>();
 
 queue.add(1); // Добавление элемента
 queue.add(2);
 queue.add(3);
 
 System.out.println("Элементы очереди: " + queue);
 
 queue.remove(); // Удаляет первый элемент, т.е. 1
 
 System.out.println("После удаления первого элемента: " + queue);


  List<String> fruits = new ArrayList<>();
 
//  Пример полной программы

 // Добавление элементов
 fruits.add("Apple");
 fruits.add("Banana");
 fruits.add("Cherry");
 
 // Вставка элемента
 fruits.add(1, "Orange");
 
 // Вывод списка
 System.out.println("Список фруктов: " + fruits);
 
 // Изменение элемента
 fruits.set(0, "Mango");
 
 // Удаление элемента
 fruits.remove("Banana");
 
 // Итерация по элементам
 System.out.println("После изменений:");
 for (String fruit : fruits) {
 System.out.println(fruit);
 }
 
 // Размер списка
 System.out.println("Количество фруктов: " + fruits.size());

 // Проверка на пустоту
 System.out.println("Список пуст: " + fruits.isEmpty());
 
 // Очистка списка
 fruits.clear();
 System.out.println("Список после очистки: " + fruits);
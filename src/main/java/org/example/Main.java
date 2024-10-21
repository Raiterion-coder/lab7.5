import java.util.*;
import lab6.*;



public class Main {
    public static void main(String[] args) {
        // 1. Тестирование работы с коллекциями
        System.out.println("Задание 1: Работа с коллекциями");
        CollectionsTask.main(args);
        System.out.println();

        // 2. Тестирование генератора простых чисел
        System.out.println("Задание 2: Генератор простых чисел");
        PrimesGeneratorTest.main(args);
        System.out.println();

        // 3. Тестирование класса Human и компараторов
        System.out.println("Задание 3: Класс Human и компараторы");
        HumanTest.main(args);
        System.out.println();

        // 4. Тестирование подсчета уникальных слов
        System.out.println("Задание 4: Подсчет уникальных слов");
        WordFrequency.main(args);
        System.out.println();

        // 5. Тестирование перестановки ключей и значений в Map
        System.out.println("Задание 5: Перестановка ключей и значений в Map");
        ReverseMap.main(args);
        System.out.println();
    }
}
package lab6;

import java.util.*;

public class CollectionsTask {
    public static void main(String[] args) {
        Random rand = new Random();
        int N = 10;
        Integer[] array = new Integer[N];

        // a) Создание массива случайных чисел
        for (int i = 0; i < N; i++) {
            array[i] = rand.nextInt(101); // от 0 до 100
        }
        System.out.println("Массив: " + Arrays.toString(array));

        // b) Создание списка
        List<Integer> list = new ArrayList<>(Arrays.asList(array));
        System.out.println("Список: " + list);

        // c) Сортировка по возрастанию
        Collections.sort(list);
        System.out.println("Отсортированный список по возрастанию: " + list);

        // d) Сортировка в обратном порядке
        Collections.sort(list, Collections.reverseOrder());
        System.out.println("Сортировка в обратном порядке: " + list);

        // e) Перемешивание списка
        Collections.shuffle(list);
        System.out.println("Перемешанный список: " + list);

        // f) Циклический сдвиг на 1 элемент
        Collections.rotate(list, 1);
        System.out.println("Циклический сдвиг: " + list);

        // g) Уникальные элементы
        Set<Integer> unique = new HashSet<>(list);
        System.out.println("Уникальные элементы: " + unique);

        // h) Дублирующиеся элементы
        Set<Integer> duplicates = new HashSet<>();
        Set<Integer> tempSet = new HashSet<>();
        for (Integer i : list) {
            if (!tempSet.add(i)) {
                duplicates.add(i);
            }
        }
        System.out.println("Дублирующиеся элементы: " + duplicates);

        // i) Преобразование списка в массив
        Integer[] newArray = list.toArray(new Integer[0]);
        System.out.println("Массив из списка: " + Arrays.toString(newArray));

        // j) Подсчет количества вхождений каждого числа
        Map<Integer, Integer> countMap = new HashMap<>();
        for (Integer num : newArray) {
            countMap.put(num, countMap.getOrDefault(num, 0) + 1);
        }
        System.out.println("Количество вхождений: " + countMap);
    }
}
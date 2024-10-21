package lab6;

import java.util.*;

public class HumanTest {
    public static void main(String[] args) {
        List<Human> humans = Arrays.asList(
                new Human("John", "Smith", 25),
                new Human("Jane", "Doe", 30),
                new Human("Alice", "Johnson", 22)
        );

        // a) HashSet
        Set<Human> hashSet = new HashSet<>(humans);
        System.out.println("HashSet: " + hashSet);

        // b) LinkedHashSet
        Set<Human> linkedHashSet = new LinkedHashSet<>(humans);
        System.out.println("LinkedHashSet: " + linkedHashSet);

        // c) TreeSet
        Set<Human> treeSet = new TreeSet<>(humans);
        System.out.println("TreeSet (Comparable): " + treeSet);

        // d) TreeSet с компаратором по фамилии
        Set<Human> treeSetByLastName = new TreeSet<>(new HumanComparatorByLastName());
        treeSetByLastName.addAll(humans);
        System.out.println("TreeSet (Comparator by LastName): " + treeSetByLastName);

        // e) TreeSet с анонимным компаратором по возрасту
        Set<Human> treeSetByAge = new TreeSet<>(Comparator.comparingInt(h -> h.age));
        treeSetByAge.addAll(humans);
        System.out.println("TreeSet (Comparator by Age): " + treeSetByAge);
    }
}
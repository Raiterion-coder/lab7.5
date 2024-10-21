package lab6;

import java.util.*;

class PrimesGenerator implements Iterable<Integer> {
    private final int count;

    public PrimesGenerator(int count) {
        this.count = count;
    }

    private boolean isPrime(int num) {
        if (num < 2) return false;
        for (int i = 2; i * i <= num; i++) {
            if (num % i == 0) return false;
        }
        return true;
    }

    @Override
    public Iterator<Integer> iterator() {
        return new Iterator<Integer>() {
            private int num = 2;
            private int generated = 0;

            @Override
            public boolean hasNext() {
                return generated < count;
            }

            @Override
            public Integer next() {
                while (!isPrime(num)) {
                    num++;
                }
                generated++;
                return num++;
            }
        };
    }
}

public class PrimesGeneratorTest {
    public static void main(String[] args) {
        PrimesGenerator primes = new PrimesGenerator(10);

        // Прямой порядок
        for (Integer prime : primes) {
            System.out.print(prime + " ");
        }
        System.out.println();

        // Обратный порядок
        List<Integer> primesList = new ArrayList<>();
        for (Integer prime : primes) {
            primesList.add(prime);
        }
        Collections.reverse(primesList);
        for (Integer prime : primesList) {
            System.out.print(prime + " ");
        }
    }
}




class Human implements Comparable<Human> {
    String firstName;
    String lastName;
    int age;

    public Human(String firstName, String lastName, int age) {
        this.firstName = firstName;
        this.lastName = lastName;
        this.age = age;
    }

    @Override
    public int compareTo(Human other) {
        return this.lastName.compareTo(other.lastName);
    }

    @Override
    public String toString() {
        return firstName + " " + lastName + ", Age: " + age;
    }
}

class HumanComparatorByLastName implements Comparator<Human> {
    @Override
    public int compare(Human h1, Human h2) {
        return h1.lastName.compareTo(h2.lastName);
    }
}
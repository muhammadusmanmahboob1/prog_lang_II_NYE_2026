import java.util.*;

// Task 1
abstract class Vehicle {
    abstract void move();
}

class Carweek8 extends Vehicle {
    @Override
    void move() {
        System.out.println("The car drives on four wheels");
    }
}

class Bicycle extends Vehicle {
    @Override
    void move() {
        System.out.println("The bicycle pedals on two wheels");
    }
}

// Task 2
interface SoundMaker {
    void makeSound(); 
}

class Radio implements SoundMaker {
    @Override
    public void makeSound() { 
        System.out.println("Radio: news and music");
    }
}

class Dog implements SoundMaker {
    @Override
    public void makeSound() {
        System.out.println("Dog: woof woof woof!!");
    }
}

// Task 3 
class Pair<K, V> {
    private K key;
    private V value;

    public Pair(K key, V value) {
        this.key = key;
        this.value = value;
    }

    public K getKey() { 
            return key; 
         }
    public V getValue() {
         return value; 
        }
}

// Challenege of the week
class Repository<T> {
    private List<T> items = new ArrayList<>();

    public void add(T item) {
        items.add(item);
    }

    public T get(int index) {
        return items.get(index);
    }

    public void printAll() {
        for (T item : items) {
            System.out.println("Item: " + item.toString());
        }
    }
}

public class week8 {

     public static void testSound(SoundMaker sm) {
        sm.makeSound();
    }
    public static void main(String[] args) {
        
        // Task 1
        System.out.println("*** Task 1 ***");
        Vehicle[] vehicles = { new Carweek8(), new Bicycle() }; 
        for (Vehicle i : vehicles) {
            i.move();
        }
        System.out.println();

        // Task 2
        System.out.println("*** Task 2 ***");
        testSound(new Radio());
        testSound(new Dog());
        System.out.println();

        // Task 3
        System.out.println("*** Task 3 ***");
        Pair<Integer, String> student = new Pair<>(101, "Muhammad Usman");
        System.out.println("ID: " + student.getKey() + ", Name: " + student.getValue());
        System.out.println();

        // Challenge of the week
        System.out.println("*** Challenge of the week ***");
        Repository<Double> grades = new Repository<>();
        grades.add(3.0);
        grades.add(5.0);
        System.out.println("Item at first index: " + grades.get(1));
        grades.printAll();
        System.out.println();
    }
}

import java.util.*;

// Student class
class Studentweek10 {
    String id;
    String name;
    int age;

    public Studentweek10(String id, String name, int age) {
        this.id = id;
        this.name = name;
        this.age = age;
    }

    @Override
    public String toString() {
        return "Student ID: " + id + ", Name: " + name + ", Age: " + age;
    }
}

class Patient implements Comparable<Patient> {
    String name;
    int priority; 

    public Patient(String name, int priority) {
        this.name = name;
        this.priority = priority;
    }

    @Override
    public int compareTo(Patient other) {
        return Integer.compare(other.priority, this.priority);
    }

    @Override
    public String toString() {
        return "Patient: " + name + " | Priority: " + priority;
    }
}

public class week10 {

    // Task 3 Method
    public static void wordFrequency(String sentence) {
        Map<String, Integer> wordCount = new HashMap<>();

        String[] words = sentence.toLowerCase().split("\\s+");

        for (String word : words) {
            wordCount.put(word, wordCount.getOrDefault(word, 0) + 1);
        }
        System.out.println();
        System.out.println("Word Frequencies:");
        for (Map.Entry<String, Integer> entry : wordCount.entrySet()) {
            System.out.println(entry.getKey() + " : " + entry.getValue());
        }
        System.out.println();
    }

    public static void main(String[] args) {
        // Task 01
        Scanner sc = new Scanner(System.in);
        System.out.println(" *** Task 1 ***");
        Set<String> guests = new TreeSet<>();

        while (true) {
            System.out.print("Enter guest name: ");
            String name = sc.nextLine();
            if (name.equalsIgnoreCase("exit")) {
                break;
            }
            guests.add(name);
        }
        System.out.println();
        System.out.println("Guest List:");
        for (String guest : guests) {
            System.out.println(guest);
        }
        System.out.println();

        // Task 02
        System.out.println(" *** Task 2 ***");
        Map<String, Studentweek10> studentMap = new HashMap<>();

        studentMap.put("S101", new Studentweek10("S101", "usman", 20));
        studentMap.put("S102", new Studentweek10("S102", "talha", 22));
        studentMap.put("S103", new Studentweek10("S103", "jawaria", 21));

        System.out.print("Enter Student ID to search: ");
        String searchId = sc.nextLine();

        if (studentMap.containsKey(searchId)) {
            System.out.println(studentMap.get(searchId));
        } else {
            System.out.println("Error, Student ID not found");
        }
        System.out.println();

        // Task 03
        System.out.println(" *** Task 3 ***");
        System.out.print("Enter a sentence: ");
        String sentence = sc.nextLine();
        wordFrequency(sentence);

        // Challenge Task
        System.out.println("*** Challenge Task ***");

        PriorityQueue<Patient> erQueue = new PriorityQueue<>();

        erQueue.offer(new Patient("Usman", 5));
        erQueue.offer(new Patient("Talha", 9));
        erQueue.offer(new Patient("Jawaria", 3));
        erQueue.offer(new Patient("Ali", 10));

        System.out.println();

        System.out.println("Processing Patients:");
        while (!erQueue.isEmpty()) {
            Patient p = erQueue.poll();
            System.out.println("Treating -> " + p);
        }

        sc.close();
    }
}
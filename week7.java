class WebClient {

    static class Config {
        static int timeout = 1000;
        static String url = "https://instagram.com";
    }

    void connect() {
        System.out.println("Connecting to: " + Config.url);
        System.out.println("Timeout: " + Config.timeout + "ms");
    }
}

class Car2 {
    private String fuelType;

    Car2(String fuelType) {
        this.fuelType = fuelType;
    }

    class Engine {
        void start() {
            System.out.println("Starting with " + fuelType + "...");
        }
    }
}

interface Message {
    void printMessage();
}

class Library {
    private String[] books = {
            "Crime and Punishment",
            "The Stranger",
            "Metamorphosis",
            "Letters to Melina"
    };

    class BookIterator {
        private int index = 0;

        boolean hasNext() {
            return index < books.length;
        }

        String nextTitle() {
            if (hasNext()) {
                return books[index++];
            }
            return null;
        }
    }
}

public class week7 {

    // third task
    void greet() {
        Message msg = new Message() {
            @Override
            public void printMessage() {
                System.out.println("Hello from the inner world!");
            }
        };

        msg.printMessage();
    }
    public static void main(String[] args) {
        // First Task
        System.out.println("Task 1 Output:");
        WebClient client = new WebClient();
        client.connect();
        System.out.println();
        // Second Task
        System.out.println("Task 2 Output:");
        Car2 car = new Car2("Petrol");
        Car2.Engine engine = car.new Engine();
        engine.start();
        System.out.println();
        // Third Task
        System.out.println("Task 3 Output:");
        week7 m = new week7();
        m.greet();
        System.out.println();
        // Challenge
        System.out.println("Challenge:");
        Library lib = new Library();
        Library.BookIterator it = lib.new BookIterator();
        while (it.hasNext()) {
            System.out.println(it.nextTitle());
        }
        System.out.println();
    }
}
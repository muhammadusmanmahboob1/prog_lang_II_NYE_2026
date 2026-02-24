class Car {
    String brand;
    String model;
    int year;

    public Car(String brand, String model, int year) {
        this.brand = brand;
        this.model = model;
        this.year = year;
    }

    void displayInfo() {
        System.out.println("Car Details: " + year + " " + brand + " " + model);
    }

    void startEngine() {
        System.out.println("The car is starting!!!");
    }

    void stopEngine() {
        System.out.println("The car is stopping!!!");
    }
}

class Student {
    String name;
    double[] grades;

    public Student(String name, double[] grades) {
        this.name = name;
        this.grades = grades;
    }

    double calculateAverage() {
        if (grades == null || grades.length == 0) {
            return 0.0;
        }
        double sum = 0;
        for (int i=0; i < grades.length; i++) {
            sum += grades[i];
        }
        return sum / grades.length;
    }
}

public class week3 {
    public static void main(String[] args) {

        Car myCar = new Car("Toyota", "Corolla", 2025);
        myCar.displayInfo();
        myCar.startEngine();
        myCar.stopEngine();

        System.out.println();

        double[] Grades = {4.5, 5.0, 3.0, 4.0};
        Student student = new Student("Muhammad Usman Mahboob", Grades);
        System.out.printf("Average Grade: %f\n", student.calculateAverage());
    }
}

// Class of First Exercise
class StudentsData {

    private String name;
    private static int studentCount = 0;

    public StudentsData(String name) {
        this.name = name;
        studentCount++;
    }

    public static void StudentCount() {
        System.out.println("Total number of students created: " + studentCount);
    }
}

// Class of Second Exercise
class CoffeeMachine {

    private String coffeeBrand;
    private double price;      
    private double quantity;  
    private double capacity;   

    public CoffeeMachine(String brand, double price, double capacity) {

        this.coffeeBrand = brand;
        setPrice(price);
        this.capacity = capacity;

        // tank must be full
        this.quantity = capacity;
    }

    public void setPrice(double price) {

        if(price >= 0) {
            this.price = price;
        } else {
            System.out.println("Invalid price!");
        }       
    }

    public double getPrice() {
        return price;
    }

    public double getQuantity() {
        return quantity;
    }

    public double buy(double amount) {

        if(amount > quantity) {
             return -1;
        }
        quantity -= amount;
        return amount * price;
    }

    public double fill() {

        double filledAmount = capacity - quantity;
        quantity = capacity;
        return filledAmount;
    }

    @Override
    public String toString() {

        return "CoffeeMachine (Brand =" + coffeeBrand + ", Price =" + price + " HUF/dl, Quantity =" + quantity + " dl, Capacity =" + capacity + ")";
    }
}

// Class of Third Exercise
class Submarine {

    private String name;
    private int depth;

    public Submarine(String name, int depth) {
        this.name = name;
        this.depth = depth;
    }

    public static void emergencySurface(Submarine[] fleet) {

        for(Submarine s : fleet) {
            s.depth = 0;
        }
    }

    @Override
    public String toString() {
        return "Submarine (" + name + ", depth=" + depth + ")";
    }
}


public class week5 {
    public static void main(String[] args) {

        // First Exercise

        System.out.println("*** Student Output ***");

        StudentsData s1 = new StudentsData("Usman");
        StudentsData s2 = new StudentsData("Talha");
        StudentsData s3 = new StudentsData("Saad");

        StudentsData.StudentCount();
        System.out.println();

        // Second Exercise 

        System.out.println("*** Coffee Machine Output ***");

        CoffeeMachine machine = new CoffeeMachine("Latte", 500, 50);

        System.out.println(machine);

        double price = machine.buy(10);

        if(price == -1) {
            System.out.println("There is not enough coffee in the container");
        } else {
            System.out.println("Price to pay: " + price + " HUF");
        }
        
        System.out.println("Remaining quantity: " + machine.getQuantity());

        double filled = machine.fill();
        System.out.println("Refilled amount: " + filled);

        System.out.println();

        // Third Exercise

        System.out.println("*** Submarine Output ***");

        Submarine sA = new Submarine("Seawolf", 300);
        Submarine sB = new Submarine("Arctic", 500);
        Submarine sC = new Submarine("Virginia", 150);

        Submarine[] fleet = {sA, sB, sC};

        System.out.println("Before emergency:");
        for(Submarine s : fleet) {
             System.out.println(s);
        }
           
        Submarine.emergencySurface(fleet);

        System.out.println("After emergency:");
        for(Submarine s : fleet)
            System.out.println(s);
    }
}
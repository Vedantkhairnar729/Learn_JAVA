Real-Life Problem - Online Shopping System

// Create the following hierarchy:

// Product
//    |
// Electronics
//    |
// Laptop

// Product class:
// - productName
// - price
// - Parameterized constructor
// - IIB to print "Product object initialized"

// Electronics class:
// - brand
// - warranty
// - Parameterized constructor
// - IIB to print "Electronics object initialized"

// Laptop class:
// - ram
// - processor
// - Parameterized constructor
// - IIB to print "Laptop object initialized"

// Requirements:
// 1. Use super() at each inheritance level.
// 2. Use IIB in all three classes.
// 3. Display all laptop details.
// 4. Observe the exact order of:
//    - Parent IIB
//    - Parent constructor
//    - Child IIB
//    - Child constructor
// 5. Create at least two Laptop objects and compare the execution order.

class Product {

    String productName;
    double price;

    {
        System.out.println("Product object initialized");
    }

    Product(String productName, double price) {

        this.productName = productName;
        this.price = price;

    }

    void displayProduct() {

        System.out.println("Product Name: " + productName);
        System.out.println("Product Price: " + price);

    }
}

class Electronic extends Product {

    String brand;
    int warranty;

    {
        System.out.println("Electonic object initialized");
    }

    Electonic(String productName, double price, String brand, int warranty) {

        super(productName, price);

        this.brand = brand;
        this.warranty = warranty;

    }

    void displayElectronic() {

        displayProduct();

        System.out.println("Product Brand: " + brand);
        System.out.println("Product Warranty: " + warranty);

    }
}

class Laptop extends Electonic {

    int ram;
    String processor;

    {
        System.out.println("Laptop object initialized");
    }

    Laptop(String productName, double price, String brand, int warranty, int ram, String processor) {

        super(productName, price, brand, warranty);

        this.ram = ram;
        this.processor = processor;
        
    }

    void displayLaptop() {

        displayElectronic();

        System.out.println("Laptop RAM: " + ram + " GB");
        System.out.println("Laptop Processor: " + processor);
    }
}

public class Online_Shoping_System {
    public static void main(String [] args) {

        System.out.println("\n--- Product Details --- ");

        Laptop l1 = new Laptop("LOQ 15", 89000, "Lenovo", 4, 16, "i5 12450HX");
        System.out.println("\n --- Product 1 Details --- ");
        l1.displayLaptop();

        Laptop l2 = new Laptop("LOQ 16", 150000, "Lenovo", 5, 32, "i7 14450HX");
        System.out.println("\n --- Product 2 Details --- ");
        l2.displayLaptop();

    }
}
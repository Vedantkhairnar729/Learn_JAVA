// Super Constructor and Method

// Create a Product class containing:
// - productName
// - price

// Create an ElectronicProduct class containing:
// - brand
// - warranty

// Use super() to initialize the parent properties and super to call a parent method that displays product details.

class Product {
    String productName;
    int price;

    Product(String productName, int price) {

        this.productName = productName;
        this.price = price;

    }

    void desk_1() {
        
        System.out.println("Product Name: " + productName);
        System.out.println("Price: " + price);

    }
}

class ElectronicProduct extends Product {

    String brand;
    int warranty;

    ElectronicProduct(String productName, int price, String brand, int warranty) {

        super(productName, price);

        this.brand = brand;
        this.warranty = warranty;

    }

    void desk_2() {

        super.desk_1();

        System.out.println("Brand: " + brand);
        System.out.println("Warranty: " + warranty + " Years");

    }
}

public class Super_Constructor_and_Method {
    public static void main(String [] args) {

        ElectronicProduct e1 = new ElectronicProduct("TV", 55000, "LG", 5);

        e1.desk_2();
    }
}
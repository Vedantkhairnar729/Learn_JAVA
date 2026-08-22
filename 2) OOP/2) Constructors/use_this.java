class car{
    String name;
    String model;
    int price;
    static String colour = "White";

    car(){
        name = "R8";
        model = "X5";
        price = 2588;
    }

    car(String name, String model, int price){
        this.name = name;
        this.model = model;
        this.price = price;
    }
    void display(){
        System.out.println("Car Name : " + name);
        System.out.println("Car Model : " + model);
        System.out.println("Car Price : " + price);
        System.out.println("Car Colour : " + colour);
        System.out.println("==============================");
    }
    void test(){
        this.display();
    }
}
public class use_this{
    public static void main(String [] args){
        car c1 = new car("Hilux","disel",5500000);
        car c2 = new car();

        c1.test();
        c2.test();
    }
}
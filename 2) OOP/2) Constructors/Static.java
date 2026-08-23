class test{
    String name;
    int roll;
    static String clg = "Hi Tech";

    test(){
        this.name = "avi";
        this.roll = 25;
    }

    test(String name, int roll){
        this.name = name;
        this.roll = roll;
    }
    static void desk(){
        System.out.println("hi static");
    }

    void disp(){
        System.out.println("Std Name : " + name);
        System.out.println("Roll No : " + roll);
        System.out.println("clg : " + clg);
        System.out.println("==========================");
    }
}
public class Static{
    public static void main(String [] args){
        test t1 = new test();
        test t2 = new test("Vedant",66);

        t1.disp();
        t2.disp();
        t2.desk();
    }
}
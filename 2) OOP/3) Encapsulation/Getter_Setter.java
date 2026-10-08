class Getter_Setter {

    private String name;
    private int age;
    private int rollNo;

    public void setName(String name) {
        this.name = name;
    }

    public String getName() {
        return name;
    }

    public void setAge(int age) {
        this.age = age;
    }

    public int getAge() {
        return age;
    }

    public void setNo(int rollNo) {
        this.rollNo = rollNo;
    }

    public int setNo() {
        return rollNo;
    }

    public static void main(String [] args) {

        Getter_Setter gs = new Getter_Setter();

        gs.setName("Ani");
        gs.setAge(22);
        gs.setNo(101);

        System.out.println("Name: " + gs.getName());
        System.out.println("Age: " + gs.getAge());
        System.out.println("Roll No: " + gs.setNo());
    }
}
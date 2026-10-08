class Setter_Method {

    private String name;

    void setName(String name) {
        this.name =name;

    }

    public static void main(String [] args) {

        Setter_Method s = new Setter_Method();

        s.setName("Ani");

        System.out.println(s.name);
    }
}
class Product {

    private String productName;
    private int productPrice;

    public void setProName(String productName) {
        this.productName = productName;
    }

    public String getProName() {
        return productName;
    }

    public void setProPrice(int productPrice) {
        this.productPrice = productPrice;
    }

    public int getProPrice() {
        return productPrice;
    }

    public static void main(String [] args) {

        Product p = new Product();

        p.setProName("TV");
        p.setProPrice(52000);

        System.out.println("Product Name: " + p.getProName());
        System.out.println("Product Price: " + p.getProPrice());
        

    }


}
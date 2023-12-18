public class Product {
    private String productName;
    private double price;
    private int quantity;
    public Product() {
    }
    public Product(String productName, double price, int quantity) {
        this.productName = productName;
        this.price = price;
        this.quantity = quantity;
    }
    public String getProductName() {
        return productName;
    }
    public double getPrice() {
        return price;
    }
    public int getQuantity() {
        return quantity;
    }
    private double calculateTotalPrice() {
        return price * quantity;
    }
    public void updateQuantity(int newQuantity) {
        this.quantity = newQuantity;
    }
    public void displayProductInfo() {
        System.out.println("Product Name: " + productName);
        System.out.println("Price: $" + price);
        System.out.println("Quantity: " + quantity);
        System.out.println("Total Price: $" + calculateTotalPrice());
    }
    public static void main(String[] args) {
        Product product1 = new Product("Shirt", 29.99, 10);
        Product product2 = new Product();
        product1.displayProductInfo();
        product2.updateQuantity(5);
        product2.displayProductInfo();
    }
}

public class Product {
   private static double discount = 0.0;
   private final int productID;
   private String productName;
   private double price;
   private int quantity;
   private static int idCounter = 1;

   public Product(String productName, double price, int quantity) {
   	this.productID = idCounter++;
   	this.productName = productName;
   	this.price = price;
   	this.quantity = quantity;
   }

   public static void updateDiscount(double newDiscount) {
   	discount = newDiscount;
   }

   public static double getDiscount() {
   	return discount;
   }

   public double calculatePrice() {
   	return price * quantity * (1 - discount / 100);
   }

   public String getProductName() {
   	return productName;
   }

   public static boolean isProductInstance(Object obj) {
   	return obj instanceof Product;
   }

   public static void main(String[] args) {
   	Product.updateDiscount(10.0);
   	Product product1 = new Product("Laptop", 50000, 2);
   	Product product2 = new Product("Phone", 20000, 1);

   	System.out.println("Product 1: " + product1.getProductName() + ", Price after discount: " + product1.calculatePrice());
   	System.out.println("Product 2: " + product2.getProductName() + ", Price after discount: " + product2.calculatePrice());
   	System.out.println("Is product1 an instance of Product? " + Product.isProductInstance(product1));
   }
}


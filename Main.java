public class Main {
    public static void main(String[] args) {
        InventoryManager manager = new InventoryManager();

        // Add new products
        manager.addProduct(1, "prod1", 10, 15.0);
        manager.addProduct(2, "prod2", 5, 25.0);
        manager.addProduct(3, "prod3", 20, 10.0);

        // Update quantity
        manager.updateQuantity(2, 15);

        // Delete product by ID
        manager.deleteProduct(3);

        // Display all products sorted by name
        manager.displayProductsSortedByName();
    }
}

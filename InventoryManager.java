import java.util.*;

public class InventoryManager {
    private Map<Integer, NewProduct> products;

    public InventoryManager() {
        //method used to initialize the hashmap
        products = new HashMap<>();
    }

    public void addProduct(int id, String name, int qty, double price) {
        //method used to add a new product to the inventory
        if (products.containsKey(id)) {
            System.out.println("Product with ID " + id + " already exists.");
            return;
        }
        //check if product with id already exists
        NewProduct product = new NewProduct();
        //create the product object
        product.setID(id);
        product.setName(name);
        product.setQty(qty);
        product.setPrice(price);
        //push the product object into the hashmap
        products.put(id, product);
        System.out.println("Product added: " + name);
    }

    public void updateQuantity(int id, int qty) {
        //method used to update the quantity of a product in the inventory
        NewProduct product = products.get(id);
        if (product == null) {
            System.out.println("Product with ID " + id + " not found.");
            return;
        }
        // check if the product id doesnt exist 
        product.setQty(qty);
        //update the quantity
        System.out.println("Quantity updated for product ID " + id);
    }

    public void deleteProduct(int id) {
        NewProduct removed = products.remove(id);
        //remove the product from the hashmap
        if (removed == null) {
            System.out.println("Product with ID " + id + " not found.");
        } else {
            System.out.println("Product with ID " + id + " deleted.");
        }
    }

    public void displayProductsSortedByName() {
        List<NewProduct> productList = new ArrayList<>(products.values());
        productList.sort(Comparator.comparing(NewProduct::getName));
        System.out.println("Products sorted by name:");
        for (NewProduct p : productList) {
            System.out.println("ID: " + p.getID() + ", Name: " + p.getName() + ", Quantity: " + p.getQty() + ", Price: " + p.getPrice());
        }
    }
}

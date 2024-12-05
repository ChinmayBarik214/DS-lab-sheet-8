import java.util.*;

class Product {
  int id;
  String name;
  float price;
  float rating;

  Product(int id, String name, float price, float rating) {
    this.id = id;
    this.name = name;
    this.price = price;
    this.rating = rating;
  }

  @Override
  public String toString() {
    return "{ID: " + id + ", Name: " + name + ", Price: " + price + ", Rating: " + rating + "}";
  }
}

public class ProductManager {
  private List<Product> products;

  public ProductManager() {
    this.products = new ArrayList<>();
  }

  // Method to add a new product
  public void addProduct(int id, String name, float price, float rating) {
    Product newProduct = new Product(id, name, price, rating);
    products.add(newProduct);
    System.out.println("Product added: " + newProduct);
  }

  // Method to update an existing product by ID
  public void updateProduct(int id, String name, Float price, Float rating) {
    for (Product product : products) {
      if (product.id == id) {
        if (name != null)
          product.name = name;
        if (price != null)
          product.price = price;
        if (rating != null)
          product.rating = rating;

        System.out.println("Product updated: " + product);
        return;
      }
    }
    System.out.println("Product with ID " + id + " not found.");
  }

  // Method to delete a product by ID
  public void deleteProduct(int id) {
    Iterator<Product> iterator = products.iterator();

    while (iterator.hasNext()) {
      Product product = iterator.next();
      if (product.id == id) {
        iterator.remove();
        System.out.println("Product deleted: " + product);
        return;
      }
    }
    System.out.println("Product with ID " + id + " not found.");
  }

  // Method to display all products
  public void displayProducts() {
    if (products.isEmpty()) {
      System.out.println("No products available.");
    } else {
      System.out.println("Product List:");
      for (Product product : products) {
        System.out.println(product);
      }
    }
  }

  // Main method to test functionality
  public static void main(String[] args) {
    ProductManager manager = new ProductManager();

    // Add products
    manager.addProduct(101, "ProductA", 50.0f, 4.5f);
    manager.addProduct(102, "ProductB", 75.0f, 4.7f);
    manager.addProduct(103, "ProductC", 100.0f, 4.2f);

    // Display all products
    manager.displayProducts();

    // Update a product
    manager.updateProduct(102, "UpdatedProductB", 80.0f, null);

    // Display all products after update
    manager.displayProducts();

    // Delete a product
    manager.deleteProduct(101);

    // Display all products after deletion
    manager.displayProducts();
  }
}

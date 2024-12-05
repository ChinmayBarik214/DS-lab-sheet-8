import java.util.*;

public class SequentialSearchByName {
  public static Product searchByName(List<Product> products, String name) {
    for (Product product : products) {
      if (product.name.equals(name))
        return product;
    }
    return null; // Product not found
  }

  public static void main(String[] args) {
    List<Product> products = Arrays.asList(
        new Product(101, "ProductA", 50.0f, 4.8f),
        new Product(102, "ProductB", 75.0f, 4.5f),
        new Product(103, "ProductC", 100.0f, 4.2f));

    Product result = searchByName(products, "ProductA");
    System.out.println(result);
  }
}

import java.util.*;

public class InsertionSortByPrice {
  public static void sortByPrice(List<Product> products) {
    for (int i = 1; i < products.size(); i++) {
      Product key = products.get(i);
      int j = i - 1;

      while (j >= 0 && products.get(j).price > key.price) {
        products.set(j + 1, products.get(j));
        j = j - 1;
      }
      products.set(j + 1, key);
    }
  }

  public static void main(String[] args) {
    List<Product> products = Arrays.asList(
        new Product(1, "Product1", 100.0f, 4.5f),
        new Product(2, "Product2", 50.0f, 4.8f),
        new Product(3, "Product3", 75.0f, 4.2f));

    sortByPrice(products);
    System.out.println(products);
  }
}

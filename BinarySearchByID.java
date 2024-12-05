import java.util.*;

public class BinarySearchByID {
  public static Product binarySearch(List<Product> products, int id) {
    int left = 0, right = products.size() - 1;

    while (left <= right) {
      int mid = left + (right - left) / 2;

      if (products.get(mid).id == id)
        return products.get(mid);
      else if (products.get(mid).id < id)
        left = mid + 1;
      else
        right = mid - 1;
    }

    return null; // Product not found
  }

  public static void main(String[] args) {
    List<Product> products = Arrays.asList(
        new Product(101, "ProductA", 50.0f, 4.8f),
        new Product(102, "ProductB", 75.0f, 4.5f),
        new Product(103, "ProductC", 100.0f, 4.2f));

    Product result = binarySearch(products, 101);
    System.out.println(result);
  }
}

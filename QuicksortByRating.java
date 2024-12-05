import java.util.*;

public class QuicksortByRating {
  public static void quicksort(List<Product> products, int low, int high) {
    if (low < high) {
      int pi = partition(products, low, high);
      quicksort(products, low, pi - 1);
      quicksort(products, pi + 1, high);
    }
  }

  private static int partition(List<Product> products, int low, int high) {
    float pivot = products.get(high).rating;
    int i = low - 1;

    for (int j = low; j < high; j++) {
      if (products.get(j).rating > pivot) { // Descending order
        i++;
        Collections.swap(products, i, j);
      }
    }
    Collections.swap(products, i + 1, high);
    return i + 1;
  }

  public static void main(String[] args) {
    List<Product> products = Arrays.asList(
        new Product(1, "Product1", 100.0f, 4.5f),
        new Product(2, "Product2", 50.0f, 4.8f),
        new Product(3, "Product3", 75.0f, 4.2f));

    quicksort(products, 0, products.size() - 1);
    System.out.println(products);
  }
}

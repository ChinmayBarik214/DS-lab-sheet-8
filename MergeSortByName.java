import java.util.*;

public class MergeSortByName {
  public static void mergeSort(List<Product> products) {
    if (products.size() < 2)
      return;

    int mid = products.size() / 2;
    List<Product> left = new ArrayList<>(products.subList(0, mid));
    List<Product> right = new ArrayList<>(products.subList(mid, products.size()));

    mergeSort(left);
    mergeSort(right);

    merge(products, left, right);
  }

  private static void merge(List<Product> products, List<Product> left, List<Product> right) {
    int i = 0, j = 0, k = 0;

    while (i < left.size() && j < right.size()) {
      if (left.get(i).name.compareTo(right.get(j).name) <= 0) {
        products.set(k++, left.get(i++));
      } else {
        products.set(k++, right.get(j++));
      }
    }

    while (i < left.size())
      products.set(k++, left.get(i++));

    while (j < right.size())
      products.set(k++, right.get(j++));
  }

  public static void main(String[] args) {
    List<Product> products = Arrays.asList(
        new Product(1, "ProductC", 100.0f, 4.5f),
        new Product(2, "ProductA", 50.0f, 4.8f),
        new Product(3, "ProductB", 75.0f, 4.2f));

    mergeSort(products);
    System.out.println(products);
  }
}

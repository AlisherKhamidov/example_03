import java.util.Arrays;

public class Main {
  public static void main(String[] args) {
    String[] fruits = new String[]{"apple", "orange", "mango"};
    print(fruits);

  }

  public static void print(String[] arr) {
    System.out.println(Arrays.toString(arr));
    print(arr);

  }
}
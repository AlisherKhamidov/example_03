public class Main {
    public static void main(String[] args) {
        String[] fruits = new String[]{"apple", "orange", "mango"};
        print(fruits);
    }

    public static void print(String[] arr) {
        for (String fruit : arr) {
            System.out.println(fruit);
        }
    }
}
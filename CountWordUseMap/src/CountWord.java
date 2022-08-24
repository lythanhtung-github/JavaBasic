import java.util.Map;
import java.util.Scanner;
import java.util.TreeMap;

public class CountWord {
    public static void main(String[] args) {

        System.out.println("Nhập vào chuỗi: ");
        Scanner sc = new Scanner(System.in);
        String str = sc.nextLine();
        String[] arr = str.split(" ");
        Map<String,Integer> wordAndCount = new TreeMap<>();
        for (String element : arr) {
            if (wordAndCount.containsKey(element)) {
                int value = wordAndCount.get(element);
                value++;
                wordAndCount.put(element, value);
            } else {
                wordAndCount.put(element, 1);
            }
        }
        System.out.println(wordAndCount);
    }
}
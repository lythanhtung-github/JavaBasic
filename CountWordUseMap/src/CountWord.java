import com.sun.javafx.collections.MappingChange;

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
        for (String temp : arr) {
            if (wordAndCount.containsKey(temp)) {
                int value = wordAndCount.get(temp);
                value++;
                wordAndCount.put(temp, value);
            } else {
                wordAndCount.put(temp, 1);
            }
        }
        System.out.println(wordAndCount);
    }
}

package chuoi_tang_dan_do_dai_lon_nhat;

import java.util.LinkedList;
import java.util.Scanner;

public class Main {
    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);

        System.out.println("Nhập chuỗi: ");
        String string = sc.nextLine();

        LinkedList<Character> max = new LinkedList<>();

        for (int i = 0; i < string.length(); i++) {
            LinkedList<Character> list = new LinkedList<>();

            list.add(string.charAt(i));
            for (int j = i + 1; j < string.length(); j++) {
                if (string.charAt(j) > list.getLast()) {
                    list.add(string.charAt(j));
                }
            }
            if (list.size() > max.size()) {
                max.clear();
                max.addAll(list);
            }
            list.clear();
        }
        System.out.print("Chuỗi tăng dần độ dài lớn nhất là: ");
        for (Character ch : max) { // 1 vòng lặp

            System.out.print(ch); // 1 câu lệnh
        }
        System.out.println();
    }
}

/*
 * 	Tính toán độ phức tạp của bài toán:
 * 	1 vòng lặp bên ngoài = n;
 * 	1 vòng lặp bên trong = n - 1;
 *  1 câu lệnh = 1
 * 	1 vòng lặp * 1 câu lệnh = 1;
 *  T(n) = (n * (n - 1)) + (1 + 1);
 *  T(n) = O(n^2) + O(n);
 * 	T(n) = O(n^2);
 * 	=> Độ phức tạp bài toán này là O(n^2)
 */


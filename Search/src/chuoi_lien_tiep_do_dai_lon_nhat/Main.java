package chuoi_lien_tiep_do_dai_lon_nhat;

import java.util.Scanner;
import java.util.LinkedList;

public class Main {
    public static void main(String[] args) {

        Scanner input = new Scanner(System.in);
        LinkedList<Character> max = new LinkedList<>();
        LinkedList<Character> list = new LinkedList<>();

        System.out.print("Nhập chuỗi: ");
        String string = input.nextLine();

        // Tìm chuỗi liên tiếp có độ dài lớn nhất
        for (int i = 0; i < string.length(); i++) { 		//1 Vòng lặp
            if (list.size() > 1 && string.charAt(i) <= list.getLast() &&
                    list.contains(string.charAt(i))) {
                list.clear(); //1 câu lệnh
            }

            list.add(string.charAt(i)); // 1 câu lệnh

            if (list.size() > max.size()) { // 1 câu lệnh
                max.clear();
                max.addAll(list);
            }
        }

        // Hiển thị chuỗi liên tiếp dài nhất
        for (Character str: max) { // 1 vòng lặp
            System.out.print(str); // 1 câu lệnh
        }
        System.out.println();
    }
}

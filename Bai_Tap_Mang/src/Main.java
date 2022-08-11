public class Main {
    public static void main(String[] args) {

        int[] arr = {1, 4, 3, 2, 7, 8, 5, 6, 5, 3, 7, 8, 9, 8, 3, 5, 4, 3, 2, 4, 2, 5};

        // Tìm phần tử lẻ cuối cùng ở vị trí chẵn

        int result = arr[0];
        for (int i = 2; i < arr.length; i += 2) {
            if (arr[i] % 2 != 0) {
                result = arr[i];
            }
        }
        System.out.printf("Phần tử lẻ cuối cùng ở vị trí chẵn là %d", result);
        System.out.println("-------------------------------------------------------");


        //Tìm phần tử có tần suất xuất hiện nhiều nhất mảng
//        int count;
//        int[] arrCount = new int[arr.length];
//
//        for (int i = 0; i < arr.length; i++) {
//            count = 0;
//            for (int j = 0; j < arr.length; j++) {
//                if (arr[i] == arr[j]) {
//                    count++;
//                }
//            }
//            arrCount[i] = count;
//        }
//
//        //Tìm max trong mảng tần số
//        int max = arrCount[0];
//        for (int i = 1; i < arrCount.length; i++) {
//            if (arrCount[i] > max) {
//                max = arrCount[i];
//            }
//        }
//
//        for (int i = 0; i < arrCount.length; i++) {
//            if (arrCount[i] == max) {
//                System.out.println(arr[i]);
//                break;
//            }
//        }
    }
}
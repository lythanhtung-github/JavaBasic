public class Main {
    public static void main(String[] args) {

        System.out.println("Các số nguyên tố bé hơn 100");
        int count = 0;
        for (int num = 2; num < 100; num++ ){
            for (int i = 1; i <= num; i++){
                if (num % i == 0 ){
                    ++count;
                }
            }
            if (count == 2){
                System.out.print(num + " ");
            }
            count = 0;
        }
    }
}
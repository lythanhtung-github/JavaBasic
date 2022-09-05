package PrimeNumber;


public class LazyPrimeFactorization implements Runnable {
    private String name;

    public LazyPrimeFactorization(String name) {
        this.name = name;
    }

    @Override
    public void run() {
        int number = 1;
        boolean isPrime;
        while (number < 200) {
            number++;
            isPrime = true;
            for (int i = 2; i < number; i++) {
                if (number % i == 0) {
                    isPrime = false;
                    break;
                }
            }
            if (isPrime) {
                System.out.println(name + "print: " + number);
            }
        }
    }
}


package RacingCars;

import java.util.Random;

import static RacingCars.Main.DISTANCE;
import static RacingCars.Main.STEP;

public class Car implements Runnable {

    private String name;

    public Car(String name) {
        this.name = name;
    }

    @Override
    public void run() {
        // Khởi tạo điểm start(hay km ban đầu)
        int runDistance = 0;
        // Khởi tạo time bắt đầu cuộc đua
        long startTime = System.currentTimeMillis();
        // Kiểm tra chừng nào còn xe chưa kết thúc quãng đường đua thì xe vẫn tiếp tục chạy
        while (runDistance < DISTANCE) {
            try {
                // Random Speed KM/H
                int speed = (new Random()).nextInt(20);
                // Calculate traveled distance
                runDistance += speed;
                // Build result graphic
                StringBuilder log = new StringBuilder("|");
                int percentTravel = (runDistance * 100) / DISTANCE;
                for (int i = 0; i < DISTANCE; i += STEP) {
                    if (percentTravel >= i + STEP) {
                        log.append("=");
                    } else if (percentTravel >= i && percentTravel < i + STEP) {
                        log.append("o");
                    } else {
                        log.append("-");
                    }
                }
                log.append("|");
                System.out.println("Car" + this.name + ": " + log + " " + Math.min(DISTANCE, runDistance) + "KM");
                Thread.sleep(1000);
            } catch (InterruptedException e) {
                System.out.println("Car" + this.name + " broken...");
                break;
            }
        }
        long endTime = System.currentTimeMillis();
        System.out.println("Car" + this.name + " Finish in " + (endTime - startTime) / 1000 + "s");

    }
}

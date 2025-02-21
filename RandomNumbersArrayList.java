package Collection;


import java.util.ArrayList;
import java.util.Random;

public class RandomNumbersArrayList {

    public static void main(String[] args) {
        long duration = measureTime();
        System.out.println("Время выполнения: " + duration + " наносекунд");
    }

    public static long measureTime() {
        long startTime = System.currentTimeMillis();


        ArrayList<Integer> list = new ArrayList<Integer>();
        // измеряем время выполнения

        int length = 10000;
        Random rand = new Random();
        for (int i = 0; i < length; i++) {
            int randomNum = rand.nextInt(1000000);
            list.add(randomNum);
        }
        for (int num : list) {
            System.out.println(num + " ");
        }
        long endTime = System.currentTimeMillis();
        return endTime - startTime;
    }
}







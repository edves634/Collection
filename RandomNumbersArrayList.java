package Collection;

import java.util.ArrayList;
import java.util.Random;

public class RandomNumbersArrayList {

    public static void main(String[] args) {
        long duration = measureTime();
        System.out.println("Время выполнения: " + duration + " миллисекунд");
    }

    public static long measureTime() {
        long startTime = System.currentTimeMillis();

        ArrayList<Integer> list = new ArrayList<Integer>();
        // Измеряем время выполнения

        int length = 10000;
        Random rand = new Random();
        for (int i = 0; i < length; i++) {
            int randomNum = rand.nextInt(1000000);
            list.add(randomNum);
        }

        // Выводим количество элементов в списке
        System.out.println("Количество случайных чисел: " + list.size());

        long endTime = System.currentTimeMillis();
        return endTime - startTime;
    }
}







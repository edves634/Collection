package Collection;

import java.util.LinkedList;
import java.util.Random;

public class RandomNumbersLinkedList {
    public static void main(String[] args) {
        long duration = measureTime();
        System.out.println("Время выполнения: " + duration + " миллисекунд");
    }
    public static long measureTime() {
        long startTime = System.currentTimeMillis();
/// comment
        LinkedList<Integer> list = new LinkedList<>();
        int length = 30000;
        Random rand = new Random();

        // Заполнение LinkedList случайными числами
        for (int i = 0; i < length; i++) {
            int randomNum = rand.nextInt(1000000);
            list.add(randomNum);
        }
        // Выбор элементов по случайным индексам
        for (int i = 0; i < 10000; i++) {
        int randomIndex = rand.nextInt(length);
        int element = list.get(randomIndex);
    }

        long endTime = System.currentTimeMillis();
        return endTime - startTime;
    }
}
    





package Collection;

import java.util.ArrayList;
import java.util.HashSet;

public class RemovingDuplicates {
    public static void main(String[] args) {

        ArrayList<Integer> list = new ArrayList<>();
        HashSet<Integer> set = new HashSet<>();

        list.add(12);
        list.add(36);
        list.add(80);
        list.add(90);
        list.add(12);
        list.add(88);
        list.add(90);

        System.out.println("Исходный список: " + list);

        set.addAll(list);
        list.clear();
        list.addAll(set);
        // Выводим результат в виде списка
        System.out.println("Список без дубликатов: " + list);
    }

}

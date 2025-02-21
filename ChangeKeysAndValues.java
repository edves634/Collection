package Collection;

import java.util.ArrayList;
import java.util.HashMap;
import java.util.List;
import java.util.Map;

public class ChangeKeysAndValues {
    public static void main(String[] args) {
        HashMap<String, Integer> map = new HashMap<>();
        map.put("A", 1);
        map.put("B", 2);
        map.put("C", 3);
        map.put("D", 4);
        map.put("E", 2); // Добавляем дубликат
        System.out.println("Исходная карта " + map);

        HashMap<Integer, List<String>> map2 = new HashMap<>();
        for (Map.Entry<String, Integer> entry : map.entrySet()) {  // Перебираем все записи исходной карты
            Integer value = entry.getValue(); // Получаем значение (ключ для нового HashMap)
            String key = entry.getKey(); // Получаем ключ (значение для нового HashMap)
            // Если значение уже есть в map2, добавляем новый ключ в список
            if (!map2.containsKey(value)) {
                map2.put(value, new ArrayList<>());
                // Создаем новый список, если значение отсутствует
            }
            map2.get(value).add(key);  // Добавляем ключ в соответствующий список

        }
        System.out.println("Поменянные ключи и значения: " + map2);

    }


}




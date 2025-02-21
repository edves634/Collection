package Collection;

import java.util.HashMap;
import java.util.Map;

public class ChangeKeysAndValues {
    public static void main(String[] args) {
        HashMap<String, Integer> map = new HashMap<>();
        map.put("A", 1);
        map.put("B", 2);
        map.put("C", 3);
        map.put("D", 4);
        System.out.println(map);

        HashMap<Integer, String> map2 = new HashMap<>();
        for (Map.Entry<String, Integer> change : map.entrySet()) {
            map2.put(change.getValue(), change.getKey());

        }
        System.out.println(map2);
    }
}

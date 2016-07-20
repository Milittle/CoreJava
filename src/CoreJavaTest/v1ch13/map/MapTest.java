package CoreJavaTest.v1ch13.map;

import java.util.HashMap;
import java.util.Map;

/**
 * Created by mizeshuang on 2016/5/27.
 */
public class MapTest {
    public static void main(String[] args) {
        Map<String, Integer> integerMap = new HashMap<>();
        integerMap.put("144-25", 1);
        integerMap.put("145-25", 2);
        integerMap.put("146-25", 3);
        integerMap.put("147-25", 4);


        System.out.println(integerMap);

        integerMap.remove("145-25");

        integerMap.put("144-25", 5);

        System.out.println(integerMap.get("144-25"));

        for (Map.Entry<String, Integer> i : integerMap.entrySet()) {
            String key = i.getKey();
            int value = i.getValue();
            System.out.println("key=" + key + "\nvalue=" + value);
        }
    }
}

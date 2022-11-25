package Task2_2;

import java.util.LinkedHashMap;
import java.util.Map;

public class Value10 {
    public static void main(String[] args) {

            Map<Integer, String> orderedMap = new LinkedHashMap<>();
            orderedMap.put(2, "test2");
            orderedMap.put(9, "test9");
            orderedMap.put(5, "test5");
            orderedMap.put(7, "test7");
            orderedMap.put(4, "test4");
            orderedMap.put(1, "test1");
            orderedMap.put(3, "test3");
            orderedMap.put(6, "test6");
            orderedMap.put(8, "test8");
            orderedMap.put(10, "test10");
            for (Map.Entry<Integer, String> entry : orderedMap.entrySet())
                System.out.printf("%d: %s %n",entry.getKey(),entry.getValue());
        }
    }


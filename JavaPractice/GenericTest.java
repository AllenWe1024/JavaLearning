import org.junit.Test;

import java.util.*;

// import java.util.*;

public class GenericTest {
    //泛型在Map中的使用
    @Test
    public void test2() {
        HashMap<String, Integer> map = new HashMap<>();

        map.put("Tom", 67);
        map.put("Jim", 56);
        map.put("Rose", 88);
        //编译不通过
        //        map.put(67,"Jack");

        //遍历key集
        Set<String> keySet = map.keySet();
        for (String str : keySet) {

            System.out.println(str);
        }

        //遍历value集
        Collection<Integer> values = map.values();
        Iterator<Integer> iterator = values.iterator();
        while (iterator.hasNext()) {
            Integer value = iterator.next();
            System.out.println(value);
        }

        //遍历entry集
        Set<Map.Entry<String, Integer>> entrySet = map.entrySet();
        Iterator<Map.Entry<String, Integer>> iterator1 = entrySet.iterator();
        while (iterator1.hasNext()) {
            Map.Entry<String, Integer> entry = iterator1.next();
            String key = entry.getKey();
            Integer value = entry.getValue();
            System.out.println(key + ":" + value);
        }

    }
}

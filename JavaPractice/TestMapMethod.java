import java.util.Collection;
import java.util.HashMap;
import java.util.Map;
import java.util.Set;

public class TestMapMethod {
    public static void main(String[] args) {
        HashMap map = new HashMap();
        map.put("许仙", "白娘子");
        map.put("董永", "七仙女");
        map.put("牛郎", "织女");
        map.put("许仙", "小青");

        System.out.println("所有的key:");
        Set keySet = map.keySet();
        for (Object key : keySet) {
            System.out.println(key);
        }

        System.out.println("所有的value:");
        Collection values = map.values();
        for (Object value : values) {
            System.out.println(value);
        }

        System.out.println("所有的映射关系:");
        Set entrySet = map.entrySet();
        for (Object mapping : entrySet) {
            //System.out.println(entry);
            Map.Entry entry = (Map.Entry) mapping;
            System.out.println(entry.getKey() + "->" + entry.getValue());
        }
    }
}

import java.util.ArrayList;
import java.util.Iterator;
import java.util.List;

import org.junit.Test;

public class ForTest {
    @Test
    public void test() {
        List<String> list = new ArrayList<>();
        list.add("1");
        list.add("2");
        list.add("3");
        Iterator<String> iterator = list.iterator();
        while (iterator.hasNext()) {
            // if ("1".equals(iterator.next())) {
            // iterator.remove();
            // list.add("4");
            // list.remove("1");
            String element = iterator.next();
            if (element.equals("2")) {
                iterator.remove();
            }
        }
        System.out.println(list);
    }
}

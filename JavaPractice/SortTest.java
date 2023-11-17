import java.util.ArrayList;
import java.util.Comparator;
import java.util.List;
import java.util.TreeSet;

public class SortTest {

    public static void main(String[] args) {
        ArrayList list = new ArrayList();
        list.add("ccc");
        list.add("ccc");
        list.add("aaa");
        list.add("aaa");
        list.add("bbb");
        list.add("ddd");
        list.add("ddd");

        sort(list);
        System.out.println(list);
    }

    public static void sort(List list) {
        TreeSet ts = new TreeSet(new Comparator() {
            @Override
            public int compare(Object o1, Object o2) {
                String s1 = (String) o1;
                String s2 = (String) o2;
                int num = s1.compareTo(s2);
                return num == 0 ? 1 : num;
            }
        });
        ts.addAll(list);
        list.clear();
        list.addAll(ts);


    }
}



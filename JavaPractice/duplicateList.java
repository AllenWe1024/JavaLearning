import java.util.ArrayList;
import java.util.HashSet;
import java.util.List;

public class duplicateList {
    // HashSet set = new HashSet();
    static List duplicateTheList(List list) {
        HashSet set = new HashSet();
        set.addAll(list);
        return new ArrayList(set);
    }

    public static void main(String[] args) {
        List list = new ArrayList();
        list.add(new Integer(1));
        list.add(new Integer(2));
        list.add(new Integer(2));
        list.add(new Integer(4));
        list.add(new Integer(4));
        List list2 = duplicateTheList(list);
        for (Object interge : list2){
            System.out.println(interge);
        }

    }
}


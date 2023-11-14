import java.util.ArrayList;
import java.util.Arrays;
import java.util.Collection;

import org.junit.Test;

public class TestCollectionContains {
    @Test
    public void test01() {
        Collection coll = new ArrayList();

        coll.add("小李广");
        coll.add("扫地僧");
        coll.add("石破天");
        coll.add("佛地魔");
        // 集合转换为数组：集合的toArray()方法
        Object[] objects = coll.toArray();
        System.out.println("用数组返回coll中所有元素：" + Arrays.toString(objects));

        // 对应的，数组转换为集合：调用Arrays的asList(Object ...objs)
        Object[] arr1 = new Object[] { 123, "AA", "CC" };
        Collection list = Arrays.asList(arr1);
        System.out.println(list);
        System.out.println(222222);

    }
}
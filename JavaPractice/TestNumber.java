import java.util.ArrayList;
import java.util.Iterator;
import java.util.Random;
import java.util.function.Predicate;

public class TestNumber {
    public static void main(String[] args) {
        ArrayList<Integer> coll = new ArrayList<Integer>();
        Random random = new Random();
        for (int i = 1; i <= 5; i++) {
            coll.add(random.nextInt(100));
        }

        System.out.println("coll中5个随机数是：");
        for (Integer integer : coll) {
            System.out.println(integer);
        }

        //方式1：使用集合的removeIf方法删除偶数
        coll.removeIf(new Predicate<Integer>() {
            @Override
            public boolean test(Integer integer) {
                return integer % 2 == 0;
            }
        });
        //方式2：调用Iterator接口的remove()方法
        //Iterator<Integer> iterator1 = coll.iterator();
        //while(coll.hasNext()){
        //    Integer i = coll.next();
        //   if(i % 2 == 0){
        //       coll.remove();
        //    }
        //}

        System.out.println("coll中删除偶数后：");
        Iterator<Integer> iterator = coll.iterator();
        while (iterator.hasNext()) {
            Integer number = iterator.next();
            System.out.println(number);
        }

    }
}
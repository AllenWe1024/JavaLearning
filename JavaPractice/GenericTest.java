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


    class StudentTest1<T> {
        private String name;
        private T score;

        public StudentTest1() {
            super();
        }

        public StudentTest1(String name, T score) {
            super();
            this.name = name;
            this.score = score;
        }

        public String getName() {
            return name;
        }

        public void setName(String name) {
            this.name = name;
        }

        public T getScore() {
            return score;
        }

        public void setScore(T score) {
            this.score = score;
        }

        @Override
        public String toString() {
            return "姓名：" + name + ", 成绩：" + score;
        }
    }
    @Test
    public void TestStudent() {
            //语文老师使用时：
            StudentTest1<String> stu1 = new StudentTest1<String>("张三", "良好");

            //数学老师使用时：
            //Student<double> stu2 = new Student<double>("张三", 90.5);//错误，必须是引用数据类型
            StudentTest1<Double> stu2 = new StudentTest1<Double>("张三", 90.5);

            //英语老师使用时：
            StudentTest1<Character> stu3 = new StudentTest1<Character>("张三", 'C');

            //错误的指定
            //Student<Object> stu = new Student<String>();//错误的
        System.out.println(stu1);
        System.out.println(stu2);
        System.out.println(stu3);


    }

}

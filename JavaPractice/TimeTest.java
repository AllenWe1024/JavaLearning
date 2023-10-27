import org.junit.Test;

import java.util.Date;

public class TimeTest {
    public static void main(String[] args) {


        test1();
        test2();
        test3();
        test4();
        test5();
    }

    public static void test1() {
        Date d = new Date();
        System.out.println(d);
    }

    @Test
    public static void test2() {
        long time = System.currentTimeMillis();
        System.out.println(time);//1559806982971
        //当前系统时间距离1970-1-1 0:0:0 0毫秒的时间差，毫秒为单位
    }

    @Test
    public static void test3() {
        Date d = new Date();
        long time = d.getTime();
        System.out.println(time);//1559807047979
    }

    @Test
    public static void test4() {
        long time = 1559807047979L;
        Date d = new Date(time);
        System.out.println(d);
    }

    @Test
    public static void test5() {
        long time = Long.MAX_VALUE;
        Date d = new Date(time);
        System.out.println(d);
    }
}

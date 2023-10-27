//import org.junit.Test;
//
//import java.text.ParseException;
//import java.text.SimpleDateFormat;
//import java.util.Date;

import org.junit.Test;

import java.text.ParseException;
import java.text.SimpleDateFormat;
import java.util.Date;

public class DataFormatTest {
    //格式化
    @Test
    public void test1() {
        Date d = new Date();

        SimpleDateFormat sf = new SimpleDateFormat("yyyy年MM月dd日 HH时mm分ss秒 SSS毫秒  E Z");
        //把Date日期转成字符串，按照指定的格式转
        String str = sf.format(d);
        System.out.println(str);
    }

    //解析
    @Test
    public void test2() throws ParseException {
        String str = "2022年06月06日 16时03分14秒 545毫秒  星期四 +0800";
        SimpleDateFormat sf = new SimpleDateFormat("yyyy年MM月dd日 HH时mm分ss秒 SSS毫秒  E Z");
        Date d = sf.parse(str);
        System.out.println(d);
    }
}

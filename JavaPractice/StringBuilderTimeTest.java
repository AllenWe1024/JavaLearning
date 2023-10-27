import org.junit.Test;

public class StringBuilderTimeTest {
    public static void main(String[] args) {
        //初始设置
        long startTime = 0L;
        long endTime = 0L;
        String text = "";
        StringBuffer buffer = new StringBuffer("");
        StringBuilder builder = new StringBuilder("");

//开始对比
        startTime = System.currentTimeMillis();
        for (int i = 0; i < 20000; i++) {
            buffer.append(String.valueOf(i));
        }
        endTime = System.currentTimeMillis();
        System.out.println("StringBuffer的执行时间：" + (endTime - startTime));

        startTime = System.currentTimeMillis();
        for (int i = 0; i < 20000; i++) {
            builder.append(String.valueOf(i));
        }
        endTime = System.currentTimeMillis();
        System.out.println("StringBuilder的执行时间：" + (endTime - startTime));

        startTime = System.currentTimeMillis();
        for (int i = 0; i < 20000; i++) {
            text = text + i;
        }
        endTime = System.currentTimeMillis();
        System.out.println("String的执行时间：" + (endTime - startTime));

    }

    @Test
    public void test01() {
        String str = null;
        StringBuffer sb = new StringBuffer();
        sb.append(str);
        System.out.println("---1----");
        System.out.println(sb.length());//
        System.out.println("---2----");
        System.out.println(sb);//
        try {
            StringBuffer sb1 = new StringBuffer(str);
            System.out.println("---3----");
            System.out.println(sb1);//
        } catch (Exception e){
            System.out.println(e);

        }


    }

    @Test
    public void test02() {
        StringBuilder a = new StringBuilder(("1"));
        StringBuilder b = new StringBuilder(("2"));
        System.out.println("---1----");
        System.out.println(System.identityHashCode(a));
        System.out.println(System.identityHashCode(b));

        operate(a, b);
        System.out.println("---4----");

        System.out.println(System.identityHashCode(a));
        System.out.println(System.identityHashCode(b));
        System.out.println(a + "," + b);


//        void operate (StringBuilder , StringBuilder y){
//
//        }
    }

    private void operate(StringBuilder x, StringBuilder y) {
        System.out.println("----2---");
        System.out.println(System.identityHashCode(x));
        System.out.println(System.identityHashCode(y));
        x.append(y);
        y = x;
        System.out.println("---3----");
        System.out.println(System.identityHashCode(x));
        System.out.println(System.identityHashCode(y));
        y.append('x');
    }
}

// import org.testng.annotations.Test;

import org.junit.Test;

public class StringBuilderTest {
    @Test
    public void test1() {
        java.lang.StringBuilder s = new java.lang.StringBuilder();
        s.append("hello").append(true).append('a').append(12).append("atguigu");
        System.out.println(s);
        System.out.println(s.length());
    }

    @Test
    public void test2() {
        java.lang.StringBuilder s = new java.lang.StringBuilder("helloworld");
        s.insert(5, "java");
        s.insert(5, "chailinyan");
        System.out.println(s);
    }

    @Test
    public void test3() {
        java.lang.StringBuilder s = new java.lang.StringBuilder("helloworld");
        s.delete(1, 3);
        s.deleteCharAt(4);
        System.out.println(s);
    }

    @Test
    public void test4() {
        java.lang.StringBuilder s = new java.lang.StringBuilder("helloworld");
        s.reverse();
        System.out.println(s);
    }

    @Test
    public void test5() {
        java.lang.StringBuilder s = new java.lang.StringBuilder("helloworld");
        s.setCharAt(2, 'a');
        System.out.println(s);
    }

    @Test
    public void test6() {
        java.lang.StringBuilder s = new java.lang.StringBuilder("helloworld");
        s.setLength(30);
        System.out.println(s);
    }
}

public class 引用 {
    public static void main(String[] args) {
        String s = "hello";
        String t = s;
        s = "world";
        System.out.println("test_remote")
        System.out.println(t); // t是"hello"还是"world"?
    }
}

public class 引用 {

  public static void main(String[] args) {
    String s = "hello";
    String t = s;
    s = "world";
    System.out.println("remote");
    System.out.println(t); // t是"hello"还是"world"?
    System.out.println("test_local");
    System.out.println("test_local2");

    String[] names = { "ABC", "XYZ", "zoo" };
    String s1 = names[1];
    names[1] = "cat";
    System.out.println(s1); // s是"XYZ"还是"cat"?
  }
}

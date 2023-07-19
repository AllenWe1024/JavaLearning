public class operation1 {

  public static void main(String[] args) {
    int x = 1;
    int y = 1;

    if (x++ == 2 & ++y == 2) {
      x = 7;
    }
    System.out.println("x=" + x + ",y=" + y);
    int x2 = 1, y2 = 1;

    if (x2++ == 2 && ++y2 == 2) {
      x2 = 7;
    }
    System.out.println("x2=" + x2 + ",y2=" + y2);
  }
}

public class ifelse {

  public static void main(String[] args) {
    boolean b = true;
    //如果写成if(b=false)能编译通过吗？如果能，结果是？
    if (
      b == false
    ) System.out.println("a"); else if (b) System.out.println("b"); else if ( //建议：if(!b)
      !b
    ) System.out.println("c"); else System.out.println("d");
  }
}

public class StringTest {
    public static void main(String args[]) {
        StringBuilder sb = new StringBuilder(10);
        sb.append("Runoob..");
        System.out.println(sb);
        sb.append("!");
        System.out.println(sb);
        sb.insert(8, "Java");
        System.out.println(sb);
        sb.delete(5, 8);
        System.out.println(sb);
        String b = "2222222";
        System.out.println("-----------");

        int[] c = {2, 2};
        changeString(b, c);
        System.out.print(b + '\n');
        System.out.println(c[0]);
        System.out.println(c[1]);


    }

    public static void changeString(String stra1, int[] b) {
        stra1 = "11111";
        b[0] = 1;
    }
}

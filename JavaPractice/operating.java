public class operating {
    public static void main(String[] args) {
        int a = 3;
        int b = 4;
        int c = 5;

        // & 与，且；有false则false
        System.out.println((a > b) & (a > c));
        System.out.println((a > b) & (a < c));
        System.out.println((a < b) & (a > c));
        System.out.println((a < b) & (a < c));
        System.out.println("===============");
        // | 或；有true则true
        System.out.println((a > b) | (a > c));
        System.out.println((a > b) | (a < c));
        System.out.println((a < b) | (a > c));
        System.out.println((a < b) | (a < c));
        System.out.println("===============");
        // ^ 异或；相同为false，不同为true
        System.out.println((a > b) ^ (a > c));
        System.out.println((a > b) ^ (a < c));
        System.out.println((a < b) ^ (a > c));
        System.out.println((a < b) ^ (a < c));
        System.out.println("===============");
        // ! 非；非false则true，非true则false
        System.out.println(!false);
        System.out.println(!true);

        //&和&&的区别
        System.out.println((a > b) & (a++ > c));
        System.out.println("a = " + a);
        System.out.println((a > b) && (a++ > c));
        System.out.println("a = " + a);
        System.out.println((a == b) && (a++ > c));
        System.out.println("a = " + a);

        //|和||的区别
        System.out.println((a > b) | (a++ > c));
        System.out.println("a = " + a);
        System.out.println((a > b) || (a++ > c));
        System.out.println("a = " + a);
        System.out.println((a == b) || (a++ > c));
        System.out.println("a = " + a);
    }
}
public class ArrayTest {
    public static void main(String[] args) {
        int[] a1 = {1, 2, 3};
        for (int i = 0; i < 3; i++) {
            System.out.println(a1[i]);
        }
        int[] a2;
        a2 = new int[]{1, 2, 3, 4, 5};
        for (int i = 0; i < 5; i++) {
            System.out.println(a2[i]);
        }
        char[] letters = new char[26];
        System.out.println("letters数组的长度：" + letters.length);
        System.out.print("存储字母到letters数组之前：[");
        for (int i = 0; i < letters.length; i++) {
            if (i == 0) {
                System.out.print(letters[i]);
            } else {
                System.out.print("," + letters[i]);
            }
        }
    }
}

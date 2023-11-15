
// import java.util.HashSet;
import java.util.HashSet;
import java.util.Random;

public class RandomValueTest {
    public static void main(String[] args) {
        HashSet<Integer> hs = new HashSet(); // 创建集合对象
        Random r = new Random();
        while (hs.size() < 10) {
            int num = r.nextInt(20) + 1; // 生成1到20的随机数
            hs.add(num);
        }

        for (Integer integer : hs) { // 遍历集合
            System.out.println(integer); // 打印每一个元素
        }
    }
}

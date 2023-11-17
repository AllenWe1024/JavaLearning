import java.util.ArrayList;
import java.util.Collections;

public class PokerTest {

    public static void main(String[] args) {
        String[] num = {"A", "2", "3", "4", "5", "6", "7", "8", "9", "10", "J", "Q", "K"};
        String[] color = {"方片", "梅花", "红桃", "黑桃"};
        ArrayList poker = new ArrayList();
        //1. 生成54张扑克牌
        for (String s1 : color) {
            for (String s2 : num) {
                poker.add(s1.concat(" " + s2));
            }
        }

        poker.add("小王");
        poker.add("大王");
        //2. 洗牌
        Collections.shuffle(poker);
        //3. 发牌
        ArrayList tomCards = new ArrayList();
        ArrayList jerryCards = new ArrayList();
        ArrayList meCards = new ArrayList();
        ArrayList lastCards = new ArrayList();

        for (int i = 0; i < poker.size(); i++) {

            if (i >= poker.size() - 3) {
                lastCards.add(poker.get(i));
            } else if (i % 3 == 0) {
                tomCards.add(poker.get(i));
            } else if (i % 3 == 1) {
                jerryCards.add(poker.get(i));
            } else {
                meCards.add(poker.get(i));
            }

        }

        //4. 看牌
        System.out.println("Tom:\n" + tomCards);
        System.out.println("Jerry:\n" + jerryCards);
        System.out.println("me:\n" + meCards);
        System.out.println("底牌:\n" + lastCards);
    }
}

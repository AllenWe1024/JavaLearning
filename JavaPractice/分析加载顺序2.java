class Father3 {
    static {
        System.out.println("11111111111");
    }

    {
        System.out.println("22222222222");
    }

    public Father3() {
        System.out.println("33333333333");

    }

}

class Son3 extends Father3 {
    static {
        System.out.println("44444444444");
    }

    {
        System.out.println("55555555555");
    }

    public Son3() {
        System.out.println("66666666666");
    }


}

public class 分析加载顺序2 {
    public static void main(String[] args) {
        System.out.println("77777777777");
        System.out.println("************************");
        new Son3();
        System.out.println("************************");

        new Son3();
        System.out.println("************************");
        new Father3();
        System.out.println("************************");

    }
}
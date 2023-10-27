public class LazySingle {
    private LazySingle() {
    }

    public static LazySingle getInstance() {
        return Inner.INSTANCE;
    }

    private static class Inner {
        static final LazySingle INSTANCE = new LazySingle();
    }

}
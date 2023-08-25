public class Something2 {
    public static void main(String[] args) {
        Other o = new Other();
        new Something2().addOne(o);
        System.out.println(o.i);
    }

    public void addOne(final Other o) {
        // o = new Other();
        o.i++;
    }
}

class Other {
    public int i;
}

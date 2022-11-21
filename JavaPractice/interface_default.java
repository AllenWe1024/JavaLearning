public class interface_default {
    public static void main(String[] args) {
        Persongsrtg p = new Studentgsrtg("Xiao Ming");
        p.run();
    }
}

interface Persongsrtg {
    String getName();
    default void run() {
        System.out.println(getName() + " run");
    }
}

class Studentgsrtg implements Persongsrtg {
    private String name;

    public Studentgsrtg(String name) {
        this.name = name;
    }

    public String getName() {
        return this.name;
    }
}


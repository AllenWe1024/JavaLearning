public class staticTest {

    public static void main(String[] args) {

// TODO Auto-generated method stub

        Person123123.setNumber(102);

        System.out.println(Person123123.getNumber());

        Person123123 peng = new Person123123();

        Person123123 peng1 = new Person123123();

        Person123123 peng2 = new Person123123();

        Person123123 peng3 = new Person123123();

        System.out.println(Person123123.getCount());

    }

}

class Person123123 {

    private static int number;

    public static int getNumber() {

        return number;

    }

    private static int count;

    Person123123() {

        count = count + 1;

    }

    public static void setNumber(int value) {

        number = value;

    }

    public static int getCount() {

        return count;

    }

}
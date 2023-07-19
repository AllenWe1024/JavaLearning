public class ExceptionTest {
    public static void main(String[] args) throws Exception {
        Exception origin = null;
        try {
            System.out.println(Integer.parseInt("abc"));
        } catch (Exception e) {
            origin = e;
            throw e;
        } finally {
            Exception e = new IllegalArgumentException();
            System.out.println("finally");
            if (origin != null) {
                e.addSuppressed(origin);
            }
            throw e;
        }
    }
}

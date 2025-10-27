
public class throwsException {

    public static int sum() throws Exception {
        int a = 10;
        int b = 0;
        int c = 10 / 0;
        return c;

    }

    public static void main(String[] args) {

        try {
            sum();

        } catch (Exception e) {
            System.out.println(e);
            

    }
}
}

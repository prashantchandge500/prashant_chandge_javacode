package demo.excepation;

public class Thrrowexcepationdemo {

    static void fun() {

        try {
            throw new NullPointerException("nullpionterexceoation");
        } catch (NullPointerException e) {
            System.out.println("caught inside fun");
            throw e;
        }

    }

    public static void main(String[] args) {
        try {
            fun();
        } catch (NullPointerException e) {
            System.out.println("caught the main");
        } catch (ArithmeticException e) {
            System.out.println("nullpointerexcepatin");
        }
    }
}

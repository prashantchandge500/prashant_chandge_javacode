package demo.excepation;

public class Throwexceptiondemo1 {

    public void arthmatic() {
        try {
            int a = 10 / 0;
            //throw new ArithmeticException("arthmatic Excepatin");
        } catch (ArithmeticException e) {
            System.out.println("Atrhmaticexcepatin is handled");
            throw e;
        }
    }

    static void fun() {

        try {
            System.out.println("hello");
            throw new NullPointerException("nullpionterexceoation");
        } catch (NullPointerException e) {
            System.out.println("caught inside fun");
            throw e;
        }

    }

    public static void main(String[] args) {
        try {
            fun();
            Throwexceptiondemo1 t = new Throwexceptiondemo1();
            t.arthmatic();
        } catch (NullPointerException e) {
            System.out.println("caught the main");
        } catch (ArithmeticException e) {
            System.out.println("this is also excute");
        }
    }
}

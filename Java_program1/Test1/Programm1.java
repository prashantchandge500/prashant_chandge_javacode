package Test1;

public class Programm1 {

    public static void main(String[] arg) {
        int i = 100, a;
        while (i < 1000) {
            a = armstrongOrNot(i);
            if (a == i) {
                System.out.println(i);
            }
            i++;
        }
    }

    static int armstrongOrNot(int num) {
        int x, a = 0;
        while (num != 0) {
            x = num % 10;
            a = a + (x * x * x);
            num /= 10;
        }
        return a;
    }
}

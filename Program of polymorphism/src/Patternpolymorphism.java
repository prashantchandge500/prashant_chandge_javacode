
class Pattern {

    public void Display() {
        for (int i = 0; i < 10; i++) {
            System.out.print("*");
        }
    }

    public void display(char var) {
        for (int i = 0; i < 10; i++) {
            System.out.print(var);
        }
    }
}

public class Patternpolymorphism {

    public static void main(String[] args) {
        Pattern P = new Pattern();
        P.Display();

        System.out.println(" ");

        P.display('h');

    }

}

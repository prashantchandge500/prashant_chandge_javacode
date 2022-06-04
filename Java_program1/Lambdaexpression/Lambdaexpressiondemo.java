package Lambdaexpression;

interface Drawable {

    public void Draw();
}

public class Lambdaexpressiondemo {

    public static void main(String[] args) {
        Drawable d1 = () -> {
            int W = 10;
            System.out.println("Drawing: " + W);

        };
        d1.Draw();
    }

}

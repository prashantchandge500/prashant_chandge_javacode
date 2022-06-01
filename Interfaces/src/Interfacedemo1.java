interface Hello{
    void Hi();
}

class How implements Hello{
    public void Hi(){
        System.out.println("hello world");
    }
}

public class Interfacedemo1 {
    public static void main(String[] args) {
        How P = new How();
        P.Hi();
    }
    
}

class Pattern{
    public void display(){
        System.out.println("hello progamming language");
    }
}

class language extends Pattern{
    public void show(){
        System.out.println("hello java");
    }
}
public class Polymorphismoverriding {
    public static void main(String[] args) {
        language p = new language();
        p.display();
        p.show();
    }
    
}

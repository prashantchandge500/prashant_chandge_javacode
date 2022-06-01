interface Drawable{
    void Draw();
}
interface printable{
    void Print();
}

class Rectangle implements Drawable,printable{
    public void Draw(){
        System.out.println("Draw the rectangle");
    }
    public void Print(){
       System.out.println("drwaing square");
    }
}
class Triangle implements Drawable,printable{
    public void Draw(){
        System.out.println("daew the triangle");
    }
    public void Print(){
        System.out.println("drawing triangle");
        
    }
}
public class Interfacedemo2 {
    public static void main(String[] args) {
        Triangle t = new Triangle();
        t.Draw();
        t.Print();
        Rectangle r = new Rectangle();
        r.Draw();
        r.Print();
    }
    
}

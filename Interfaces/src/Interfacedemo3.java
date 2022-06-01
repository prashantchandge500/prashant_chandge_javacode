interface Drawable{
    void draw();
    static int cube(int x){
       return(x*x*x);
    }   
}

class Rectangle implements Drawable{
    public void draw(){
        System.out.println("make the Rectangle");
    }
}
public class Interfacedemo3 {
    public static void main(String[] args) {
        Drawable r= new Rectangle();
        r.draw();
        System.out.println(Drawable.cube(4));
        
    }
    
}

interface showable{
    void show();
    interface message{
        interface message1{
            void msg(); 
        }
    }
}
class display implements showable{
   public void show(){
        System.out.println(" print the show");
    }
}

public class Nestedinterface implements showable.message.message1 {
    public void msg(){
        System.out.println("print the message");
    }
    public static void main(String[] args) {
        showable.message.message1 m= new Nestedinterface ();
        
        m.msg();
        
        display d = new display();
        d.show();
    }
    
}



































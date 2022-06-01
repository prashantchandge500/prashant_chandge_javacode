class Operation{
    static int a=4;
    static int b=3;
    static int c=2;
    static int add,sub,multi,div;
    
    
    static void perform(){
        add=a+b;
        sub=c-b;
        multi=a*b;
        div=c*a;
    
   
        System.out.println("addition is "+ add);
        System.out.println("Substraction is:"+ sub);
        System.out.println("multipliction is:"+multi);
        System.out.println("division is:"+div);
    } 
        static void changevariable(){
            a=5;
            b=3;
            c=8;    
        }
        static{
            System.out.println("All the operation");
            
        }
}
public class Staticvariabledemo2 {
    public static void main(String[] args) {
        Operation p = new Operation();
        p.perform();
        System.out.println(" ");
        Operation.changevariable();
        p.perform();
     
        
        
                
           
        
        
      
        
    }
    
}

    
    


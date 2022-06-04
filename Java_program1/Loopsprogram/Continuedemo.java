
package Loopsprogram;
public class Continuedemo {
    public static void main(String[] args) {
        //Enhanceloopdemo ehld = new Enhanceloopdemo();
        //ehld.enhanceloop();
        //System.out.println("---------------------------------------------");
        //Whileloopdemo w = new Whileloopdemo();
        //w.show();
        //System.out.println("------------------------");
        //Dowhileloopdemo dwl = new Dowhileloopdemo();
        //dwl.show1();
        //System.out.println("------------------------------");
        Labellstatementdemo lsd =new Labellstatementdemo();
        lsd.show4();
    
     
        for(int i=0;i<10;i++){
            if(i%2==0){
                continue;
            }
            System.out.println(i + " ");
        }
    }
    
}

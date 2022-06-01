class Bicycle{
    int gear;
    int speed;
    
    public Bicycle(int gear , int speed){
        this.gear = gear;
        this.speed =speed;
    }
    public void applybrake(int decrement){
        speed=speed-decrement;
    }
    public void speedup(int increment){
        speed=speed-increment;
    }
    @Override public String toString(){
        return("No of gears are " + gear + " Speed of bicycle " + speed);
    }
}

class Moutainbike extends Bicycle{
    int seatheight;
    
    public Moutainbike(int gear, int speed, int seatheight){
        super(gear,speed);
        this.seatheight=seatheight;
    }
    public void setheight(int newvalue){
        seatheight=newvalue;
    }
    @Override public String toString(){
        return(super.toString()+ " seatheight is " + seatheight);
        
    }
}
class Singleinheritance{
    public static void main(String[] args) {
        Bicycle b = new Bicycle(4,50);
        Moutainbike mb = new Moutainbike(5, 100, 10);
        System.out.println(b.toString());
        System.out.println(mb.toString());
        
    }
}
package Univpaper;
//multipale abstract method
// not a object of abstract method
//not
abstract class Car{
    public abstract void drive();
    public void playMusic(){
        System.out.println("Playing..");
    }
}
class WagonR extends Car{
    public void drive(){
        System.out.println("Driving");
    }

}
public class AbstractClass {
    public static void main(Stringbasics[] args) {


        Car c1 = new WagonR();
        c1.drive();
    }
}

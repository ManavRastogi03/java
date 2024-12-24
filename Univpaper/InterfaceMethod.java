package Univpaper;
interface Vechile{
    void start();
    void speed();

}
class Bike implements Vechile{
    public void start(){
        System.out.println("Reday");
    }
    public void speed(){
        System.out.println("200mps");
    }
}
public class InterfaceMethod {
    public static void main(String[] args) {


        Bike b1 = new Bike();
        b1.start();
        b1.speed();
    }
}

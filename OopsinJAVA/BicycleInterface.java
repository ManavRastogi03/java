package Java.OopsinJAVA;
interface Bicycle{
    int a=12;
    void applyBrake(int decrement);
    void speedup(int increment);
}
interface BlowHorn{
    void BlowHorn1();
    void BlowHorn2();

}
class AvonCycle implements Bicycle,BlowHorn{
    int speed=7;
    void blowhorn(){
        System.out.println("Pee Pee Poo Poo");
    }
    public void applyBrake(int dec){
        speed-=dec;
        System.out.println(speed);
    }

    public void speedup(int inc){
        speed+=inc;
        System.out.println(speed);
    }
    public void BlowHorn1(){
        System.out.println("Kahoo naa Pyar hai..!");
    }
    public void BlowHorn2(){
        System.out.println("Mene khe diya..!");
    }
}
public class BicycleInterface {
    public static void main(String[] args) {
        AvonCycle b1=new AvonCycle();
        System.out.println(Bicycle.a);
//        you can create the properties of inteface
        b1.applyBrake(2);
        b1.speedup(3);
//        You cannot create the properties of interface as they are final
//       Bicycle.a=90;

    }
}
